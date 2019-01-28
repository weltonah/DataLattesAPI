package br.com.datalattesAPI.model.AtuacaoProfissional;

/**
 * 
 */
public class ConselhoComissaoConsultoria extends DirecaoAux {

	public String especificacao;

	public ConselhoComissaoConsultoria(String mesInicio, String anoInicio, String mesFim, String anoFim,
			String flagPeriodo, String nomeOrgao, String nomeUnidade, String especificacao) {
		super(mesInicio, anoInicio, mesFim, anoFim, flagPeriodo, nomeOrgao, nomeUnidade);
		this.especificacao = especificacao;
	}

}