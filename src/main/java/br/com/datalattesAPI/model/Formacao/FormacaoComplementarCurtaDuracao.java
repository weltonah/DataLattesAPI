package br.com.datalattesAPI.model.Formacao;

/**
 * 
 */
public class FormacaoComplementarCurtaDuracao extends EnsinoMedio {

	public String cargaHoraria;
	public String cadigoInstituicao;
	public String nomeOrgao;
	public String nomeCurso;

	public FormacaoComplementarCurtaDuracao(String anoInicio, String anoConclusao, String nomeInstituicao,
			String statusCurso, String cargaHoraria, String cadigoInstituicao, String nomeOrgao, String nomeCurso) {
		super(anoInicio, anoConclusao, nomeInstituicao, statusCurso);
		this.cargaHoraria = cargaHoraria;
		this.cadigoInstituicao = cadigoInstituicao;
		this.nomeOrgao = nomeOrgao;
		this.nomeCurso = nomeCurso;
	}

	public String getCargaHoraria() {
		return this.cargaHoraria;
	}

	public void setCargaHoraria(String cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public String getCadigoInstituicao() {
		return this.cadigoInstituicao;
	}

	public void setCadigoInstituicao(String cadigoInstituicao) {
		this.cadigoInstituicao = cadigoInstituicao;
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