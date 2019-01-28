package br.com.datalattesAPI.model.Formacao;

/**
 * 
 */
public abstract class Aux2 extends Aperfeicoamento {

	public String codigoAreaCurso;
	public String idOrientador;
	public String tipoCurso;

	public Aux2(String anoInicio, String anoConclusao, String nomeInstituicao, String statusCurso,
			String tituloTrabalho, String nomeAgenciaFinanciadora, String tituloTrabalhoEN, String nomeCursoEN,
			String flagBolsa, String nomeOrientador, String nomeOrgao, String nomeCurso, String codigoAreaCurso,
			String idOrientador, String tipoCurso) {
		super(anoInicio, anoConclusao, nomeInstituicao, statusCurso, tituloTrabalho, nomeAgenciaFinanciadora,
				tituloTrabalhoEN, nomeCursoEN, flagBolsa, nomeOrientador, nomeOrgao, nomeCurso);
		this.codigoAreaCurso = codigoAreaCurso;
		this.idOrientador = idOrientador;
		this.tipoCurso = tipoCurso;
	}

	public String getCodigoAreaCurso() {
		return this.codigoAreaCurso;
	}

	public void setCodigoAreaCurso(String codigoAreaCurso) {
		this.codigoAreaCurso = codigoAreaCurso;
	}

	public String getIdOrientador() {
		return this.idOrientador;
	}

	public void setIdOrientador(String idOrientador) {
		this.idOrientador = idOrientador;
	}

	public String getTipoCurso() {
		return this.tipoCurso;
	}

	public void setTipoCurso(String tipoCurso) {
		this.tipoCurso = tipoCurso;
	}

}