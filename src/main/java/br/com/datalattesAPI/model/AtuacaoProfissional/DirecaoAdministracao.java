package br.com.datalattesAPI.model.AtuacaoProfissional;

public class DirecaoAdministracao extends DirecaoAux {

	public String formatoCargoFuncao;
	public String cargoFuncao;

	public DirecaoAdministracao(String mesInicio, String anoInicio, String mesFim, String anoFim, String flagPeriodo,
			String nomeOrgao, String nomeUnidade, String formatoCargoFuncao, String cargoFuncao) {
		super(mesInicio, anoInicio, mesFim, anoFim, flagPeriodo, nomeOrgao, nomeUnidade);
		this.formatoCargoFuncao = formatoCargoFuncao;
		this.cargoFuncao = cargoFuncao;
	}

	public String getFormatoCargoFuncao() {
		return this.formatoCargoFuncao;
	}

	public void setFormatoCargoFuncao(String formatoCargoFuncao) {
		this.formatoCargoFuncao = formatoCargoFuncao;
	}

	public String getCargoFuncao() {
		return this.cargoFuncao;
	}

	public void setCargoFuncao(String cargoFuncao) {
		this.cargoFuncao = cargoFuncao;
	}

}
