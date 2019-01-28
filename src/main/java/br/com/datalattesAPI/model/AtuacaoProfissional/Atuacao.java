package br.com.datalattesAPI.model.AtuacaoProfissional;

/**
 * 
 */
public abstract class Atuacao {

	public String anoInicio;
	public String mesFim;
	public String anoFim;
	public String mesInicio;

	public Atuacao(String mesInicio, String anoInicio, String mesFim, String anoFim) {
		super();
		this.mesInicio = mesInicio;
		this.anoInicio = anoInicio;
		this.mesFim = mesFim;
		this.anoFim = anoFim;
	}

	public String getMesInicio() {
		return this.mesInicio;
	}

	public void setMesInicio(String mesInicio) {
		this.mesInicio = mesInicio;
	}

	public String getAnoInicio() {
		return this.anoInicio;
	}

	public void setAnoInicio(String anoInicio) {
		this.anoInicio = anoInicio;
	}

	public String getMesFim() {
		return this.mesFim;
	}

	public void setMesFim(String mesFim) {
		this.mesFim = mesFim;
	}

	public String getAnoFim() {
		return this.anoFim;
	}

	public void setAnoFim(String anoFim) {
		this.anoFim = anoFim;
	}

}