package br.com.datalattesAPI.model.Evento;

import br.com.datalattesAPI.model.Geral.AreaConhecimento;
import br.com.datalattesAPI.model.Geral.PalavraChave;
import br.com.datalattesAPI.model.Geral.SetorAtividade;
import br.com.datalattesAPI.model.Producao.Autores;

/**
 * 
 */
public abstract class AuxiliarEvento {

	public String natureza;
	public String titulo;
	public String ano;
	public String pais;
	public String idioma;
	public String tipoParticipacao;
	public Autores autores;
	public PalavraChave palavraChave;
	public SetorAtividade setorAtividade;
	public AreaConhecimento areaConhecimento;
	public String formaParticipacao;
	public String nomeEvento;
	public String nomeInstituicao;
	public String localEvento;
	public String cidadeEvento;

	public AuxiliarEvento(String natureza, String titulo, String ano, String pais, String idioma,
			String tipoParticipacao, Autores autores, PalavraChave palavraChave, SetorAtividade setorAtividade,
			AreaConhecimento areaConhecimento, String formaParticipacao, String nomeEvento, String nomeInstituicao,
			String localEvento, String cidadeEvento) {
		super();
		this.natureza = natureza;
		this.titulo = titulo;
		this.ano = ano;
		this.pais = pais;
		this.idioma = idioma;
		this.tipoParticipacao = tipoParticipacao;
		this.autores = autores;
		this.palavraChave = palavraChave;
		this.setorAtividade = setorAtividade;
		this.areaConhecimento = areaConhecimento;
		this.formaParticipacao = formaParticipacao;
		this.nomeEvento = nomeEvento;
		this.nomeInstituicao = nomeInstituicao;
		this.localEvento = localEvento;
		this.cidadeEvento = cidadeEvento;
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

	public String getTipoParticipacao() {
		return this.tipoParticipacao;
	}

	public void setTipoParticipacao(String tipoParticipacao) {
		this.tipoParticipacao = tipoParticipacao;
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

	public String getFormaParticipacao() {
		return this.formaParticipacao;
	}

	public void setFormaParticipacao(String formaParticipacao) {
		this.formaParticipacao = formaParticipacao;
	}

	public String getNomeEvento() {
		return this.nomeEvento;
	}

	public void setNomeEvento(String nomeEvento) {
		this.nomeEvento = nomeEvento;
	}

	public String getNomeInstituicao() {
		return this.nomeInstituicao;
	}

	public void setNomeInstituicao(String nomeInstituicao) {
		this.nomeInstituicao = nomeInstituicao;
	}

	public String getLocalEvento() {
		return this.localEvento;
	}

	public void setLocalEvento(String localEvento) {
		this.localEvento = localEvento;
	}

	public String getCidadeEvento() {
		return this.cidadeEvento;
	}

	public void setCidadeEvento(String cidadeEvento) {
		this.cidadeEvento = cidadeEvento;
	}

	@Override
	public String toString() {
		return "AuxiliarEvento [" + (this.natureza != null ? "natureza=" + this.natureza + ", " : "")
				+ (this.titulo != null ? "titulo=" + this.titulo + ", " : "")
				+ (this.ano != null ? "ano=" + this.ano + ", " : "")
				+ (this.pais != null ? "pais=" + this.pais + ", " : "")
				+ (this.idioma != null ? "idioma=" + this.idioma + ", " : "")
				+ (this.tipoParticipacao != null ? "tipoParticipacao=" + this.tipoParticipacao + ", " : "")
				+ (this.autores != null ? "autores=" + this.autores + ", " : "")
				+ (this.palavraChave != null ? "palavraChave=" + this.palavraChave + ", " : "")
				+ (this.setorAtividade != null ? "setorAtividade=" + this.setorAtividade + ", " : "")
				+ (this.areaConhecimento != null ? "areaConhecimento=" + this.areaConhecimento + ", " : "")
				+ (this.formaParticipacao != null ? "formaParticipacao=" + this.formaParticipacao + ", " : "")
				+ (this.nomeEvento != null ? "nomeEvento=" + this.nomeEvento + ", " : "")
				+ (this.nomeInstituicao != null ? "nomeInstituicao=" + this.nomeInstituicao + ", " : "")
				+ (this.localEvento != null ? "localEvento=" + this.localEvento + ", " : "")
				+ (this.cidadeEvento != null ? "cidadeEvento=" + this.cidadeEvento : "") + "]";
	}

}