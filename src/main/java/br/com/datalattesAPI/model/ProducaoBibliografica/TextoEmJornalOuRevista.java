package br.com.datalattesAPI.model.ProducaoBibliografica;

import br.com.datalattesAPI.model.Geral.AreaConhecimento;
import br.com.datalattesAPI.model.Geral.PalavraChave;
import br.com.datalattesAPI.model.Geral.SetorAtividade;
import br.com.datalattesAPI.model.Producao.Autores;
import br.com.datalattesAPI.model.Producao.Auxiliar;

public class TextoEmJornalOuRevista extends Auxiliar {
	String natureza;
	String tituloDoTexto;
	String anoDoTexto;
	String paisDePublicacao;
	String idioma;
	String meioDeDivulgacao;
	String homePageDoTrabalho;
	String flagRelevancia;
	String doi;
	String tituloDoTextoIngles;
	String flagDivulgacaoCientifica;
	String tituloDoJornalOuRevista;
	String issn;
	String formatoDataDePublicacao;
	String dataDePublicacao;
	String volume;
	String paginaInicial;
	String paginaFinal;
	String localDePublicacao;

	public TextoEmJornalOuRevista(Autores autores, PalavraChave palavraChave, SetorAtividade setorAtividade,
			AreaConhecimento areaConhecimento, String natureza, String tituloDoTexto, String anoDoTexto,
			String paisDePublicacao, String idioma, String meioDeDivulgacao, String homePageDoTrabalho,
			String flagRelevancia, String doi, String tituloDoTextoIngles, String flagDivulgacaoCientifica,
			String tituloDoJornalOuRevista, String issn, String formatoDataDePublicacao, String dataDePublicacao,
			String volume, String paginaInicial, String paginaFinal, String localDePublicacao) {
		super(autores, palavraChave, setorAtividade, areaConhecimento);
		this.natureza = natureza;
		this.tituloDoTexto = tituloDoTexto;
		this.anoDoTexto = anoDoTexto;
		this.paisDePublicacao = paisDePublicacao;
		this.idioma = idioma;
		this.meioDeDivulgacao = meioDeDivulgacao;
		this.homePageDoTrabalho = homePageDoTrabalho;
		this.flagRelevancia = flagRelevancia;
		this.doi = doi;
		this.tituloDoTextoIngles = tituloDoTextoIngles;
		this.flagDivulgacaoCientifica = flagDivulgacaoCientifica;
		this.tituloDoJornalOuRevista = tituloDoJornalOuRevista;
		this.issn = issn;
		this.formatoDataDePublicacao = formatoDataDePublicacao;
		this.dataDePublicacao = dataDePublicacao;
		this.volume = volume;
		this.paginaInicial = paginaInicial;
		this.paginaFinal = paginaFinal;
		this.localDePublicacao = localDePublicacao;
	}

	public String getNatureza() {
		return this.natureza;
	}

	public void setNatureza(String natureza) {
		this.natureza = natureza;
	}

	public String getTituloDoTexto() {
		return this.tituloDoTexto;
	}

	public void setTituloDoTexto(String tituloDoTexto) {
		this.tituloDoTexto = tituloDoTexto;
	}

	public String getAnoDoTexto() {
		return this.anoDoTexto;
	}

	public void setAnoDoTexto(String anoDoTexto) {
		this.anoDoTexto = anoDoTexto;
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

	public String getTituloDoTextoIngles() {
		return this.tituloDoTextoIngles;
	}

	public void setTituloDoTextoIngles(String tituloDoTextoIngles) {
		this.tituloDoTextoIngles = tituloDoTextoIngles;
	}

	public String getFlagDivulgacaoCientifica() {
		return this.flagDivulgacaoCientifica;
	}

	public void setFlagDivulgacaoCientifica(String flagDivulgacaoCientifica) {
		this.flagDivulgacaoCientifica = flagDivulgacaoCientifica;
	}

	public String getTituloDoJornalOuRevista() {
		return this.tituloDoJornalOuRevista;
	}

	public void setTituloDoJornalOuRevista(String tituloDoJornalOuRevista) {
		this.tituloDoJornalOuRevista = tituloDoJornalOuRevista;
	}

	public String getIssn() {
		return this.issn;
	}

	public void setIssn(String issn) {
		this.issn = issn;
	}

	public String getFormatoDataDePublicacao() {
		return this.formatoDataDePublicacao;
	}

	public void setFormatoDataDePublicacao(String formatoDataDePublicacao) {
		this.formatoDataDePublicacao = formatoDataDePublicacao;
	}

	public String getDataDePublicacao() {
		return this.dataDePublicacao;
	}

	public void setDataDePublicacao(String dataDePublicacao) {
		this.dataDePublicacao = dataDePublicacao;
	}

	public String getVolume() {
		return this.volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
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
