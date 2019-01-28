package br.com.datalattesAPI.model.Formacao;

/**
 * 
 */
public class EnsinoMedio extends Aux3 {

	public String nomeInstituicao;
	public String statusCurso;

	public EnsinoMedio(String anoInicio, String anoConclusao, String nomeInstituicao, String statusCurso) {
		super(anoInicio, anoConclusao);
		this.nomeInstituicao = nomeInstituicao;
		this.statusCurso = statusCurso;
	}

	public String getNomeInstituicao() {
		return this.nomeInstituicao;
	}

	public void setNomeInstituicao(String nomeInstituicao) {
		this.nomeInstituicao = nomeInstituicao;
	}

	public String getStatusCurso() {
		return this.statusCurso;
	}

	public void setStatusCurso(String statusCurso) {
		this.statusCurso = statusCurso;
	}

}