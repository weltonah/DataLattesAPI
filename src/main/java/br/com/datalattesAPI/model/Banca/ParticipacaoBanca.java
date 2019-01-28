package br.com.datalattesAPI.model.Banca;

/**
 * 
 */
public class ParticipacaoBanca {

	public String nomeCompleto;
	public String citacao;
	public String idCnpq;

	public ParticipacaoBanca(String nomeCompleto, String citacao, String idCnpq) {
		super();
		this.nomeCompleto = nomeCompleto;
		this.citacao = citacao;
		this.idCnpq = idCnpq;
	}

	public String getNomeCompleto() {
		return this.nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getCitacao() {
		return this.citacao;
	}

	public void setCitacao(String citacao) {
		this.citacao = citacao;
	}

	public String getIdCnpq() {
		return this.idCnpq;
	}

	public void setIdCnpq(String idCnpq) {
		this.idCnpq = idCnpq;
	}

}