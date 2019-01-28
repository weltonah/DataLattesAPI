package datalattesAPI.Teste;

import java.io.File;
import java.util.ArrayList;

import javax.xml.xpath.XPathExpressionException;

import org.junit.Test;

import br.com.datalattesAPI.DTapi;
import br.com.datalattesAPI.model.ProducaoTecnica.ApresentacaoDeTrabalho;
import br.com.datalattesAPI.model.ProducaoTecnica.CartaMapaOuSimilar;
import br.com.datalattesAPI.model.ProducaoTecnica.CultivarProtegida;
import br.com.datalattesAPI.model.ProducaoTecnica.CultivarRegistrada;
import br.com.datalattesAPI.model.ProducaoTecnica.CursoDeCurtaDuracaoMinistrado;
import br.com.datalattesAPI.model.ProducaoTecnica.DesenhoIndustrial;
import br.com.datalattesAPI.model.ProducaoTecnica.DesenvolvimentoDeMaterialDidaticoOuInstrucional;
import br.com.datalattesAPI.model.ProducaoTecnica.Editoracao;
import br.com.datalattesAPI.model.ProducaoTecnica.ManutencaoDeObraArtistica;
import br.com.datalattesAPI.model.ProducaoTecnica.Maquete;
import br.com.datalattesAPI.model.ProducaoTecnica.Marca;
import br.com.datalattesAPI.model.ProducaoTecnica.MidiaSocialWebsiteBlog;
import br.com.datalattesAPI.model.ProducaoTecnica.OrganizacaoDeEvento;
import br.com.datalattesAPI.model.ProducaoTecnica.Patente;
import br.com.datalattesAPI.model.ProducaoTecnica.ProcessosOuTecnicas;
import br.com.datalattesAPI.model.ProducaoTecnica.ProdutoTecnologico;
import br.com.datalattesAPI.model.ProducaoTecnica.ProgramaDeRadioOuTv;
import br.com.datalattesAPI.model.ProducaoTecnica.RelatorioDePesquisa;
import br.com.datalattesAPI.model.ProducaoTecnica.Software;
import br.com.datalattesAPI.model.ProducaoTecnica.TopografiaDeCircuitoIntegrado;
import br.com.datalattesAPI.model.ProducaoTecnica.TrabalhoTecnico;

public class ProducaoTecnicaTeste {

	@Test
	public void CultivarRegistrada() throws InterruptedException, XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<CultivarRegistrada> result = dt.getProducaoTecnicaDao().CultivarRegistrada();
		// assertEquals(result.size(), 17);
	}

	@Test
	public void Software() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<Software> result = dt.getProducaoTecnicaDao().Software();
	}

	@Test
	public void Patente() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<Patente> result = dt.getProducaoTecnicaDao().Patente();
	}

	@Test
	public void CultivarProtegida() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<CultivarProtegida> result = dt.getProducaoTecnicaDao().CultivarProtegida();
	}

	@Test
	public void DesenhoIndustrial() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<DesenhoIndustrial> result = dt.getProducaoTecnicaDao().DesenhoIndustrial();
	}

	@Test
	public void Marca() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<Marca> result = dt.getProducaoTecnicaDao().Marca();
	}

	@Test
	public void TopografiaDeCircuitoIntegrado() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<TopografiaDeCircuitoIntegrado> result = dt.getProducaoTecnicaDao().TopografiaDeCircuitoIntegrado();
	}

	@Test
	public void ProdutoTecnologico() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<ProdutoTecnologico> result = dt.getProducaoTecnicaDao().ProdutoTecnologico();
	}

	@Test
	public void ProcessosOuTecnicas() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<ProcessosOuTecnicas> result = dt.getProducaoTecnicaDao().ProcessosOuTecnicas();
	}

	@Test
	public void TrabalhoTecnico() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<TrabalhoTecnico> result = dt.getProducaoTecnicaDao().TrabalhoTecnico();
	}

	@Test
	public void ApresentacaoDeTrabalho() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<ApresentacaoDeTrabalho> result = dt.getProducaoTecnicaDao().ApresentacaoDeTrabalho();
	}

	@Test
	public void CartaMapaOuSimilar() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<CartaMapaOuSimilar> result = dt.getProducaoTecnicaDao().CartaMapaOuSimilar();
	}

	@Test
	public void CursoDeCurtaDuracaoMinistrado() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<CursoDeCurtaDuracaoMinistrado> result = dt.getProducaoTecnicaDao().CursoDeCurtaDuracaoMinistrado();
	}

	@Test
	public void DesenvolvimentoDeMaterialDidaticoOuInstrucional() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<DesenvolvimentoDeMaterialDidaticoOuInstrucional> result = dt.getProducaoTecnicaDao()
				.DesenvolvimentoDeMaterialDidaticoOuInstrucional();
	}

	@Test
	public void Editoracao() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<Editoracao> result = dt.getProducaoTecnicaDao().Editoracao();
	}

	@Test
	public void ManutencaoDeObraArtistica() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<ManutencaoDeObraArtistica> result = dt.getProducaoTecnicaDao().ManutencaoDeObraArtistica();
	}

	@Test
	public void Maquete() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<Maquete> result = dt.getProducaoTecnicaDao().Maquete();
	}

	@Test
	public void OrganizacaoDeEvento() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<OrganizacaoDeEvento> result = dt.getProducaoTecnicaDao().OrganizacaoDeEvento();
	}

	@Test
	public void ProgramaDeRadioOuTv() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<ProgramaDeRadioOuTv> result = dt.getProducaoTecnicaDao().ProgramaDeRadioOuTv();
	}

	@Test
	public void RelatorioDePesquisa() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<RelatorioDePesquisa> result = dt.getProducaoTecnicaDao().RelatorioDePesquisa();
	}

	@Test
	public void MidiaSocialWebsiteBlog() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<MidiaSocialWebsiteBlog> result = dt.getProducaoTecnicaDao().MidiaSocialWebsiteBlog();
	}

}
