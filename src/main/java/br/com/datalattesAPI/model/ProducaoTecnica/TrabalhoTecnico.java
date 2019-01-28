package br.com.datalattesAPI.model.ProducaoTecnica;

import br.com.datalattesAPI.model.Geral.AreaConhecimento;
import br.com.datalattesAPI.model.Geral.PalavraChave;
import br.com.datalattesAPI.model.Geral.SetorAtividade;
import br.com.datalattesAPI.model.Producao.Autores;
import br.com.datalattesAPI.model.Producao.Auxiliar;

public class TrabalhoTecnico extends Auxiliar {
	String natureza;
	String tituloDoTrabalhoTecnico;
	String ano;
	String pais;
	String meioDeDivulgacao;
	String homePageDoTrabalho;
	String idioma;
	String flagRelevancia;
	String doi;
	String tituloDoTrabalhoTecnicoIngles;
	String finalidade;
	String duracaoEmMeses;
	String numeroDePaginas;
	String disponibilidade;
	String instituicaoFinanciadora;
	String cidadeDoTrabalho;
	String finalidadeIngles;

	public TrabalhoTecnico(Autores autores, PalavraChave palavraChave, SetorAtividade setorAtividade,
			AreaConhecimento areaConhecimento, String natureza, String tituloDoTrabalhoTecnico, String ano, String pais,
			String meioDeDivulgacao, String homePageDoTrabalho, String idioma, String flagRelevancia, String doi,
			String tituloDoTrabalhoTecnicoIngles, String finalidade, String duracaoEmMeses, String numeroDePaginas,
			String disponibilidade, String instituicaoFinanciadora, String cidadeDoTrabalho, String finalidadeIngles) {
		super(autores, palavraChave, setorAtividade, areaConhecimento);
		this.natureza = natureza;
		this.tituloDoTrabalhoTecnico = tituloDoTrabalhoTecnico;
		this.ano = ano;
		this.pais = pais;
		this.meioDeDivulgacao = meioDeDivulgacao;
		this.homePageDoTrabalho = homePageDoTrabalho;
		this.idioma = idioma;
		this.flagRelevancia = flagRelevancia;
		this.doi = doi;
		this.tituloDoTrabalhoTecnicoIngles = tituloDoTrabalhoTecnicoIngles;
		this.finalidade = finalidade;
		this.duracaoEmMeses = duracaoEmMeses;
		this.numeroDePaginas = numeroDePaginas;
		this.disponibilidade = disponibilidade;
		this.instituicaoFinanciadora = instituicaoFinanciadora;
		this.cidadeDoTrabalho = cidadeDoTrabalho;
		this.finalidadeIngles = finalidadeIngles;
	}

	public String getNatureza() {
		return this.natureza;
	}

	public void setNatureza(String natureza) {
		this.natureza = natureza;
	}

	public String getTituloDoTrabalhoTecnico() {
		return this.tituloDoTrabalhoTecnico;
	}

	public void setTituloDoTrabalhoTecnico(String tituloDoTrabalhoTecnico) {
		this.tituloDoTrabalhoTecnico = tituloDoTrabalhoTecnico;
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

	public String getIdioma() {
		return this.idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
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

	public String getTituloDoTrabalhoTecnicoIngles() {
		return this.tituloDoTrabalhoTecnicoIngles;
	}

	public void setTituloDoTrabalhoTecnicoIngles(String tituloDoTrabalhoTecnicoIngles) {
		this.tituloDoTrabalhoTecnicoIngles = tituloDoTrabalhoTecnicoIngles;
	}

	public String getFinalidade() {
		return this.finalidade;
	}

	public void setFinalidade(String finalidade) {
		this.finalidade = finalidade;
	}

	public String getDuracaoEmMeses() {
		return this.duracaoEmMeses;
	}

	public void setDuracaoEmMeses(String duracaoEmMeses) {
		this.duracaoEmMeses = duracaoEmMeses;
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

	public String getCidadeDoTrabalho() {
		return this.cidadeDoTrabalho;
	}

	public void setCidadeDoTrabalho(String cidadeDoTrabalho) {
		this.cidadeDoTrabalho = cidadeDoTrabalho;
	}

	public String getFinalidadeIngles() {
		return this.finalidadeIngles;
	}

	public void setFinalidadeIngles(String finalidadeIngles) {
		this.finalidadeIngles = finalidadeIngles;
	}
}
