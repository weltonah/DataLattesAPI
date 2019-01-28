package br.com.datalattesAPI.model.AtuacaoProfissional;

/**
 * 
 */
public class Ensino extends Atuacao {

	public Ensino(String mesInicio, String anoInicio, String mesFim, String anoFim, String flagPeriodo,
			String nomeOrgao, String nomeCurso) {
		super(mesInicio, anoInicio, mesFim, anoFim);
		this.flagPeriodo = flagPeriodo;
		this.nomeOrgao = nomeOrgao;
		this.nomeCurso = nomeCurso;
	}

	public String flagPeriodo;
	public String nomeOrgao;
	public String nomeCurso;

	public String getFlagPeriodo() {
		return this.flagPeriodo;
	}

	public void setFlagPeriodo(String flagPeriodo) {
		this.flagPeriodo = flagPeriodo;
	}

	public String getNomeOrgao() {
		return this.nomeOrgao;
	}

	public void setNomeOrgao(String nomeOrgao) {
		this.nomeOrgao = nomeOrgao;
	}

	public String getNomeCurso() {
		return this.nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

}