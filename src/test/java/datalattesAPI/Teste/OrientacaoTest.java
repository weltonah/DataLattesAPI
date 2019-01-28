package datalattesAPI.Teste;

import java.io.File;
import java.util.ArrayList;

import javax.xml.xpath.XPathExpressionException;

import org.junit.Test;

import br.com.datalattesAPI.DTapi;
import br.com.datalattesAPI.model.Orientacao.OrientacaoAperfeicoamentoEspecializacao;
import br.com.datalattesAPI.model.Orientacao.OrientacaoDoutorado;
import br.com.datalattesAPI.model.Orientacao.OrientacaoGraduacao;
import br.com.datalattesAPI.model.Orientacao.OrientacaoIniciacaoCientifica;
import br.com.datalattesAPI.model.Orientacao.OrientacaoMestrado;
import br.com.datalattesAPI.model.Orientacao.OrientacaoPosDoutorado;

public class OrientacaoTest {

	@Test
	public void OrientacaoMestradoConcluido() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<OrientacaoMestrado> result = dt.getOrientacaoDao().OrientacaoMestradoConcluido();
	}

	@Test
	public void OrientacaoDoutoradoConcluido() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<OrientacaoDoutorado> result = dt.getOrientacaoDao().OrientacaoDoutoradoConcluido();
	}

	@Test
	public void OrientacaoPosDoutoradoConcluido() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<OrientacaoPosDoutorado> result = dt.getOrientacaoDao().OrientacaoPosDoutoradoConcluido();
	}

	@Test
	public void OrientacaoGraduacaoConcluido() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<OrientacaoGraduacao> result = dt.getOrientacaoDao().OrientacaoGraduacaoConcluido();
	}

	@Test
	public void OrientacaoAperfeicoamentoEspecializacaoConcluido() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<OrientacaoAperfeicoamentoEspecializacao> result = dt.getOrientacaoDao()
				.OrientacaoAperfeicoamentoEspecializacaoConcluido();
	}

	@Test
	public void OrientacaoIniciacaoCientificaConcluido() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<OrientacaoIniciacaoCientifica> result = dt.getOrientacaoDao()
				.OrientacaoIniciacaoCientificaConcluido();
	}

	@Test
	public void OrientacaoMestradoAndamento() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<OrientacaoMestrado> result = dt.getOrientacaoDao().OrientacaoMestradoAndamento();
	}

	@Test
	public void OrientacaoDoutoradoAndamento() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<OrientacaoDoutorado> result = dt.getOrientacaoDao().OrientacaoDoutoradoAndamento();
	}

	@Test
	public void OrientacaoPosDoutoradoAndamento() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<OrientacaoPosDoutorado> result = dt.getOrientacaoDao().OrientacaoPosDoutoradoAndamento();
	}

	@Test
	public void OrientacaoGraduacaoAndamento() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<OrientacaoGraduacao> result = dt.getOrientacaoDao().OrientacaoGraduacaoAndamento();
	}

	@Test
	public void OrientacaoAperfeicoamentoEspecializacaoAndamento() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<OrientacaoAperfeicoamentoEspecializacao> result = dt.getOrientacaoDao()
				.OrientacaoAperfeicoamentoEspecializacaoAndamento();
	}

	@Test
	public void OrientacaoIniciacaoCientificaAndamento() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<OrientacaoIniciacaoCientifica> result = dt.getOrientacaoDao()
				.OrientacaoIniciacaoCientificaAndamento();
	}

}
