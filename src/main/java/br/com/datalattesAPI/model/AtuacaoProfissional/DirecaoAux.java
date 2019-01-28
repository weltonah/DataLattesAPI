package br.com.datalattesAPI.model.AtuacaoProfissional;

/**
 * 
 */
public abstract class DirecaoAux extends Atuacao {

	public DirecaoAux(String mesInicio, String anoInicio, String mesFim, String anoFim, String flagPeriodo,
			String nomeOrgao, String nomeUnidade) {
		super(mesInicio, anoInicio, mesFim, anoFim);
		this.flagPeriodo = flagPeriodo;
		this.nomeOrgao = nomeOrgao;
		this.nomeUnidade = nomeUnidade;
	}

	/**
	 * 
	 */
	public String flagPeriodo;

	/**
	 * 
	 */
	public String nomeOrgao;
	public String nomeUnidade;

}