package br.com.datalattesAPI.model.Formacao;

/**
 * 
 */
public class CursoTecnico extends EnsinoMedio {

	public String nomeOrgao;
	public String nomeCurso;
	public String flagBolsa;
	public String nomeAgenciaFinanciadora;

	public CursoTecnico(String anoInicio, String anoConclusao, String nomeInstituicao, String statusCurso,
			String nomeOrgao, String nomeCurso, String flagBolsa, String nomeAgenciaFinanciadora) {
		super(anoInicio, anoConclusao, nomeInstituicao, statusCurso);
		this.nomeOrgao = nomeOrgao;
		this.nomeCurso = nomeCurso;
		this.flagBolsa = flagBolsa;
		this.nomeAgenciaFinanciadora = nomeAgenciaFinanciadora;
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

	public String getFlagBolsa() {
		return this.flagBolsa;
	}

	public void setFlagBolsa(String flagBolsa) {
		this.flagBolsa = flagBolsa;
	}

	public String getNomeAgenciaFinanciadora() {
		return this.nomeAgenciaFinanciadora;
	}

	public void setNomeAgenciaFinanciadora(String nomeAgenciaFinanciadora) {
		this.nomeAgenciaFinanciadora = nomeAgenciaFinanciadora;
	}

}