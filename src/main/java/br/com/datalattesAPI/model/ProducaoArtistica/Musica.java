package br.com.datalattesAPI.model.ProducaoArtistica;

import br.com.datalattesAPI.model.Geral.AreaConhecimento;
import br.com.datalattesAPI.model.Geral.PalavraChave;
import br.com.datalattesAPI.model.Geral.SetorAtividade;
import br.com.datalattesAPI.model.Producao.Autores;
import br.com.datalattesAPI.model.Producao.Auxiliar;

public class Musica extends Auxiliar {
	String natureza;
	String titulo;
	String ano;
	String pais;
	String idioma;
	String meioDeDivulgacao;
	String homePage;
	String flagRelevancia;
	String tituloIngles;
	String flagDivulgacaoCientifica;
	String tipoDeEvento;
	String atividadeDosAutores;
	String formacaoInstrumental;
	String flagIneditismoDaObra;
	String dataEstreia;
	String dataEncerramento;
	String localDeEstreia;
	String premiacao;
	String instituicaoPromotoraDoPremio;
	String obraDeReferencia;
	String autorDaObraDeReferencia;
	String anoDaObraDeReferencia;
	String duracao;
	String temporada;
	String instituicaoPromotoraDoEvento;
	String localDoEvento;
	String cidadeDoEvento;

	public Musica(Autores autores, PalavraChave palavraChave, SetorAtividade setorAtividade,
			AreaConhecimento areaConhecimento, String natureza, String titulo, String ano, String pais, String idioma,
			String meioDeDivulgacao, String homePage, String flagRelevancia, String tituloIngles,
			String flagDivulgacaoCientifica, String tipoDeEvento, String atividadeDosAutores,
			String formacaoInstrumental, String flagIneditismoDaObra, String dataEstreia, String dataEncerramento,
			String localDeEstreia, String premiacao, String instituicaoPromotoraDoPremio, String obraDeReferencia,
			String autorDaObraDeReferencia, String anoDaObraDeReferencia, String duracao, String temporada,
			String instituicaoPromotoraDoEvento, String localDoEvento, String cidadeDoEvento) {
		super(autores, palavraChave, setorAtividade, areaConhecimento);
		this.natureza = natureza;
		this.titulo = titulo;
		this.ano = ano;
		this.pais = pais;
		this.idioma = idioma;
		this.meioDeDivulgacao = meioDeDivulgacao;
		this.homePage = homePage;
		this.flagRelevancia = flagRelevancia;
		this.tituloIngles = tituloIngles;
		this.flagDivulgacaoCientifica = flagDivulgacaoCientifica;
		this.tipoDeEvento = tipoDeEvento;
		this.atividadeDosAutores = atividadeDosAutores;
		this.formacaoInstrumental = formacaoInstrumental;
		this.flagIneditismoDaObra = flagIneditismoDaObra;
		this.dataEstreia = dataEstreia;
		this.dataEncerramento = dataEncerramento;
		this.localDeEstreia = localDeEstreia;
		this.premiacao = premiacao;
		this.instituicaoPromotoraDoPremio = instituicaoPromotoraDoPremio;
		this.obraDeReferencia = obraDeReferencia;
		this.autorDaObraDeReferencia = autorDaObraDeReferencia;
		this.anoDaObraDeReferencia = anoDaObraDeReferencia;
		this.duracao = duracao;
		this.temporada = temporada;
		this.instituicaoPromotoraDoEvento = instituicaoPromotoraDoEvento;
		this.localDoEvento = localDoEvento;
		this.cidadeDoEvento = cidadeDoEvento;
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

	public String getFormacaoInstrumental() {
		return this.formacaoInstrumental;
	}

	public void setFormacaoInstrumental(String formacaoInstrumental) {
		this.formacaoInstrumental = formacaoInstrumental;
	}

	public String getFlagIneditismoDaObra() {
		return this.flagIneditismoDaObra;
	}

	public void setFlagIneditismoDaObra(String flagIneditismoDaObra) {
		this.flagIneditismoDaObra = flagIneditismoDaObra;
	}

	public String getDataEstreia() {
		return this.dataEstreia;
	}

	public void setDataEstreia(String dataEstreia) {
		this.dataEstreia = dataEstreia;
	}

	public String getDataEncerramento() {
		return this.dataEncerramento;
	}

	public void setDataEncerramento(String dataEncerramento) {
		this.dataEncerramento = dataEncerramento;
	}

	public String getLocalDeEstreia() {
		return this.localDeEstreia;
	}

	public void setLocalDeEstreia(String localDeEstreia) {
		this.localDeEstreia = localDeEstreia;
	}

	public String getPremiacao() {
		return this.premiacao;
	}

	public void setPremiacao(String premiacao) {
		this.premiacao = premiacao;
	}

	public String getInstituicaoPromotoraDoPremio() {
		return this.instituicaoPromotoraDoPremio;
	}

	public void setInstituicaoPromotoraDoPremio(String instituicaoPromotoraDoPremio) {
		this.instituicaoPromotoraDoPremio = instituicaoPromotoraDoPremio;
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

	public String getDuracao() {
		return this.duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}

	public String getTemporada() {
		return this.temporada;
	}

	public void setTemporada(String temporada) {
		this.temporada = temporada;
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
}
