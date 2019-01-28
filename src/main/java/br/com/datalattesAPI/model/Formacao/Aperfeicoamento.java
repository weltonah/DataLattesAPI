package br.com.datalattesAPI.model.Formacao;

/**
 * 
 */
public class Aperfeicoamento extends Class1 {
	private String nomeOrientador;

	private String nomeOrgao;
	private String nomeCurso;

	public Aperfeicoamento(String anoInicio, String anoConclusao, String nomeInstituicao, String statusCurso,
			String tituloTrabalho, String nomeAgenciaFinanciadora, String tituloTrabalhoEN, String nomeCursoEN,
			String flagBolsa, String nomeOrientador, String nomeOrgao, String nomeCurso) {
		super(anoInicio, anoConclusao, nomeInstituicao, statusCurso, tituloTrabalho, nomeAgenciaFinanciadora,
				tituloTrabalhoEN, nomeCursoEN, flagBolsa);
		this.nomeOrientador = nomeOrientador;
		this.nomeOrgao = nomeOrgao;
		this.nomeCurso = nomeCurso;
	}

	public String getNomeOrientador() {
		return this.nomeOrientador;
	}

	public void setNomeOrientador(String nomeOrientador) {
		this.nomeOrientador = nomeOrientador;
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