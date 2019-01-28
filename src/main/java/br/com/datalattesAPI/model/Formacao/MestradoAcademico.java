package br.com.datalattesAPI.model.Formacao;

import br.com.datalattesAPI.model.Geral.AreaConhecimento;
import br.com.datalattesAPI.model.Geral.PalavraChave;
import br.com.datalattesAPI.model.Geral.SetorAtividade;

/**
 * 
 */
public class MestradoAcademico extends Aux2 {

	public String anoObtencaoTitulo;
	public PalavraChave palavraChave;
	public SetorAtividade setorAtividade;
	public AreaConhecimento areaConhecimento;
	public String nomeCoorientador;

	public MestradoAcademico(String anoInicio, String anoConclusao, String nomeInstituicao, String statusCurso,
			String tituloTrabalho, String nomeAgenciaFinanciadora, String tituloTrabalhoEN, String nomeCursoEN,
			String flagBolsa, String nomeOrientador, String nomeOrgao, String nomeCurso, String codigoAreaCurso,
			String idOrientador, String tipoCurso, String anoObtencaoTitulo, PalavraChave palavraChave,
			SetorAtividade setorAtividade, AreaConhecimento areaConhecimento, String nomeCoorientador) {
		super(anoInicio, anoConclusao, nomeInstituicao, statusCurso, tituloTrabalho, nomeAgenciaFinanciadora,
				tituloTrabalhoEN, nomeCursoEN, flagBolsa, nomeOrientador, nomeOrgao, nomeCurso, codigoAreaCurso,
				idOrientador, tipoCurso);
		this.anoObtencaoTitulo = anoObtencaoTitulo;
		this.palavraChave = palavraChave;
		this.setorAtividade = setorAtividade;
		this.areaConhecimento = areaConhecimento;
		this.nomeCoorientador = nomeCoorientador;
	}

	public String getAnoObtencaoTitulo() {
		return this.anoObtencaoTitulo;
	}

	public void setAnoObtencaoTitulo(String anoObtencaoTitulo) {
		this.anoObtencaoTitulo = anoObtencaoTitulo;
	}

	public PalavraChave getPalavraChave() {
		return this.palavraChave;
	}

	public void setPalavraChave(PalavraChave palavraChave) {
		this.palavraChave = palavraChave;
	}

	public SetorAtividade getSetorAtividade() {
		return this.setorAtividade;
	}

	public void setSetorAtividade(SetorAtividade setorAtividade) {
		this.setorAtividade = setorAtividade;
	}

	public AreaConhecimento getAreaConhecimento() {
		return this.areaConhecimento;
	}

	public void setAreaConhecimento(AreaConhecimento areaConhecimento) {
		this.areaConhecimento = areaConhecimento;
	}

	public String getNomeCoorientador() {
		return this.nomeCoorientador;
	}

	public void setNomeCoorientador(String nomeCoorientador) {
		this.nomeCoorientador = nomeCoorientador;
	}

	@Override
	public String toString() {
		return "MestradoAcademico ["
				+ (this.anoObtencaoTitulo != null ? "anoObtencaoTitulo=" + this.anoObtencaoTitulo + ", " : "")
				+ (this.palavraChave != null ? "palavraChave=" + this.palavraChave + ", " : "")
				+ (this.setorAtividade != null ? "setorAtividade=" + this.setorAtividade + ", " : "")
				+ (this.areaConhecimento != null ? "areaConhecimento=" + this.areaConhecimento + ", " : "")
				+ (this.nomeCoorientador != null ? "nomeCoorientador=" + this.nomeCoorientador + ", " : "")
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
				+ (this.anoConclusao != null ? "anoConclusao=" + this.anoConclusao : "") + "]";
	}

}