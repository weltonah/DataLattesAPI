package br.com.datalattesAPI.model.AtuacaoProfissional;

import java.util.ArrayList;

/**
 * 
 */
public class Producoes {

	public Producoes(ArrayList<ProducaoPesquisa> producao) {
		super();
		this.producao = producao;
	}

	public ArrayList<ProducaoPesquisa> producao;

	public ArrayList<ProducaoPesquisa> getProducao() {
		return this.producao;
	}

	public void setProducao(ArrayList<ProducaoPesquisa> producao) {
		this.producao = producao;
	}

}