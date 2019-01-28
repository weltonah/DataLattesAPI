package br.com.datalattesAPI.model.Geral;

/**
* 
*/
public class Premio {

	public String nomePremioTitulo;
	public String nomeEntidade;
	public String anoPremiacao;
	public String nomePremioTituloEN;

	public Premio(String nomePremioTitulo, String nomeEntidade, String anoPremiacao, String nomePremioTituloEN) {
		super();
		this.nomePremioTitulo = nomePremioTitulo;
		this.nomeEntidade = nomeEntidade;
		this.anoPremiacao = anoPremiacao;
		this.nomePremioTituloEN = nomePremioTituloEN;
	}

	public String getNomePremioTitulo() {
		return this.nomePremioTitulo;
	}

	public void setNomePremioTitulo(String nomePremioTitulo) {
		this.nomePremioTitulo = nomePremioTitulo;
	}

	public String getNomeEntidade() {
		return this.nomeEntidade;
	}

	public void setNomeEntidade(String nomeEntidade) {
		this.nomeEntidade = nomeEntidade;
	}

	public String getAnoPremiacao() {
		return this.anoPremiacao;
	}

	public void setAnoPremiacao(String anoPremiacao) {
		this.anoPremiacao = anoPremiacao;
	}

	public String getNomePremioTituloEN() {
		return this.nomePremioTituloEN;
	}

	public void setNomePremioTituloEN(String nomePremioTituloEN) {
		this.nomePremioTituloEN = nomePremioTituloEN;
	}

	@Override
	public String toString() {
		return "Premio [nomePremioTitulo=" + this.nomePremioTitulo + ", nomeEntidade=" + this.nomeEntidade
				+ ", anoPremiacao=" + this.anoPremiacao + ", nomePremioTituloEN=" + this.nomePremioTituloEN + "]";
	}

}