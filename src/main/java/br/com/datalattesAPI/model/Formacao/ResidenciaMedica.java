package br.com.datalattesAPI.model.Formacao;

import br.com.datalattesAPI.model.Geral.AreaConhecimento;
import br.com.datalattesAPI.model.Geral.PalavraChave;
import br.com.datalattesAPI.model.Geral.SetorAtividade;

/**
 * 
 */
public class ResidenciaMedica extends EnsinoMedio {

	public String flagBolsa;
	public String nomeAgenciaFinanciadora;
	public String tituloResidencia;
	public String numeroRegistro;
	public PalavraChave palavraChave;
	public SetorAtividade setorAtividade;
	public AreaConhecimento areaConhecimento;

	public ResidenciaMedica(String anoInicio, String anoConclusao, String nomeInstituicao, String statusCurso,
			String flagBolsa, String nomeAgenciaFinanciadora, String tituloResidencia, String numeroRegistro,
			PalavraChave palavraChave, SetorAtividade setorAtividade, AreaConhecimento areaConhecimento) {
		super(anoInicio, anoConclusao, nomeInstituicao, statusCurso);
		this.flagBolsa = flagBolsa;
		this.nomeAgenciaFinanciadora = nomeAgenciaFinanciadora;
		this.tituloResidencia = tituloResidencia;
		this.numeroRegistro = numeroRegistro;
		this.palavraChave = palavraChave;
		this.setorAtividade = setorAtividade;
		this.areaConhecimento = areaConhecimento;
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

	public String getTituloResidencia() {
		return this.tituloResidencia;
	}

	public void setTituloResidencia(String tituloResidencia) {
		this.tituloResidencia = tituloResidencia;
	}

	public String getNumeroRegistro() {
		return this.numeroRegistro;
	}

	public void setNumeroRegistro(String numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
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