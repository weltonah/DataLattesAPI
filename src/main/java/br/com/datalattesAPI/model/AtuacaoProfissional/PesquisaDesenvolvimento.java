package br.com.datalattesAPI.model.AtuacaoProfissional;

import java.util.ArrayList;

/**
 * 
 */
public class PesquisaDesenvolvimento extends DirecaoAux {

	public PesquisaDesenvolvimento(String mesInicio, String anoInicio, String mesFim, String anoFim, String flagPeriodo,
			String nomeOrgao, String nomeUnidade, ArrayList<LinhaPesquisa> linhaPesquisa) {
		super(mesInicio, anoInicio, mesFim, anoFim, flagPeriodo, nomeOrgao, nomeUnidade);
		this.linhaPesquisa = linhaPesquisa;
	}

	public ArrayList<LinhaPesquisa> linhaPesquisa;

	public ArrayList<LinhaPesquisa> getLinhaPesquisa() {
		return this.linhaPesquisa;
	}

	public void setLinhaPesquisa(ArrayList<LinhaPesquisa> linhaPesquisa) {
		this.linhaPesquisa = linhaPesquisa;
	}

}