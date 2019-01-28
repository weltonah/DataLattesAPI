package br.com.datalattesAPI.model.Formacao;

/**
 * 
 */
public abstract class Aux3 {

	public String anoInicio;
	public String anoConclusao;

	public Aux3(String anoInicio, String anoConclusao) {
		super();
		this.anoInicio = anoInicio;
		this.anoConclusao = anoConclusao;
	}

	public String getAnoInicio() {
		return this.anoInicio;
	}

	public void setAnoInicio(String anoInicio) {
		this.anoInicio = anoInicio;
	}

	public String getAnoConclusao() {
		return this.anoConclusao;
	}

	public void setAnoConclusao(String anoConclusao) {
		this.anoConclusao = anoConclusao;
	}

}