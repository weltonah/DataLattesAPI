package br.com.datalattesAPI.model.AtuacaoProfissional;

/**
 * 
 */
public class ExtensaoUniversitaria extends DirecaoAux {
	public String atividadeExtensao;

	public ExtensaoUniversitaria(String mesInicio, String anoInicio, String mesFim, String anoFim, String flagPeriodo,
			String nomeOrgao, String nomeUnidade, String atividadeExtensao) {
		super(mesInicio, anoInicio, mesFim, anoFim, flagPeriodo, nomeOrgao, nomeUnidade);
		this.atividadeExtensao = atividadeExtensao;
	}

	public String getAtividadeExtensao() {
		return this.atividadeExtensao;
	}

	public void setAtividadeExtensao(String atividadeExtensao) {
		this.atividadeExtensao = atividadeExtensao;
	}

}