package br.com.datalattesAPI.model.Geral;

/**
 * 
 */
public class EnderecoResidencial {

	public String pais;
	public String uf;
	public String cep;
	public String bairro;
	public String cidade;
	public String ddd;
	public String telefone;
	public String ramal;

	public EnderecoResidencial(String pais, String uf, String cep, String bairro, String cidade, String ddd,
			String telefone, String ramal) {
		super();
		this.pais = pais;
		this.uf = uf;
		this.cep = cep;
		this.bairro = bairro;
		this.cidade = cidade;
		this.ddd = ddd;
		this.telefone = telefone;
		this.ramal = ramal;
	}

	public String getPais() {
		return this.pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getUf() {
		return this.uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCep() {
		return this.cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getBairro() {
		return this.bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return this.cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getDdd() {
		return this.ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getTelefone() {
		return this.telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getRamal() {
		return this.ramal;
	}

	public void setRamal(String ramal) {
		this.ramal = ramal;
	}

	@Override
	public String toString() {
		return "EnderecoResidencial [pais=" + this.pais + ", uf=" + this.uf + ", cep=" + this.cep + ", bairro="
				+ this.bairro + ", cidade=" + this.cidade + ", ddd=" + this.ddd + ", telefone=" + this.telefone
				+ ", ramal=" + this.ramal + "]";
	}

}