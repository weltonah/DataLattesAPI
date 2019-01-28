package br.com.datalattesAPI.Xpath;

import java.io.File;
import java.util.ArrayList;

import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import br.com.datalattesAPI.model.Formacao.Aperfeicoamento;
import br.com.datalattesAPI.model.Formacao.CursoTecnico;
import br.com.datalattesAPI.model.Formacao.Doutorado;
import br.com.datalattesAPI.model.Formacao.EnsinoFundamental;
import br.com.datalattesAPI.model.Formacao.EnsinoMedio;
import br.com.datalattesAPI.model.Formacao.Especializacao;
import br.com.datalattesAPI.model.Formacao.Graduacao;
import br.com.datalattesAPI.model.Formacao.LivreDocencia;
import br.com.datalattesAPI.model.Formacao.MestradoAcademico;
import br.com.datalattesAPI.model.Formacao.MestradoProfissionalizante;
import br.com.datalattesAPI.model.Formacao.PosDoutorado;
import br.com.datalattesAPI.model.Formacao.ResidenciaMedica;
import br.com.datalattesAPI.model.Geral.AreaConhecimento;
import br.com.datalattesAPI.model.Geral.PalavraChave;
import br.com.datalattesAPI.model.Geral.SetorAtividade;

public class FormacaoXpath extends AbstractXpath {

	public FormacaoXpath(File file) {
		super(file);
	}

	public ArrayList<Graduacao> BuscaGraduacao() throws XPathExpressionException {
		XPathExpression expr = this.xpath.compile("//GRADUACAO");
		NodeList listaResultaXpath = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		ArrayList<Graduacao> ListGraduacaoResult = new ArrayList<>();
		for (int i = 0; i < listaResultaXpath.getLength(); i++) {
			Node TipoNode = listaResultaXpath.item(i);
			String anoInicio = TesteNullNo(TipoNode, "ANO-DE-INICIO");
			String anoConclusao = TesteNullNo(TipoNode, "ANO-DE-CONCLUSAO");
			String nomeInstituicao = TesteNullNo(TipoNode, "NOME-INSTITUICAO");
			String statusCurso = TesteNullNo(TipoNode, "STATUS-DO-CURSO");
			String tituloTrabalho = TesteNullNo(TipoNode, "TITULO-DO-TRABALHO-DE-CONCLUSAO-DE-CURSO");
			String nomeAgenciaFinanciadora = TesteNullNo(TipoNode, "NOME-AGENCIA");
			String tituloTrabalhoEN = TesteNullNo(TipoNode, "TITULO-DO-TRABALHO-DE-CONCLUSAO-DE-CURSO-INGLES");
			String nomeCursoEN = TesteNullNo(TipoNode, "NOME-CURSO-INGLES");
			String flagBolsa = TesteNullNo(TipoNode, "FLAG-BOLSA");
			String codigoAreaCurso = TesteNullNo(TipoNode, "CODIGO-AREA-CURSO");
			String idOrientador = TesteNullNo(TipoNode, "NUMERO-ID-ORIENTADOR");
			String tipoCurso = TesteNullNo(TipoNode, "TIPO-GRADUACAO");
			String nomeOrientador = TesteNullNo(TipoNode, "NOME-DO-ORIENTADOR");
			String nomeOrgao = TesteNullNo(TipoNode, "NOME-ORGAO");
			String formacaoAcademicaTitulacao = TesteNullNo(TipoNode, "FORMACAO-ACADEMICA-TITULACAO");
			String nomeCurso = TesteNullNo(TipoNode, "NOME-CURSO");

			Graduacao graduacao = new Graduacao(anoInicio, anoConclusao, nomeInstituicao, statusCurso, tituloTrabalho,
					nomeAgenciaFinanciadora, tituloTrabalhoEN, nomeCursoEN, flagBolsa, nomeOrientador, nomeOrgao,
					nomeCurso, codigoAreaCurso, idOrientador, tipoCurso, formacaoAcademicaTitulacao);
			ListGraduacaoResult.add(graduacao);
		}
		return ListGraduacaoResult;
	}

	public ArrayList<Especializacao> BuscaEspecializacao() throws XPathExpressionException {
		XPathExpression expr = this.xpath.compile("//ESPECIALIZACAO");
		NodeList listaResultaXpath = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		ArrayList<Especializacao> ListEspecializacaoResult = new ArrayList<>();
		for (int i = 0; i < listaResultaXpath.getLength(); i++) {
			Node TipoNode = listaResultaXpath.item(i);
			String anoInicio = TesteNullNo(TipoNode, "ANO-DE-INICIO");
			String anoConclusao = TesteNullNo(TipoNode, "ANO-DE-CONCLUSAO");
			String nomeInstituicao = TesteNullNo(TipoNode, "NOME-INSTITUICAO");
			String statusCurso = TesteNullNo(TipoNode, "STATUS-DO-CURSO");
			String tituloTrabalho = TesteNullNo(TipoNode, "TITULO-DA-MONOGRAFIA");
			String nomeAgenciaFinanciadora = TesteNullNo(TipoNode, "NOME-AGENCIA");
			String tituloTrabalhoEN = TesteNullNo(TipoNode, "TITULO-DA-MONOGRAFIA-INGLES");
			String nomeCursoEN = TesteNullNo(TipoNode, "NOME-CURSO-INGLES");
			String flagBolsa = TesteNullNo(TipoNode, "FLAG-BOLSA");
			String nomeOrientador = TesteNullNo(TipoNode, "NOME-DO-ORIENTADOR");
			String nomeOrgao = TesteNullNo(TipoNode, "NOME-ORGAO");
			String nomeCurso = TesteNullNo(TipoNode, "NOME-CURSO");

			Especializacao especializacao = new Especializacao(anoInicio, anoConclusao, nomeInstituicao, statusCurso,
					tituloTrabalho, nomeAgenciaFinanciadora, tituloTrabalhoEN, nomeCursoEN, flagBolsa, nomeOrientador,
					nomeOrgao, nomeCurso);
			ListEspecializacaoResult.add(especializacao);
		}
		return ListEspecializacaoResult;
	}

	public ArrayList<Aperfeicoamento> BuscaAperfeicoamento() throws XPathExpressionException {
		XPathExpression expr = this.xpath.compile("//APERFEICOAMENTO");
		NodeList listaResultaXpath = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		ArrayList<Aperfeicoamento> ListAperfeicoamentoResult = new ArrayList<>();
		for (int i = 0; i < listaResultaXpath.getLength(); i++) {
			Node TipoNode = listaResultaXpath.item(i);
			String anoInicio = TesteNullNo(TipoNode, "ANO-DE-INICIO");
			String anoConclusao = TesteNullNo(TipoNode, "ANO-DE-CONCLUSAO");
			String nomeInstituicao = TesteNullNo(TipoNode, "NOME-INSTITUICAO");
			String statusCurso = TesteNullNo(TipoNode, "STATUS-DO-CURSO");
			String tituloTrabalho = TesteNullNo(TipoNode, "TITULO-DA-MONOGRAFIA");
			String nomeAgenciaFinanciadora = TesteNullNo(TipoNode, "NOME-AGENCIA");
			String tituloTrabalhoEN = TesteNullNo(TipoNode, "TITULO-DA-MONOGRAFIA-INGLES");
			String nomeCursoEN = TesteNullNo(TipoNode, "NOME-CURSO-INGLES");
			String flagBolsa = TesteNullNo(TipoNode, "FLAG-BOLSA");
			String nomeOrientador = TesteNullNo(TipoNode, "NOME-DO-ORIENTADOR");
			String nomeOrgao = TesteNullNo(TipoNode, "NOME-ORGAO");
			String nomeCurso = TesteNullNo(TipoNode, "NOME-CURSO");

			Aperfeicoamento aperfeicoamento = new Aperfeicoamento(anoInicio, anoConclusao, nomeInstituicao, statusCurso,
					tituloTrabalho, nomeAgenciaFinanciadora, tituloTrabalhoEN, nomeCursoEN, flagBolsa, nomeOrientador,
					nomeOrgao, nomeCurso);
			ListAperfeicoamentoResult.add(aperfeicoamento);
		}
		return ListAperfeicoamentoResult;
	}

	public ArrayList<CursoTecnico> BuscaCursoTecnico() throws XPathExpressionException {
		XPathExpression expr = this.xpath.compile("//CURSO-TECNICO-PROFISSIONALIZANTE");
		NodeList listaResultaXpath = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		ArrayList<CursoTecnico> ListCursoTecnicoResult = new ArrayList<>();
		for (int i = 0; i < listaResultaXpath.getLength(); i++) {
			Node TipoNode = listaResultaXpath.item(i);
			String anoInicio = TesteNullNo(TipoNode, "ANO-DE-INICIO");
			String anoConclusao = TesteNullNo(TipoNode, "ANO-DE-CONCLUSAO");
			String nomeInstituicao = TesteNullNo(TipoNode, "NOME-INSTITUICAO");
			String statusCurso = TesteNullNo(TipoNode, "STATUS-DO-CURSO");
			String nomeAgenciaFinanciadora = TesteNullNo(TipoNode, "NOME-AGENCIA");
			String flagBolsa = TesteNullNo(TipoNode, "FLAG-BOLSA");
			String nomeOrgao = TesteNullNo(TipoNode, "NOME-ORGAO");
			String nomeCurso = TesteNullNo(TipoNode, "NOME-CURSO");

			CursoTecnico cursoTecnico = new CursoTecnico(anoInicio, anoConclusao, nomeInstituicao, statusCurso,
					nomeOrgao, nomeCurso, flagBolsa, nomeAgenciaFinanciadora);
			ListCursoTecnicoResult.add(cursoTecnico);
		}
		return ListCursoTecnicoResult;
	}

	public ArrayList<EnsinoFundamental> BuscaEnsinoFundamental() throws XPathExpressionException {
		XPathExpression expr = this.xpath.compile("//ENSINO-FUNDAMENTAL-PRIMEIRO-GRAU");
		NodeList listaResultaXpath = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		ArrayList<EnsinoFundamental> ListEnsinoFundamentalResult = new ArrayList<>();
		for (int i = 0; i < listaResultaXpath.getLength(); i++) {
			Node TipoNode = listaResultaXpath.item(i);
			String anoInicio = TesteNullNo(TipoNode, "ANO-DE-INICIO");
			String anoConclusao = TesteNullNo(TipoNode, "ANO-DE-CONCLUSAO");
			String nomeInstituicao = TesteNullNo(TipoNode, "NOME-INSTITUICAO");
			String statusCurso = TesteNullNo(TipoNode, "STATUS-DO-CURSO");

			EnsinoFundamental ensinoFundamental = new EnsinoFundamental(anoInicio, anoConclusao, nomeInstituicao,
					statusCurso);
			ListEnsinoFundamentalResult.add(ensinoFundamental);
		}
		return ListEnsinoFundamentalResult;
	}

	public ArrayList<EnsinoMedio> BuscaEnsinoMedio() throws XPathExpressionException {
		XPathExpression expr = this.xpath.compile("//ENSINO-MEDIO-SEGUNDO-GRAU");
		NodeList listaResultaXpath = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		ArrayList<EnsinoMedio> ListEnsinoMedioResult = new ArrayList<>();
		for (int i = 0; i < listaResultaXpath.getLength(); i++) {
			Node TipoNode = listaResultaXpath.item(i);
			String anoInicio = TesteNullNo(TipoNode, "ANO-DE-INICIO");
			String anoConclusao = TesteNullNo(TipoNode, "ANO-DE-CONCLUSAO");
			String nomeInstituicao = TesteNullNo(TipoNode, "NOME-INSTITUICAO");
			String statusCurso = TesteNullNo(TipoNode, "STATUS-DO-CURSO");

			EnsinoMedio ensinoMedio = new EnsinoMedio(anoInicio, anoConclusao, nomeInstituicao, statusCurso);
			ListEnsinoMedioResult.add(ensinoMedio);
		}
		return ListEnsinoMedioResult;
	}

	public ArrayList<MestradoAcademico> BuscaMestradoAcademico() throws XPathExpressionException {
		XPathExpression expr = this.xpath.compile("//MESTRADO");
		NodeList listaResultaXpath = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		ArrayList<MestradoAcademico> ListaResultadoBusca = new ArrayList<>();
		for (int i = 0; i < listaResultaXpath.getLength(); i++) {
			Node TipoNode = listaResultaXpath.item(i);
			String anoInicio = TesteNullNo(TipoNode, "ANO-DE-INICIO");
			String anoConclusao = TesteNullNo(TipoNode, "ANO-DE-CONCLUSAO");
			String nomeInstituicao = TesteNullNo(TipoNode, "NOME-INSTITUICAO");
			String statusCurso = TesteNullNo(TipoNode, "STATUS-DO-CURSO");
			String tituloTrabalho = TesteNullNo(TipoNode, "TITULO-DA-DISSERTACAO-TESE");
			String nomeAgenciaFinanciadora = TesteNullNo(TipoNode, "NOME-AGENCIA");
			String tituloTrabalhoEN = TesteNullNo(TipoNode, "TITULO-DA-DISSERTACAO-TESE-INGLES");
			String nomeCursoEN = TesteNullNo(TipoNode, "NOME-CURSO-INGLES");
			String flagBolsa = TesteNullNo(TipoNode, "FLAG-BOLSA");
			String codigoAreaCurso = TesteNullNo(TipoNode, "CODIGO-AREA-CURSO");
			String idOrientador = TesteNullNo(TipoNode, "NUMERO-ID-ORIENTADOR");
			String tipoCurso = TesteNullNo(TipoNode, "TIPO-MESTRADO");
			String nomeOrientador = TesteNullNo(TipoNode, "NOME-COMPLETO-DO-ORIENTADOR");
			String nomeOrgao = TesteNullNo(TipoNode, "NOME-ORGAO");
			String nomeCurso = TesteNullNo(TipoNode, "NOME-CURSO");
			String anoObtencaoTitulo = TesteNullNo(TipoNode, "ANO-DE-OBTENCAO-DO-TITULO");
			String nomeCoorientador = TesteNullNo(TipoNode, "NOME-DO-CO-ORIENTADOR");
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
			MestradoAcademico mestrado = new MestradoAcademico(anoInicio, anoConclusao, nomeInstituicao, statusCurso,
					tituloTrabalho, nomeAgenciaFinanciadora, tituloTrabalhoEN, nomeCursoEN, flagBolsa, nomeOrientador,
					nomeOrgao, nomeCurso, codigoAreaCurso, idOrientador, tipoCurso, anoObtencaoTitulo, palavraChave,
					setorAtividade, areaConhecimento, nomeCoorientador);
			ListaResultadoBusca.add(mestrado);
		}
		return ListaResultadoBusca;
	}

	public ArrayList<Doutorado> BuscaDoutorado() throws XPathExpressionException {
		XPathExpression expr = this.xpath.compile("//DOUTORADO");
		NodeList listaResultaXpath = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		ArrayList<Doutorado> ListaResultadoBusca = new ArrayList<>();
		for (int i = 0; i < listaResultaXpath.getLength(); i++) {
			Node TipoNode = listaResultaXpath.item(i);
			String anoInicio = TesteNullNo(TipoNode, "ANO-DE-INICIO");
			String anoConclusao = TesteNullNo(TipoNode, "ANO-DE-CONCLUSAO");
			String nomeInstituicao = TesteNullNo(TipoNode, "NOME-INSTITUICAO");
			String statusCurso = TesteNullNo(TipoNode, "STATUS-DO-CURSO");
			String tituloTrabalho = TesteNullNo(TipoNode, "TITULO-DA-DISSERTACAO-TESE");
			String nomeAgenciaFinanciadora = TesteNullNo(TipoNode, "NOME-AGENCIA");
			String tituloTrabalhoEN = TesteNullNo(TipoNode, "TITULO-DA-DISSERTACAO-TESE-INGLES");
			String nomeCursoEN = TesteNullNo(TipoNode, "NOME-CURSO-INGLES");
			String flagBolsa = TesteNullNo(TipoNode, "FLAG-BOLSA");
			String codigoAreaCurso = TesteNullNo(TipoNode, "CODIGO-AREA-CURSO");
			String idOrientador = TesteNullNo(TipoNode, "NUMERO-ID-ORIENTADOR");
			String tipoCurso = TesteNullNo(TipoNode, "TIPO-DOUTORADO");
			String nomeOrientador = TesteNullNo(TipoNode, "NOME-COMPLETO-DO-ORIENTADOR");
			String nomeOrgao = TesteNullNo(TipoNode, "NOME-ORGAO");
			String nomeCurso = TesteNullNo(TipoNode, "NOME-CURSO");
			String anoObtencaoTitulo = TesteNullNo(TipoNode, "ANO-DE-OBTENCAO-DO-TITULO");
			String nomeCoorientador = TesteNullNo(TipoNode, "NOME-DO-CO-ORIENTADOR");
			String nomeOrientadorSanduiche = TesteNullNo(TipoNode, "NOME-DO-ORIENTADOR-SANDUICHE");
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
			Doutorado doutorado = new Doutorado(anoInicio, anoConclusao, nomeInstituicao, statusCurso, tituloTrabalho,
					nomeAgenciaFinanciadora, tituloTrabalhoEN, nomeCursoEN, flagBolsa, nomeOrientador, nomeOrgao,
					nomeCurso, codigoAreaCurso, idOrientador, tipoCurso, anoObtencaoTitulo, palavraChave,
					setorAtividade, areaConhecimento, nomeCoorientador, nomeOrientadorSanduiche);
			ListaResultadoBusca.add(doutorado);
		}
		return ListaResultadoBusca;
	}

	public ArrayList<LivreDocencia> BuscaLivreDocencia() throws XPathExpressionException {
		XPathExpression expr = this.xpath.compile("//LIVRE-DOCENCIA");
		NodeList listaResultaXpath = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		ArrayList<LivreDocencia> ListaResultadoBusca = new ArrayList<>();
		for (int i = 0; i < listaResultaXpath.getLength(); i++) {
			Node TipoNode = listaResultaXpath.item(i);
			String nomeInstituicao = TesteNullNo(TipoNode, "NOME-INSTITUICAO");
			String tituloTrabalho = TesteNullNo(TipoNode, "TITULO-DO-TRABALHO");
			String tituloTrabalhoEN = TesteNullNo(TipoNode, "TITULO-DO-TRABALHO-INGLES");
			String anoObtencaoTitulo = TesteNullNo(TipoNode, "ANO-DE-OBTENCAO-DO-TITULO");
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
			LivreDocencia livreDocencia = new LivreDocencia(nomeInstituicao, anoObtencaoTitulo, tituloTrabalho,
					tituloTrabalhoEN, palavraChave, setorAtividade, areaConhecimento);
			ListaResultadoBusca.add(livreDocencia);
		}
		return ListaResultadoBusca;
	}

	public ArrayList<PosDoutorado> BuscaPosDoutorado() throws XPathExpressionException {
		XPathExpression expr = this.xpath.compile("//POS-DOUTORADO");
		NodeList listaResultaXpath = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		ArrayList<PosDoutorado> ListaResultadoBusca = new ArrayList<>();
		for (int i = 0; i < listaResultaXpath.getLength(); i++) {
			Node TipoNode = listaResultaXpath.item(i);
			String anoInicio = TesteNullNo(TipoNode, "ANO-DE-INICIO");
			String anoConclusao = TesteNullNo(TipoNode, "ANO-DE-CONCLUSAO");
			String nomeInstituicao = TesteNullNo(TipoNode, "NOME-INSTITUICAO");
			String statusCurso = TesteNullNo(TipoNode, "STATUS-DO-CURSO");
			String tituloTrabalho = TesteNullNo(TipoNode, "TITULO-DO-TRABALHO");
			String nomeAgenciaFinanciadora = TesteNullNo(TipoNode, "NOME-AGENCIA");
			String tituloTrabalhoEN = TesteNullNo(TipoNode, "TITULO-DO-TRABALHO-INGLES");
			String nomeCursoEN = TesteNullNo(TipoNode, "NOME-CURSO-INGLES");
			String flagBolsa = TesteNullNo(TipoNode, "FLAG-BOLSA");
			String idOrientador = TesteNullNo(TipoNode, "NUMERO-ID-ORIENTADOR");
			String anoObtencaoTitulo = TesteNullNo(TipoNode, "ANO-DE-OBTENCAO-DO-TITULO");
			String statusEstagio = TesteNullNo(TipoNode, "STATUS-DO-ESTAGIO");
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
			PosDoutorado posDoutorado = new PosDoutorado(anoInicio, anoConclusao, nomeInstituicao, statusCurso,
					tituloTrabalho, nomeAgenciaFinanciadora, tituloTrabalhoEN, nomeCursoEN, flagBolsa,
					anoObtencaoTitulo, statusEstagio, idOrientador, palavraChave, setorAtividade, areaConhecimento);
			ListaResultadoBusca.add(posDoutorado);
		}
		return ListaResultadoBusca;
	}

	public ArrayList<MestradoProfissionalizante> BuscaMestradoProfissionalizante() throws XPathExpressionException {
		XPathExpression expr = this.xpath.compile("//MESTRADO-PROFISSIONALIZANTE");
		NodeList listaResultaXpath = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		ArrayList<MestradoProfissionalizante> ListaResultadoBusca = new ArrayList<>();
		for (int i = 0; i < listaResultaXpath.getLength(); i++) {
			Node TipoNode = listaResultaXpath.item(i);
			String anoInicio = TesteNullNo(TipoNode, "ANO-DE-INICIO");
			String anoConclusao = TesteNullNo(TipoNode, "ANO-DE-CONCLUSAO");
			String nomeInstituicao = TesteNullNo(TipoNode, "NOME-INSTITUICAO");
			String statusCurso = TesteNullNo(TipoNode, "STATUS-DO-CURSO");
			String tituloTrabalho = TesteNullNo(TipoNode, "TITULO-DA-DISSERTACAO-TESE");
			String nomeAgenciaFinanciadora = TesteNullNo(TipoNode, "NOME-AGENCIA");
			String tituloTrabalhoEN = TesteNullNo(TipoNode, "TITULO-DA-DISSERTACAO-TESE-INGLES");
			String nomeCursoEN = TesteNullNo(TipoNode, "NOME-CURSO-INGLES");
			String flagBolsa = TesteNullNo(TipoNode, "FLAG-BOLSA");
			String codigoAreaCurso = TesteNullNo(TipoNode, "CODIGO-AREA-CURSO");
			String idOrientador = TesteNullNo(TipoNode, "NUMERO-ID-ORIENTADOR");
			String tipoCurso = TesteNullNo(TipoNode, "TIPO-DOUTORADO");
			String nomeOrgao = TesteNullNo(TipoNode, "NOME-ORGAO");
			String nomeCurso = TesteNullNo(TipoNode, "NOME-CURSO");
			String anoObtencaoTitulo = TesteNullNo(TipoNode, "ANO-DE-OBTENCAO-DO-TITULO");
			String nomeCoorientador = TesteNullNo(TipoNode, "NOME-DO-CO-ORIENTADOR");
			String nomeOrientador = TesteNullNo(TipoNode, "NOME-COMPLETO-DO-ORIENTADOR");
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
			MestradoProfissionalizante mestradoProfissionalizante = new MestradoProfissionalizante(anoInicio,
					anoConclusao, nomeInstituicao, statusCurso, tituloTrabalho, nomeAgenciaFinanciadora,
					tituloTrabalhoEN, nomeCursoEN, flagBolsa, nomeOrientador, nomeOrgao, nomeCurso, codigoAreaCurso,
					idOrientador, tipoCurso, anoObtencaoTitulo, palavraChave, setorAtividade, areaConhecimento,
					nomeCoorientador);
			ListaResultadoBusca.add(mestradoProfissionalizante);
		}
		return ListaResultadoBusca;
	}

	public ArrayList<ResidenciaMedica> BuscaResidenciaMedica() throws XPathExpressionException {
		XPathExpression expr = this.xpath.compile("//MESTRADO-PROFISSIONALIZANTE");
		NodeList listaResultaXpath = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		ArrayList<ResidenciaMedica> ListaResultadoBusca = new ArrayList<>();
		for (int i = 0; i < listaResultaXpath.getLength(); i++) {
			Node TipoNode = listaResultaXpath.item(i);
			String anoInicio = TesteNullNo(TipoNode, "ANO-DE-INICIO");
			String anoConclusao = TesteNullNo(TipoNode, "ANO-DE-CONCLUSAO");
			String nomeInstituicao = TesteNullNo(TipoNode, "NOME-INSTITUICAO");
			String statusCurso = TesteNullNo(TipoNode, "STATUS-DO-CURSO");
			String nomeAgenciaFinanciadora = TesteNullNo(TipoNode, "NOME-AGENCIA");
			String flagBolsa = TesteNullNo(TipoNode, "FLAG-BOLSA");
			String tituloResidencia = TesteNullNo(TipoNode, "TITULO-DA-RESIDENCIA-MEDICA");
			String numeroRegistro = TesteNullNo(TipoNode, "NUMERO-DO-REGISTRO");
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
			ResidenciaMedica residenciaMedica = new ResidenciaMedica(anoInicio, anoConclusao, nomeInstituicao,
					statusCurso, flagBolsa, nomeAgenciaFinanciadora, tituloResidencia, numeroRegistro, palavraChave,
					setorAtividade, areaConhecimento);
			ListaResultadoBusca.add(residenciaMedica);
		}
		return ListaResultadoBusca;
	}

}
