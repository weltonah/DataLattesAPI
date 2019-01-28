package br.com.datalattesAPI.DAO;

import java.io.File;
import java.util.ArrayList;

import javax.xml.xpath.XPathExpressionException;

import br.com.datalattesAPI.Xpath.ProducaoArtisticaDaoXpath;
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

public class ProducaoArtisticaDao {

	public ProducaoArtisticaDaoXpath producaoArtisticaDaoXpath;

	public ProducaoArtisticaDao(File file) {
		this.producaoArtisticaDaoXpath = new ProducaoArtisticaDaoXpath(file);
	}

	public ArrayList<PartituraMusical> PartituraMusical() throws XPathExpressionException {
		return this.producaoArtisticaDaoXpath.BuscaPartituraMusical();
	}

	public ArrayList<ApresentacaoDeObraArtistica> ApresentacaoDeObraArtistica() throws XPathExpressionException {
		return this.producaoArtisticaDaoXpath.BuscaApresentacaoDeObraArtistica();
	}

	public ArrayList<ApresentacaoEmRadioOuTv> ApresentacaoEmRadioOuTv() throws XPathExpressionException {
		return this.producaoArtisticaDaoXpath.BuscaApresentacaoEmRadioOuTv();
	}

	public ArrayList<ArranjoMusical> ArranjoMusical() throws XPathExpressionException {
		return this.producaoArtisticaDaoXpath.BuscaArranjoMusical();
	}

	public ArrayList<ComposicaoMusical> ComposicaoMusical() throws XPathExpressionException {
		return this.producaoArtisticaDaoXpath.BuscaComposicaoMusical();
	}

	public ArrayList<CursoDeCurtaDuracao> CursoDeCurtaDuracao() throws XPathExpressionException {
		return this.producaoArtisticaDaoXpath.BuscaCursoDeCurtaDuracao();
	}

	public ArrayList<ObraDeArtesVisuais> ObraDeArtesVisuais() throws XPathExpressionException {
		return this.producaoArtisticaDaoXpath.BuscaObraDeArtesVisuais();
	}

	public ArrayList<OutraProducaoArtisticaCultural> OutraProducaoArtisticaCultural() throws XPathExpressionException {
		return this.producaoArtisticaDaoXpath.BuscaOutraProducaoArtisticaCultural();
	}

	public ArrayList<Sonoplastia> Sonoplastia() throws XPathExpressionException {
		return this.producaoArtisticaDaoXpath.BuscaSonoplastia();
	}

	public ArrayList<ArtesCenicas> ArtesCenicas() throws XPathExpressionException {
		return this.producaoArtisticaDaoXpath.BuscaArtesCenicas();
	}

	public ArrayList<ArtesVisuais> ArtesVisuais() throws XPathExpressionException {
		return this.producaoArtisticaDaoXpath.BuscaArtesVisuais();
	}

	public ArrayList<Musica> Musica() throws XPathExpressionException {
		return this.producaoArtisticaDaoXpath.BuscaMusica();
	}
}
