package br.com.datalattesAPI.model.ProducaoTecnica;

import br.com.datalattesAPI.model.Geral.AreaConhecimento;
import br.com.datalattesAPI.model.Geral.PalavraChave;
import br.com.datalattesAPI.model.Geral.SetorAtividade;
import br.com.datalattesAPI.model.Producao.Autores;
import br.com.datalattesAPI.model.Producao.Auxiliar;

public class ManutencaoDeObraArtistica extends Auxiliar {
	String tipo;
	String natureza;
	String titulo;
	String ano;
	String pais;
	String idioma;
	String flagRelevancia;
	String doi;
	String tituloIngles;
	String nomeDaObra;
	String autorDaObra;
	String anoDaObra;
	String acervo;
	String local;
	String cidade;

	public ManutencaoDeObraArtistica(Autores autores, PalavraChave palavraChave, SetorAtividade setorAtividade,
			AreaConhecimento areaConhecimento, String tipo, String natureza, String titulo, String ano, String pais,
			String idioma, String flagRelevancia, String doi, String tituloIngles, String nomeDaObra,
			String autorDaObra, String anoDaObra, String acervo, String local, String cidade) {
		super(autores, palavraChave, setorAtividade, areaConhecimento);
		this.tipo = tipo;
		this.natureza = natureza;
		this.titulo = titulo;
		this.ano = ano;
		this.pais = pais;
		this.idioma = idioma;
		this.flagRelevancia = flagRelevancia;
		this.doi = doi;
		this.tituloIngles = tituloIngles;
		this.nomeDaObra = nomeDaObra;
		this.autorDaObra = autorDaObra;
		this.anoDaObra = anoDaObra;
		this.acervo = acervo;
		this.local = local;
		this.cidade = cidade;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
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

	public String getFlagRelevancia() {
		return this.flagRelevancia;
	}

	public void setFlagRelevancia(String flagRelevancia) {
		this.flagRelevancia = flagRelevancia;
	}

	public String getDoi() {
		return this.doi;
	}

	public void setDoi(String doi) {
		this.doi = doi;
	}

	public String getTituloIngles() {
		return this.tituloIngles;
	}

	public void setTituloIngles(String tituloIngles) {
		this.tituloIngles = tituloIngles;
	}

	public String getNomeDaObra() {
		return this.nomeDaObra;
	}

	public void setNomeDaObra(String nomeDaObra) {
		this.nomeDaObra = nomeDaObra;
	}

	public String getAutorDaObra() {
		return this.autorDaObra;
	}

	public void setAutorDaObra(String autorDaObra) {
		this.autorDaObra = autorDaObra;
	}

	public String getAnoDaObra() {
		return this.anoDaObra;
	}

	public void setAnoDaObra(String anoDaObra) {
		this.anoDaObra = anoDaObra;
	}

	public String getAcervo() {
		return this.acervo;
	}

	public void setAcervo(String acervo) {
		this.acervo = acervo;
	}

	public String getLocal() {
		return this.local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getCidade() {
		return this.cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
}
