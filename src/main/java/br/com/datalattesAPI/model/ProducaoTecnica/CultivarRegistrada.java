package br.com.datalattesAPI.model.ProducaoTecnica;

import br.com.datalattesAPI.model.Geral.AreaConhecimento;
import br.com.datalattesAPI.model.Geral.PalavraChave;
import br.com.datalattesAPI.model.Geral.SetorAtividade;
import br.com.datalattesAPI.model.Producao.Autores;
import br.com.datalattesAPI.model.Producao.Auxiliar;

public class CultivarRegistrada extends Auxiliar {
	String denominacao;
	String anoSolicitacao;
	String pais;
	String flagRelevancia;
	String denominacaoIngles;
	String flagPotencialInovacao;
	String finalidade;
	String instituicaoFinanciadora;
	String finalidadeIngles;

	public CultivarRegistrada(Autores autores, PalavraChave palavraChave, SetorAtividade setorAtividade,
			AreaConhecimento areaConhecimento, String denominacao, String anoSolicitacao, String pais,
			String flagRelevancia, String denominacaoIngles, String flagPotencialInovacao, String finalidade,
			String instituicaoFinanciadora, String finalidadeIngles) {
		super(autores, palavraChave, setorAtividade, areaConhecimento);
		this.denominacao = denominacao;
		this.anoSolicitacao = anoSolicitacao;
		this.pais = pais;
		this.flagRelevancia = flagRelevancia;
		this.denominacaoIngles = denominacaoIngles;
		this.flagPotencialInovacao = flagPotencialInovacao;
		this.finalidade = finalidade;
		this.instituicaoFinanciadora = instituicaoFinanciadora;
		this.finalidadeIngles = finalidadeIngles;
	}

	public String getDenominacao() {
		return this.denominacao;
	}

	public void setDenominacao(String denominacao) {
		this.denominacao = denominacao;
	}

	public String getAnoSolicitacao() {
		return this.anoSolicitacao;
	}

	public void setAnoSolicitacao(String anoSolicitacao) {
		this.anoSolicitacao = anoSolicitacao;
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

	public String getDenominacaoIngles() {
		return this.denominacaoIngles;
	}

	public void setDenominacaoIngles(String denominacaoIngles) {
		this.denominacaoIngles = denominacaoIngles;
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
