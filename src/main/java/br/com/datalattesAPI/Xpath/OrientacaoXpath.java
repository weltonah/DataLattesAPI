package br.com.datalattesAPI.Xpath;

import java.io.File;
import java.util.ArrayList;

import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import br.com.datalattesAPI.model.Geral.AreaConhecimento;
import br.com.datalattesAPI.model.Geral.PalavraChave;
import br.com.datalattesAPI.model.Geral.SetorAtividade;
import br.com.datalattesAPI.model.Orientacao.OrientacaoAbstract;
import br.com.datalattesAPI.model.Orientacao.OrientacaoAperfeicoamentoEspecializacao;
import br.com.datalattesAPI.model.Orientacao.OrientacaoDoutorado;
import br.com.datalattesAPI.model.Orientacao.OrientacaoGraduacao;
import br.com.datalattesAPI.model.Orientacao.OrientacaoIniciacaoCientifica;
import br.com.datalattesAPI.model.Orientacao.OrientacaoMestrado;
import br.com.datalattesAPI.model.Orientacao.OrientacaoPosDoutorado;

public class OrientacaoXpath extends AbstractXpath {

	public OrientacaoXpath(File file) {
		super(file);
	}

	public ArrayList<OrientacaoAbstract> BuscaOrientacaoConcluida(String raiz, String nomeObjeto)
			throws XPathExpressionException {
		XPathExpression expr = this.xpath.compile(raiz);
		NodeList listaOrientaBuscada = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		ArrayList<OrientacaoAbstract> ListaResultadoOrientacao = new ArrayList<OrientacaoAbstract>();
		String tipoorientacaoaux;
		if (nomeObjeto.contentEquals("OrientacaoGraduacao")
				|| nomeObjeto.contentEquals("OrientacaoAperfeicoamentoEspecializacao")
				|| nomeObjeto.contentEquals("OrientacaoIniciacaoCientifica"))
			tipoorientacaoaux = "TIPO-DE-ORIENTACAO-CONCLUIDA";
		else
			tipoorientacaoaux = "TIPO-DE-ORIENTACAO";

		for (int i = 0; i < listaOrientaBuscada.getLength(); i++) {
			Node TipoNode = listaOrientaBuscada.item(i);

			String natureza = TesteFilhoNo(0, TipoNode, "NATUREZA");
			String titulo = TesteFilhoNo(0, TipoNode, "TITULO");
			String ano = TesteFilhoNo(0, TipoNode, "ANO");
			String pais = TesteFilhoNo(0, TipoNode, "PAIS");
			String doi = TesteFilhoNo(0, TipoNode, "DOI");

			String nomeInstituicao = TesteFilhoNo(1, TipoNode, "NOME-DA-INSTITUICAO");
			String tipoOrientacao = TesteFilhoNo(1, TipoNode, tipoorientacaoaux);
			String nomeOrientado = TesteFilhoNo(1, TipoNode, "NOME-DO-ORIENTADO");
			String nomeOrgao = TesteFilhoNo(1, TipoNode, "NOME-ORGAO");
			String nomeCurso = TesteFilhoNo(1, TipoNode, "NOME-DO-CURSO");
			String flagBolsa = TesteFilhoNo(1, TipoNode, "FLAG-BOLSA");
			String nomeAgencia = TesteFilhoNo(1, TipoNode, "NOME-DA-AGENCIA");
			String idOrientador = TesteFilhoNo(1, TipoNode, "NUMERO-ID-ORIENTADO");

			NodeList ListSubItens = TipoNode.getChildNodes();
			PalavraChave palavraChave = null;
			SetorAtividade setorAtividade = null;
			AreaConhecimento areaConhecimento = null;
			for (int j = 0; j < ListSubItens.getLength(); j++) {
				Node subItens = ListSubItens.item(j);
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
			OrientacaoAbstract itemResultado = null;
			String tipo;
			switch (nomeObjeto) {
			case "OrientacaoMestrado":
				tipo = TipoNode.getChildNodes().item(0).getAttributes().getNamedItem("TIPO").getTextContent();
				itemResultado = new OrientacaoMestrado(palavraChave, setorAtividade, areaConhecimento, natureza, titulo,
						ano, pais, doi, tipoOrientacao, nomeOrientado, nomeInstituicao, nomeOrgao, nomeCurso, flagBolsa,
						nomeAgencia, idOrientador, tipo);
				break;
			case "OrientacaoDoutorado":
				itemResultado = new OrientacaoDoutorado(palavraChave, setorAtividade, areaConhecimento, natureza,
						titulo, ano, pais, doi, tipoOrientacao, nomeOrientado, nomeInstituicao, nomeOrgao, nomeCurso,
						flagBolsa, nomeAgencia, idOrientador);
				break;
			case "OrientacaoPosDoutorado":
				itemResultado = new OrientacaoPosDoutorado(palavraChave, setorAtividade, areaConhecimento, natureza,
						titulo, ano, pais, doi, tipoOrientacao, nomeOrientado, nomeInstituicao, nomeOrgao, nomeCurso,
						flagBolsa, nomeAgencia, idOrientador);
				break;

			default:
				if (nomeObjeto.contentEquals("OrientacaoGraduacao")
						&& natureza.contentEquals("TRABALHO_DE_CONCLUSAO_DE_CURSO_GRADUACAO"))
					itemResultado = new OrientacaoGraduacao(palavraChave, setorAtividade, areaConhecimento, natureza,
							titulo, ano, pais, doi, tipoOrientacao, nomeOrientado, nomeInstituicao, nomeOrgao,
							nomeCurso, flagBolsa, nomeAgencia, idOrientador);
				if (nomeObjeto.contentEquals("OrientacaoAperfeicoamentoEspecializacao")
						&& natureza.contentEquals("MONOGRAFIA_DE_CONCLUSAO_DE_CURSO_APERFEICOAMENTO_E_ESPECIALIZACAO"))
					itemResultado = new OrientacaoAperfeicoamentoEspecializacao(palavraChave, setorAtividade,
							areaConhecimento, natureza, titulo, ano, pais, doi, tipoOrientacao, nomeOrientado,
							nomeInstituicao, nomeOrgao, nomeCurso, flagBolsa, nomeAgencia, idOrientador);
				if (nomeObjeto.contentEquals("OrientacaoIniciacaoCientifica")
						&& natureza.contentEquals("INICIACAO_CIENTIFICA"))
					itemResultado = new OrientacaoIniciacaoCientifica(palavraChave, setorAtividade, areaConhecimento,
							natureza, titulo, ano, pais, doi, tipoOrientacao, nomeOrientado, nomeInstituicao, nomeOrgao,
							nomeCurso, flagBolsa, nomeAgencia, idOrientador);
				break;
			}
			if (itemResultado != null)
				ListaResultadoOrientacao.add(itemResultado);
		}
		return ListaResultadoOrientacao;
	}

	public ArrayList<OrientacaoAbstract> BuscaOrientacaoAndamento(String raiz, String nomeObjeto)
			throws XPathExpressionException {
		XPathExpression expr = this.xpath.compile(raiz);
		NodeList listaOrientaBuscada = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		ArrayList<OrientacaoAbstract> ListaResultadoOrientacao = new ArrayList<OrientacaoAbstract>();
		for (int i = 0; i < listaOrientaBuscada.getLength(); i++) {
			Node TipoNode = listaOrientaBuscada.item(i);

			String natureza = TesteFilhoNo(0, TipoNode, "NATUREZA");
			String titulo = TesteFilhoNo(0, TipoNode, "TITULO-DO-TRABALHO");
			String ano = TesteFilhoNo(0, TipoNode, "ANO");
			String pais = TesteFilhoNo(0, TipoNode, "PAIS");
			String doi = TesteFilhoNo(0, TipoNode, "DOI");

			String nomeInstituicao = TesteFilhoNo(1, TipoNode, "NOME-INSTITUICAO");
			String tipoOrientacao = TesteFilhoNo(1, TipoNode, "TIPO-DE-ORIENTACAO");
			String nomeOrientado = TesteFilhoNo(1, TipoNode, "NOME-DO-ORIENTANDO");
			String nomeOrgao = TesteFilhoNo(1, TipoNode, "NOME-ORGAO");
			String nomeCurso = TesteFilhoNo(1, TipoNode, "NOME-CURSO");
			String flagBolsa = TesteFilhoNo(1, TipoNode, "FLAG-BOLSA");
			String nomeAgencia = TesteFilhoNo(1, TipoNode, "NOME-DA-AGENCIA");
			String idOrientador = TesteFilhoNo(1, TipoNode, "NUMERO-ID-ORIENTANDO");

			NodeList ListSubItens = TipoNode.getChildNodes();
			PalavraChave palavraChave = null;
			SetorAtividade setorAtividade = null;
			AreaConhecimento areaConhecimento = null;
			for (int j = 0; j < ListSubItens.getLength(); j++) {
				Node subItens = ListSubItens.item(j);
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
			OrientacaoAbstract itemResultado = null;
			String tipo;
			switch (nomeObjeto) {
			case "OrientacaoMestrado":
				tipo = TipoNode.getChildNodes().item(0).getAttributes().getNamedItem("TIPO").getTextContent();
				itemResultado = new OrientacaoMestrado(palavraChave, setorAtividade, areaConhecimento, natureza, titulo,
						ano, pais, doi, tipoOrientacao, nomeOrientado, nomeInstituicao, nomeOrgao, nomeCurso, flagBolsa,
						nomeAgencia, idOrientador, tipo);
				break;
			case "OrientacaoDoutorado":
				itemResultado = new OrientacaoDoutorado(palavraChave, setorAtividade, areaConhecimento, natureza,
						titulo, ano, pais, doi, tipoOrientacao, nomeOrientado, nomeInstituicao, nomeOrgao, nomeCurso,
						flagBolsa, nomeAgencia, idOrientador);
				break;
			case "OrientacaoPosDoutorado":
				itemResultado = new OrientacaoPosDoutorado(palavraChave, setorAtividade, areaConhecimento, natureza,
						titulo, ano, pais, doi, tipoOrientacao, nomeOrientado, nomeInstituicao, nomeOrgao, nomeCurso,
						flagBolsa, nomeAgencia, idOrientador);
				break;
			case "OrientacaoGraduacao":
				itemResultado = new OrientacaoGraduacao(palavraChave, setorAtividade, areaConhecimento, natureza,
						titulo, ano, pais, doi, tipoOrientacao, nomeOrientado, nomeInstituicao, nomeOrgao, nomeCurso,
						flagBolsa, nomeAgencia, idOrientador);
				break;
			case "OrientacaoAperfeicoamentoEspecializacao":
				itemResultado = new OrientacaoAperfeicoamentoEspecializacao(palavraChave, setorAtividade,
						areaConhecimento, natureza, titulo, ano, pais, doi, tipoOrientacao, nomeOrientado,
						nomeInstituicao, nomeOrgao, nomeCurso, flagBolsa, nomeAgencia, idOrientador);
				break;
			case "OrientacaoIniciacaoCientifica":
				itemResultado = new OrientacaoIniciacaoCientifica(palavraChave, setorAtividade, areaConhecimento,
						natureza, titulo, ano, pais, doi, tipoOrientacao, nomeOrientado, nomeInstituicao, nomeOrgao,
						nomeCurso, flagBolsa, nomeAgencia, idOrientador);
				break;
			}
			if (itemResultado != null)
				ListaResultadoOrientacao.add(itemResultado);
		}
		return ListaResultadoOrientacao;
	}

}
