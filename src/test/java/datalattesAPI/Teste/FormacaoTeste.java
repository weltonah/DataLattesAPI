package datalattesAPI.Teste;

import java.io.File;
import java.util.ArrayList;

import javax.xml.xpath.XPathExpressionException;

import org.junit.Test;

import br.com.datalattesAPI.DTapi;
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

public class FormacaoTeste {
	@Test
	public void FormacaoGraduacao() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<Graduacao> result = dt.getFormacaoDao().FormacaoGraduacao();
	}

	@Test
	public void FormacaoEspecializacao() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<Especializacao> result = dt.getFormacaoDao().FormacaoEspecializacao();
	}

	@Test
	public void FormacaoAperfeicoamento() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<Aperfeicoamento> result = dt.getFormacaoDao().FormacaoAperfeicoamento();
	}

	@Test
	public void FormacaoCursoTecnico() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<CursoTecnico> result = dt.getFormacaoDao().FormacaoCursoTecnico();
	}

	@Test
	public void FormacaoEnsinoFundamental() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<EnsinoFundamental> result = dt.getFormacaoDao().FormacaoEnsinoFundamental();
	}

	@Test
	public void FormacaoEnsinoMedio() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<EnsinoMedio> result = dt.getFormacaoDao().FormacaoEnsinoMedio();
	}

	@Test
	public void FormacaoMestrado() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<MestradoAcademico> result = dt.getFormacaoDao().FormacaoMestrado();
	}

	@Test
	public void FormacaoDoutorado() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<Doutorado> result = dt.getFormacaoDao().FormacaoDoutorado();
	}

	@Test
	public void FormacaoLivreDocencia() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<LivreDocencia> result = dt.getFormacaoDao().FormacaoLivreDocencia();
	}

	@Test
	public void FormacaoPosDoutorado() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<PosDoutorado> result = dt.getFormacaoDao().FormacaoPosDoutorado();
	}

	@Test
	public void FormacaoMestradoProfissionalizante()
			throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<MestradoProfissionalizante> result = dt.getFormacaoDao().FormacaoMestradoProfissionalizante();
	}

	@Test
	public void FormacaoResidenciaMedica() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<ResidenciaMedica> result = dt.getFormacaoDao().FormacaoResidenciaMedica();
	}

}
