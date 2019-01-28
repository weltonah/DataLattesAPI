package br.com.datalattesAPI.model.Geral;

/**
* 
*/
public class ResumoCV {

	public String resumo;
	public String resumoEN;

	public ResumoCV(String resumo, String resumoEN) {
		super();
		this.resumo = resumo;
		this.resumoEN = resumoEN;
	}

	public String getResumo() {
		return this.resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}

	public String getResumoEN() {
		return this.resumoEN;
	}

	public void setResumoEN(String resumoEN) {
		this.resumoEN = resumoEN;
	}

	@Override
	public String toString() {
		return "ResumoCV [" + (this.resumo != null ? "resumo=" + this.resumo + ", " : "")
				+ (this.resumoEN != null ? "resumoEN=" + this.resumoEN : "") + "]";
	}

}