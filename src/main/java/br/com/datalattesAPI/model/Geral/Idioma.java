package br.com.datalattesAPI.model.Geral;

/**
* 
*/
public class Idioma {

	public String nomeIdioma;
	public String descricaoIdioma;
	public String proficienciaLeitura;
	public String proficienciaFala;
	public String proficienciaEscrita;
	public String proficienciaCompreensao;

	public Idioma(String nomeIdioma, String descricaoIdioma, String proficienciaLeitura, String proficienciaFala,
			String proficienciaEscrita, String proficienciaCompreensao) {
		super();
		this.nomeIdioma = nomeIdioma;
		this.descricaoIdioma = descricaoIdioma;
		this.proficienciaLeitura = proficienciaLeitura;
		this.proficienciaFala = proficienciaFala;
		this.proficienciaEscrita = proficienciaEscrita;
		this.proficienciaCompreensao = proficienciaCompreensao;
	}

	public String getNomeIdioma() {
		return this.nomeIdioma;
	}

	public void setNomeIdioma(String nomeIdioma) {
		this.nomeIdioma = nomeIdioma;
	}

	public String getDescricaoIdioma() {
		return this.descricaoIdioma;
	}

	public void setDescricaoIdioma(String descricaoIdioma) {
		this.descricaoIdioma = descricaoIdioma;
	}

	public String getProficienciaLeitura() {
		return this.proficienciaLeitura;
	}

	public void setProficienciaLeitura(String proficienciaLeitura) {
		this.proficienciaLeitura = proficienciaLeitura;
	}

	public String getProficienciaFala() {
		return this.proficienciaFala;
	}

	public void setProficienciaFala(String proficienciaFala) {
		this.proficienciaFala = proficienciaFala;
	}

	public String getProficienciaEscrita() {
		return this.proficienciaEscrita;
	}

	public void setProficienciaEscrita(String proficienciaEscrita) {
		this.proficienciaEscrita = proficienciaEscrita;
	}

	public String getProficienciaCompreensao() {
		return this.proficienciaCompreensao;
	}

	public void setProficienciaCompreensao(String proficienciaCompreensao) {
		this.proficienciaCompreensao = proficienciaCompreensao;
	}

	@Override
	public String toString() {
		return "Idioma [nomeIdioma=" + this.nomeIdioma + ", descricaoIdioma=" + this.descricaoIdioma
				+ ", proficienciaLeitura=" + this.proficienciaLeitura + ", proficienciaFala=" + this.proficienciaFala
				+ ", proficienciaEscrita=" + this.proficienciaEscrita + ", proficienciaCompreensao="
				+ this.proficienciaCompreensao + "]";
	}

}