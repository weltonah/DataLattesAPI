package br.com.datalattesAPI.DAO;

import java.io.File;
import java.util.ArrayList;

import javax.xml.xpath.XPathExpressionException;

import br.com.datalattesAPI.Xpath.ProducaoBibliograficaXpath;
import br.com.datalattesAPI.model.ProducaoBibliografica.ArtigoAceitoParaPublicacao;
import br.com.datalattesAPI.model.ProducaoBibliografica.ArtigoPublicado;
import br.com.datalattesAPI.model.ProducaoBibliografica.CapituloDeLivroPublicado;
import br.com.datalattesAPI.model.ProducaoBibliografica.LivroPublicadoOuOrganizado;
import br.com.datalattesAPI.model.ProducaoBibliografica.PrefacioPosfacio;
import br.com.datalattesAPI.model.ProducaoBibliografica.TextoEmJornalOuRevista;
import br.com.datalattesAPI.model.ProducaoBibliografica.TrabalhoEmEventos;
import br.com.datalattesAPI.model.ProducaoBibliografica.Traducao;

public class ProducaoBibliograficaDao {
	public ProducaoBibliograficaXpath producaoBibliograficaXpath;

	public ProducaoBibliograficaDao(File file) {
		this.producaoBibliograficaXpath = new ProducaoBibliograficaXpath(file);
	}

	public ArrayList<ArtigoPublicado> ArtigoPublicado() throws XPathExpressionException {
		return this.producaoBibliograficaXpath.BuscaArtigoPublicado();
	}

	public ArrayList<ArtigoAceitoParaPublicacao> ArtigoAceitoParaPublicacao() throws XPathExpressionException {
		return this.producaoBibliograficaXpath.BuscaArtigoAceitoParaPublicacao();
	}

	public ArrayList<TrabalhoEmEventos> TrabalhoEmEventos() throws XPathExpressionException {
		return this.producaoBibliograficaXpath.BuscaTrabalhoEmEventos();
	}

	public ArrayList<LivroPublicadoOuOrganizado> LivroPublicadoOuOrganizado() throws XPathExpressionException {
		return this.producaoBibliograficaXpath.BuscaLivroPublicaasdasdoOuOrganizado();
	}

	public ArrayList<CapituloDeLivroPublicado> CapituloDeLivroPublicado() throws XPathExpressionException {
		return this.producaoBibliograficaXpath.BuscaCapituloDeLivroPublicado();
	}

	public ArrayList<TextoEmJornalOuRevista> TextoEmJornalOuRevista() throws XPathExpressionException {
		return this.producaoBibliograficaXpath.BuscaTextoEmJornalOuRevista();
	}

	public ArrayList<PrefacioPosfacio> PrefacioPosfacio() throws XPathExpressionException {
		return this.producaoBibliograficaXpath.BuscaPrefacioPosfacio();
	}

	public ArrayList<Traducao> Traducao() throws XPathExpressionException {
		return this.producaoBibliograficaXpath.BuscaTraducao();

	}
}
