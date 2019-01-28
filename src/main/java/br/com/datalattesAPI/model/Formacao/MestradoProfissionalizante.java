package br.com.datalattesAPI.model.Formacao;

import br.com.datalattesAPI.model.Geral.AreaConhecimento;
import br.com.datalattesAPI.model.Geral.PalavraChave;
import br.com.datalattesAPI.model.Geral.SetorAtividade;

/**
 * 
 */
public class MestradoProfissionalizante extends MestradoAcademico {

	public MestradoProfissionalizante(String anoInicio, String anoConclusao, String nomeInstituicao, String statusCurso,
			String tituloTrabalho, String nomeAgenciaFinanciadora, String tituloTrabalhoEN, String nomeCursoEN,
			String flagBolsa, String nomeOrientador, String nomeOrgao, String nomeCurso, String codigoAreaCurso,
			String idOrientador, String tipoCurso, String anoObtencaoTitulo, PalavraChave palavraChave,
			SetorAtividade setorAtividade, AreaConhecimento areaConhecimento, String nomeCoorientador) {
		super(anoInicio, anoConclusao, nomeInstituicao, statusCurso, tituloTrabalho, nomeAgenciaFinanciadora,
				tituloTrabalhoEN, nomeCursoEN, flagBolsa, nomeOrientador, nomeOrgao, nomeCurso, codigoAreaCurso,
				idOrientador, tipoCurso, anoObtencaoTitulo, palavraChave, setorAtividade, areaConhecimento,
				nomeCoorientador);
		// TODO Auto-generated constructor stub
	}

}