package br.com.datalattesAPI.model.Banca;

import br.com.datalattesAPI.model.Geral.AreaConhecimento;
import br.com.datalattesAPI.model.Geral.PalavraChave;
import br.com.datalattesAPI.model.Geral.SetorAtividade;
import br.com.datalattesAPI.model.Producao.Autores;

public class BancaQualificacaoMestrado extends BancaFormacao {
	public BancaQualificacaoMestrado(String natureza, String titulo, String ano, String pais, String idioma,
			Autores autores, PalavraChave palavraChave, SetorAtividade setorAtividade,
			AreaConhecimento areaConhecimento, String nomeInstituicao, String nomeOrgao, String nomeCandidato,
			String nomeCurso) {
		super(natureza, titulo, ano, pais, idioma, autores, palavraChave, setorAtividade, areaConhecimento,
				nomeInstituicao, nomeOrgao, nomeCandidato, nomeCurso);
		// TODO Auto-generated constructor stub
	}

}