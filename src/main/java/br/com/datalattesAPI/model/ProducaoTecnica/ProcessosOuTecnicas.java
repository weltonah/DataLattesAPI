package br.com.datalattesAPI.model.ProducaoTecnica;

import br.com.datalattesAPI.model.Geral.AreaConhecimento;
import br.com.datalattesAPI.model.Geral.PalavraChave;
import br.com.datalattesAPI.model.Geral.SetorAtividade;
import br.com.datalattesAPI.model.Producao.Autores;
import br.com.datalattesAPI.model.Producao.Auxiliar;

public class ProcessosOuTecnicas extends Auxiliar {
	String natureza;
	String tituloDoProcesso;
	String ano;
	String pais;
	String idioma;
	String meioDeDivulgacao;
	String homePageDoTrabalho;
	String flagRelevancia;
	String doi;
	String tituloDoProcessoIngles;
	String flagPotencialInovacao;
	String finalidade;
	String disponibilidade;
	String instituicaoFinanciadora;
	String cidadeDoProcesso;
	String finalidadeIngles;

	public ProcessosOuTecnicas(Autores autores, PalavraChave palavraChave, SetorAtividade setorAtividade,
			AreaConhecimento areaConhecimento, String natureza, String tituloDoProcesso, String ano, String pais,
			String idioma, String meioDeDivulgacao, String homePageDoTrabalho, String flagRelevancia, String doi,
			String tituloDoProcessoIngles, String flagPotencialInovacao, String finalidade, String disponibilidade,
			String instituicaoFinanciadora, String cidadeDoProcesso, String finalidadeIngles) {
		super(autores, palavraChave, setorAtividade, areaConhecimento);
		this.natureza = natureza;
		this.tituloDoProcesso = tituloDoProcesso;
		this.ano = ano;
		this.pais = pais;
		this.idioma = idioma;
		this.meioDeDivulgacao = meioDeDivulgacao;
		this.homePageDoTrabalho = homePageDoTrabalho;
		this.flagRelevancia = flagRelevancia;
		this.doi = doi;
		this.tituloDoProcessoIngles = tituloDoProcessoIngles;
		this.flagPotencialInovacao = flagPotencialInovacao;
		this.finalidade = finalidade;
		this.disponibilidade = disponibilidade;
		this.instituicaoFinanciadora = instituicaoFinanciadora;
		this.cidadeDoProcesso = cidadeDoProcesso;
		this.finalidadeIngles = finalidadeIngles;
	}

	public String getNatureza() {
		return this.natureza;
	}

	public void setNatureza(String natureza) {
		this.natureza = natureza;
	}

	public String getTituloDoProcesso() {
		return this.tituloDoProcesso;
	}

	public void setTituloDoProcesso(String tituloDoProcesso) {
		this.tituloDoProcesso = tituloDoProcesso;
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

	public String getTituloDoProcessoIngles() {
		return this.tituloDoProcessoIngles;
	}

	public void setTituloDoProcessoIngles(String tituloDoProcessoIngles) {
		this.tituloDoProcessoIngles = tituloDoProcessoIngles;
	}

	public String getFlagPotencialInovacao() {
		return this.flagPotencialInovacao;
	}

	public void setFlagPotencialInovacao(String flagPotencialInovacao) {
		this.flagPotencialInovacao = flagPotencialInovacao;
	}

	public String getFinalidade() {
		return this.finalidade;
	}

	public void setFinalidade(String finalidade) {
		this.finalidade = finalidade;
	}

	public String getDisponibilidade() {
		return this.disponibilidade;
	}

	public void setDisponibilidade(String disponibilidade) {
		this.disponibilidade = disponibilidade;
	}

	public String getInstituicaoFinanciadora() {
		return this.instituicaoFinanciadora;
	}

	public void setInstituicaoFinanciadora(String instituicaoFinanciadora) {
		this.instituicaoFinanciadora = instituicaoFinanciadora;
	}

	public String getCidadeDoProcesso() {
		return this.cidadeDoProcesso;
	}

	public void setCidadeDoProcesso(String cidadeDoProcesso) {
		this.cidadeDoProcesso = cidadeDoProcesso;
	}

	public String getFinalidadeIngles() {
		return this.finalidadeIngles;
	}

	public void setFinalidadeIngles(String finalidadeIngles) {
		this.finalidadeIngles = finalidadeIngles;
	}
}
