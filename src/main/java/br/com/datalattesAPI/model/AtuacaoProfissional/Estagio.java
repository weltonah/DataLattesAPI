package br.com.datalattesAPI.model.AtuacaoProfissional;

/**
 * 
 */
public class Estagio extends DirecaoAux {

	public Estagio(String mesInicio, String anoInicio, String mesFim, String anoFim, String flagPeriodo,
			String nomeOrgao, String nomeUnidade, String estagioRealizado) {
		super(mesInicio, anoInicio, mesFim, anoFim, flagPeriodo, nomeOrgao, nomeUnidade);
		this.EstagioRealizado = estagioRealizado;
	}

	public String EstagioRealizado;

	public String getEstagioRealizado() {
		return this.EstagioRealizado;
	}

	public void setEstagioRealizado(String estagioRealizado) {
		this.EstagioRealizado = estagioRealizado;
	}

}