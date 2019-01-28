package br.com.datalattesAPI.model.Formacao;

/**
 * 
 */
public class MBA extends EnsinoMedio {

	public String anoObtencaoTitulo;
	public String flagBolsa;
	public String nomeAgenciaFinanciadora;
	public String tituloTrabalho;
	public String nomeOrientador;

	public MBA(String anoInicio, String anoConclusao, String nomeInstituicao, String statusCurso,
			String anoObtencaoTitulo, String flagBolsa, String nomeAgenciaFinanciadora, String tituloTrabalho,
			String nomeOrientador) {
		super(anoInicio, anoConclusao, nomeInstituicao, statusCurso);
		this.anoObtencaoTitulo = anoObtencaoTitulo;
		this.flagBolsa = flagBolsa;
		this.nomeAgenciaFinanciadora = nomeAgenciaFinanciadora;
		this.tituloTrabalho = tituloTrabalho;
		this.nomeOrientador = nomeOrientador;
	}

	public String getAnoObtencaoTitulo() {
		return this.anoObtencaoTitulo;
	}

	public void setAnoObtencaoTitulo(String anoObtencaoTitulo) {
		this.anoObtencaoTitulo = anoObtencaoTitulo;
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

	public String getTituloTrabalho() {
		return this.tituloTrabalho;
	}

	public void setTituloTrabalho(String tituloTrabalho) {
		this.tituloTrabalho = tituloTrabalho;
	}

	public String getNomeOrientador() {
		return this.nomeOrientador;
	}

	public void setNomeOrientador(String nomeOrientador) {
		this.nomeOrientador = nomeOrientador;
	}

}