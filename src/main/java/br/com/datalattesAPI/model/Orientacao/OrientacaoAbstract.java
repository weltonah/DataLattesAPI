package br.com.datalattesAPI.model.Orientacao;

import br.com.datalattesAPI.model.Geral.AreaConhecimento;
import br.com.datalattesAPI.model.Geral.PalavraChave;
import br.com.datalattesAPI.model.Geral.SetorAtividade;

/**
 * 
 */
public abstract class OrientacaoAbstract extends auxiliarOrientacao {

	public String natureza;
	public String titulo;
	public String ano;
	public String pais;
	public String doi;
	public String tipoOrientacao;
	public String nomeOrientado;
	public String nomeInstituicao;
	public String nomeOrgao;
	public String nomeCurso;
	public String flagBolsa;
	public String nomeAgencia;
	public String idOrientador;

	public OrientacaoAbstract(PalavraChave palavraChave, SetorAtividade setorAtividade,
			AreaConhecimento areaConhecimento, String natureza, String titulo, String ano, String pais, String doi,
			String tipoOrientacao, String nomeOrientado, String nomeInstituicao, String nomeOrgao, String nomeCurso,
			String flagBolsa, String nomeAgencia, String idOrientador) {
		super(palavraChave, setorAtividade, areaConhecimento);
		this.natureza = natureza;
		this.titulo = titulo;
		this.ano = ano;
		this.pais = pais;
		this.doi = doi;
		this.tipoOrientacao = tipoOrientacao;
		this.nomeOrientado = nomeOrientado;
		this.nomeInstituicao = nomeInstituicao;
		this.nomeOrgao = nomeOrgao;
		this.nomeCurso = nomeCurso;
		this.flagBolsa = flagBolsa;
		this.nomeAgencia = nomeAgencia;
		this.idOrientador = idOrientador;
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

	public String getDoi() {
		return this.doi;
	}

	public void setDoi(String doi) {
		this.doi = doi;
	}

	public String getTipoOrientacao() {
		return this.tipoOrientacao;
	}

	public void setTipoOrientacao(String tipoOrientacao) {
		this.tipoOrientacao = tipoOrientacao;
	}

	public String getNomeOrientado() {
		return this.nomeOrientado;
	}

	public void setNomeOrientado(String nomeOrientado) {
		this.nomeOrientado = nomeOrientado;
	}

	public String getNomeInstituicao() {
		return this.nomeInstituicao;
	}

	public void setNomeInstituicao(String nomeInstituicao) {
		this.nomeInstituicao = nomeInstituicao;
	}

	public String getNomeOrgao() {
		return this.nomeOrgao;
	}

	public void setNomeOrgao(String nomeOrgao) {
		this.nomeOrgao = nomeOrgao;
	}

	public String getNomeCurso() {
		return this.nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public String getFlagBolsa() {
		return this.flagBolsa;
	}

	public void setFlagBolsa(String flagBolsa) {
		this.flagBolsa = flagBolsa;
	}

	public String getNomeAgencia() {
		return this.nomeAgencia;
	}

	public void setNomeAgencia(String nomeAgencia) {
		this.nomeAgencia = nomeAgencia;
	}

	public String getIdOrientador() {
		return this.idOrientador;
	}

	public void setIdOrientador(String idOrientador) {
		this.idOrientador = idOrientador;
	}

}