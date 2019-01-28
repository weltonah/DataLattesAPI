package br.com.datalattesAPI.model.ProducaoArtistica;

import br.com.datalattesAPI.model.Geral.AreaConhecimento;
import br.com.datalattesAPI.model.Geral.PalavraChave;
import br.com.datalattesAPI.model.Geral.SetorAtividade;
import br.com.datalattesAPI.model.Producao.Autores;
import br.com.datalattesAPI.model.Producao.Auxiliar;

public class ComposicaoMusical extends Auxiliar {
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
	String formacaoInstrumental;
	String numeroDePaginas;
	String registroDeDireitoAutoral;
	String premiacao;

	public ComposicaoMusical(Autores autores, PalavraChave palavraChave, SetorAtividade setorAtividade,
			AreaConhecimento areaConhecimento, String natureza, String titulo, String ano, String pais, String idioma,
			String meioDeDivulgacao, String homePage, String flagRelevancia, String doi, String tituloIngles,
			String formacaoInstrumental, String numeroDePaginas, String registroDeDireitoAutoral, String premiacao) {
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
		this.formacaoInstrumental = formacaoInstrumental;
		this.numeroDePaginas = numeroDePaginas;
		this.registroDeDireitoAutoral = registroDeDireitoAutoral;
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

	public String getFormacaoInstrumental() {
		return this.formacaoInstrumental;
	}

	public void setFormacaoInstrumental(String formacaoInstrumental) {
		this.formacaoInstrumental = formacaoInstrumental;
	}

	public String getNumeroDePaginas() {
		return this.numeroDePaginas;
	}

	public void setNumeroDePaginas(String numeroDePaginas) {
		this.numeroDePaginas = numeroDePaginas;
	}

	public String getRegistroDeDireitoAutoral() {
		return this.registroDeDireitoAutoral;
	}

	public void setRegistroDeDireitoAutoral(String registroDeDireitoAutoral) {
		this.registroDeDireitoAutoral = registroDeDireitoAutoral;
	}

	public String getPremiacao() {
		return this.premiacao;
	}

	public void setPremiacao(String premiacao) {
		this.premiacao = premiacao;
	}
}
