package br.com.datalattesAPI.model.Orientacao;

import br.com.datalattesAPI.model.Geral.AreaConhecimento;
import br.com.datalattesAPI.model.Geral.PalavraChave;
import br.com.datalattesAPI.model.Geral.SetorAtividade;

/**
 * 
 */
public class OrientacaoMestrado extends OrientacaoAbstract {

	public String tipo;

	public OrientacaoMestrado(PalavraChave palavraChave, SetorAtividade setorAtividade,
			AreaConhecimento areaConhecimento, String natureza, String titulo, String ano, String pais, String doi,
			String tipoOrientacao, String nomeOrientado, String nomeInstituicao, String nomeOrgao, String nomeCurso,
			String flagBolsa, String nomeAgencia, String idOrientador, String tipo) {
		super(palavraChave, setorAtividade, areaConhecimento, natureza, titulo, ano, pais, doi, tipoOrientacao,
				nomeOrientado, nomeInstituicao, nomeOrgao, nomeCurso, flagBolsa, nomeAgencia, idOrientador);
		this.tipo = tipo;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}