package br.com.datalattesAPI.model.Geral;

/**
* 
*/
public class Area {

	public Area(String nomeGrandeArea, String nomeArea, String nomeSubArea, String nomeEspecialidade) {
		super();
		this.nomeGrandeArea = nomeGrandeArea;
		this.nomeArea = nomeArea;
		this.nomeSubArea = nomeSubArea;
		this.nomeEspecialidade = nomeEspecialidade;
	}

	public String nomeGrandeArea;

	public String nomeArea;

	public String nomeSubArea;

	public String nomeEspecialidade;

	public String getNomeGrandeArea() {
		return this.nomeGrandeArea;
	}

	public void setNomeGrandeArea(String nomeGrandeArea) {
		this.nomeGrandeArea = nomeGrandeArea;
	}

	public String getNomeArea() {
		return this.nomeArea;
	}

	public void setNomeArea(String nomeArea) {
		this.nomeArea = nomeArea;
	}

	public String getNomeSubArea() {
		return this.nomeSubArea;
	}

	public void setNomeSubArea(String nomeSubArea) {
		this.nomeSubArea = nomeSubArea;
	}

	public String getNomeEspecialidade() {
		return this.nomeEspecialidade;
	}

	public void setNomeEspecialidade(String nomeEspecialidade) {
		this.nomeEspecialidade = nomeEspecialidade;
	}

	@Override
	public String toString() {
		return "Area [" + (this.nomeGrandeArea != null ? "nomeGrandeArea=" + this.nomeGrandeArea + ", " : "")
				+ (this.nomeArea != null ? "nomeArea=" + this.nomeArea + ", " : "")
				+ (this.nomeSubArea != null ? "nomeSubArea=" + this.nomeSubArea + ", " : "")
				+ (this.nomeEspecialidade != null ? "nomeEspecialidade=" + this.nomeEspecialidade : "") + "]";
	}

}