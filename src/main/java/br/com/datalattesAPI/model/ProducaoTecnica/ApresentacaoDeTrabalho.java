package br.com.datalattesAPI.model.ProducaoTecnica;

import br.com.datalattesAPI.model.Geral.AreaConhecimento;
import br.com.datalattesAPI.model.Geral.PalavraChave;
import br.com.datalattesAPI.model.Geral.SetorAtividade;
import br.com.datalattesAPI.model.Producao.Autores;
import br.com.datalattesAPI.model.Producao.Auxiliar;

public class ApresentacaoDeTrabalho extends Auxiliar {
	String natureza;
	String titulo;
	String ano;
	String pais;
	String idioma;
	String flagRelevancia;
	String doi;
	String tituloIngles;
	String flagDivulgacaoCientifica;
	String nomeDoEvento;
	String instituicaoPromotora;
	String localDaApresentacao;
	String cidadeDaApresentacao;
	String nomeDoEventoIngles;

	public ApresentacaoDeTrabalho(Autores autores, PalavraChave palavraChave, SetorAtividade setorAtividade,
			AreaConhecimento areaConhecimento, String natureza, String titulo, String ano, String pais, String idioma,
			String flagRelevancia, String doi, String tituloIngles, String flagDivulgacaoCientifica,
			String nomeDoEvento, String instituicaoPromotora, String localDaApresentacao, String cidadeDaApresentacao,
			String nomeDoEventoIngles) {
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
		this.nomeDoEvento = nomeDoEvento;
		this.instituicaoPromotora = instituicaoPromotora;
		this.localDaApresentacao = localDaApresentacao;
		this.cidadeDaApresentacao = cidadeDaApresentacao;
		this.nomeDoEventoIngles = nomeDoEventoIngles;
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

	public String getNomeDoEvento() {
		return this.nomeDoEvento;
	}

	public void setNomeDoEvento(String nomeDoEvento) {
		this.nomeDoEvento = nomeDoEvento;
	}

	public String getInstituicaoPromotora() {
		return this.instituicaoPromotora;
	}

	public void setInstituicaoPromotora(String instituicaoPromotora) {
		this.instituicaoPromotora = instituicaoPromotora;
	}

	public String getLocalDaApresentacao() {
		return this.localDaApresentacao;
	}

	public void setLocalDaApresentacao(String localDaApresentacao) {
		this.localDaApresentacao = localDaApresentacao;
	}

	public String getCidadeDaApresentacao() {
		return this.cidadeDaApresentacao;
	}

	public void setCidadeDaApresentacao(String cidadeDaApresentacao) {
		this.cidadeDaApresentacao = cidadeDaApresentacao;
	}

	public String getNomeDoEventoIngles() {
		return this.nomeDoEventoIngles;
	}

	public void setNomeDoEventoIngles(String nomeDoEventoIngles) {
		this.nomeDoEventoIngles = nomeDoEventoIngles;
	}
}
