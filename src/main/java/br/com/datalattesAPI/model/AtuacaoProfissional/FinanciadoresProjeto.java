package br.com.datalattesAPI.model.AtuacaoProfissional;

import java.util.ArrayList;

public class FinanciadoresProjeto {

	public FinanciadoresProjeto(ArrayList<Financiadores> financiadores) {
		super();
		this.financiadores = financiadores;
	}

	public ArrayList<Financiadores> financiadores;

	public ArrayList<Financiadores> getFinanciadores() {
		return this.financiadores;
	}

	public void setFinanciadores(ArrayList<Financiadores> financiadores) {
		this.financiadores = financiadores;
	}
}
