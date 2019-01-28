package br.com.datalattesAPI.model.ProducaoArtistica;

import br.com.datalattesAPI.model.Geral.AreaConhecimento;
import br.com.datalattesAPI.model.Geral.PalavraChave;
import br.com.datalattesAPI.model.Geral.SetorAtividade;
import br.com.datalattesAPI.model.Producao.Autores;
import br.com.datalattesAPI.model.Producao.Auxiliar;

public class ApresentacaoDeObraArtistica extends Auxiliar {
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
	String tipoDeEvento;
	String atividadeDosAutores;
	String flagIneditismoDaObra;
	String premiacao;
	String obraDeReferencia;
	String autorDaObraDeReferencia;
	String anoDaObraDeReferencia;
	String duracaoEmMinutos;
	String instituicaoPromotoraDoEvento;
	String localDoEvento;
	String cidade;

	public ApresentacaoDeObraArtistica(Autores autores, PalavraChave palavraChave, SetorAtividade setorAtividade,
			AreaConhecimento areaConhecimento, String natureza, String titulo, String ano, String pais, String idioma,
			String meioDeDivulgacao, String homePage, String flagRelevancia, String doi, String tituloIngles,
			String tipoDeEvento, String atividadeDosAutores, String flagIneditismoDaObra, String premiacao,
			String obraDeReferencia, String autorDaObraDeReferencia, String anoDaObraDeReferencia,
			String duracaoEmMinutos, String instituicaoPromotoraDoEvento, String localDoEvento, String cidade) {
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
		this.tipoDeEvento = tipoDeEvento;
		this.atividadeDosAutores = atividadeDosAutores;
		this.flagIneditismoDaObra = flagIneditismoDaObra;
		this.premiacao = premiacao;
		this.obraDeReferencia = obraDeReferencia;
		this.autorDaObraDeReferencia = autorDaObraDeReferencia;
		this.anoDaObraDeReferencia = anoDaObraDeReferencia;
		this.duracaoEmMinutos = duracaoEmMinutos;
		this.instituicaoPromotoraDoEvento = instituicaoPromotoraDoEvento;
		this.localDoEvento = localDoEvento;
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

	public String getTipoDeEvento() {
		return this.tipoDeEvento;
	}

	public void setTipoDeEvento(String tipoDeEvento) {
		this.tipoDeEvento = tipoDeEvento;
	}

	public String getAtividadeDosAutores() {
		return this.atividadeDosAutores;
	}

	public void setAtividadeDosAutores(String atividadeDosAutores) {
		this.atividadeDosAutores = atividadeDosAutores;
	}

	public String getFlagIneditismoDaObra() {
		return this.flagIneditismoDaObra;
	}

	public void setFlagIneditismoDaObra(String flagIneditismoDaObra) {
		this.flagIneditismoDaObra = flagIneditismoDaObra;
	}

	public String getPremiacao() {
		return this.premiacao;
	}

	public void setPremiacao(String premiacao) {
		this.premiacao = premiacao;
	}

	public String getObraDeReferencia() {
		return this.obraDeReferencia;
	}

	public void setObraDeReferencia(String obraDeReferencia) {
		this.obraDeReferencia = obraDeReferencia;
	}

	public String getAutorDaObraDeReferencia() {
		return this.autorDaObraDeReferencia;
	}

	public void setAutorDaObraDeReferencia(String autorDaObraDeReferencia) {
		this.autorDaObraDeReferencia = autorDaObraDeReferencia;
	}

	public String getAnoDaObraDeReferencia() {
		return this.anoDaObraDeReferencia;
	}

	public void setAnoDaObraDeReferencia(String anoDaObraDeReferencia) {
		this.anoDaObraDeReferencia = anoDaObraDeReferencia;
	}

	public String getDuracaoEmMinutos() {
		return this.duracaoEmMinutos;
	}

	public void setDuracaoEmMinutos(String duracaoEmMinutos) {
		this.duracaoEmMinutos = duracaoEmMinutos;
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
}
