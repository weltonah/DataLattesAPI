package br.com.datalattesAPI.model.ProducaoArtistica;

import br.com.datalattesAPI.model.Geral.AreaConhecimento;
import br.com.datalattesAPI.model.Geral.PalavraChave;
import br.com.datalattesAPI.model.Geral.SetorAtividade;
import br.com.datalattesAPI.model.Producao.Autores;
import br.com.datalattesAPI.model.Producao.Auxiliar;

public class ArtesVisuais extends Auxiliar {
	String natureza;
	String titulo;
	String ano;
	String pais;
	String idioma;
	String flagRelevancia;
	String tituloIngles;
	String meioDeDivulgacao;
	String homePage;
	String flagDivulgacaoCientifica;
	String premiacao;
	String atividadeDosAutores;
	String instituicaoPromotoraDoEvento;
	String localDoEvento;
	String cidadeDoEvento;
	String temporada;

	public ArtesVisuais(Autores autores, PalavraChave palavraChave, SetorAtividade setorAtividade,
			AreaConhecimento areaConhecimento, String natureza, String titulo, String ano, String pais, String idioma,
			String flagRelevancia, String tituloIngles, String meioDeDivulgacao, String homePage,
			String flagDivulgacaoCientifica, String premiacao, String atividadeDosAutores,
			String instituicaoPromotoraDoEvento, String localDoEvento, String cidadeDoEvento, String temporada) {
		super(autores, palavraChave, setorAtividade, areaConhecimento);
		this.natureza = natureza;
		this.titulo = titulo;
		this.ano = ano;
		this.pais = pais;
		this.idioma = idioma;
		this.flagRelevancia = flagRelevancia;
		this.tituloIngles = tituloIngles;
		this.meioDeDivulgacao = meioDeDivulgacao;
		this.homePage = homePage;
		this.flagDivulgacaoCientifica = flagDivulgacaoCientifica;
		this.premiacao = premiacao;
		this.atividadeDosAutores = atividadeDosAutores;
		this.instituicaoPromotoraDoEvento = instituicaoPromotoraDoEvento;
		this.localDoEvento = localDoEvento;
		this.cidadeDoEvento = cidadeDoEvento;
		this.temporada = temporada;
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

	public String getTituloIngles() {
		return this.tituloIngles;
	}

	public void setTituloIngles(String tituloIngles) {
		this.tituloIngles = tituloIngles;
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

	public String getFlagDivulgacaoCientifica() {
		return this.flagDivulgacaoCientifica;
	}

	public void setFlagDivulgacaoCientifica(String flagDivulgacaoCientifica) {
		this.flagDivulgacaoCientifica = flagDivulgacaoCientifica;
	}

	public String getPremiacao() {
		return this.premiacao;
	}

	public void setPremiacao(String premiacao) {
		this.premiacao = premiacao;
	}

	public String getAtividadeDosAutores() {
		return this.atividadeDosAutores;
	}

	public void setAtividadeDosAutores(String atividadeDosAutores) {
		this.atividadeDosAutores = atividadeDosAutores;
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

	public String getCidadeDoEvento() {
		return this.cidadeDoEvento;
	}

	public void setCidadeDoEvento(String cidadeDoEvento) {
		this.cidadeDoEvento = cidadeDoEvento;
	}

	public String getTemporada() {
		return this.temporada;
	}

	public void setTemporada(String temporada) {
		this.temporada = temporada;
	}
}
