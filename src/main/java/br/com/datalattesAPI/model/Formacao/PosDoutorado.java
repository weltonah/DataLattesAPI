package br.com.datalattesAPI.model.Formacao;

import br.com.datalattesAPI.model.Geral.AreaConhecimento;
import br.com.datalattesAPI.model.Geral.PalavraChave;
import br.com.datalattesAPI.model.Geral.SetorAtividade;

/**
 * 
 */
public class PosDoutorado extends Class1 {

	public String anoObtencaoTitulo;
	public String statusEstagio;
	public String idOrientador;
	public PalavraChave palavraChave;
	public SetorAtividade setorAtividade;
	public AreaConhecimento areaConhecimento;

	public PosDoutorado(String anoInicio, String anoConclusao, String nomeInstituicao, String statusCurso,
			String tituloTrabalho, String nomeAgenciaFinanciadora, String tituloTrabalhoEN, String nomeCursoEN,
			String flagBolsa, String anoObtencaoTitulo, String statusEstagio, String idOrientador,
			PalavraChave palavraChave, SetorAtividade setorAtividade, AreaConhecimento areaConhecimento) {
		super(anoInicio, anoConclusao, nomeInstituicao, statusCurso, tituloTrabalho, nomeAgenciaFinanciadora,
				tituloTrabalhoEN, nomeCursoEN, flagBolsa);
		this.anoObtencaoTitulo = anoObtencaoTitulo;
		this.statusEstagio = statusEstagio;
		this.idOrientador = idOrientador;
		this.palavraChave = palavraChave;
		this.setorAtividade = setorAtividade;
		this.areaConhecimento = areaConhecimento;
	}

	public String getAnoObtencaoTitulo() {
		return this.anoObtencaoTitulo;
	}

	public void setAnoObtencaoTitulo(String anoObtencaoTitulo) {
		this.anoObtencaoTitulo = anoObtencaoTitulo;
	}

	public String getStatusEstagio() {
		return this.statusEstagio;
	}

	public void setStatusEstagio(String statusEstagio) {
		this.statusEstagio = statusEstagio;
	}

	public String getIdOrientador() {
		return this.idOrientador;
	}

	public void setIdOrientador(String idOrientador) {
		this.idOrientador = idOrientador;
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

}