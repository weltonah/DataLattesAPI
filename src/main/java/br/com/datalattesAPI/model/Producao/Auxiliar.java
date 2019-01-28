package br.com.datalattesAPI.model.Producao;

import br.com.datalattesAPI.model.Geral.AreaConhecimento;
import br.com.datalattesAPI.model.Geral.PalavraChave;
import br.com.datalattesAPI.model.Geral.SetorAtividade;

/**
 * 
 */
public abstract class Auxiliar {

	public Autores autores;
	public PalavraChave palavraChave;
	public SetorAtividade setorAtividade;
	public AreaConhecimento areaConhecimento;

	public Auxiliar(Autores autores, PalavraChave palavraChave, SetorAtividade setorAtividade,
			AreaConhecimento areaConhecimento) {
		super();
		this.autores = autores;
		this.palavraChave = palavraChave;
		this.setorAtividade = setorAtividade;
		this.areaConhecimento = areaConhecimento;
	}

	public Autores getAutores() {
		return this.autores;
	}

	public void setAutores(Autores autores) {
		this.autores = autores;
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