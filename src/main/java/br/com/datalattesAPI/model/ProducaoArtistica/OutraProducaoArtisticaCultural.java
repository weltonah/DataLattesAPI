package br.com.datalattesAPI.model.ProducaoArtistica;

import br.com.datalattesAPI.model.Geral.AreaConhecimento;
import br.com.datalattesAPI.model.Geral.PalavraChave;
import br.com.datalattesAPI.model.Geral.SetorAtividade;
import br.com.datalattesAPI.model.Producao.Autores;
import br.com.datalattesAPI.model.Producao.Auxiliar;

public class OutraProducaoArtisticaCultural extends Auxiliar {
	String natureza;
	String titulo;
	String ano;
	String pais;
	String idioma;
	String meioDeDivulgacao;
	String homePage;
	String flagRelevancia;
	String doi;
	String tituloIngles;
	String naturezaIngles;
	String flagDivulgacaoCientifica;
	String instituicaoPromotoraDoEvento;
	String localDoEvento;
	String cidade;
	String exposicao;
	String premiacao;

	public OutraProducaoArtisticaCultural(Autores autores, PalavraChave palavraChave, SetorAtividade setorAtividade,
			AreaConhecimento areaConhecimento, String natureza, String titulo, String ano, String pais, String idioma,
			String meioDeDivulgacao, String homePage, String flagRelevancia, String doi, String tituloIngles,
			String naturezaIngles, String flagDivulgacaoCientifica, String instituicaoPromotoraDoEvento,
			String localDoEvento, String cidade, String exposicao, String premiacao) {
		super(autores, palavraChave, setorAtividade, areaConhecimento);
		this.natureza = natureza;
		this.titulo = titulo;
		this.ano = ano;
		this.pais = pais;
		this.idioma = idioma;
		this.meioDeDivulgacao = meioDeDivulgacao;
		this.homePage = homePage;
		this.flagRelevancia = flagRelevancia;
		this.doi = doi;
		this.tituloIngles = tituloIngles;
		this.naturezaIngles = naturezaIngles;
		this.flagDivulgacaoCientifica = flagDivulgacaoCientifica;
		this.instituicaoPromotoraDoEvento = instituicaoPromotoraDoEvento;
		this.localDoEvento = localDoEvento;
		this.cidade = cidade;
		this.exposicao = exposicao;
		this.premiacao = premiacao;
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

	public String getMeioDeDivulgacao() {
		return this.meioDeDivulgacao;
	}

	public void setMeioDeDivulgacao(String meioDeDivulgacao) {
		this.meioDeDivulgacao = meioDeDivulgacao;
	}

	public String getHomePage() {
		return this.homePage;
	}

	public void setHomePage(String homePage) {
		this.homePage = homePage;
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

	public String getNaturezaIngles() {
		return this.naturezaIngles;
	}

	public void setNaturezaIngles(String naturezaIngles) {
		this.naturezaIngles = naturezaIngles;
	}

	public String getFlagDivulgacaoCientifica() {
		return this.flagDivulgacaoCientifica;
	}

	public void setFlagDivulgacaoCientifica(String flagDivulgacaoCientifica) {
		this.flagDivulgacaoCientifica = flagDivulgacaoCientifica;
	}

	public String getInstituicaoPromotoraDoEvento() {
		return this.instituicaoPromotoraDoEvento;
	}

	public void setInstituicaoPromotoraDoEvento(String instituicaoPromotoraDoEvento) {
		this.instituicaoPromotoraDoEvento = instituicaoPromotoraDoEvento;
	}

	public String getLocalDoEvento() {
		return this.localDoEvento;
	}

	public void setLocalDoEvento(String localDoEvento) {
		this.localDoEvento = localDoEvento;
	}

	public String getCidade() {
		return this.cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getExposicao() {
		return this.exposicao;
	}

	public void setExposicao(String exposicao) {
		this.exposicao = exposicao;
	}

	public String getPremiacao() {
		return this.premiacao;
	}

	public void setPremiacao(String premiacao) {
		this.premiacao = premiacao;
	}
}
