package br.com.datalattesAPI.model.ProducaoArtistica;

import br.com.datalattesAPI.model.Geral.AreaConhecimento;
import br.com.datalattesAPI.model.Geral.PalavraChave;
import br.com.datalattesAPI.model.Geral.SetorAtividade;
import br.com.datalattesAPI.model.Producao.Autores;
import br.com.datalattesAPI.model.Producao.Auxiliar;

public class ApresentacaoEmRadioOuTv extends Auxiliar {
	String natureza;
	String titulo;
	String ano;
	String pais;
	String idioma;
	String flagRelevancia;
	String doi;
	String tituloIngles;
	String flagDivulgacaoCientifica;
	String emissora;
	String formatoDataDeApresentacao;
	String dataDeApresentacao;
	String duracaoEmMinutos;
	String cidade;

	public ApresentacaoEmRadioOuTv(Autores autores, PalavraChave palavraChave, SetorAtividade setorAtividade,
			AreaConhecimento areaConhecimento, String natureza, String titulo, String ano, String pais, String idioma,
			String flagRelevancia, String doi, String tituloIngles, String flagDivulgacaoCientifica, String emissora,
			String formatoDataDeApresentacao, String dataDeApresentacao, String duracaoEmMinutos, String cidade) {
		super(autores, palavraChave, setorAtividade, areaConhecimento);
		this.natureza = natureza;
		this.titulo = titulo;
		this.ano = ano;
		this.pais = pais;
		this.idioma = idioma;
		this.flagRelevancia = flagRelevancia;
		this.doi = doi;
		this.tituloIngles = tituloIngles;
		this.flagDivulgacaoCientifica = flagDivulgacaoCientifica;
		this.emissora = emissora;
		this.formatoDataDeApresentacao = formatoDataDeApresentacao;
		this.dataDeApresentacao = dataDeApresentacao;
		this.duracaoEmMinutos = duracaoEmMinutos;
		this.cidade = cidade;
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

	public String getFormatoDataDeApresentacao() {
		return this.formatoDataDeApresentacao;
	}

	public void setFormatoDataDeApresentacao(String formatoDataDeApresentacao) {
		this.formatoDataDeApresentacao = formatoDataDeApresentacao;
	}

	public String getDataDeApresentacao() {
		return this.dataDeApresentacao;
	}

	public void setDataDeApresentacao(String dataDeApresentacao) {
		this.dataDeApresentacao = dataDeApresentacao;
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
}
