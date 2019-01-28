package br.com.datalattesAPI.model.Formacao;

import br.com.datalattesAPI.model.Geral.AreaConhecimento;
import br.com.datalattesAPI.model.Geral.PalavraChave;
import br.com.datalattesAPI.model.Geral.SetorAtividade;

/**
 * 
 */
public class Doutorado extends MestradoAcademico {

	public String nomeOrientadorSanduiche;

	public Doutorado(String anoInicio, String anoConclusao, String nomeInstituicao, String statusCurso,
			String tituloTrabalho, String nomeAgenciaFinanciadora, String tituloTrabalhoEN, String nomeCursoEN,
			String flagBolsa, String nomeOrientador, String nomeOrgao, String nomeCurso, String codigoAreaCurso,
			String idOrientador, String tipoCurso, String anoObtencaoTitulo, PalavraChave palavraChave,
			SetorAtividade setorAtividade, AreaConhecimento areaConhecimento, String nomeCoorientador,
			String nomeOrientadorSanduiche) {
		super(anoInicio, anoConclusao, nomeInstituicao, statusCurso, tituloTrabalho, nomeAgenciaFinanciadora,
				tituloTrabalhoEN, nomeCursoEN, flagBolsa, nomeOrientador, nomeOrgao, nomeCurso, codigoAreaCurso,
				idOrientador, tipoCurso, anoObtencaoTitulo, palavraChave, setorAtividade, areaConhecimento,
				nomeCoorientador);
		this.nomeOrientadorSanduiche = nomeOrientadorSanduiche;
	}

	public String getNomeOrientadorSanduiche() {
		return this.nomeOrientadorSanduiche;
	}

	public void setNomeOrientadorSanduiche(String nomeOrientadorSanduiche) {
		this.nomeOrientadorSanduiche = nomeOrientadorSanduiche;
	}

}