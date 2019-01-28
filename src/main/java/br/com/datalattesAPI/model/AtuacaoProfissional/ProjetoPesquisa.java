package br.com.datalattesAPI.model.AtuacaoProfissional;

import java.util.ArrayList;

public class ProjetoPesquisa {

	public String anoInicio;
	public String anoFim;
	public String nomeProjeto;
	public String situacao;
	public String natureza;
	public String numeroGraducao;
	public String numeroMestradoAcademico;
	public String numeroMestradoProf;
	public String numeroDoutorado;
	public String descricaoProjeto;
	public String idProjeto;
	public String nomeCoordenador;
	public String dataCertificacao;
	public String numeroTecnicoNivelMedio;
	public ArrayList<EquipeProjeto> equipeProjeto;
	public ArrayList<FinanciadoresProjeto> financiadoresProjeto;
	public ArrayList<Producoes> producoes;
	public ArrayList<Orientacoes> orientacoes;

	public ProjetoPesquisa(String anoInicio, String anoFim, String nomeProjeto, String situacao, String natureza,
			String numeroGraducao, String numeroMestradoAcademico, String numeroMestradoProf, String numeroDoutorado,
			String descricaoProjeto, String idProjeto, String nomeCoordenador, String dataCertificacao,
			String numeroTecnicoNivelMedio, ArrayList<EquipeProjeto> equipeProjeto,
			ArrayList<FinanciadoresProjeto> financiadoresProjeto, ArrayList<Producoes> producoes,
			ArrayList<Orientacoes> orientacoes) {
		super();
		this.anoInicio = anoInicio;
		this.anoFim = anoFim;
		this.nomeProjeto = nomeProjeto;
		this.situacao = situacao;
		this.natureza = natureza;
		this.numeroGraducao = numeroGraducao;
		this.numeroMestradoAcademico = numeroMestradoAcademico;
		this.numeroMestradoProf = numeroMestradoProf;
		this.numeroDoutorado = numeroDoutorado;
		this.descricaoProjeto = descricaoProjeto;
		this.idProjeto = idProjeto;
		this.nomeCoordenador = nomeCoordenador;
		this.dataCertificacao = dataCertificacao;
		this.numeroTecnicoNivelMedio = numeroTecnicoNivelMedio;
		this.equipeProjeto = equipeProjeto;
		this.financiadoresProjeto = financiadoresProjeto;
		this.producoes = producoes;
		this.orientacoes = orientacoes;
	}

	public String getAnoInicio() {
		return this.anoInicio;
	}

	public void setAnoInicio(String anoInicio) {
		this.anoInicio = anoInicio;
	}

	public String getAnoFim() {
		return this.anoFim;
	}

	public void setAnoFim(String anoFim) {
		this.anoFim = anoFim;
	}

	public String getNomeProjeto() {
		return this.nomeProjeto;
	}

	public void setNomeProjeto(String nomeProjeto) {
		this.nomeProjeto = nomeProjeto;
	}

	public String getSituacao() {
		return this.situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public String getNatureza() {
		return this.natureza;
	}

	public void setNatureza(String natureza) {
		this.natureza = natureza;
	}

	public String getNumeroGraducao() {
		return this.numeroGraducao;
	}

	public void setNumeroGraducao(String numeroGraducao) {
		this.numeroGraducao = numeroGraducao;
	}

	public String getNumeroMestradoAcademico() {
		return this.numeroMestradoAcademico;
	}

	public void setNumeroMestradoAcademico(String numeroMestradoAcademico) {
		this.numeroMestradoAcademico = numeroMestradoAcademico;
	}

	public String getNumeroMestradoProf() {
		return this.numeroMestradoProf;
	}

	public void setNumeroMestradoProf(String numeroMestradoProf) {
		this.numeroMestradoProf = numeroMestradoProf;
	}

	public String getNumeroDoutorado() {
		return this.numeroDoutorado;
	}

	public void setNumeroDoutorado(String numeroDoutorado) {
		this.numeroDoutorado = numeroDoutorado;
	}

	public String getDescricaoProjeto() {
		return this.descricaoProjeto;
	}

	public void setDescricaoProjeto(String descricaoProjeto) {
		this.descricaoProjeto = descricaoProjeto;
	}

	public String getIdProjeto() {
		return this.idProjeto;
	}

	public void setIdProjeto(String idProjeto) {
		this.idProjeto = idProjeto;
	}

	public String getNomeCoordenador() {
		return this.nomeCoordenador;
	}

	public void setNomeCoordenador(String nomeCoordenador) {
		this.nomeCoordenador = nomeCoordenador;
	}

	public String getDataCertificacao() {
		return this.dataCertificacao;
	}

	public void setDataCertificacao(String dataCertificacao) {
		this.dataCertificacao = dataCertificacao;
	}

	public String getNumeroTecnicoNivelMedio() {
		return this.numeroTecnicoNivelMedio;
	}

	public void setNumeroTecnicoNivelMedio(String numeroTecnicoNivelMedio) {
		this.numeroTecnicoNivelMedio = numeroTecnicoNivelMedio;
	}

	public ArrayList<EquipeProjeto> getEquipeProjeto() {
		return this.equipeProjeto;
	}

	public void setEquipeProjeto(ArrayList<EquipeProjeto> equipeProjeto) {
		this.equipeProjeto = equipeProjeto;
	}

	public ArrayList<FinanciadoresProjeto> getFinanciadoresProjeto() {
		return this.financiadoresProjeto;
	}

	public void setFinanciadoresProjeto(ArrayList<FinanciadoresProjeto> financiadoresProjeto) {
		this.financiadoresProjeto = financiadoresProjeto;
	}

	public ArrayList<Producoes> getProducoes() {
		return this.producoes;
	}

	public void setProducoes(ArrayList<Producoes> producoes) {
		this.producoes = producoes;
	}

	public ArrayList<Orientacoes> getOrientacoes() {
		return this.orientacoes;
	}

	public void setOrientacoes(ArrayList<Orientacoes> orientacoes) {
		this.orientacoes = orientacoes;
	}

}