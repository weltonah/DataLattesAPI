package br.com.datalattesAPI.model.AtuacaoProfissional;

/**
 * 
 */
public class ServicoTecnicoEspecializado extends DirecaoAux {
	public String servicoRealizado;

	public ServicoTecnicoEspecializado(String mesInicio, String anoInicio, String mesFim, String anoFim,
			String flagPeriodo, String nomeOrgao, String nomeUnidade, String servicoRealizado) {
		super(mesInicio, anoInicio, mesFim, anoFim, flagPeriodo, nomeOrgao, nomeUnidade);
		this.servicoRealizado = servicoRealizado;
	}

	public String getServicoRealizado() {
		return this.servicoRealizado;
	}

	public void setServicoRealizado(String servicoRealizado) {
		this.servicoRealizado = servicoRealizado;
	}

}