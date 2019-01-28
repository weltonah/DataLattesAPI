package br.com.datalattesAPI.model.ProducaoTecnica;

import br.com.datalattesAPI.model.Geral.AreaConhecimento;
import br.com.datalattesAPI.model.Geral.PalavraChave;
import br.com.datalattesAPI.model.Geral.SetorAtividade;
import br.com.datalattesAPI.model.Producao.Autores;
import br.com.datalattesAPI.model.Producao.Auxiliar;

public class TopografiaDeCircuitoIntegrado extends Auxiliar {
	String titulo;
	String anoDesenvolvimento;
	String pais;
	String flagRelevancia;
	String tituloIngles;
	String flagPotencialInovacao;
	String finalidade;
	String instituicaoFinanciadora;
	String finalidadeIngles;

	public TopografiaDeCircuitoIntegrado(Autores autores, PalavraChave palavraChave, SetorAtividade setorAtividade,
			AreaConhecimento areaConhecimento, String titulo, String anoDesenvolvimento, String pais,
			String flagRelevancia, String tituloIngles, String flagPotencialInovacao, String finalidade,
			String instituicaoFinanciadora, String finalidadeIngles) {
		super(autores, palavraChave, setorAtividade, areaConhecimento);
		this.titulo = titulo;
		this.anoDesenvolvimento = anoDesenvolvimento;
		this.pais = pais;
		this.flagRelevancia = flagRelevancia;
		this.tituloIngles = tituloIngles;
		this.flagPotencialInovacao = flagPotencialInovacao;
		this.finalidade = finalidade;
		this.instituicaoFinanciadora = instituicaoFinanciadora;
		this.finalidadeIngles = finalidadeIngles;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAnoDesenvolvimento() {
		return this.anoDesenvolvimento;
	}

	public void setAnoDesenvolvimento(String anoDesenvolvimento) {
		this.anoDesenvolvimento = anoDesenvolvimento;
	}

	public String getPais() {
		return this.pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getFlagRelevancia() {
		return this.flagRelevancia;
	}

	public void setFlagRelevancia(String flagRelevancia) {
		this.flagRelevancia = flagRelevancia;
	}

	public String getTituloIngles() {
		return this.tituloIngles;
	}

	public void setTituloIngles(String tituloIngles) {
		this.tituloIngles = tituloIngles;
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
