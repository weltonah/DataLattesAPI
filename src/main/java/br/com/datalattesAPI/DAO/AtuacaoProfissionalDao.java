package br.com.datalattesAPI.DAO;

import java.io.File;
import java.util.ArrayList;

import javax.xml.xpath.XPathExpressionException;

import br.com.datalattesAPI.Xpath.AtuacaoProfissionalXpath;
import br.com.datalattesAPI.model.AtuacaoProfissional.ConselhoComissaoConsultoria;
import br.com.datalattesAPI.model.AtuacaoProfissional.DirecaoAdministracao;
import br.com.datalattesAPI.model.AtuacaoProfissional.Ensino;
import br.com.datalattesAPI.model.AtuacaoProfissional.Estagio;
import br.com.datalattesAPI.model.AtuacaoProfissional.ExtensaoUniversitaria;
import br.com.datalattesAPI.model.AtuacaoProfissional.ParticipacaoProjeto;
import br.com.datalattesAPI.model.AtuacaoProfissional.PesquisaDesenvolvimento;
import br.com.datalattesAPI.model.AtuacaoProfissional.ServicoTecnicoEspecializado;
import br.com.datalattesAPI.model.AtuacaoProfissional.TreinamentoMinistrado;
import br.com.datalattesAPI.model.AtuacaoProfissional.Vinculo;

public class AtuacaoProfissionalDao {
	public AtuacaoProfissionalXpath atuacaoProfissionalXpath;

	public AtuacaoProfissionalDao(File file) {
		this.atuacaoProfissionalXpath = new AtuacaoProfissionalXpath(file);
	}

	public ArrayList<Vinculo> Vinculo() throws XPathExpressionException {
		return this.atuacaoProfissionalXpath.BuscaVinculo();
	}

	public ArrayList<DirecaoAdministracao> DirecaoAdministracao()
			throws XPathExpressionException {
		return this.atuacaoProfissionalXpath.BuscaDirecaoAdministracao();
	}

	public ArrayList<Estagio> Estagio() throws XPathExpressionException {
		return this.atuacaoProfissionalXpath.BuscaEstagio();
	}

	public ArrayList<ServicoTecnicoEspecializado> ServicoTecnicoEspecializado()
			throws XPathExpressionException {
		return this.atuacaoProfissionalXpath.BuscaServicoTecnicoEspecializado();
	}

	public ArrayList<ExtensaoUniversitaria> ExtensaoUniversitaria()
			throws XPathExpressionException {
		return this.atuacaoProfissionalXpath.BuscaExtensaoUniversitaria();
	}

	public ArrayList<ConselhoComissaoConsultoria> ConselhoComissaoConsultoria()
			throws XPathExpressionException {
		return this.atuacaoProfissionalXpath.BuscaConselhoComissaoConsultoria();
	}

	public ArrayList<Ensino> Ensino() throws XPathExpressionException {
		return this.atuacaoProfissionalXpath.BuscaEnsino();
	}

	public ArrayList<TreinamentoMinistrado> TreinamentoMinistrado()
			throws XPathExpressionException {
		return this.atuacaoProfissionalXpath.BuscaTreinamentoMinistrado();
	}

	public ArrayList<PesquisaDesenvolvimento> PesquisaDesenvolvimento()
			throws XPathExpressionException {
		return this.atuacaoProfissionalXpath.BuscaPesquisaDesenvolvimento();
	}

	public ArrayList<ParticipacaoProjeto> ParticipacaoProjeto() throws XPathExpressionException {
		return this.atuacaoProfissionalXpath.BuscaParticipacaoProjeto();
	}
}
