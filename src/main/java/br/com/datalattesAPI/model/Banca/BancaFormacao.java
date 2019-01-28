package br.com.datalattesAPI.model.Banca;

import br.com.datalattesAPI.model.Geral.AreaConhecimento;
import br.com.datalattesAPI.model.Geral.PalavraChave;
import br.com.datalattesAPI.model.Geral.SetorAtividade;
import br.com.datalattesAPI.model.Producao.Autores;

/**
 * 
 */
public abstract class BancaFormacao extends AuxiliarBanca {

	public String nomeOrgao;
	public String nomeCandidato;
	public String nomeCurso;

	public BancaFormacao(String natureza, String titulo, String ano, String pais, String idioma, Autores autores,
			PalavraChave palavraChave, SetorAtividade setorAtividade, AreaConhecimento areaConhecimento,
			String nomeInstituicao, String nomeOrgao, String nomeCandidato, String nomeCurso) {
		super(natureza, titulo, ano, pais, idioma, autores, palavraChave, setorAtividade, areaConhecimento,
				nomeInstituicao);
		this.nomeOrgao = nomeOrgao;
		this.nomeCandidato = nomeCandidato;
		this.nomeCurso = nomeCurso;
	}

	public String getNomeOrgao() {
		return this.nomeOrgao;
	}

	public void setNomeOrgao(String nomeOrgao) {
		this.nomeOrgao = nomeOrgao;
	}

	public String getNomeInsituicao() {
		return this.nomeInstituicao;
	}

	public void setNomeInsituicao(String nomeInsituicao) {
		this.nomeInstituicao = nomeInsituicao;
	}

	public String getNomeCandidato() {
		return this.nomeCandidato;
	}

	public void setNomeCandidato(String nomeCandidato) {
		this.nomeCandidato = nomeCandidato;
	}

	public String getNomeCurso() {
		return this.nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

}