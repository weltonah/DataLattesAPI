package br.com.datalattesAPI.model.Producao;

import java.util.ArrayList;

/**
 * 
 */
public class Autores {

	public ArrayList<Autor> autor;

	public Autores(ArrayList<Autor> autor) {
		super();
		this.autor = autor;
	}

	public ArrayList<Autor> getAutor() {
		return this.autor;
	}

	public void setAutor(ArrayList<Autor> autor) {
		this.autor = autor;
	}

}