package br.com.datalattesAPI.model.Formacao;

/**
 * 
 */
public class Graduacao extends Aux2 {

	public String formacaoAcademicaTitulacao;

	public Graduacao(String anoInicio, String anoConclusao, String nomeInstituicao, String statusCurso,
			String tituloTrabalho, String nomeAgenciaFinanciadora, String tituloTrabalhoEN, String nomeCursoEN,
			String flagBolsa, String nomeOrientador, String nomeOrgao, String nomeCurso, String codigoAreaCurso,
			String idOrientador, String tipoCurso, String formacaoAcademicaTitulacao) {
		super(anoInicio, anoConclusao, nomeInstituicao, statusCurso, tituloTrabalho, nomeAgenciaFinanciadora,
				tituloTrabalhoEN, nomeCursoEN, flagBolsa, nomeOrientador, nomeOrgao, nomeCurso, codigoAreaCurso,
				idOrientador, tipoCurso);
		this.formacaoAcademicaTitulacao = formacaoAcademicaTitulacao;
	}

	public String getFormacaoAcademicaTitulacao() {
		return this.formacaoAcademicaTitulacao;
	}

	public void setFormacaoAcademicaTitulacao(String formacaoAcademicaTitulacao) {
		this.formacaoAcademicaTitulacao = formacaoAcademicaTitulacao;
	}

	@Override
	public String toString() {
		return "Graduacao ["
				+ (this.formacaoAcademicaTitulacao != null
						? "formacaoAcademicaTitulacao=" + this.formacaoAcademicaTitulacao + ", "
						: "")
				+ (this.codigoAreaCurso != null ? "codigoAreaCurso=" + this.codigoAreaCurso + ", " : "")
				+ (this.idOrientador != null ? "idOrientador=" + this.idOrientador + ", " : "")
				+ (this.tipoCurso != null ? "tipoCurso=" + this.tipoCurso + ", " : "")
				+ (this.tituloTrabalho != null ? "tituloTrabalho=" + this.tituloTrabalho + ", " : "")
				+ (this.nomeAgenciaFinanciadora != null
						? "nomeAgenciaFinanciadora=" + this.nomeAgenciaFinanciadora + ", "
						: "")
				+ (this.tituloTrabalhoEN != null ? "tituloTrabalhoEN=" + this.tituloTrabalhoEN + ", " : "")
				+ (this.nomeCursoEN != null ? "nomeCursoEN=" + this.nomeCursoEN + ", " : "")
				+ (this.flagBolsa != null ? "flagBolsa=" + this.flagBolsa + ", " : "")
				+ (this.nomeInstituicao != null ? "nomeInstituicao=" + this.nomeInstituicao + ", " : "")
				+ (this.statusCurso != null ? "statusCurso=" + this.statusCurso + ", " : "")
				+ (this.anoInicio != null ? "anoInicio=" + this.anoInicio + ", " : "")
				+ (this.anoConclusao != null ? "anoConclusao=" + this.anoConclusao + ", " : "")
				+ (getFormacaoAcademicaTitulacao() != null
						? "getFormacaoAcademicaTitulacao()=" + getFormacaoAcademicaTitulacao() + ", "
						: "")
				+ (getCodigoAreaCurso() != null ? "getCodigoAreaCurso()=" + getCodigoAreaCurso() + ", " : "")
				+ (getIdOrientador() != null ? "getIdOrientador()=" + getIdOrientador() + ", " : "")
				+ (getTipoCurso() != null ? "getTipoCurso()=" + getTipoCurso() + ", " : "")
				+ (getNomeOrientador() != null ? "getNomeOrientador()=" + getNomeOrientador() + ", " : "")
				+ (getNomeOrgao() != null ? "getNomeOrgao()=" + getNomeOrgao() + ", " : "")
				+ (getNomeCurso() != null ? "getNomeCurso()=" + getNomeCurso() + ", " : "")
				+ (getTituloTrabalho() != null ? "getTituloTrabalho()=" + getTituloTrabalho() + ", " : "")
				+ (getNomeAgenciaFinanciadora() != null
						? "getNomeAgenciaFinanciadora()=" + getNomeAgenciaFinanciadora() + ", "
						: "")
				+ (getTituloTrabalhoEN() != null ? "getTituloTrabalhoEN()=" + getTituloTrabalhoEN() + ", " : "")
				+ (getNomeCursoEN() != null ? "getNomeCursoEN()=" + getNomeCursoEN() + ", " : "")
				+ (getFlagBolsa() != null ? "getFlagBolsa()=" + getFlagBolsa() + ", " : "")
				+ (getNomeInstituicao() != null ? "getNomeInstituicao()=" + getNomeInstituicao() + ", " : "")
				+ (getStatusCurso() != null ? "getStatusCurso()=" + getStatusCurso() + ", " : "")
				+ (getAnoInicio() != null ? "getAnoInicio()=" + getAnoInicio() + ", " : "")
				+ (getAnoConclusao() != null ? "getAnoConclusao()=" + getAnoConclusao() + ", " : "")
				+ (getClass() != null ? "getClass()=" + getClass() + ", " : "") + "hashCode()=" + hashCode() + ", "
				+ (super.toString() != null ? "toString()=" + super.toString() : "") + "]";
	}

}