package br.com.datalattesAPI.model.ProducaoBibliografica;

import br.com.datalattesAPI.model.Geral.AreaConhecimento;
import br.com.datalattesAPI.model.Geral.PalavraChave;
import br.com.datalattesAPI.model.Geral.SetorAtividade;
import br.com.datalattesAPI.model.Producao.Autores;
import br.com.datalattesAPI.model.Producao.Auxiliar;

/**
 * 
 */
public class ArtigoPublicado extends Auxiliar {
	String natureza;
	String tituloDoArtigo;
	String anoDoArtigo;
	String paisDePublicacao;
	String idioma;
	String meioDeDivulgacao;
	String homePageDoTrabalho;
	String flagRelevancia;
	String doi;
	String tituloDoArtigoIngles;
	String flagDivulgacaoCientifica;
	String tituloDoPeriodicoOuRevista;
	String issn;
	String volume;
	String fasciculo;
	String serie;
	String paginaInicial;
	String paginaFinal;
	String localDePublicacao;

	public ArtigoPublicado(Autores autores, PalavraChave palavraChave, SetorAtividade setorAtividade,
			AreaConhecimento areaConhecimento, String natureza, String tituloDoArtigo, String anoDoArtigo,
			String paisDePublicacao, String idioma, String meioDeDivulgacao, String homePageDoTrabalho,
			String flagRelevancia, String doi, String tituloDoArtigoIngles, String flagDivulgacaoCientifica,
			String tituloDoPeriodicoOuRevista, String issn, String volume, String fasciculo, String serie,
			String paginaInicial, String paginaFinal, String localDePublicacao) {
		super(autores, palavraChave, setorAtividade, areaConhecimento);
		this.natureza = natureza;
		this.tituloDoArtigo = tituloDoArtigo;
		this.anoDoArtigo = anoDoArtigo;
		this.paisDePublicacao = paisDePublicacao;
		this.idioma = idioma;
		this.meioDeDivulgacao = meioDeDivulgacao;
		this.homePageDoTrabalho = homePageDoTrabalho;
		this.flagRelevancia = flagRelevancia;
		this.doi = doi;
		this.tituloDoArtigoIngles = tituloDoArtigoIngles;
		this.flagDivulgacaoCientifica = flagDivulgacaoCientifica;
		this.tituloDoPeriodicoOuRevista = tituloDoPeriodicoOuRevista;
		this.issn = issn;
		this.volume = volume;
		this.fasciculo = fasciculo;
		this.serie = serie;
		this.paginaInicial = paginaInicial;
		this.paginaFinal = paginaFinal;
		this.localDePublicacao = localDePublicacao;
	}

	@Override
	public String toString() {
		return "ArtigoPublicado [" + (this.natureza != null ? "natureza=" + this.natureza + ", " : "")
				+ (this.tituloDoArtigo != null ? "tituloDoArtigo=" + this.tituloDoArtigo + ", " : "")
				+ (this.anoDoArtigo != null ? "anoDoArtigo=" + this.anoDoArtigo + ", " : "")
				+ (this.paisDePublicacao != null ? "paisDePublicacao=" + this.paisDePublicacao + ", " : "")
				+ (this.idioma != null ? "idioma=" + this.idioma + ", " : "")
				+ (this.meioDeDivulgacao != null ? "meioDeDivulgacao=" + this.meioDeDivulgacao + ", " : "")
				+ (this.homePageDoTrabalho != null ? "homePageDoTrabalho=" + this.homePageDoTrabalho + ", " : "")
				+ (this.flagRelevancia != null ? "flagRelevancia=" + this.flagRelevancia + ", " : "")
				+ (this.doi != null ? "doi=" + this.doi + ", " : "")
				+ (this.tituloDoArtigoIngles != null ? "tituloDoArtigoIngles=" + this.tituloDoArtigoIngles + ", " : "")
				+ (this.flagDivulgacaoCientifica != null
						? "flagDivulgacaoCientifica=" + this.flagDivulgacaoCientifica + ", "
						: "")
				+ (this.tituloDoPeriodicoOuRevista != null
						? "tituloDoPeriodicoOuRevista=" + this.tituloDoPeriodicoOuRevista + ", "
						: "")
				+ (this.issn != null ? "issn=" + this.issn + ", " : "")
				+ (this.volume != null ? "volume=" + this.volume + ", " : "")
				+ (this.fasciculo != null ? "fasciculo=" + this.fasciculo + ", " : "")
				+ (this.serie != null ? "serie=" + this.serie + ", " : "")
				+ (this.paginaInicial != null ? "paginaInicial=" + this.paginaInicial + ", " : "")
				+ (this.paginaFinal != null ? "paginaFinal=" + this.paginaFinal + ", " : "")
				+ (this.localDePublicacao != null ? "localDePublicacao=" + this.localDePublicacao : "") + "]";
	}

	public String getNatureza() {
		return this.natureza;
	}

	public void setNatureza(String natureza) {
		this.natureza = natureza;
	}

	public String getTituloDoArtigo() {
		return this.tituloDoArtigo;
	}

	public void setTituloDoArtigo(String tituloDoArtigo) {
		this.tituloDoArtigo = tituloDoArtigo;
	}

	public String getAnoDoArtigo() {
		return this.anoDoArtigo;
	}

	public void setAnoDoArtigo(String anoDoArtigo) {
		this.anoDoArtigo = anoDoArtigo;
	}

	public String getPaisDePublicacao() {
		return this.paisDePublicacao;
	}

	public void setPaisDePublicacao(String paisDePublicacao) {
		this.paisDePublicacao = paisDePublicacao;
	}

	public String getIdioma() {
		return this.idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getMeioDeDivulgacao() {
		return this.meioDeDivulgacao;
	}

	public void setMeioDeDivulgacao(String meioDeDivulgacao) {
		this.meioDeDivulgacao = meioDeDivulgacao;
	}

	public String getHomePageDoTrabalho() {
		return this.homePageDoTrabalho;
	}

	public void setHomePageDoTrabalho(String homePageDoTrabalho) {
		this.homePageDoTrabalho = homePageDoTrabalho;
	}

	public String getFlagRelevancia() {
		return this.flagRelevancia;
	}

	public void setFlagRelevancia(String flagRelevancia) {
		this.flagRelevancia = flagRelevancia;
	}

	public String getDoi() {
		return this.doi;
	}

	public void setDoi(String doi) {
		this.doi = doi;
	}

	public String getTituloDoArtigoIngles() {
		return this.tituloDoArtigoIngles;
	}

	public void setTituloDoArtigoIngles(String tituloDoArtigoIngles) {
		this.tituloDoArtigoIngles = tituloDoArtigoIngles;
	}

	public String getFlagDivulgacaoCientifica() {
		return this.flagDivulgacaoCientifica;
	}

	public void setFlagDivulgacaoCientifica(String flagDivulgacaoCientifica) {
		this.flagDivulgacaoCientifica = flagDivulgacaoCientifica;
	}

	public String getTituloDoPeriodicoOuRevista() {
		return this.tituloDoPeriodicoOuRevista;
	}

	public void setTituloDoPeriodicoOuRevista(String tituloDoPeriodicoOuRevista) {
		this.tituloDoPeriodicoOuRevista = tituloDoPeriodicoOuRevista;
	}

	public String getIssn() {
		return this.issn;
	}

	public void setIssn(String issn) {
		this.issn = issn;
	}

	public String getVolume() {
		return this.volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	public String getFasciculo() {
		return this.fasciculo;
	}

	public void setFasciculo(String fasciculo) {
		this.fasciculo = fasciculo;
	}

	public String getSerie() {
		return this.serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getPaginaInicial() {
		return this.paginaInicial;
	}

	public void setPaginaInicial(String paginaInicial) {
		this.paginaInicial = paginaInicial;
	}

	public String getPaginaFinal() {
		return this.paginaFinal;
	}

	public void setPaginaFinal(String paginaFinal) {
		this.paginaFinal = paginaFinal;
	}

	public String getLocalDePublicacao() {
		return this.localDePublicacao;
	}

	public void setLocalDePublicacao(String localDePublicacao) {
		this.localDePublicacao = localDePublicacao;
	}

}