package br.com.datalattesAPI.Xpath;

import java.io.File;
import java.util.ArrayList;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import br.com.datalattesAPI.File.ConverterFileToDocument;
import br.com.datalattesAPI.model.AtuacaoProfissional.EquipeProjeto;
import br.com.datalattesAPI.model.AtuacaoProfissional.Financiadores;
import br.com.datalattesAPI.model.AtuacaoProfissional.FinanciadoresProjeto;
import br.com.datalattesAPI.model.AtuacaoProfissional.IntegranteProjeto;
import br.com.datalattesAPI.model.AtuacaoProfissional.OrientacaoPesquisa;
import br.com.datalattesAPI.model.AtuacaoProfissional.Orientacoes;
import br.com.datalattesAPI.model.AtuacaoProfissional.ProducaoPesquisa;
import br.com.datalattesAPI.model.AtuacaoProfissional.Producoes;
import br.com.datalattesAPI.model.Geral.Area;
import br.com.datalattesAPI.model.Geral.AreaConhecimento;
import br.com.datalattesAPI.model.Geral.PalavraChave;
import br.com.datalattesAPI.model.Geral.SetorAtividade;
import br.com.datalattesAPI.model.Producao.Autor;

public abstract class AbstractXpath {
	public Document xmlfile;
	public XPath xpath;

	public AbstractXpath(File file) {
		this.xmlfile = ConverterFileToDocument.ConverterFileToDoc(file);
		XPathFactory xPathfactory = XPathFactory.newInstance();
		this.xpath = xPathfactory.newXPath();
	}

	public String TesteNullNo(Node no, String texto) {
		return (no.getAttributes().getNamedItem(texto) != null)
				? no.getAttributes().getNamedItem(texto).getTextContent()
				: "";
	}

	public String TesteFilhoNo(int index, Node no, String texto) {
		return (no.getChildNodes().item(index).getAttributes().getNamedItem(texto) != null)
				? no.getChildNodes().item(index).getAttributes().getNamedItem(texto).getTextContent()
				: "";
	}

	public PalavraChave BuscaPalavraChave(Node subItens) {
		String palavra1 = TesteNullNo(subItens, "PALAVRA-CHAVE-1");
		String palavra2 = TesteNullNo(subItens, "PALAVRA-CHAVE-2");
		String palavra3 = TesteNullNo(subItens, "PALAVRA-CHAVE-3");
		String palavra4 = TesteNullNo(subItens, "PALAVRA-CHAVE-4");
		String palavra5 = TesteNullNo(subItens, "PALAVRA-CHAVE-5");
		String palavra6 = TesteNullNo(subItens, "PALAVRA-CHAVE-6");
		return new PalavraChave(palavra1, palavra2, palavra3, palavra4, palavra5, palavra6);
	}

	public void buscarDadosAdicionaisProducaoBibliografica(ArrayList<Autor> autorlista, PalavraChave palavraChave,
			SetorAtividade setorAtividade, AreaConhecimento areaConhecimento, NodeList ListSubItens) {
		for (int j = 0; j < ListSubItens.getLength(); j++) {
			Node subItens = ListSubItens.item(j);
			if (subItens.getNodeName().contentEquals("AUTORES")) {
				String nomeCompleto = TesteNullNo(subItens, "NOME-COMPLETO-DO-AUTOR");
				String nomeCitacao = TesteNullNo(subItens, "NOME-PARA-CITACAO");
				String idCnpq = TesteNullNo(subItens, "NRO-ID-CNPQ");
				Autor autor = new Autor(nomeCompleto, nomeCitacao, idCnpq);
				autorlista.add(autor);
			}
			if (subItens.getNodeName().contentEquals("PALAVRAS-CHAVE")) {
				palavraChave = BuscaPalavraChave(subItens);
			}
			if (subItens.getNodeName().contentEquals("AREAS-DO-CONHECIMENTO")) {
				areaConhecimento = BuscaAreaConhecimento(subItens);
			}
			if (subItens.getNodeName().contentEquals("SETORES-DE-ATIVIDADE")) {
				setorAtividade = BuscaSetorAtividade(subItens);
			}
		}
	}

	public AreaConhecimento BuscaAreaConhecimento(Node subItens) {
		Area area1 = null;
		Area area2 = null;
		Area area3 = null;
		NodeList Nosfilhos = subItens.getChildNodes();
		for (int k = 0; k < Nosfilhos.getLength(); k++) {
			Node filho = Nosfilhos.item(k);
			String nomeGrandeArea = TesteNullNo(filho, "NOME-GRANDE-AREA-DO-CONHECIMENTO");
			String nomeArea = TesteNullNo(filho, "NOME-DA-AREA-DO-CONHECIMENTO");
			String nomeSubArea = TesteNullNo(filho, "NOME-DA-SUB-AREA-DO-CONHECIMENTO");
			String nomeEspecialidade = TesteNullNo(filho, "NOME-DA-ESPECIALIDADE");
			switch (k) {
			case 1:
				area1 = new Area(nomeGrandeArea, nomeArea, nomeSubArea, nomeEspecialidade);
				break;
			case 2:
				area2 = new Area(nomeGrandeArea, nomeArea, nomeSubArea, nomeEspecialidade);
				break;
			case 3:
				area3 = new Area(nomeGrandeArea, nomeArea, nomeSubArea, nomeEspecialidade);
				break;
			}
		}
		return new AreaConhecimento(area1, area2, area3);
	}

	public EquipeProjeto BuscaEquipeProjeto(Node subItens) {
		ArrayList<IntegranteProjeto> listaintegrante = new ArrayList<>();
		NodeList Nosfilhos = subItens.getChildNodes();
		for (int k = 0; k < Nosfilhos.getLength(); k++) {
			Node filho = Nosfilhos.item(k);
			String nomeCompleto = TesteNullNo(filho, "NOME-COMPLETO");
			String nomeCitacao = TesteNullNo(filho, "NOME-PARA-CITACAO");
			String flagResponsavel = TesteNullNo(filho, "FLAG-RESPONSAVEL");
			String idCnpq = TesteNullNo(filho, "NRO-ID-CNPQ");
			IntegranteProjeto integrante = new IntegranteProjeto(nomeCompleto, nomeCitacao, flagResponsavel, idCnpq);
			listaintegrante.add(integrante);
		}
		EquipeProjeto item = new EquipeProjeto(listaintegrante);
		return item;
	}

	public FinanciadoresProjeto BuscaFinanciadoresProjeto(Node subItens) {
		ArrayList<Financiadores> listaintegrante = new ArrayList<>();
		NodeList Nosfilhos = subItens.getChildNodes();
		for (int k = 0; k < Nosfilhos.getLength(); k++) {
			Node filho = Nosfilhos.item(k);
			String nomeInstituicao = TesteNullNo(filho, "NOME-INSTITUICAO");
			String natureza = TesteNullNo(filho, "NATUREZA");
			Financiadores integrante = new Financiadores(nomeInstituicao, natureza);
			listaintegrante.add(integrante);
		}
		FinanciadoresProjeto item = new FinanciadoresProjeto(listaintegrante);
		return item;
	}

	public Producoes BuscaProducoes(Node subItens) {
		ArrayList<ProducaoPesquisa> listaintegrante = new ArrayList<>();
		NodeList Nosfilhos = subItens.getChildNodes();
		for (int k = 0; k < Nosfilhos.getLength(); k++) {
			Node filho = Nosfilhos.item(k);
			String titulo = TesteNullNo(filho, "TITULO-DA-PRODUCAO-CT");
			String tipo = TesteNullNo(filho, "TIPO-PRODUCAO-CT");
			ProducaoPesquisa integrante = new ProducaoPesquisa(titulo, tipo);
			listaintegrante.add(integrante);
		}
		Producoes item = new Producoes(listaintegrante);
		return item;
	}

	public Orientacoes BuscaOrientacoes(Node subItens) {
		ArrayList<OrientacaoPesquisa> listaintegrante = new ArrayList<>();
		NodeList Nosfilhos = subItens.getChildNodes();
		for (int k = 0; k < Nosfilhos.getLength(); k++) {
			Node filho = Nosfilhos.item(k);
			String titulo = TesteNullNo(filho, "TITULO-ORIENTACAO");
			String tipo = TesteNullNo(filho, "TIPO-ORIENTACAO");
			OrientacaoPesquisa integrante = new OrientacaoPesquisa(titulo, tipo);
			listaintegrante.add(integrante);
		}
		Orientacoes item = new Orientacoes(listaintegrante);
		return item;
	}

	public SetorAtividade BuscaSetorAtividade(Node subItens) {
		String setor1 = TesteNullNo(subItens, "SETOR-DE-ATIVIDADE-1");
		String setor2 = TesteNullNo(subItens, "SETOR-DE-ATIVIDADE-2");
		String setor3 = TesteNullNo(subItens, "SETOR-DE-ATIVIDADE-3");

		return new SetorAtividade(setor1, setor2, setor3);
	}

}
