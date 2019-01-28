package br.com.datalattesAPI.model.AtuacaoProfissional;

import java.util.ArrayList;

/**
 * 
 */
public class Orientacoes {

	public Orientacoes(ArrayList<OrientacaoPesquisa> orientacao) {
		super();
		this.orientacao = orientacao;
	}

	public ArrayList<OrientacaoPesquisa> orientacao;

	public ArrayList<OrientacaoPesquisa> getOrientacao() {
		return this.orientacao;
	}

	public void setOrientacao(ArrayList<OrientacaoPesquisa> orientacao) {
		this.orientacao = orientacao;
	}

}