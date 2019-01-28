package br.com.datalattesAPI.DAO;

import java.io.File;
import java.util.ArrayList;

import javax.xml.xpath.XPathExpressionException;

import br.com.datalattesAPI.Xpath.ProducaoTecnicaXpath;
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

public class ProducaoTecnicaDao {

	public ProducaoTecnicaXpath producaoTecnicaXpath;

	public ProducaoTecnicaDao(File file) {
		this.producaoTecnicaXpath = new ProducaoTecnicaXpath(file);
	}

	public ArrayList<CultivarRegistrada> CultivarRegistrada() throws XPathExpressionException {
		return this.producaoTecnicaXpath.BuscaCultivarRegistrada();
	}

	public ArrayList<Software> Software() throws XPathExpressionException {
		return this.producaoTecnicaXpath.BuscaSoftware();
	}

	public ArrayList<Patente> Patente() throws XPathExpressionException {
		return this.producaoTecnicaXpath.BuscaPatente();
	}

	public ArrayList<CultivarProtegida> CultivarProtegida() throws XPathExpressionException {
		return this.producaoTecnicaXpath.BuscaCultivarProtegida();
	}

	public ArrayList<DesenhoIndustrial> DesenhoIndustrial() throws XPathExpressionException {
		return this.producaoTecnicaXpath.BuscaDesenhoIndustrial();
	}

	public ArrayList<Marca> Marca() throws XPathExpressionException {
		return this.producaoTecnicaXpath.BuscaMarca();
	}

	public ArrayList<TopografiaDeCircuitoIntegrado> TopografiaDeCircuitoIntegrado() throws XPathExpressionException {
		return this.producaoTecnicaXpath.BuscaTopografiaDeCircuitoIntegrado();
	}

	public ArrayList<ProdutoTecnologico> ProdutoTecnologico() throws XPathExpressionException {
		return this.producaoTecnicaXpath.BuscaProdutoTecnologico();
	}

	public ArrayList<ProcessosOuTecnicas> ProcessosOuTecnicas() throws XPathExpressionException {
		return this.producaoTecnicaXpath.BuscaProcessosOuTecnicas();
	}

	public ArrayList<TrabalhoTecnico> TrabalhoTecnico() throws XPathExpressionException {
		return this.producaoTecnicaXpath.BuscaTrabalhoTecnico();
	}

	public ArrayList<ApresentacaoDeTrabalho> ApresentacaoDeTrabalho() throws XPathExpressionException {
		return this.producaoTecnicaXpath.BuscaApresentacaoDeTrabalho();
	}

	public ArrayList<CartaMapaOuSimilar> CartaMapaOuSimilar() throws XPathExpressionException {
		return this.producaoTecnicaXpath.BuscaCartaMapaOuSimilar();
	}

	public ArrayList<CursoDeCurtaDuracaoMinistrado> CursoDeCurtaDuracaoMinistrado() throws XPathExpressionException {
		return this.producaoTecnicaXpath.BuscaCursoDeCurtaDuracaoMinistrado();
	}

	public ArrayList<DesenvolvimentoDeMaterialDidaticoOuInstrucional> DesenvolvimentoDeMaterialDidaticoOuInstrucional()
			throws XPathExpressionException {
		return this.producaoTecnicaXpath.BuscaDesenvolvimentoDeMaterialDidaticoOuInstrucional();
	}

	public ArrayList<Editoracao> Editoracao() throws XPathExpressionException {
		return this.producaoTecnicaXpath.BuscaEditoracao();
	}

	public ArrayList<ManutencaoDeObraArtistica> ManutencaoDeObraArtistica() throws XPathExpressionException {
		return this.producaoTecnicaXpath.BuscaManutencaoDeObraArtistica();
	}

	public ArrayList<Maquete> Maquete() throws XPathExpressionException {
		return this.producaoTecnicaXpath.BuscaMaquete();
	}

	public ArrayList<OrganizacaoDeEvento> OrganizacaoDeEvento() throws XPathExpressionException {
		return this.producaoTecnicaXpath.BuscaOrganizacaoDeEvento();
	}

	public ArrayList<ProgramaDeRadioOuTv> ProgramaDeRadioOuTv() throws XPathExpressionException {
		return this.producaoTecnicaXpath.BuscaProgramaDeRadioOuTv();
	}

	public ArrayList<RelatorioDePesquisa> RelatorioDePesquisa() throws XPathExpressionException {
		return this.producaoTecnicaXpath.BuscaRelatorioDePesquisa();
	}

	public ArrayList<MidiaSocialWebsiteBlog> MidiaSocialWebsiteBlog() throws XPathExpressionException {
		return this.producaoTecnicaXpath.BuscaMidiaSocialWebsiteBlog();
	}
}
