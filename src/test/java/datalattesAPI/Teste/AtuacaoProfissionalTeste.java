package datalattesAPI.Teste;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.util.ArrayList;

import javax.xml.xpath.XPathExpressionException;

import org.junit.Test;

import br.com.datalattesAPI.DTapi;
import br.com.datalattesAPI.model.AtuacaoProfissional.ConselhoComissaoConsultoria;
import br.com.datalattesAPI.model.AtuacaoProfissional.DirecaoAdministracao;
import br.com.datalattesAPI.model.AtuacaoProfissional.Ensino;
import br.com.datalattesAPI.model.AtuacaoProfissional.Estagio;
import br.com.datalattesAPI.model.AtuacaoProfissional.ExtensaoUniversitaria;
import br.com.datalattesAPI.model.AtuacaoProfissional.ParticipacaoProjeto;
import br.com.datalattesAPI.model.AtuacaoProfissional.PesquisaDesenvolvimento;
import br.com.datalattesAPI.model.AtuacaoProfissional.ServicoTecnicoEspecializado;
import br.com.datalattesAPI.model.AtuacaoProfissional.TreinamentoMinistrado;
import br.com.datalattesAPI.model.AtuacaoProfissional.Vinculo;

public class AtuacaoProfissionalTeste {

	@Test
	public void Vinculo() throws InterruptedException, XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<Vinculo> result = dt.getAtuacaoProfissionalDao().Vinculo();
		assertEquals(result.size(), 17);
	}

	@Test
	public void DirecaoAdministracao() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<DirecaoAdministracao> result = dt.getAtuacaoProfissionalDao().DirecaoAdministracao();
	}

	@Test
	public void Estagio() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<Estagio> result = dt.getAtuacaoProfissionalDao().Estagio();
	}

	@Test
	public void ServicoTecnicoEspecializado() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<ServicoTecnicoEspecializado> result = dt.getAtuacaoProfissionalDao().ServicoTecnicoEspecializado();
	}

	@Test
	public void ExtensaoUniversitaria() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<ExtensaoUniversitaria> result = dt.getAtuacaoProfissionalDao().ExtensaoUniversitaria();
	}

	@Test
	public void ConselhoComissaoConsultoria() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<ConselhoComissaoConsultoria> result = dt.getAtuacaoProfissionalDao().ConselhoComissaoConsultoria();
	}

	@Test
	public void Ensino() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<Ensino> result = dt.getAtuacaoProfissionalDao().Ensino();
	}

	@Test
	public void TreinamentoMinistrado() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<TreinamentoMinistrado> result = dt.getAtuacaoProfissionalDao().TreinamentoMinistrado();
	}

	@Test
	public void PesquisaDesenvolvimento() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<PesquisaDesenvolvimento> result = dt.getAtuacaoProfissionalDao().PesquisaDesenvolvimento();
	}

	@Test
	public void ParticipacaoProjeto() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<ParticipacaoProjeto> result = dt.getAtuacaoProfissionalDao().ParticipacaoProjeto();
	}
}
