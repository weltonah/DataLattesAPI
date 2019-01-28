package br.com.datalattesAPI.model.Banca;

import br.com.datalattesAPI.model.Geral.AreaConhecimento;
import br.com.datalattesAPI.model.Geral.PalavraChave;
import br.com.datalattesAPI.model.Geral.SetorAtividade;
import br.com.datalattesAPI.model.Producao.Autores;

/**
 * 
 */
public class BancaProfessorTitular extends AuxiliarBanca {

	public BancaProfessorTitular(String natureza, String titulo, String ano, String pais, String idioma,
			Autores autores, PalavraChave palavraChave, SetorAtividade setorAtividade,
			AreaConhecimento areaConhecimento, String nomeInstituicao) {
		super(natureza, titulo, ano, pais, idioma, autores, palavraChave, setorAtividade, areaConhecimento,
				nomeInstituicao);
		// TODO Auto-generated constructor stub
	}

}