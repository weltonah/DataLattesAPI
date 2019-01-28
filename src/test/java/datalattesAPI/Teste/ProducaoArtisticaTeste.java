package datalattesAPI.Teste;

import java.io.File;
import java.util.ArrayList;

import javax.xml.xpath.XPathExpressionException;

import org.junit.Test;

import br.com.datalattesAPI.DTapi;
import br.com.datalattesAPI.model.ProducaoArtistica.ApresentacaoDeObraArtistica;
import br.com.datalattesAPI.model.ProducaoArtistica.ApresentacaoEmRadioOuTv;
import br.com.datalattesAPI.model.ProducaoArtistica.ArranjoMusical;
import br.com.datalattesAPI.model.ProducaoArtistica.ArtesCenicas;
import br.com.datalattesAPI.model.ProducaoArtistica.ArtesVisuais;
import br.com.datalattesAPI.model.ProducaoArtistica.ComposicaoMusical;
import br.com.datalattesAPI.model.ProducaoArtistica.CursoDeCurtaDuracao;
import br.com.datalattesAPI.model.ProducaoArtistica.Musica;
import br.com.datalattesAPI.model.ProducaoArtistica.ObraDeArtesVisuais;
import br.com.datalattesAPI.model.ProducaoArtistica.OutraProducaoArtisticaCultural;
import br.com.datalattesAPI.model.ProducaoArtistica.PartituraMusical;
import br.com.datalattesAPI.model.ProducaoArtistica.Sonoplastia;

public class ProducaoArtisticaTeste {

	@Test
	public void PartituraMusical() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<PartituraMusical> result = dt.getProducaoArtisticaDao().PartituraMusical();
	}

	@Test
	public void ApresentacaoDeObraArtistica() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<ApresentacaoDeObraArtistica> result = dt.getProducaoArtisticaDao().ApresentacaoDeObraArtistica();
	}

	@Test
	public void ApresentacaoEmRadioOuTv() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<ApresentacaoEmRadioOuTv> result = dt.getProducaoArtisticaDao().ApresentacaoEmRadioOuTv();
	}

	@Test
	public void ArranjoMusical() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<ArranjoMusical> result = dt.getProducaoArtisticaDao().ArranjoMusical();
	}

	@Test
	public void ComposicaoMusical() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<ComposicaoMusical> result = dt.getProducaoArtisticaDao().ComposicaoMusical();
	}

	@Test
	public void CursoDeCurtaDuracao() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<CursoDeCurtaDuracao> result = dt.getProducaoArtisticaDao().CursoDeCurtaDuracao();
	}

	@Test
	public void ObraDeArtesVisuais() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<ObraDeArtesVisuais> result = dt.getProducaoArtisticaDao().ObraDeArtesVisuais();
	}

	@Test
	public void OutraProducaoArtisticaCultural() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<OutraProducaoArtisticaCultural> result = dt.getProducaoArtisticaDao()
				.OutraProducaoArtisticaCultural();
	}

	@Test
	public void Sonoplastia() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<Sonoplastia> result = dt.getProducaoArtisticaDao().Sonoplastia();
	}

	@Test
	public void ArtesCenicas() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<ArtesCenicas> result = dt.getProducaoArtisticaDao().ArtesCenicas();
	}

	@Test
	public void ArtesVisuais() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<ArtesVisuais> result = dt.getProducaoArtisticaDao().ArtesVisuais();
	}

	@Test
	public void Musica() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<Musica> result = dt.getProducaoArtisticaDao().Musica();
	}
}
