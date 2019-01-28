package br.com.datalattesAPI.DAO;

import java.io.File;
import java.util.ArrayList;
import java.util.stream.Collectors;

import javax.xml.xpath.XPathExpressionException;

import br.com.datalattesAPI.Xpath.OrientacaoXpath;
import br.com.datalattesAPI.model.Orientacao.OrientacaoAbstract;
import br.com.datalattesAPI.model.Orientacao.OrientacaoAperfeicoamentoEspecializacao;
import br.com.datalattesAPI.model.Orientacao.OrientacaoDoutorado;
import br.com.datalattesAPI.model.Orientacao.OrientacaoGraduacao;
import br.com.datalattesAPI.model.Orientacao.OrientacaoIniciacaoCientifica;
import br.com.datalattesAPI.model.Orientacao.OrientacaoMestrado;
import br.com.datalattesAPI.model.Orientacao.OrientacaoPosDoutorado;

public class OrientacaoDao {

	public OrientacaoXpath orientacaoXpath;

	public OrientacaoDao(File file) {
		this.orientacaoXpath = new OrientacaoXpath(file);
	}

	public ArrayList<OrientacaoMestrado> OrientacaoMestradoConcluido() throws XPathExpressionException {
		ArrayList<OrientacaoAbstract> resposta = this.orientacaoXpath
				.BuscaOrientacaoConcluida("//ORIENTACOES-CONCLUIDAS-PARA-MESTRADO", "OrientacaoMestrado");
		ArrayList<OrientacaoMestrado> result = (ArrayList<OrientacaoMestrado>) resposta.stream()
				.map(u -> (OrientacaoMestrado) u).collect(Collectors.toList());
		return result;
	}

	public ArrayList<OrientacaoDoutorado> OrientacaoDoutoradoConcluido() throws XPathExpressionException {
		ArrayList<OrientacaoAbstract> resposta = this.orientacaoXpath
				.BuscaOrientacaoConcluida("//ORIENTACOES-CONCLUIDAS-PARA-DOUTORADO", "OrientacaoDoutorado");
		ArrayList<OrientacaoDoutorado> result = (ArrayList<OrientacaoDoutorado>) resposta.stream()
				.map(u -> (OrientacaoDoutorado) u).collect(Collectors.toList());
		return result;
	}

	public ArrayList<OrientacaoPosDoutorado> OrientacaoPosDoutoradoConcluido() throws XPathExpressionException {
		ArrayList<OrientacaoAbstract> resposta = this.orientacaoXpath
				.BuscaOrientacaoConcluida("//ORIENTACOES-CONCLUIDAS-PARA-POS-DOUTORADO", "OrientacaoPosDoutorado");
		ArrayList<OrientacaoPosDoutorado> result = (ArrayList<OrientacaoPosDoutorado>) resposta.stream()
				.map(u -> (OrientacaoPosDoutorado) u).collect(Collectors.toList());
		return result;
	}

	public ArrayList<OrientacaoGraduacao> OrientacaoGraduacaoConcluido() throws XPathExpressionException {
		ArrayList<OrientacaoAbstract> resposta = this.orientacaoXpath
				.BuscaOrientacaoConcluida("//OUTRAS-ORIENTACOES-CONCLUIDAS", "OrientacaoGraduacao");
		ArrayList<OrientacaoGraduacao> result = (ArrayList<OrientacaoGraduacao>) resposta.stream()
				.map(u -> (OrientacaoGraduacao) u).collect(Collectors.toList());
		return result;
	}

	public ArrayList<OrientacaoAperfeicoamentoEspecializacao> OrientacaoAperfeicoamentoEspecializacaoConcluido()
			throws XPathExpressionException {
		ArrayList<OrientacaoAbstract> resposta = this.orientacaoXpath
				.BuscaOrientacaoConcluida("//OUTRAS-ORIENTACOES-CONCLUIDAS", "OrientacaoAperfeicoamentoEspecializacao");
		ArrayList<OrientacaoAperfeicoamentoEspecializacao> result = (ArrayList<OrientacaoAperfeicoamentoEspecializacao>) resposta
				.stream().map(u -> (OrientacaoAperfeicoamentoEspecializacao) u).collect(Collectors.toList());
		return result;
	}

	public ArrayList<OrientacaoIniciacaoCientifica> OrientacaoIniciacaoCientificaConcluido()
			throws XPathExpressionException {
		ArrayList<OrientacaoAbstract> resposta = this.orientacaoXpath
				.BuscaOrientacaoConcluida("//OUTRAS-ORIENTACOES-CONCLUIDAS", "OrientacaoIniciacaoCientifica");
		ArrayList<OrientacaoIniciacaoCientifica> result = (ArrayList<OrientacaoIniciacaoCientifica>) resposta.stream()
				.map(u -> (OrientacaoIniciacaoCientifica) u).collect(Collectors.toList());
		return result;
	}

	public ArrayList<OrientacaoMestrado> OrientacaoMestradoAndamento() throws XPathExpressionException {
		ArrayList<OrientacaoAbstract> resposta = this.orientacaoXpath
				.BuscaOrientacaoAndamento("//ORIENTACAO-EM-ANDAMENTO-DE-MESTRADO", "OrientacaoMestrado");
		ArrayList<OrientacaoMestrado> result = (ArrayList<OrientacaoMestrado>) resposta.stream()
				.map(u -> (OrientacaoMestrado) u).collect(Collectors.toList());
		return result;
	}

	public ArrayList<OrientacaoDoutorado> OrientacaoDoutoradoAndamento() throws XPathExpressionException {
		ArrayList<OrientacaoAbstract> resposta = this.orientacaoXpath
				.BuscaOrientacaoAndamento("//ORIENTACAO-EM-ANDAMENTO-DE-DOUTORADO", "OrientacaoDoutorado");
		ArrayList<OrientacaoDoutorado> result = (ArrayList<OrientacaoDoutorado>) resposta.stream()
				.map(u -> (OrientacaoDoutorado) u).collect(Collectors.toList());
		return result;
	}

	public ArrayList<OrientacaoPosDoutorado> OrientacaoPosDoutoradoAndamento() throws XPathExpressionException {
		ArrayList<OrientacaoAbstract> resposta = this.orientacaoXpath
				.BuscaOrientacaoAndamento("//ORIENTACAO-EM-ANDAMENTO-DE-POS-DOUTORADO", "OrientacaoPosDoutorado");
		ArrayList<OrientacaoPosDoutorado> result = (ArrayList<OrientacaoPosDoutorado>) resposta.stream()
				.map(u -> (OrientacaoPosDoutorado) u).collect(Collectors.toList());
		return result;
	}

	public ArrayList<OrientacaoGraduacao> OrientacaoGraduacaoAndamento() throws XPathExpressionException {
		ArrayList<OrientacaoAbstract> resposta = this.orientacaoXpath
				.BuscaOrientacaoAndamento("//ORIENTACAO-EM-ANDAMENTO-DE-GRADUACAO", "OrientacaoGraduacao");
		ArrayList<OrientacaoGraduacao> result = (ArrayList<OrientacaoGraduacao>) resposta.stream()
				.map(u -> (OrientacaoGraduacao) u).collect(Collectors.toList());
		return result;
	}

	public ArrayList<OrientacaoAperfeicoamentoEspecializacao> OrientacaoAperfeicoamentoEspecializacaoAndamento()
			throws XPathExpressionException {
		ArrayList<OrientacaoAbstract> resposta = this.orientacaoXpath.BuscaOrientacaoAndamento(
				"//ORIENTACAO-EM-ANDAMENTO-DE-APERFEICOAMENTO-ESPECIALIZACAO",
				"OrientacaoAperfeicoamentoEspecializacao");
		ArrayList<OrientacaoAperfeicoamentoEspecializacao> result = (ArrayList<OrientacaoAperfeicoamentoEspecializacao>) resposta
				.stream().map(u -> (OrientacaoAperfeicoamentoEspecializacao) u).collect(Collectors.toList());
		return result;
	}

	public ArrayList<OrientacaoIniciacaoCientifica> OrientacaoIniciacaoCientificaAndamento()
			throws XPathExpressionException {
		ArrayList<OrientacaoAbstract> resposta = this.orientacaoXpath.BuscaOrientacaoAndamento(
				"//ORIENTACAO-EM-ANDAMENTO-DE-INICIACAO-CIENTIFICA", "OrientacaoIniciacaoCientifica");
		ArrayList<OrientacaoIniciacaoCientifica> result = (ArrayList<OrientacaoIniciacaoCientifica>) resposta.stream()
				.map(u -> (OrientacaoIniciacaoCientifica) u).collect(Collectors.toList());
		return result;
	}

}
