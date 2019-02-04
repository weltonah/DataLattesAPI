package br.com.datalattesAPI.Xpath;

import java.io.File;
import java.util.ArrayList;

import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import br.com.datalattesAPI.model.Banca.AuxiliarBanca;
import br.com.datalattesAPI.model.Banca.BancaAperfeicoamentoEspecializacao;
import br.com.datalattesAPI.model.Banca.BancaAvaliacaoCurso;
import br.com.datalattesAPI.model.Banca.BancaConcursoPublico;
import br.com.datalattesAPI.model.Banca.BancaDoutorado;
import br.com.datalattesAPI.model.Banca.BancaFormacao;
import br.com.datalattesAPI.model.Banca.BancaGraduacao;
import br.com.datalattesAPI.model.Banca.BancaLivreDocencia;
import br.com.datalattesAPI.model.Banca.BancaMestrado;
import br.com.datalattesAPI.model.Banca.BancaProfessorTitular;
import br.com.datalattesAPI.model.Banca.BancaQualificacaoDoutorado;
import br.com.datalattesAPI.model.Geral.AreaConhecimento;
import br.com.datalattesAPI.model.Geral.PalavraChave;
import br.com.datalattesAPI.model.Geral.SetorAtividade;
import br.com.datalattesAPI.model.Producao.Autor;
import br.com.datalattesAPI.model.Producao.Autores;

public class BancaXpath extends AbstractXpath {

	public BancaXpath(File file) {
		super(file);
	}

	public ArrayList<AuxiliarBanca> BuscaBancaProfissional(String raiz, String nomeObjeto)
			throws XPathExpressionException {
		XPathExpression expr = this.xpath.compile(raiz);
		NodeList listaBancaBuscada = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		ArrayList<AuxiliarBanca> ListaResultadoBusca = new ArrayList<AuxiliarBanca>();
		for (int i = 0; i < listaBancaBuscada.getLength(); i++) {
			Node TipoNode = listaBancaBuscada.item(i);
			String natureza = TesteFilhoNo(0, TipoNode, "NATUREZA");
			String titulo = TesteFilhoNo(0, TipoNode, "TITULO");
			String ano = TesteFilhoNo(0, TipoNode, "ANO");
			String pais = TesteFilhoNo(0, TipoNode, "PAIS");
			String idioma = TesteFilhoNo(0, TipoNode, "IDIOMA");

			String nomeInstituicao = TesteFilhoNo(1, TipoNode, "NOME-INSTITUICAO");

			NodeList ListSubItens = TipoNode.getChildNodes();

			ArrayList<Autor> autorlista = new ArrayList<Autor>();
			PalavraChave palavraChave = null;
			SetorAtividade setorAtividade = null;
			AreaConhecimento areaConhecimento = null;
			for (int j = 0; j < ListSubItens.getLength(); j++) {
				Node subItens = ListSubItens.item(j);
				if (subItens.getNodeName().contentEquals("PARTICIPANTE-BANCA")) {
					String nomeCompleto = TesteNullNo(subItens, "NOME-COMPLETO-DO-PARTICIPANTE-DA-BANCA");
					String nomeCitacao = TesteNullNo(subItens, "NOME-PARA-CITACAO-DO-PARTICIPANTE-DA-BANCA");
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

			Autores autores = new Autores(autorlista);
			AuxiliarBanca itemResultado = null;
			switch (nomeObjeto) {
			case "BancaProfessorTitular":
				itemResultado = new BancaProfessorTitular(natureza, titulo, ano, pais, idioma, autores, palavraChave,
						setorAtividade, areaConhecimento, nomeInstituicao);
				break;
			case "BancaConcursoPublico":
				itemResultado = new BancaConcursoPublico(natureza, titulo, ano, pais, idioma, autores, palavraChave,
						setorAtividade, areaConhecimento, nomeInstituicao);
				break;
			case "BancaAvaliacaoCurso":
				itemResultado = new BancaAvaliacaoCurso(natureza, titulo, ano, pais, idioma, autores, palavraChave,
						setorAtividade, areaConhecimento, nomeInstituicao);
				break;
			default:
				itemResultado = new BancaLivreDocencia(natureza, titulo, ano, pais, idioma, autores, palavraChave,
						setorAtividade, areaConhecimento, nomeInstituicao);
				break;
			}
			if (itemResultado != null)
				ListaResultadoBusca.add(itemResultado);
		}
		return ListaResultadoBusca;
	}

	public ArrayList<BancaFormacao> BuscaBancaFormacao(String raiz, String nomeObjeto) throws XPathExpressionException {
		XPathExpression expr = this.xpath.compile(raiz);
		NodeList listaBancaBuscada = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		ArrayList<BancaFormacao> ListaResultadoBusca = new ArrayList<BancaFormacao>();
		for (int i = 0; i < listaBancaBuscada.getLength(); i++) {
			Node TipoNode = listaBancaBuscada.item(i);
			
			
			
			String natureza = TesteFilhoNo(0, TipoNode, "NATUREZA");
			String titulo = TesteFilhoNo(0, TipoNode, "TITULO");
			String ano = TesteFilhoNo(0, TipoNode, "ANO");
			String pais = TesteFilhoNo(0, TipoNode, "PAIS");
			String idioma = TesteFilhoNo(0, TipoNode, "IDIOMA");
			
			String nomeCandidato = TesteFilhoNo(1, TipoNode, "NOME-DO-CANDIDATO");
			String nomeInstituicao = TesteFilhoNo(1, TipoNode, "NOME-ORGAO");
			String nomeCurso = TesteFilhoNo(1, TipoNode, "NOME-INSTITUICAO");
			String nomeOrgao = TesteFilhoNo(1, TipoNode, "NOME-CURSO");
			NodeList ListSubItens = TipoNode.getChildNodes();

			ArrayList<Autor> autorlista = new ArrayList<Autor>();
			PalavraChave palavraChave = null;
			SetorAtividade setorAtividade = null;
			AreaConhecimento areaConhecimento = null;
			for (int j = 0; j < ListSubItens.getLength(); j++) {
				Node subItens = ListSubItens.item(j);
				if (subItens.getNodeName().contentEquals("PARTICIPANTE-BANCA")) {
					String nomeCompleto = TesteNullNo(subItens, "NOME-COMPLETO-DO-PARTICIPANTE-DA-BANCA");
					String nomeCitacao = TesteNullNo(subItens, "NOME-PARA-CITACAO-DO-PARTICIPANTE-DA-BANCA");
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

			Autores autores = new Autores(autorlista);
			BancaFormacao itemResultado = null;
			switch (nomeObjeto) {
			case "BancaMestrado":
				String tipo = TipoNode.getChildNodes().item(0).getAttributes().getNamedItem("TIPO").getTextContent();
				itemResultado = new BancaMestrado(natureza, titulo, ano, pais, idioma, autores, palavraChave,
						setorAtividade, areaConhecimento, nomeInstituicao, nomeOrgao, nomeCandidato, nomeCurso, tipo);
				break;
			case "BancaDoutorado":
				itemResultado = new BancaDoutorado(natureza, titulo, ano, pais, idioma, autores, palavraChave,
						setorAtividade, areaConhecimento, nomeInstituicao, nomeOrgao, nomeCandidato, nomeCurso);
				break;
			case "BancaQualificacaoDoutorado":
				itemResultado = new BancaQualificacaoDoutorado(natureza, titulo, ano, pais, idioma, autores,
						palavraChave, setorAtividade, areaConhecimento, nomeInstituicao, nomeOrgao, nomeCandidato,
						nomeCurso);
				break;
			case "BancaGraduacao":
				itemResultado = new BancaGraduacao(natureza, titulo, ano, pais, idioma, autores, palavraChave,
						setorAtividade, areaConhecimento, nomeInstituicao, nomeOrgao, nomeCandidato, nomeCurso);
				break;
			default:
				itemResultado = new BancaAperfeicoamentoEspecializacao(natureza, titulo, ano, pais, idioma, autores,
						palavraChave, setorAtividade, areaConhecimento, nomeInstituicao, nomeOrgao, nomeCandidato,
						nomeCurso);
				break;
			}
			if (itemResultado != null)
				ListaResultadoBusca.add(itemResultado);
		}
		return ListaResultadoBusca;
	}
}
