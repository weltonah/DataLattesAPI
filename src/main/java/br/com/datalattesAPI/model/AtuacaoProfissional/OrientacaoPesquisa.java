package br.com.datalattesAPI.model.AtuacaoProfissional;

/**
 * 
 */
public class OrientacaoPesquisa {

	public String titulo;

	public OrientacaoPesquisa(String titulo, String tipo) {
		super();
		this.titulo = titulo;
		this.tipo = tipo;
	}

	public String tipo;

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}