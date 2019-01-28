package br.com.datalattesAPI.model.ProducaoTecnica;

import br.com.datalattesAPI.model.Geral.AreaConhecimento;
import br.com.datalattesAPI.model.Geral.PalavraChave;
import br.com.datalattesAPI.model.Geral.SetorAtividade;
import br.com.datalattesAPI.model.Producao.Autores;
import br.com.datalattesAPI.model.Producao.Auxiliar;

public class CursoDeCurtaDuracaoMinistrado extends Auxiliar {
	String nivelDoCurso;
	String titulo;
	String ano;
	String pais;
	String idioma;
	String meioDeDivulgacao;
	String homePageDoTrabalho;
	String flagRelevancia;
	String doi;
	String tituloIngles;
	String flagDivulgacaoCientifica;
	String participacaoDosAutores;
	String instituicaoPromotoraDoCurso;
	String localDoCurso;
	String cidade;
	String duracao;
	String unidade;
	String unidadeIngles;

	public CursoDeCurtaDuracaoMinistrado(Autores autores, PalavraChave palavraChave, SetorAtividade setorAtividade,
			AreaConhecimento areaConhecimento, String nivelDoCurso, String titulo, String ano, String pais,
			String idioma, String meioDeDivulgacao, String homePageDoTrabalho, String flagRelevancia, String doi,
			String tituloIngles, String flagDivulgacaoCientifica, String participacaoDosAutores,
			String instituicaoPromotoraDoCurso, String localDoCurso, String cidade, String duracao, String unidade,
			String unidadeIngles) {
		super(autores, palavraChave, setorAtividade, areaConhecimento);
		this.nivelDoCurso = nivelDoCurso;
		this.titulo = titulo;
		this.ano = ano;
		this.pais = pais;
		this.idioma = idioma;
		this.meioDeDivulgacao = meioDeDivulgacao;
		this.homePageDoTrabalho = homePageDoTrabalho;
		this.flagRelevancia = flagRelevancia;
		this.doi = doi;
		this.tituloIngles = tituloIngles;
		this.flagDivulgacaoCientifica = flagDivulgacaoCientifica;
		this.participacaoDosAutores = participacaoDosAutores;
		this.instituicaoPromotoraDoCurso = instituicaoPromotoraDoCurso;
		this.localDoCurso = localDoCurso;
		this.cidade = cidade;
		this.duracao = duracao;
		this.unidade = unidade;
		this.unidadeIngles = unidadeIngles;
	}

	public String getNivelDoCurso() {
		return this.nivelDoCurso;
	}

	public void setNivelDoCurso(String nivelDoCurso) {
		this.nivelDoCurso = nivelDoCurso;
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

	public String getMeioDeDivulgacao() {
		return this.meioDeDivulgacao;
	}

	public void setMeioDeDivulgacao(String meioDeDivulgacao) {
		this.meioDeDivulgacao = meioDeDivulgacao;
	}

	public String getHomePageDoTrabalho() {
		return this.homePageDoTrabalho;
	}

	public void setHomePageDoTrabalho(String homePageDoTrabalho) {
		this.homePageDoTrabalho = homePageDoTrabalho;
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

	public String getFlagDivulgacaoCientifica() {
		return this.flagDivulgacaoCientifica;
	}

	public void setFlagDivulgacaoCientifica(String flagDivulgacaoCientifica) {
		this.flagDivulgacaoCientifica = flagDivulgacaoCientifica;
	}

	public String getParticipacaoDosAutores() {
		return this.participacaoDosAutores;
	}

	public void setParticipacaoDosAutores(String participacaoDosAutores) {
		this.participacaoDosAutores = participacaoDosAutores;
	}

	public String getInstituicaoPromotoraDoCurso() {
		return this.instituicaoPromotoraDoCurso;
	}

	public void setInstituicaoPromotoraDoCurso(String instituicaoPromotoraDoCurso) {
		this.instituicaoPromotoraDoCurso = instituicaoPromotoraDoCurso;
	}

	public String getLocalDoCurso() {
		return this.localDoCurso;
	}

	public void setLocalDoCurso(String localDoCurso) {
		this.localDoCurso = localDoCurso;
	}

	public String getCidade() {
		return this.cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getDuracao() {
		return this.duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}

	public String getUnidade() {
		return this.unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	public String getUnidadeIngles() {
		return this.unidadeIngles;
	}

	public void setUnidadeIngles(String unidadeIngles) {
		this.unidadeIngles = unidadeIngles;
	}

}
