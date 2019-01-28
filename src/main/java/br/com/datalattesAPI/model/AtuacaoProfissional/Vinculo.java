package br.com.datalattesAPI.model.AtuacaoProfissional;

/**
 * 
 */
public class Vinculo extends Atuacao {

	public Vinculo(String mesInicio, String anoInicio, String mesFim, String anoFim, String tipoVinculo,
			String enquadramentoFuncional, String flagDedicacaoExclusiva, String flagVinculoEmpregatico) {
		super(mesInicio, anoInicio, mesFim, anoFim);
		this.tipoVinculo = tipoVinculo;
		this.enquadramentoFuncional = enquadramentoFuncional;
		this.flagDedicacaoExclusiva = flagDedicacaoExclusiva;
		this.flagVinculoEmpregatico = flagVinculoEmpregatico;
	}

	public String tipoVinculo;
	public String enquadramentoFuncional;
	public String flagDedicacaoExclusiva;
	public String flagVinculoEmpregatico;

	public String getTipoVinculo() {
		return this.tipoVinculo;
	}

	public void setTipoVinculo(String tipoVinculo) {
		this.tipoVinculo = tipoVinculo;
	}

	public String getEnquadramentoFuncional() {
		return this.enquadramentoFuncional;
	}

	public void setEnquadramentoFuncional(String enquadramentoFuncional) {
		this.enquadramentoFuncional = enquadramentoFuncional;
	}

	public String getFlagDedicacaoExclusiva() {
		return this.flagDedicacaoExclusiva;
	}

	public void setFlagDedicacaoExclusiva(String flagDedicacaoExclusiva) {
		this.flagDedicacaoExclusiva = flagDedicacaoExclusiva;
	}

	public String getFlagVinculoEmpregatico() {
		return this.flagVinculoEmpregatico;
	}

	public void setFlagVinculoEmpregatico(String flagVinculoEmpregatico) {
		this.flagVinculoEmpregatico = flagVinculoEmpregatico;
	}

}