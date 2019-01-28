package br.com.datalattesAPI.model.Evento;

import br.com.datalattesAPI.model.Geral.AreaConhecimento;
import br.com.datalattesAPI.model.Geral.PalavraChave;
import br.com.datalattesAPI.model.Geral.SetorAtividade;
import br.com.datalattesAPI.model.Producao.Autores;

/**
 * 
 */
public class EventoEncontro extends AuxiliarEvento {

	public EventoEncontro(String natureza, String titulo, String ano, String pais, String idioma,
			String tipoParticipacao, Autores autores, PalavraChave palavraChave, SetorAtividade setorAtividade,
			AreaConhecimento areaConhecimento, String formaParticipacao, String nomeEvento, String nomeInstituicao,
			String localEvento, String cidadeEvento) {
		super(natureza, titulo, ano, pais, idioma, tipoParticipacao, autores, palavraChave, setorAtividade,
				areaConhecimento, formaParticipacao, nomeEvento, nomeInstituicao, localEvento, cidadeEvento);
		// TODO Auto-generated constructor stub
	}

}