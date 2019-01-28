package br.com.datalattesAPI.model.Formacao;

/**
 * 
 */
public abstract class Class1 extends EnsinoMedio {

	public String tituloTrabalho;
	public String nomeAgenciaFinanciadora;
	public String tituloTrabalhoEN;
	public String nomeCursoEN;
	public String flagBolsa;

	public Class1(String anoInicio, String anoConclusao, String nomeInstituicao, String statusCurso,
			String tituloTrabalho, String nomeAgenciaFinanciadora, String tituloTrabalhoEN, String nomeCursoEN,
			String flagBolsa) {
		super(anoInicio, anoConclusao, nomeInstituicao, statusCurso);
		this.tituloTrabalho = tituloTrabalho;
		this.nomeAgenciaFinanciadora = nomeAgenciaFinanciadora;
		this.tituloTrabalhoEN = tituloTrabalhoEN;
		this.nomeCursoEN = nomeCursoEN;
		this.flagBolsa = flagBolsa;
	}

	public String getTituloTrabalho() {
		return this.tituloTrabalho;
	}

	public void setTituloTrabalho(String tituloTrabalho) {
		this.tituloTrabalho = tituloTrabalho;
	}

	public String getNomeAgenciaFinanciadora() {
		return this.nomeAgenciaFinanciadora;
	}

	public void setNomeAgenciaFinanciadora(String nomeAgenciaFinanciadora) {
		this.nomeAgenciaFinanciadora = nomeAgenciaFinanciadora;
	}

	public String getTituloTrabalhoEN() {
		return this.tituloTrabalhoEN;
	}

	public void setTituloTrabalhoEN(String tituloTrabalhoEN) {
		this.tituloTrabalhoEN = tituloTrabalhoEN;
	}

	public String getNomeCursoEN() {
		return this.nomeCursoEN;
	}

	public void setNomeCursoEN(String nomeCursoEN) {
		this.nomeCursoEN = nomeCursoEN;
	}

	public String getFlagBolsa() {
		return this.flagBolsa;
	}

	public void setFlagBolsa(String flagBolsa) {
		this.flagBolsa = flagBolsa;
	}

}