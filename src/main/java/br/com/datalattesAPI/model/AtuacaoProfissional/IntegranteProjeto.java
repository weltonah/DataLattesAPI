package br.com.datalattesAPI.model.AtuacaoProfissional;

/**
 * 
 */
public class IntegranteProjeto {

	/**
	 * 
	 */
	public String nomeCompleto;

	public IntegranteProjeto(String nomeCompleto, String nomeCitacao, String flagResponsavel, String idCnpq) {
		super();
		this.nomeCompleto = nomeCompleto;
		this.nomeCitacao = nomeCitacao;
		this.flagResponsavel = flagResponsavel;
		this.idCnpq = idCnpq;
	}

	/**
	 * 
	 */
	public String nomeCitacao;

	/**
	 * 
	 */
	public String flagResponsavel;

	/**
	 * 
	 */
	public String idCnpq;

	public String getNomeCompleto() {
		return this.nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getNomeCitacao() {
		return this.nomeCitacao;
	}

	public void setNomeCitacao(String nomeCitacao) {
		this.nomeCitacao = nomeCitacao;
	}

	public String getFlagResponsavel() {
		return this.flagResponsavel;
	}

	public void setFlagResponsavel(String flagResponsavel) {
		this.flagResponsavel = flagResponsavel;
	}

	public String getIdCnpq() {
		return this.idCnpq;
	}

	public void setIdCnpq(String idCnpq) {
		this.idCnpq = idCnpq;
	}

}