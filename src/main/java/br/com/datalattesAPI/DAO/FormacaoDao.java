package br.com.datalattesAPI.DAO;

import java.io.File;
import java.util.ArrayList;

import javax.xml.xpath.XPathExpressionException;

import br.com.datalattesAPI.Xpath.FormacaoXpath;
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

public class FormacaoDao {

	public FormacaoXpath formacaoXpath;

	public FormacaoDao(File file) {
		this.formacaoXpath = new FormacaoXpath(file);
	}

	public ArrayList<Graduacao> FormacaoGraduacao() throws XPathExpressionException {
		return this.formacaoXpath.BuscaGraduacao();
	}

	public ArrayList<Especializacao> FormacaoEspecializacao() throws XPathExpressionException {
		return this.formacaoXpath.BuscaEspecializacao();
	}

	public ArrayList<Aperfeicoamento> FormacaoAperfeicoamento() throws XPathExpressionException {
		return this.formacaoXpath.BuscaAperfeicoamento();
	}

	public ArrayList<CursoTecnico> FormacaoCursoTecnico() throws XPathExpressionException {
		return this.formacaoXpath.BuscaCursoTecnico();
	}

	public ArrayList<EnsinoFundamental> FormacaoEnsinoFundamental() throws XPathExpressionException {
		return this.formacaoXpath.BuscaEnsinoFundamental();
	}

	public ArrayList<EnsinoMedio> FormacaoEnsinoMedio() throws XPathExpressionException {
		return this.formacaoXpath.BuscaEnsinoMedio();
	}

	public ArrayList<MestradoAcademico> FormacaoMestrado() throws XPathExpressionException {
		return this.formacaoXpath.BuscaMestradoAcademico();
	}

	public ArrayList<Doutorado> FormacaoDoutorado() throws XPathExpressionException {
		return this.formacaoXpath.BuscaDoutorado();
	}

	public ArrayList<LivreDocencia> FormacaoLivreDocencia() throws XPathExpressionException {
		return this.formacaoXpath.BuscaLivreDocencia();
	}

	public ArrayList<PosDoutorado> FormacaoPosDoutorado() throws XPathExpressionException {
		return this.formacaoXpath.BuscaPosDoutorado();
	}

	public ArrayList<MestradoProfissionalizante> FormacaoMestradoProfissionalizante() throws XPathExpressionException {
		return this.formacaoXpath.BuscaMestradoProfissionalizante();
	}

	public ArrayList<ResidenciaMedica> FormacaoResidenciaMedica() throws XPathExpressionException {
		return this.formacaoXpath.BuscaResidenciaMedica();
	}

}
