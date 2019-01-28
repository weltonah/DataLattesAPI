package br.com.datalattesAPI.model.Banca;

import br.com.datalattesAPI.model.Geral.AreaConhecimento;
import br.com.datalattesAPI.model.Geral.PalavraChave;
import br.com.datalattesAPI.model.Geral.SetorAtividade;
import br.com.datalattesAPI.model.Producao.Autores;

/**
 * 
 */
public abstract class AuxiliarBanca {

	public String natureza;

	public String titulo;
	public String ano;
	public String pais;
	public String idioma;
	public Autores autores;
	public PalavraChave palavraChave;
	public SetorAtividade setorAtividade;
	public AreaConhecimento areaConhecimento;
	public String nomeInstituicao;

	public AuxiliarBanca(String natureza, String titulo, String ano, String pais, String idioma, Autores autores,
			PalavraChave palavraChave, SetorAtividade setorAtividade, AreaConhecimento areaConhecimento,
			String nomeInstituicao) {
		super();
		this.natureza = natureza;
		this.titulo = titulo;
		this.ano = ano;
		this.pais = pais;
		this.idioma = idioma;
		this.autores = autores;
		this.palavraChave = palavraChave;
		this.setorAtividade = setorAtividade;
		this.areaConhecimento = areaConhecimento;
		this.nomeInstituicao = nomeInstituicao;
	}

	public String getNatureza() {
		return this.natureza;
	}

	public void setNatureza(String natureza) {
		this.natureza = natureza;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAno() {
		return this.ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getPais() {
		return this.pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getIdioma() {
		return this.idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
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

	public String getNomeInstituicao() {
		return this.nomeInstituicao;
	}

	public void setNomeInstituicao(String nomeInstituicao) {
		this.nomeInstituicao = nomeInstituicao;
	}

}