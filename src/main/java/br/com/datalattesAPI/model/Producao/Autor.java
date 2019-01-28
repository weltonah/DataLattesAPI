package br.com.datalattesAPI.model.Producao;

/**
 * 
 */
public class Autor {

	public String nomeCompleto;
	public String nomeCitacao;
	public String idCnpq;

	public Autor(String nomeCompleto, String nomeCitacao, String idCnpq) {
		super();
		this.nomeCompleto = nomeCompleto;
		this.nomeCitacao = nomeCitacao;
		this.idCnpq = idCnpq;
	}

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

	public String getIdCnpq() {
		return this.idCnpq;
	}

	public void setIdCnpq(String idCnpq) {
		this.idCnpq = idCnpq;
	}

}