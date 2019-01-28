package br.com.datalattesAPI.DAO;

import java.io.File;
import java.util.ArrayList;
import java.util.stream.Collectors;

import javax.xml.xpath.XPathExpressionException;

import br.com.datalattesAPI.Xpath.BancaXpath;
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

public class BancaDao {
	public BancaXpath bancaXpath;

	public BancaDao(File file) {
		this.bancaXpath = new BancaXpath(file);
	}

	public ArrayList<BancaProfessorTitular> BancaProfessorTitular() throws XPathExpressionException {
		ArrayList<AuxiliarBanca> resposta = this.bancaXpath
				.BuscaBancaProfissional("//BANCA-JULGADORA-PARA-PROFESSOR-TITULAR", "BancaProfessorTitular");
		ArrayList<BancaProfessorTitular> result = (ArrayList<BancaProfessorTitular>) resposta.stream()
				.map(u -> (BancaProfessorTitular) u).collect(Collectors.toList());
		return result;
	}

	public ArrayList<BancaConcursoPublico> BancaConcursoPublico() throws XPathExpressionException {
		ArrayList<AuxiliarBanca> resposta = this.bancaXpath
				.BuscaBancaProfissional("//BANCA-JULGADORA-PARA-CONCURSO-PUBLICO", "BancaConcursoPublico");
		ArrayList<BancaConcursoPublico> result = (ArrayList<BancaConcursoPublico>) resposta.stream()
				.map(u -> (BancaConcursoPublico) u).collect(Collectors.toList());
		return result;
	}

	public ArrayList<BancaAvaliacaoCurso> BancaAvaliacaoCurso() throws XPathExpressionException {
		ArrayList<AuxiliarBanca> resposta = this.bancaXpath
				.BuscaBancaProfissional("//BANCA-JULGADORA-PARA-AVALIACAO-CURSOS", "BancaAvaliacaoCurso");
		ArrayList<BancaAvaliacaoCurso> result = (ArrayList<BancaAvaliacaoCurso>) resposta.stream()
				.map(u -> (BancaAvaliacaoCurso) u).collect(Collectors.toList());
		return result;
	}

	public ArrayList<BancaLivreDocencia> BancaLivreDocencia() throws XPathExpressionException {
		ArrayList<AuxiliarBanca> resposta = this.bancaXpath
				.BuscaBancaProfissional("//BANCA-JULGADORA-PARA-LIVRE-DOCENCIA", "BancaLivreDocencia");
		ArrayList<BancaLivreDocencia> result = (ArrayList<BancaLivreDocencia>) resposta.stream()
				.map(u -> (BancaLivreDocencia) u).collect(Collectors.toList());
		return result;
	}

	public ArrayList<BancaMestrado> BancaMestrado() throws XPathExpressionException {
		ArrayList<BancaFormacao> resposta = this.bancaXpath.BuscaBancaFormacao("//PARTICIPACAO-EM-BANCA-DE-MESTRADO",
				"BancaMestrado");
		ArrayList<BancaMestrado> result = (ArrayList<BancaMestrado>) resposta.stream().map(u -> (BancaMestrado) u)
				.collect(Collectors.toList());
		return result;
	}

	public ArrayList<BancaDoutorado> BancaDoutorado() throws XPathExpressionException {
		ArrayList<BancaFormacao> resposta = this.bancaXpath.BuscaBancaFormacao("//PARTICIPACAO-EM-BANCA-DE-DOUTORADO",
				"BancaDoutorado");
		ArrayList<BancaDoutorado> result = (ArrayList<BancaDoutorado>) resposta.stream().map(u -> (BancaDoutorado) u)
				.collect(Collectors.toList());
		return result;
	}

	public ArrayList<BancaQualificacaoDoutorado> BancaQualificacaoDoutorado() throws XPathExpressionException {
		ArrayList<BancaFormacao> resposta = this.bancaXpath
				.BuscaBancaFormacao("//PARTICIPACAO-EM-BANCA-DE-EXAME-QUALIFICACAO", "BancaQualificacaoDoutorado");
		ArrayList<BancaQualificacaoDoutorado> result = (ArrayList<BancaQualificacaoDoutorado>) resposta.stream()
				.map(u -> (BancaQualificacaoDoutorado) u).collect(Collectors.toList());
		return result;
	}

	public ArrayList<BancaGraduacao> BancaGraduacao() throws XPathExpressionException {
		ArrayList<BancaFormacao> resposta = this.bancaXpath.BuscaBancaFormacao("//PARTICIPACAO-EM-BANCA-DE-GRADUACAO",
				"BancaGraduacao");
		ArrayList<BancaGraduacao> result = (ArrayList<BancaGraduacao>) resposta.stream().map(u -> (BancaGraduacao) u)
				.collect(Collectors.toList());
		return result;
	}

	public ArrayList<BancaAperfeicoamentoEspecializacao> BancaAperfeicoamentoEspecializacao()
			throws XPathExpressionException {
		ArrayList<BancaFormacao> resposta = this.bancaXpath.BuscaBancaFormacao(
				"//PARTICIPACAO-EM-BANCA-DE-APERFEICOAMENTO-ESPECIALIZACAO", "BancaAperfeicoamentoEspecializacao");
		ArrayList<BancaAperfeicoamentoEspecializacao> result = (ArrayList<BancaAperfeicoamentoEspecializacao>) resposta
				.stream().map(u -> (BancaAperfeicoamentoEspecializacao) u).collect(Collectors.toList());
		return result;
	}
}
