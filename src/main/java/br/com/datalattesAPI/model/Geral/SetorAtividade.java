package br.com.datalattesAPI.model.Geral;

/**
* 
*/
public class SetorAtividade {

	public String setor1;
	public String setor2;
	public String setor3;

	public SetorAtividade(String setor1, String setor2, String setor3) {
		super();
		this.setor1 = setor1;
		this.setor2 = setor2;
		this.setor3 = setor3;
	}

	public String getSetor1() {
		return this.setor1;
	}

	public void setSetor1(String setor1) {
		this.setor1 = setor1;
	}

	public String getSetor2() {
		return this.setor2;
	}

	public void setSetor2(String setor2) {
		this.setor2 = setor2;
	}

	public String getSetor3() {
		return this.setor3;
	}

	public void setSetor3(String setor3) {
		this.setor3 = setor3;
	}

}