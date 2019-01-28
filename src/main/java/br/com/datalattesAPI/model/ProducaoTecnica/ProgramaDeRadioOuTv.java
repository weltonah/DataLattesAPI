package br.com.datalattesAPI.model.ProducaoTecnica;

import br.com.datalattesAPI.model.Geral.AreaConhecimento;
import br.com.datalattesAPI.model.Geral.PalavraChave;
import br.com.datalattesAPI.model.Geral.SetorAtividade;
import br.com.datalattesAPI.model.Producao.Autores;
import br.com.datalattesAPI.model.Producao.Auxiliar;

public class ProgramaDeRadioOuTv extends Auxiliar {
	String natureza;
	String titulo;
	String ano;
	String pais;
	String idioma;
	String flagRelevancia;
	String doi;
	String tituloIngles;
	String homePage;
	String meioDeDivulgacao;
	String flagDivulgacaoCientifica;
	String emissora;
	String tema;
	String formatoDataDaApresentacao;
	String dataDaApresentacao;
	String duracaoEmMinutos;
	String cidade;
	String veiculoDeDivulgacao;

	public ProgramaDeRadioOuTv(Autores autores, PalavraChave palavraChave, SetorAtividade setorAtividade,
			AreaConhecimento areaConhecimento, String natureza, String titulo, String ano, String pais, String idioma,
			String flagRelevancia, String doi, String tituloIngles, String homePage, String meioDeDivulgacao,
			String flagDivulgacaoCientifica, String emissora, String tema, String formatoDataDaApresentacao,
			String dataDaApresentacao, String duracaoEmMinutos, String cidade, String veiculoDeDivulgacao) {
		super(autores, palavraChave, setorAtividade, areaConhecimento);
		this.natureza = natureza;
		this.titulo = titulo;
		this.ano = ano;
		this.pais = pais;
		this.idioma = idioma;
		this.flagRelevancia = flagRelevancia;
		this.doi = doi;
		this.tituloIngles = tituloIngles;
		this.homePage = homePage;
		this.meioDeDivulgacao = meioDeDivulgacao;
		this.flagDivulgacaoCientifica = flagDivulgacaoCientifica;
		this.emissora = emissora;
		this.tema = tema;
		this.formatoDataDaApresentacao = formatoDataDaApresentacao;
		this.dataDaApresentacao = dataDaApresentacao;
		this.duracaoEmMinutos = duracaoEmMinutos;
		this.cidade = cidade;
		this.veiculoDeDivulgacao = veiculoDeDivulgacao;
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

	public String getHomePage() {
		return this.homePage;
	}

	public void setHomePage(String homePage) {
		this.homePage = homePage;
	}

	public String getMeioDeDivulgacao() {
		return this.meioDeDivulgacao;
	}

	public void setMeioDeDivulgacao(String meioDeDivulgacao) {
		this.meioDeDivulgacao = meioDeDivulgacao;
	}

	public String getFlagDivulgacaoCientifica() {
		return this.flagDivulgacaoCientifica;
	}

	public void setFlagDivulgacaoCientifica(String flagDivulgacaoCientifica) {
		this.flagDivulgacaoCientifica = flagDivulgacaoCientifica;
	}

	public String getEmissora() {
		return this.emissora;
	}

	public void setEmissora(String emissora) {
		this.emissora = emissora;
	}

	public String getTema() {
		return this.tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public String getFormatoDataDaApresentacao() {
		return this.formatoDataDaApresentacao;
	}

	public void setFormatoDataDaApresentacao(String formatoDataDaApresentacao) {
		this.formatoDataDaApresentacao = formatoDataDaApresentacao;
	}

	public String getDataDaApresentacao() {
		return this.dataDaApresentacao;
	}

	public void setDataDaApresentacao(String dataDaApresentacao) {
		this.dataDaApresentacao = dataDaApresentacao;
	}

	public String getDuracaoEmMinutos() {
		return this.duracaoEmMinutos;
	}

	public void setDuracaoEmMinutos(String duracaoEmMinutos) {
		this.duracaoEmMinutos = duracaoEmMinutos;
	}

	public String getCidade() {
		return this.cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getVeiculoDeDivulgacao() {
		return this.veiculoDeDivulgacao;
	}

	public void setVeiculoDeDivulgacao(String veiculoDeDivulgacao) {
		this.veiculoDeDivulgacao = veiculoDeDivulgacao;
	}
}
