package br.com.datalattesAPI.model.AtuacaoProfissional;

import java.util.ArrayList;

/**
 * 
 */
public class ParticipacaoProjeto extends DirecaoAux {

	public ParticipacaoProjeto(String mesInicio, String anoInicio, String mesFim, String anoFim, String flagPeriodo,
			String nomeOrgao, String nomeUnidade, ArrayList<ProjetoPesquisa> projetoPesquisa) {
		super(mesInicio, anoInicio, mesFim, anoFim, flagPeriodo, nomeOrgao, nomeUnidade);
		this.projetoPesquisa = projetoPesquisa;
	}

	public ArrayList<ProjetoPesquisa> projetoPesquisa;

	public ArrayList<ProjetoPesquisa> getProjetoPesquisa() {
		return this.projetoPesquisa;
	}

	public void setProjetoPesquisa(ArrayList<ProjetoPesquisa> projetoPesquisa) {
		this.projetoPesquisa = projetoPesquisa;
	}

}