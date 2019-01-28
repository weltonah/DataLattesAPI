package br.com.datalattesAPI.model.AtuacaoProfissional;

/**
 * 
 */
public class ProducaoPesquisa {

	public ProducaoPesquisa(String titulo, String tipo) {
		super();
		this.titulo = titulo;
		this.tipo = tipo;
	}

	public String titulo;
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