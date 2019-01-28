package br.com.datalattesAPI.model.ProducaoBibliografica;

import br.com.datalattesAPI.model.Geral.AreaConhecimento;
import br.com.datalattesAPI.model.Geral.PalavraChave;
import br.com.datalattesAPI.model.Geral.SetorAtividade;
import br.com.datalattesAPI.model.Producao.Autores;
import br.com.datalattesAPI.model.Producao.Auxiliar;

public class TrabalhoEmEventos extends Auxiliar {
	String natureza;
	String tituloDoTrabalho;
	String anoDoTrabalho;
	String paisDoEvento;
	String idioma;
	String meioDeDivulgacao;
	String homePageDoTrabalho;
	String flagRelevancia;
	String doi;
	String tituloDoTrabalhoIngles;
	String flagDivulgacaoCientifica;
	String classificacaoDoEvento;
	String nomeDoEvento;
	String cidadeDoEvento;
	String anoDeRealizacao;
	String tituloDosAnaisOuProceedings;
	String volume;
	String fasciculo;
	String serie;
	String paginaInicial;
	String paginaFinal;
	String isbn;
	String nomeDaEditora;
	String cidadeDaEditora;
	String nomeDoEventoIngles;

	public TrabalhoEmEventos(Autores autores, PalavraChave palavraChave, SetorAtividade setorAtividade,
			AreaConhecimento areaConhecimento, String natureza, String tituloDoTrabalho, String anoDoTrabalho,
			String paisDoEvento, String idioma, String meioDeDivulgacao, String homePageDoTrabalho,
			String flagRelevancia, String doi, String tituloDoTrabalhoIngles, String flagDivulgacaoCientifica,
			String classificacaoDoEvento, String nomeDoEvento, String cidadeDoEvento, String anoDeRealizacao,
			String tituloDosAnaisOuProceedings, String volume, String fasciculo, String serie, String paginaInicial,
			String paginaFinal, String isbn, String nomeDaEditora, String cidadeDaEditora, String nomeDoEventoIngles) {
		super(autores, palavraChave, setorAtividade, areaConhecimento);
		this.natureza = natureza;
		this.tituloDoTrabalho = tituloDoTrabalho;
		this.anoDoTrabalho = anoDoTrabalho;
		this.paisDoEvento = paisDoEvento;
		this.idioma = idioma;
		this.meioDeDivulgacao = meioDeDivulgacao;
		this.homePageDoTrabalho = homePageDoTrabalho;
		this.flagRelevancia = flagRelevancia;
		this.doi = doi;
		this.tituloDoTrabalhoIngles = tituloDoTrabalhoIngles;
		this.flagDivulgacaoCientifica = flagDivulgacaoCientifica;
		this.classificacaoDoEvento = classificacaoDoEvento;
		this.nomeDoEvento = nomeDoEvento;
		this.cidadeDoEvento = cidadeDoEvento;
		this.anoDeRealizacao = anoDeRealizacao;
		this.tituloDosAnaisOuProceedings = tituloDosAnaisOuProceedings;
		this.volume = volume;
		this.fasciculo = fasciculo;
		this.serie = serie;
		this.paginaInicial = paginaInicial;
		this.paginaFinal = paginaFinal;
		this.isbn = isbn;
		this.nomeDaEditora = nomeDaEditora;
		this.cidadeDaEditora = cidadeDaEditora;
		this.nomeDoEventoIngles = nomeDoEventoIngles;
	}

	public String getNatureza() {
		return this.natureza;
	}

	public void setNatureza(String natureza) {
		this.natureza = natureza;
	}

	public String getTituloDoTrabalho() {
		return this.tituloDoTrabalho;
	}

	public void setTituloDoTrabalho(String tituloDoTrabalho) {
		this.tituloDoTrabalho = tituloDoTrabalho;
	}

	public String getAnoDoTrabalho() {
		return this.anoDoTrabalho;
	}

	public void setAnoDoTrabalho(String anoDoTrabalho) {
		this.anoDoTrabalho = anoDoTrabalho;
	}

	public String getPaisDoEvento() {
		return this.paisDoEvento;
	}

	public void setPaisDoEvento(String paisDoEvento) {
		this.paisDoEvento = paisDoEvento;
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

	public String getTituloDoTrabalhoIngles() {
		return this.tituloDoTrabalhoIngles;
	}

	public void setTituloDoTrabalhoIngles(String tituloDoTrabalhoIngles) {
		this.tituloDoTrabalhoIngles = tituloDoTrabalhoIngles;
	}

	public String getFlagDivulgacaoCientifica() {
		return this.flagDivulgacaoCientifica;
	}

	public void setFlagDivulgacaoCientifica(String flagDivulgacaoCientifica) {
		this.flagDivulgacaoCientifica = flagDivulgacaoCientifica;
	}

	public String getClassificacaoDoEvento() {
		return this.classificacaoDoEvento;
	}

	public void setClassificacaoDoEvento(String classificacaoDoEvento) {
		this.classificacaoDoEvento = classificacaoDoEvento;
	}

	public String getNomeDoEvento() {
		return this.nomeDoEvento;
	}

	public void setNomeDoEvento(String nomeDoEvento) {
		this.nomeDoEvento = nomeDoEvento;
	}

	public String getCidadeDoEvento() {
		return this.cidadeDoEvento;
	}

	public void setCidadeDoEvento(String cidadeDoEvento) {
		this.cidadeDoEvento = cidadeDoEvento;
	}

	public String getAnoDeRealizacao() {
		return this.anoDeRealizacao;
	}

	public void setAnoDeRealizacao(String anoDeRealizacao) {
		this.anoDeRealizacao = anoDeRealizacao;
	}

	public String getTituloDosAnaisOuProceedings() {
		return this.tituloDosAnaisOuProceedings;
	}

	public void setTituloDosAnaisOuProceedings(String tituloDosAnaisOuProceedings) {
		this.tituloDosAnaisOuProceedings = tituloDosAnaisOuProceedings;
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

	public String getIsbn() {
		return this.isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getNomeDaEditora() {
		return this.nomeDaEditora;
	}

	public void setNomeDaEditora(String nomeDaEditora) {
		this.nomeDaEditora = nomeDaEditora;
	}

	public String getCidadeDaEditora() {
		return this.cidadeDaEditora;
	}

	public void setCidadeDaEditora(String cidadeDaEditora) {
		this.cidadeDaEditora = cidadeDaEditora;
	}

	public String getNomeDoEventoIngles() {
		return this.nomeDoEventoIngles;
	}

	public void setNomeDoEventoIngles(String nomeDoEventoIngles) {
		this.nomeDoEventoIngles = nomeDoEventoIngles;
	}
}
