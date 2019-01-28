package br.com.datalattesAPI.model.Banca;

import br.com.datalattesAPI.model.Geral.AreaConhecimento;
import br.com.datalattesAPI.model.Geral.PalavraChave;
import br.com.datalattesAPI.model.Geral.SetorAtividade;
import br.com.datalattesAPI.model.Producao.Autores;

/**
 * 
 */
public class BancaMestrado extends BancaFormacao {

	public BancaMestrado(String natureza, String titulo, String ano, String pais, String idioma, Autores autores,
			PalavraChave palavraChave, SetorAtividade setorAtividade, AreaConhecimento areaConhecimento,
			String nomeInstituicao, String nomeOrgao, String nomeCandidato, String nomeCurso, String tipo) {
		super(natureza, titulo, ano, pais, idioma, autores, palavraChave, setorAtividade, areaConhecimento,
				nomeInstituicao, nomeOrgao, nomeCandidato, nomeCurso);
		this.tipo = tipo;
	}

	private String tipo;

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}