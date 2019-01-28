package br.com.datalattesAPI.model.AtuacaoProfissional;

import br.com.datalattesAPI.model.Geral.AreaConhecimento;
import br.com.datalattesAPI.model.Geral.PalavraChave;
import br.com.datalattesAPI.model.Geral.SetorAtividade;

/**
 * 
 */
public class LinhaPesquisa {

	public String tituloLinhaPesquisa;

	public LinhaPesquisa(String tituloLinhaPesquisa, String flagLinhaPesquisaAtiva, String objetivoLinhaPesquisa,
			String tituloLinhaPesquisaEN, String objetivoLinhaPesquisaEN, PalavraChave palavraChave,
			SetorAtividade setorAtividade, AreaConhecimento areaConhecimento) {
		super();
		this.tituloLinhaPesquisa = tituloLinhaPesquisa;
		this.flagLinhaPesquisaAtiva = flagLinhaPesquisaAtiva;
		this.objetivoLinhaPesquisa = objetivoLinhaPesquisa;
		this.tituloLinhaPesquisaEN = tituloLinhaPesquisaEN;
		this.objetivoLinhaPesquisaEN = objetivoLinhaPesquisaEN;
		this.palavraChave = palavraChave;
		this.setorAtividade = setorAtividade;
		this.areaConhecimento = areaConhecimento;
	}

	/**
	 * 
	 */
	public String flagLinhaPesquisaAtiva;

	/**
	 * 
	 */
	public String objetivoLinhaPesquisa;

	/**
	 * 
	 */
	public String tituloLinhaPesquisaEN;

	/**
	 * 
	 */
	public String objetivoLinhaPesquisaEN;

	/**
	 * 
	 */
	public PalavraChave palavraChave;

	/**
	 * 
	 */
	public SetorAtividade setorAtividade;

	/**
	 * 
	 */
	public AreaConhecimento areaConhecimento;

	public String getTituloLinhaPesquisa() {
		return this.tituloLinhaPesquisa;
	}

	public void setTituloLinhaPesquisa(String tituloLinhaPesquisa) {
		this.tituloLinhaPesquisa = tituloLinhaPesquisa;
	}

	public String getFlagLinhaPesquisaAtiva() {
		return this.flagLinhaPesquisaAtiva;
	}

	public void setFlagLinhaPesquisaAtiva(String flagLinhaPesquisaAtiva) {
		this.flagLinhaPesquisaAtiva = flagLinhaPesquisaAtiva;
	}

	public String getObjetivoLinhaPesquisa() {
		return this.objetivoLinhaPesquisa;
	}

	public void setObjetivoLinhaPesquisa(String objetivoLinhaPesquisa) {
		this.objetivoLinhaPesquisa = objetivoLinhaPesquisa;
	}

	public String getTituloLinhaPesquisaEN() {
		return this.tituloLinhaPesquisaEN;
	}

	public void setTituloLinhaPesquisaEN(String tituloLinhaPesquisaEN) {
		this.tituloLinhaPesquisaEN = tituloLinhaPesquisaEN;
	}

	public String getObjetivoLinhaPesquisaEN() {
		return this.objetivoLinhaPesquisaEN;
	}

	public void setObjetivoLinhaPesquisaEN(String objetivoLinhaPesquisaEN) {
		this.objetivoLinhaPesquisaEN = objetivoLinhaPesquisaEN;
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