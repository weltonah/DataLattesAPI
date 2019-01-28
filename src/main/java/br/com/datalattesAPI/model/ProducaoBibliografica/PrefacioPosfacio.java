package br.com.datalattesAPI.model.ProducaoBibliografica;

import br.com.datalattesAPI.model.Geral.AreaConhecimento;
import br.com.datalattesAPI.model.Geral.PalavraChave;
import br.com.datalattesAPI.model.Geral.SetorAtividade;
import br.com.datalattesAPI.model.Producao.Autores;
import br.com.datalattesAPI.model.Producao.Auxiliar;

public class PrefacioPosfacio extends Auxiliar {
	String tipo;
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
	String nomeDoAutorDaPublicacao;
	String tituloDaPublicacao;
	String issnIsbn;
	String numeroDaEdicaoRevisao;
	String volume;
	String serie;
	String fasciculo;
	String editoraDoPrefacioPosfacio;
	String cidadeDaEditora;

	public PrefacioPosfacio(Autores autores, PalavraChave palavraChave, SetorAtividade setorAtividade,
			AreaConhecimento areaConhecimento, String tipo, String natureza, String titulo, String ano,
			String paisDePublicacao, String idioma, String meioDeDivulgacao, String homePageDoTrabalho,
			String flagRelevancia, String doi, String tituloIngles, String nomeDoAutorDaPublicacao,
			String tituloDaPublicacao, String issnIsbn, String numeroDaEdicaoRevisao, String volume, String serie,
			String fasciculo, String editoraDoPrefacioPosfacio, String cidadeDaEditora) {
		super(autores, palavraChave, setorAtividade, areaConhecimento);
		this.tipo = tipo;
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
		this.nomeDoAutorDaPublicacao = nomeDoAutorDaPublicacao;
		this.tituloDaPublicacao = tituloDaPublicacao;
		this.issnIsbn = issnIsbn;
		this.numeroDaEdicaoRevisao = numeroDaEdicaoRevisao;
		this.volume = volume;
		this.serie = serie;
		this.fasciculo = fasciculo;
		this.editoraDoPrefacioPosfacio = editoraDoPrefacioPosfacio;
		this.cidadeDaEditora = cidadeDaEditora;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
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

	public String getNomeDoAutorDaPublicacao() {
		return this.nomeDoAutorDaPublicacao;
	}

	public void setNomeDoAutorDaPublicacao(String nomeDoAutorDaPublicacao) {
		this.nomeDoAutorDaPublicacao = nomeDoAutorDaPublicacao;
	}

	public String getTituloDaPublicacao() {
		return this.tituloDaPublicacao;
	}

	public void setTituloDaPublicacao(String tituloDaPublicacao) {
		this.tituloDaPublicacao = tituloDaPublicacao;
	}

	public String getIssnIsbn() {
		return this.issnIsbn;
	}

	public void setIssnIsbn(String issnIsbn) {
		this.issnIsbn = issnIsbn;
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

	public String getSerie() {
		return this.serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getFasciculo() {
		return this.fasciculo;
	}

	public void setFasciculo(String fasciculo) {
		this.fasciculo = fasciculo;
	}

	public String getEditoraDoPrefacioPosfacio() {
		return this.editoraDoPrefacioPosfacio;
	}

	public void setEditoraDoPrefacioPosfacio(String editoraDoPrefacioPosfacio) {
		this.editoraDoPrefacioPosfacio = editoraDoPrefacioPosfacio;
	}

	public String getCidadeDaEditora() {
		return this.cidadeDaEditora;
	}

	public void setCidadeDaEditora(String cidadeDaEditora) {
		this.cidadeDaEditora = cidadeDaEditora;
	}
}
