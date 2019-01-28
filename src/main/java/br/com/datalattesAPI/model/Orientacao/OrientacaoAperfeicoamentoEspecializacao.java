package br.com.datalattesAPI.model.Orientacao;

import br.com.datalattesAPI.model.Geral.AreaConhecimento;
import br.com.datalattesAPI.model.Geral.PalavraChave;
import br.com.datalattesAPI.model.Geral.SetorAtividade;

/**
 * 
 */
public class OrientacaoAperfeicoamentoEspecializacao extends OrientacaoAbstract {

	public OrientacaoAperfeicoamentoEspecializacao(PalavraChave palavraChave, SetorAtividade setorAtividade,
			AreaConhecimento areaConhecimento, String natureza, String titulo, String ano, String pais, String doi,
			String tipoOrientacao, String nomeOrientado, String nomeInstituicao, String nomeOrgao, String nomeCurso,
			String flagBolsa, String nomeAgencia, String idOrientador) {
		super(palavraChave, setorAtividade, areaConhecimento, natureza, titulo, ano, pais, doi, tipoOrientacao,
				nomeOrientado, nomeInstituicao, nomeOrgao, nomeCurso, flagBolsa, nomeAgencia, idOrientador);
		// TODO Auto-generated constructor stub
	}

}