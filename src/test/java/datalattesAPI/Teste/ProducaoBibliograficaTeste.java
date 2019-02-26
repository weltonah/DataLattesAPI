package datalattesAPI.Teste;

import java.io.File;
import java.util.ArrayList;

import javax.xml.xpath.XPathExpressionException;

import org.junit.Test;

import br.com.datalattesAPI.DTapi;
import br.com.datalattesAPI.model.ProducaoBibliografica.ArtigoAceitoParaPublicacao;
import br.com.datalattesAPI.model.ProducaoBibliografica.ArtigoPublicado;
import br.com.datalattesAPI.model.ProducaoBibliografica.CapituloDeLivroPublicado;
import br.com.datalattesAPI.model.ProducaoBibliografica.LivroPublicadoOuOrganizado;
import br.com.datalattesAPI.model.ProducaoBibliografica.PrefacioPosfacio;
import br.com.datalattesAPI.model.ProducaoBibliografica.TextoEmJornalOuRevista;
import br.com.datalattesAPI.model.ProducaoBibliografica.TrabalhoEmEventos;
import br.com.datalattesAPI.model.ProducaoBibliografica.Traducao;

public class ProducaoBibliograficaTeste {

	@Test
	public void ArtigoPublicado() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<ArtigoPublicado> result = dt.getProducaoBibliograficaDao().ArtigoPublicado();
	}

	@Test
	public void ArtigoAceitoParaPublicacao() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<ArtigoAceitoParaPublicacao> result = dt.getProducaoBibliograficaDao().ArtigoAceitoParaPublicacao();
	}

	@Test
	public void TrabalhoEmEventos() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<TrabalhoEmEventos> result = dt.getProducaoBibliograficaDao().TrabalhoEmEventos();

	}

	@Test
	public void LivroPublicaasdasdoOuOrganizado() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<LivroPublicadoOuOrganizado> result = dt.getProducaoBibliograficaDao().LivroPublicadoOuOrganizado();

	}

	@Test
	public void CapituloDeLivroPublicado() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<CapituloDeLivroPublicado> result = dt.getProducaoBibliograficaDao().CapituloDeLivroPublicado();

	}

	@Test
	public void TextoEmJornalOuRevista() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<TextoEmJornalOuRevista> result = dt.getProducaoBibliograficaDao().TextoEmJornalOuRevista();

	}

	@Test
	public void PrefacioPosfacio() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<PrefacioPosfacio> result = dt.getProducaoBibliograficaDao().PrefacioPosfacio();

	}

	@Test
	public void Traducao() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<Traducao> result = dt.getProducaoBibliograficaDao().Traducao();

	}
}
