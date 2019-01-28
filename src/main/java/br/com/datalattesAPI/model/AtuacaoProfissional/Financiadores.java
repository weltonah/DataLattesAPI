package br.com.datalattesAPI.model.AtuacaoProfissional;

/**
 * 
 */
public class Financiadores {

	public Financiadores(String nomeInstituicao, String natureza) {
		super();
		this.nomeInstituicao = nomeInstituicao;
		this.natureza = natureza;
	}

	/**
	 * 
	 */
	public String nomeInstituicao;

	/**
	 * 
	 */
	public String natureza;

	public String getNomeInstituicao() {
		return this.nomeInstituicao;
	}

	public void setNomeInstituicao(String nomeInstituicao) {
		this.nomeInstituicao = nomeInstituicao;
	}

	public String getNatureza() {
		return this.natureza;
	}

	public void setNatureza(String natureza) {
		this.natureza = natureza;
	}

}