package br.com.datalattesAPI.model.ProducaoTecnica;

import br.com.datalattesAPI.model.Geral.AreaConhecimento;
import br.com.datalattesAPI.model.Geral.PalavraChave;
import br.com.datalattesAPI.model.Geral.SetorAtividade;
import br.com.datalattesAPI.model.Producao.Autores;
import br.com.datalattesAPI.model.Producao.Auxiliar;

public class Maquete extends Auxiliar {
	String titulo;
	String ano;
	String pais;
	String idioma;
	String meioDeDivulgacao;
	String homePageDoTrabalho;
	String flagRelevancia;
	String doi;
	String tituloIngles;
	String finalidade;
	String objetoRepresentado;
	String materialUtilizado;
	String instituicaoFinanciadora;
	String finalidadeIngles;

	public Maquete(Autores autores, PalavraChave palavraChave, SetorAtividade setorAtividade,
			AreaConhecimento areaConhecimento, String titulo, String ano, String pais, String idioma,
			String meioDeDivulgacao, String homePageDoTrabalho, String flagRelevancia, String doi, String tituloIngles,
			String finalidade, String objetoRepresentado, String materialUtilizado, String instituicaoFinanciadora,
			String finalidadeIngles) {
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
		this.finalidade = finalidade;
		this.objetoRepresentado = objetoRepresentado;
		this.materialUtilizado = materialUtilizado;
		this.instituicaoFinanciadora = instituicaoFinanciadora;
		this.finalidadeIngles = finalidadeIngles;
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

	public String getFinalidade() {
		return this.finalidade;
	}

	public void setFinalidade(String finalidade) {
		this.finalidade = finalidade;
	}

	public String getObjetoRepresentado() {
		return this.objetoRepresentado;
	}

	public void setObjetoRepresentado(String objetoRepresentado) {
		this.objetoRepresentado = objetoRepresentado;
	}

	public String getMaterialUtilizado() {
		return this.materialUtilizado;
	}

	public void setMaterialUtilizado(String materialUtilizado) {
		this.materialUtilizado = materialUtilizado;
	}

	public String getInstituicaoFinanciadora() {
		return this.instituicaoFinanciadora;
	}

	public void setInstituicaoFinanciadora(String instituicaoFinanciadora) {
		this.instituicaoFinanciadora = instituicaoFinanciadora;
	}

	public String getFinalidadeIngles() {
		return this.finalidadeIngles;
	}

	public void setFinalidadeIngles(String finalidadeIngles) {
		this.finalidadeIngles = finalidadeIngles;
	}
}
