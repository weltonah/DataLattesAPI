package br.com.datalattesAPI.model.Formacao;

import br.com.datalattesAPI.model.Geral.AreaConhecimento;
import br.com.datalattesAPI.model.Geral.PalavraChave;
import br.com.datalattesAPI.model.Geral.SetorAtividade;

/**
 * 
 */
public class LivreDocencia {

	public String nomeInstituicao;
	public String anoObtencaoTitulo;
	public String tituloTrabalho;
	public String tituloTrabalhoEN;
	public PalavraChave palavraChave;
	public SetorAtividade setorAtividade;
	public AreaConhecimento areaConhecimento;

	public LivreDocencia(String nomeInstituicao, String anoObtencaoTitulo, String tituloTrabalho,
			String tituloTrabalhoEN, PalavraChave palavraChave, SetorAtividade setorAtividade,
			AreaConhecimento areaConhecimento) {
		super();
		this.nomeInstituicao = nomeInstituicao;
		this.anoObtencaoTitulo = anoObtencaoTitulo;
		this.tituloTrabalho = tituloTrabalho;
		this.tituloTrabalhoEN = tituloTrabalhoEN;
		this.palavraChave = palavraChave;
		this.setorAtividade = setorAtividade;
		this.areaConhecimento = areaConhecimento;
	}

	public String getNomeInstituicao() {
		return this.nomeInstituicao;
	}

	public void setNomeInstituicao(String nomeInstituicao) {
		this.nomeInstituicao = nomeInstituicao;
	}

	public String getAnoObtencaoTitulo() {
		return this.anoObtencaoTitulo;
	}

	public void setAnoObtencaoTitulo(String anoObtencaoTitulo) {
		this.anoObtencaoTitulo = anoObtencaoTitulo;
	}

	public String getTituloTrabalho() {
		return this.tituloTrabalho;
	}

	public void setTituloTrabalho(String tituloTrabalho) {
		this.tituloTrabalho = tituloTrabalho;
	}

	public String getTituloTrabalhoEN() {
		return this.tituloTrabalhoEN;
	}

	public void setTituloTrabalhoEN(String tituloTrabalhoEN) {
		this.tituloTrabalhoEN = tituloTrabalhoEN;
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