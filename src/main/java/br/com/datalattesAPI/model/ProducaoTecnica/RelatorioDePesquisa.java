package br.com.datalattesAPI.model.ProducaoTecnica;

import br.com.datalattesAPI.model.Geral.AreaConhecimento;
import br.com.datalattesAPI.model.Geral.PalavraChave;
import br.com.datalattesAPI.model.Geral.SetorAtividade;
import br.com.datalattesAPI.model.Producao.Autores;
import br.com.datalattesAPI.model.Producao.Auxiliar;

public class RelatorioDePesquisa extends Auxiliar {
	String titulo;
	String ano;
	String pais;
	String idioma;
	String meioDeDivulgacao;
	String homePageDoTrabalho;
	String flagRelevancia;
	String doi;
	String tituloIngles;
	String nomeDoProjeto;
	String numeroDePaginas;
	String disponibilidade;
	String instituicaoFinanciadora;

	public RelatorioDePesquisa(Autores autores, PalavraChave palavraChave, SetorAtividade setorAtividade,
			AreaConhecimento areaConhecimento, String titulo, String ano, String pais, String idioma,
			String meioDeDivulgacao, String homePageDoTrabalho, String flagRelevancia, String doi, String tituloIngles,
			String nomeDoProjeto, String numeroDePaginas, String disponibilidade, String instituicaoFinanciadora) {
		super(autores, palavraChave, setorAtividade, areaConhecimento);
		this.titulo = titulo;
		this.ano = ano;
		this.pais = pais;
		this.idioma = idioma;
		this.meioDeDivulgacao = meioDeDivulgacao;
		this.homePageDoTrabalho = homePageDoTrabalho;
		this.flagRelevancia = flagRelevancia;
		this.doi = doi;
		this.tituloIngles = tituloIngles;
		this.nomeDoProjeto = nomeDoProjeto;
		this.numeroDePaginas = numeroDePaginas;
		this.disponibilidade = disponibilidade;
		this.instituicaoFinanciadora = instituicaoFinanciadora;
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

	public String getPais() {
		return this.pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
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

	public String getNomeDoProjeto() {
		return this.nomeDoProjeto;
	}

	public void setNomeDoProjeto(String nomeDoProjeto) {
		this.nomeDoProjeto = nomeDoProjeto;
	}

	public String getNumeroDePaginas() {
		return this.numeroDePaginas;
	}

	public void setNumeroDePaginas(String numeroDePaginas) {
		this.numeroDePaginas = numeroDePaginas;
	}

	public String getDisponibilidade() {
		return this.disponibilidade;
	}

	public void setDisponibilidade(String disponibilidade) {
		this.disponibilidade = disponibilidade;
	}

	public String getInstituicaoFinanciadora() {
		return this.instituicaoFinanciadora;
	}

	public void setInstituicaoFinanciadora(String instituicaoFinanciadora) {
		this.instituicaoFinanciadora = instituicaoFinanciadora;
	}
}
