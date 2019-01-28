package br.com.datalattesAPI.model.ProducaoTecnica;

import br.com.datalattesAPI.model.Geral.AreaConhecimento;
import br.com.datalattesAPI.model.Geral.PalavraChave;
import br.com.datalattesAPI.model.Geral.SetorAtividade;
import br.com.datalattesAPI.model.Producao.Autores;
import br.com.datalattesAPI.model.Producao.Auxiliar;

public class ProdutoTecnologico extends Auxiliar {
	String tipoProduto;
	String natureza;
	String tituloDoProduto;
	String ano;
	String pais;
	String idioma;
	String meioDeDivulgacao;
	String homePageDoTrabalho;
	String flagRelevancia;
	String doi;
	String tituloDoProdutoIngles;
	String flagPotencialInovacao;
	String finalidade;
	String disponibilidade;
	String cidadeDoProduto;
	String instituicaoFinanciadora;
	String finalidadeIngles;

	public ProdutoTecnologico(Autores autores, PalavraChave palavraChave, SetorAtividade setorAtividade,
			AreaConhecimento areaConhecimento, String tipoProduto, String natureza, String tituloDoProduto, String ano,
			String pais, String idioma, String meioDeDivulgacao, String homePageDoTrabalho, String flagRelevancia,
			String doi, String tituloDoProdutoIngles, String flagPotencialInovacao, String finalidade,
			String disponibilidade, String cidadeDoProduto, String instituicaoFinanciadora, String finalidadeIngles) {
		super(autores, palavraChave, setorAtividade, areaConhecimento);
		this.tipoProduto = tipoProduto;
		this.natureza = natureza;
		this.tituloDoProduto = tituloDoProduto;
		this.ano = ano;
		this.pais = pais;
		this.idioma = idioma;
		this.meioDeDivulgacao = meioDeDivulgacao;
		this.homePageDoTrabalho = homePageDoTrabalho;
		this.flagRelevancia = flagRelevancia;
		this.doi = doi;
		this.tituloDoProdutoIngles = tituloDoProdutoIngles;
		this.flagPotencialInovacao = flagPotencialInovacao;
		this.finalidade = finalidade;
		this.disponibilidade = disponibilidade;
		this.cidadeDoProduto = cidadeDoProduto;
		this.instituicaoFinanciadora = instituicaoFinanciadora;
		this.finalidadeIngles = finalidadeIngles;
	}

	public String getTipoProduto() {
		return this.tipoProduto;
	}

	public void setTipoProduto(String tipoProduto) {
		this.tipoProduto = tipoProduto;
	}

	public String getNatureza() {
		return this.natureza;
	}

	public void setNatureza(String natureza) {
		this.natureza = natureza;
	}

	public String getTituloDoProduto() {
		return this.tituloDoProduto;
	}

	public void setTituloDoProduto(String tituloDoProduto) {
		this.tituloDoProduto = tituloDoProduto;
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

	public String getTituloDoProdutoIngles() {
		return this.tituloDoProdutoIngles;
	}

	public void setTituloDoProdutoIngles(String tituloDoProdutoIngles) {
		this.tituloDoProdutoIngles = tituloDoProdutoIngles;
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

	public String getCidadeDoProduto() {
		return this.cidadeDoProduto;
	}

	public void setCidadeDoProduto(String cidadeDoProduto) {
		this.cidadeDoProduto = cidadeDoProduto;
	}

	public String getInstituicaoFinanciadora() {
		return this.instituicaoFinanciadora;
	}

	public void setInstituicaoFinanciadora(String instituicaoFinanciadora) {
		this.instituicaoFinanciadora = instituicaoFinanciadora;
	}

	public String getFinalidadeIngles() {
		return this.finalidadeIngles;
	}

	public void setFinalidadeIngles(String finalidadeIngles) {
		this.finalidadeIngles = finalidadeIngles;
	}
}
