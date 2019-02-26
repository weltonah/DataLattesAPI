package datalattesAPI.Teste;

import java.io.File;
import java.util.ArrayList;

import javax.xml.xpath.XPathExpressionException;

import org.junit.Test;

import br.com.datalattesAPI.DTapi;
import br.com.datalattesAPI.model.Banca.BancaAperfeicoamentoEspecializacao;
import br.com.datalattesAPI.model.Banca.BancaAvaliacaoCurso;
import br.com.datalattesAPI.model.Banca.BancaConcursoPublico;
import br.com.datalattesAPI.model.Banca.BancaDoutorado;
import br.com.datalattesAPI.model.Banca.BancaGraduacao;
import br.com.datalattesAPI.model.Banca.BancaLivreDocencia;
import br.com.datalattesAPI.model.Banca.BancaMestrado;
import br.com.datalattesAPI.model.Banca.BancaProfessorTitular;
import br.com.datalattesAPI.model.Banca.BancaQualificacaoDoutorado;
import br.com.datalattesAPI.model.Banca.BancaQualificacaoMestrado;


public class BancaTeste {

	@Test
	public void BancaProfessorTitular() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<BancaProfessorTitular> result = dt.getBancaDao().BancaProfessorTitular();
	}

	@Test
	public void BancaConcursoPublico() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<BancaConcursoPublico> result = dt.getBancaDao().BancaConcursoPublico();
	}

	@Test
	public void BancaAvaliacaoCurso() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<BancaAvaliacaoCurso> result = dt.getBancaDao().BancaAvaliacaoCurso();
	}

	@Test
	public void BancaLivreDocencia() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<BancaLivreDocencia> result = dt.getBancaDao().BancaLivreDocencia();
	}

	@Test
	public void BancaMestrado() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<BancaMestrado> result = dt.getBancaDao().BancaMestrado();
	}

	@Test
	public void BancaDoutorado() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<BancaDoutorado> result = dt.getBancaDao().BancaDoutorado();
	}

	@Test
	public void BancaQualificacaoDoutorado() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alexcurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<BancaQualificacaoDoutorado> result = dt.getBancaDao().BancaQualificacaoDoutorado();
	}
	
	@Test
	public void BancaQualificacaoMestrado() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alexcurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<BancaQualificacaoMestrado> result = dt.getBancaDao().BancaQualificacaoMestrado();
	}

	@Test
	public void BancaGraduacao() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<BancaGraduacao> result = dt.getBancaDao().BancaGraduacao();
	}

	@Test
	public void BancaAperfeicoamentoEspecializacao() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<BancaAperfeicoamentoEspecializacao> result = dt.getBancaDao().BancaAperfeicoamentoEspecializacao();
	}
}
