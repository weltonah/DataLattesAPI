package br.com.datalattesAPI.model.ProducaoBibliografica;

import br.com.datalattesAPI.model.Geral.AreaConhecimento;
import br.com.datalattesAPI.model.Geral.PalavraChave;
import br.com.datalattesAPI.model.Geral.SetorAtividade;
import br.com.datalattesAPI.model.Producao.Autores;
import br.com.datalattesAPI.model.Producao.Auxiliar;

public class CapituloDeLivroPublicado extends Auxiliar {
	String tipo;
	String tituloDoCapituloDoLivro;
	String ano;
	String paisDePublicacao;
	String idioma;
	String meioDeDivulgacao;
	String homePageDoTrabalho;
	String flagRelevancia;
	String doi;
	String tituloDoCapituloDoLivroIngles;
	String flagDivulgacaoCientifica;
	String tituloDoLivro;
	String numeroDeVolumes;
	String paginaInicial;
	String paginaFinal;
	String isbn;
	String organizadores;
	String numeroDaEdicaoRevisao;
	String numeroDaSerie;
	String cidadeDaEditora;
	String nomeDaEditora;

	public CapituloDeLivroPublicado(Autores autores, PalavraChave palavraChave, SetorAtividade setorAtividade,
			AreaConhecimento areaConhecimento, String tipo, String tituloDoCapituloDoLivro, String ano,
			String paisDePublicacao, String idioma, String meioDeDivulgacao, String homePageDoTrabalho,
			String flagRelevancia, String doi, String tituloDoCapituloDoLivroIngles, String flagDivulgacaoCientifica,
			String tituloDoLivro, String numeroDeVolumes, String paginaInicial, String paginaFinal, String isbn,
			String organizadores, String numeroDaEdicaoRevisao, String numeroDaSerie, String cidadeDaEditora,
			String nomeDaEditora) {
		super(autores, palavraChave, setorAtividade, areaConhecimento);
		this.tipo = tipo;
		this.tituloDoCapituloDoLivro = tituloDoCapituloDoLivro;
		this.ano = ano;
		this.paisDePublicacao = paisDePublicacao;
		this.idioma = idioma;
		this.meioDeDivulgacao = meioDeDivulgacao;
		this.homePageDoTrabalho = homePageDoTrabalho;
		this.flagRelevancia = flagRelevancia;
		this.doi = doi;
		this.tituloDoCapituloDoLivroIngles = tituloDoCapituloDoLivroIngles;
		this.flagDivulgacaoCientifica = flagDivulgacaoCientifica;
		this.tituloDoLivro = tituloDoLivro;
		this.numeroDeVolumes = numeroDeVolumes;
		this.paginaInicial = paginaInicial;
		this.paginaFinal = paginaFinal;
		this.isbn = isbn;
		this.organizadores = organizadores;
		this.numeroDaEdicaoRevisao = numeroDaEdicaoRevisao;
		this.numeroDaSerie = numeroDaSerie;
		this.cidadeDaEditora = cidadeDaEditora;
		this.nomeDaEditora = nomeDaEditora;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTituloDoCapituloDoLivro() {
		return this.tituloDoCapituloDoLivro;
	}

	public void setTituloDoCapituloDoLivro(String tituloDoCapituloDoLivro) {
		this.tituloDoCapituloDoLivro = tituloDoCapituloDoLivro;
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

	public String getTituloDoCapituloDoLivroIngles() {
		return this.tituloDoCapituloDoLivroIngles;
	}

	public void setTituloDoCapituloDoLivroIngles(String tituloDoCapituloDoLivroIngles) {
		this.tituloDoCapituloDoLivroIngles = tituloDoCapituloDoLivroIngles;
	}

	public String getFlagDivulgacaoCientifica() {
		return this.flagDivulgacaoCientifica;
	}

	public void setFlagDivulgacaoCientifica(String flagDivulgacaoCientifica) {
		this.flagDivulgacaoCientifica = flagDivulgacaoCientifica;
	}

	public String getTituloDoLivro() {
		return this.tituloDoLivro;
	}

	public void setTituloDoLivro(String tituloDoLivro) {
		this.tituloDoLivro = tituloDoLivro;
	}

	public String getNumeroDeVolumes() {
		return this.numeroDeVolumes;
	}

	public void setNumeroDeVolumes(String numeroDeVolumes) {
		this.numeroDeVolumes = numeroDeVolumes;
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

	public String getOrganizadores() {
		return this.organizadores;
	}

	public void setOrganizadores(String organizadores) {
		this.organizadores = organizadores;
	}

	public String getNumeroDaEdicaoRevisao() {
		return this.numeroDaEdicaoRevisao;
	}

	public void setNumeroDaEdicaoRevisao(String numeroDaEdicaoRevisao) {
		this.numeroDaEdicaoRevisao = numeroDaEdicaoRevisao;
	}

	public String getNumeroDaSerie() {
		return this.numeroDaSerie;
	}

	public void setNumeroDaSerie(String numeroDaSerie) {
		this.numeroDaSerie = numeroDaSerie;
	}

	public String getCidadeDaEditora() {
		return this.cidadeDaEditora;
	}

	public void setCidadeDaEditora(String cidadeDaEditora) {
		this.cidadeDaEditora = cidadeDaEditora;
	}

	public String getNomeDaEditora() {
		return this.nomeDaEditora;
	}

	public void setNomeDaEditora(String nomeDaEditora) {
		this.nomeDaEditora = nomeDaEditora;
	}
}
