package br.com.datalattesAPI.model.ProducaoBibliografica;

import br.com.datalattesAPI.model.Geral.AreaConhecimento;
import br.com.datalattesAPI.model.Geral.PalavraChave;
import br.com.datalattesAPI.model.Geral.SetorAtividade;
import br.com.datalattesAPI.model.Producao.Autores;
import br.com.datalattesAPI.model.Producao.Auxiliar;

public class Traducao extends Auxiliar {
	String natureza;
	String titulo;
	String ano;
	String paisDePublicacao;
	String idioma;
	String meioDeDivulgacao;
	String homePageDoTrabalho;
	String flagRelevancia;
	String doi;
	String tituloIngles;
	String nomeDoAutorTraduzido;
	String tituloDaObraOriginal;
	String issnIsbn;
	String idiomaDaObraOriginal;
	String editoraDaTraducao;
	String cidadeDaEditora;
	String numeroDePaginas;
	String numeroDaEdicaoRevisao;
	String volume;
	String fasciculo;
	String serie;

	public Traducao(Autores autores, PalavraChave palavraChave, SetorAtividade setorAtividade,
			AreaConhecimento areaConhecimento, String natureza, String titulo, String ano, String paisDePublicacao,
			String idioma, String meioDeDivulgacao, String homePageDoTrabalho, String flagRelevancia, String doi,
			String tituloIngles, String nomeDoAutorTraduzido, String tituloDaObraOriginal, String issnIsbn,
			String idiomaDaObraOriginal, String editoraDaTraducao, String cidadeDaEditora, String numeroDePaginas,
			String numeroDaEdicaoRevisao, String volume, String fasciculo, String serie) {
		super(autores, palavraChave, setorAtividade, areaConhecimento);
		this.natureza = natureza;
		this.titulo = titulo;
		this.ano = ano;
		this.paisDePublicacao = paisDePublicacao;
		this.idioma = idioma;
		this.meioDeDivulgacao = meioDeDivulgacao;
		this.homePageDoTrabalho = homePageDoTrabalho;
		this.flagRelevancia = flagRelevancia;
		this.doi = doi;
		this.tituloIngles = tituloIngles;
		this.nomeDoAutorTraduzido = nomeDoAutorTraduzido;
		this.tituloDaObraOriginal = tituloDaObraOriginal;
		this.issnIsbn = issnIsbn;
		this.idiomaDaObraOriginal = idiomaDaObraOriginal;
		this.editoraDaTraducao = editoraDaTraducao;
		this.cidadeDaEditora = cidadeDaEditora;
		this.numeroDePaginas = numeroDePaginas;
		this.numeroDaEdicaoRevisao = numeroDaEdicaoRevisao;
		this.volume = volume;
		this.fasciculo = fasciculo;
		this.serie = serie;
	}

	public String getNatureza() {
		return this.natureza;
	}

	public void setNatureza(String natureza) {
		this.natureza = natureza;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAno() {
		return this.ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
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

	public String getTituloIngles() {
		return this.tituloIngles;
	}

	public void setTituloIngles(String tituloIngles) {
		this.tituloIngles = tituloIngles;
	}

	public String getNomeDoAutorTraduzido() {
		return this.nomeDoAutorTraduzido;
	}

	public void setNomeDoAutorTraduzido(String nomeDoAutorTraduzido) {
		this.nomeDoAutorTraduzido = nomeDoAutorTraduzido;
	}

	public String getTituloDaObraOriginal() {
		return this.tituloDaObraOriginal;
	}

	public void setTituloDaObraOriginal(String tituloDaObraOriginal) {
		this.tituloDaObraOriginal = tituloDaObraOriginal;
	}

	public String getIssnIsbn() {
		return this.issnIsbn;
	}

	public void setIssnIsbn(String issnIsbn) {
		this.issnIsbn = issnIsbn;
	}

	public String getIdiomaDaObraOriginal() {
		return this.idiomaDaObraOriginal;
	}

	public void setIdiomaDaObraOriginal(String idiomaDaObraOriginal) {
		this.idiomaDaObraOriginal = idiomaDaObraOriginal;
	}

	public String getEditoraDaTraducao() {
		return this.editoraDaTraducao;
	}

	public void setEditoraDaTraducao(String editoraDaTraducao) {
		this.editoraDaTraducao = editoraDaTraducao;
	}

	public String getCidadeDaEditora() {
		return this.cidadeDaEditora;
	}

	public void setCidadeDaEditora(String cidadeDaEditora) {
		this.cidadeDaEditora = cidadeDaEditora;
	}

	public String getNumeroDePaginas() {
		return this.numeroDePaginas;
	}

	public void setNumeroDePaginas(String numeroDePaginas) {
		this.numeroDePaginas = numeroDePaginas;
	}

	public String getNumeroDaEdicaoRevisao() {
		return this.numeroDaEdicaoRevisao;
	}

	public void setNumeroDaEdicaoRevisao(String numeroDaEdicaoRevisao) {
		this.numeroDaEdicaoRevisao = numeroDaEdicaoRevisao;
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
}
