package br.com.datalattesAPI.Xpath;

import java.io.File;
import java.util.ArrayList;

import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import br.com.datalattesAPI.model.AtuacaoProfissional.ConselhoComissaoConsultoria;
import br.com.datalattesAPI.model.AtuacaoProfissional.DirecaoAdministracao;
import br.com.datalattesAPI.model.AtuacaoProfissional.Ensino;
import br.com.datalattesAPI.model.AtuacaoProfissional.EquipeProjeto;
import br.com.datalattesAPI.model.AtuacaoProfissional.Estagio;
import br.com.datalattesAPI.model.AtuacaoProfissional.ExtensaoUniversitaria;
import br.com.datalattesAPI.model.AtuacaoProfissional.FinanciadoresProjeto;
import br.com.datalattesAPI.model.AtuacaoProfissional.LinhaPesquisa;
import br.com.datalattesAPI.model.AtuacaoProfissional.Orientacoes;
import br.com.datalattesAPI.model.AtuacaoProfissional.ParticipacaoProjeto;
import br.com.datalattesAPI.model.AtuacaoProfissional.PesquisaDesenvolvimento;
import br.com.datalattesAPI.model.AtuacaoProfissional.Producoes;
import br.com.datalattesAPI.model.AtuacaoProfissional.ProjetoPesquisa;
import br.com.datalattesAPI.model.AtuacaoProfissional.ServicoTecnicoEspecializado;
import br.com.datalattesAPI.model.AtuacaoProfissional.TreinamentoMinistrado;
import br.com.datalattesAPI.model.AtuacaoProfissional.Vinculo;
import br.com.datalattesAPI.model.Geral.AreaConhecimento;
import br.com.datalattesAPI.model.Geral.PalavraChave;
import br.com.datalattesAPI.model.Geral.SetorAtividade;

public class AtuacaoProfissionalXpath extends AbstractXpath {

	public AtuacaoProfissionalXpath(File file) {
		super(file);
	}

	public ArrayList<Vinculo> BuscaVinculo() throws XPathExpressionException {
		XPathExpression expr = this.xpath.compile("//VINCULOS");
		NodeList listaResultaXpath = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		ArrayList<Vinculo> ListGraduacaoResult = new ArrayList<Vinculo>();
		for (int i = 0; i < listaResultaXpath.getLength(); i++) {
			Node TipoNode = listaResultaXpath.item(i);
			String anoInicio = TesteNullNo(TipoNode, "ANO-INICIO");
			String mesInicio = TesteNullNo(TipoNode, "MES-INICIO");
			String mesFim = TesteNullNo(TipoNode, "MES-FIM");
			String anoFim = TesteNullNo(TipoNode, "ANO-FIM");
			String tipoVinculo = TesteNullNo(TipoNode, "TIPO-DE-VINCULO");
			String enquadramentoFuncional = TesteNullNo(TipoNode, "ENQUADRAMENTO-FUNCIONAL");
			String flagDedicacaoExclusiva = TesteNullNo(TipoNode, "FLAG-DEDICACAO-EXCLUSIVA");
			String flagVinculoEmpregatico = TesteNullNo(TipoNode, "FLAG-VINCULO-EMPREGATICIO");
			Vinculo item = new Vinculo(mesInicio, anoInicio, mesFim, anoFim, tipoVinculo, enquadramentoFuncional,
					flagDedicacaoExclusiva, flagVinculoEmpregatico);
			ListGraduacaoResult.add(item);
		}
		return ListGraduacaoResult;
	}

	public ArrayList<DirecaoAdministracao> BuscaDirecaoAdministracao() throws XPathExpressionException {
		XPathExpression expr = this.xpath.compile("//DIRECAO-E-ADMINISTRACAO");
		NodeList listaResultaXpath = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		ArrayList<DirecaoAdministracao> ListGraduacaoResult = new ArrayList<DirecaoAdministracao>();
		for (int i = 0; i < listaResultaXpath.getLength(); i++) {
			Node TipoNode = listaResultaXpath.item(i);
			String anoInicio = TesteNullNo(TipoNode, "ANO-INICIO");
			String mesInicio = TesteNullNo(TipoNode, "MES-INICIO");
			String mesFim = TesteNullNo(TipoNode, "MES-FIM");
			String anoFim = TesteNullNo(TipoNode, "ANO-FIM");
			String flagPeriodo = TesteNullNo(TipoNode, "FLAG-PERIODO");
			String nomeOrgao = TesteNullNo(TipoNode, "NOME-ORGAO");
			String nomeUnidade = TesteNullNo(TipoNode, "NOME-UNIDADE");
			String formatoCargoFuncao = TesteNullNo(TipoNode, "FORMATO-CARGO-OU-FUNCAO");
			String cargoFuncao = TesteNullNo(TipoNode, "CARGO-OU-FUNCAO");
			DirecaoAdministracao item = new DirecaoAdministracao(mesInicio, anoInicio, mesFim, anoFim, flagPeriodo,
					nomeOrgao, nomeUnidade, formatoCargoFuncao, cargoFuncao);
			ListGraduacaoResult.add(item);
		}
		return ListGraduacaoResult;
	}

	public ArrayList<Estagio> BuscaEstagio() throws XPathExpressionException {
		XPathExpression expr = this.xpath.compile("//ESTAGIO");
		NodeList listaResultaXpath = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		ArrayList<Estagio> ListGraduacaoResult = new ArrayList<Estagio>();
		for (int i = 0; i < listaResultaXpath.getLength(); i++) {
			Node TipoNode = listaResultaXpath.item(i);
			String anoInicio = TesteNullNo(TipoNode, "ANO-INICIO");
			String mesInicio = TesteNullNo(TipoNode, "MES-INICIO");
			String mesFim = TesteNullNo(TipoNode, "MES-FIM");
			String anoFim = TesteNullNo(TipoNode, "ANO-FIM");
			String flagPeriodo = TesteNullNo(TipoNode, "FLAG-PERIODO");
			String nomeOrgao = TesteNullNo(TipoNode, "NOME-ORGAO");
			String nomeUnidade = TesteNullNo(TipoNode, "NOME-UNIDADE");
			String estagioRealizado = TesteNullNo(TipoNode, "ESTAGIO-REALIZADO");
			Estagio item = new Estagio(mesInicio, anoInicio, mesFim, anoFim, flagPeriodo, nomeOrgao, nomeUnidade,
					estagioRealizado);
			ListGraduacaoResult.add(item);
		}
		return ListGraduacaoResult;
	}

	public ArrayList<ServicoTecnicoEspecializado> BuscaServicoTecnicoEspecializado() throws XPathExpressionException {
		XPathExpression expr = this.xpath.compile("//SERVICO-TECNICO-ESPECIALIZADO");
		NodeList listaResultaXpath = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		ArrayList<ServicoTecnicoEspecializado> ListGraduacaoResult = new ArrayList<ServicoTecnicoEspecializado>();
		for (int i = 0; i < listaResultaXpath.getLength(); i++) {
			Node TipoNode = listaResultaXpath.item(i);
			String anoInicio = TesteNullNo(TipoNode, "ANO-INICIO");
			String mesInicio = TesteNullNo(TipoNode, "MES-INICIO");
			String mesFim = TesteNullNo(TipoNode, "MES-FIM");
			String anoFim = TesteNullNo(TipoNode, "ANO-FIM");
			String flagPeriodo = TesteNullNo(TipoNode, "FLAG-PERIODO");
			String nomeOrgao = TesteNullNo(TipoNode, "NOME-ORGAO");
			String nomeUnidade = TesteNullNo(TipoNode, "NOME-UNIDADE");
			String servicoRealizado = TesteNullNo(TipoNode, "SERVICO-REALIZADO");
			ServicoTecnicoEspecializado item = new ServicoTecnicoEspecializado(mesInicio, anoInicio, mesFim, anoFim,
					flagPeriodo, nomeOrgao, nomeUnidade, servicoRealizado);
			ListGraduacaoResult.add(item);
		}
		return ListGraduacaoResult;
	}

	public ArrayList<ExtensaoUniversitaria> BuscaExtensaoUniversitaria() throws XPathExpressionException {
		XPathExpression expr = this.xpath.compile("//EXTENSAO-UNIVERSITARIA");
		NodeList listaResultaXpath = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		ArrayList<ExtensaoUniversitaria> ListGraduacaoResult = new ArrayList<ExtensaoUniversitaria>();
		for (int i = 0; i < listaResultaXpath.getLength(); i++) {
			Node TipoNode = listaResultaXpath.item(i);
			String anoInicio = TesteNullNo(TipoNode, "ANO-INICIO");
			String mesInicio = TesteNullNo(TipoNode, "MES-INICIO");
			String mesFim = TesteNullNo(TipoNode, "MES-FIM");
			String anoFim = TesteNullNo(TipoNode, "ANO-FIM");
			String flagPeriodo = TesteNullNo(TipoNode, "FLAG-PERIODO");
			String nomeOrgao = TesteNullNo(TipoNode, "NOME-ORGAO");
			String nomeUnidade = TesteNullNo(TipoNode, "NOME-UNIDADE");
			String atividadeExtensao = TesteNullNo(TipoNode, "ATIVIDADE-DE-EXTENSAO-REALIZADA");
			ExtensaoUniversitaria item = new ExtensaoUniversitaria(mesInicio, anoInicio, mesFim, anoFim, flagPeriodo,
					nomeOrgao, nomeUnidade, atividadeExtensao);
			ListGraduacaoResult.add(item);
		}
		return ListGraduacaoResult;
	}

	public ArrayList<ConselhoComissaoConsultoria> BuscaConselhoComissaoConsultoria() throws XPathExpressionException {
		XPathExpression expr = this.xpath.compile("//CONSELHO-COMISSAO-E-CONSULTORIA");
		NodeList listaResultaXpath = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		ArrayList<ConselhoComissaoConsultoria> ListGraduacaoResult = new ArrayList<ConselhoComissaoConsultoria>();
		for (int i = 0; i < listaResultaXpath.getLength(); i++) {
			Node TipoNode = listaResultaXpath.item(i);
			String anoInicio = TesteNullNo(TipoNode, "ANO-INICIO");
			String mesInicio = TesteNullNo(TipoNode, "MES-INICIO");
			String mesFim = TesteNullNo(TipoNode, "MES-FIM");
			String anoFim = TesteNullNo(TipoNode, "ANO-FIM");
			String flagPeriodo = TesteNullNo(TipoNode, "FLAG-PERIODO");
			String nomeOrgao = TesteNullNo(TipoNode, "NOME-ORGAO");
			String nomeUnidade = TesteNullNo(TipoNode, "NOME-UNIDADE");
			String especificacao = TesteNullNo(TipoNode, "ESPECIFICACAO");
			ConselhoComissaoConsultoria item = new ConselhoComissaoConsultoria(mesInicio, anoInicio, mesFim, anoFim,
					flagPeriodo, nomeOrgao, nomeUnidade, especificacao);
			ListGraduacaoResult.add(item);
		}
		return ListGraduacaoResult;
	}

	public ArrayList<Ensino> BuscaEnsino() throws XPathExpressionException {
		XPathExpression expr = this.xpath.compile("//ENSINO");
		NodeList listaResultaXpath = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		ArrayList<Ensino> ListGraduacaoResult = new ArrayList<Ensino>();
		for (int i = 0; i < listaResultaXpath.getLength(); i++) {
			Node TipoNode = listaResultaXpath.item(i);
			String anoInicio = TesteNullNo(TipoNode, "ANO-INICIO");
			String mesInicio = TesteNullNo(TipoNode, "MES-INICIO");
			String mesFim = TesteNullNo(TipoNode, "MES-FIM");
			String anoFim = TesteNullNo(TipoNode, "ANO-FIM");
			String flagPeriodo = TesteNullNo(TipoNode, "FLAG-PERIODO");
			String nomeOrgao = TesteNullNo(TipoNode, "NOME-ORGAO");
			String nomeCurso = TesteNullNo(TipoNode, "NOME-CURSO");
			Ensino item = new Ensino(mesInicio, anoInicio, mesFim, anoFim, flagPeriodo, nomeOrgao, nomeCurso);
			ListGraduacaoResult.add(item);
		}
		return ListGraduacaoResult;
	}

	public ArrayList<TreinamentoMinistrado> BuscaTreinamentoMinistrado() throws XPathExpressionException {
		XPathExpression expr = this.xpath.compile("//TREINAMENTO-MINISTRADO");
		NodeList listaResultaXpath = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		ArrayList<TreinamentoMinistrado> ListGraduacaoResult = new ArrayList<TreinamentoMinistrado>();
		for (int i = 0; i < listaResultaXpath.getLength(); i++) {
			Node TipoNode = listaResultaXpath.item(i);
			String anoInicio = TesteNullNo(TipoNode, "ANO-INICIO");
			String mesInicio = TesteNullNo(TipoNode, "MES-INICIO");
			String mesFim = TesteNullNo(TipoNode, "MES-FIM");
			String anoFim = TesteNullNo(TipoNode, "ANO-FIM");
			String flagPeriodo = TesteNullNo(TipoNode, "FLAG-PERIODO");
			String nomeOrgao = TesteNullNo(TipoNode, "NOME-ORGAO");
			String nomeUnidade = TesteNullNo(TipoNode, "NOME-UNIDADE");
			TreinamentoMinistrado item = new TreinamentoMinistrado(mesInicio, anoInicio, mesFim, anoFim, flagPeriodo,
					nomeOrgao, nomeUnidade);
			ListGraduacaoResult.add(item);
		}
		return ListGraduacaoResult;
	}

	public ArrayList<PesquisaDesenvolvimento> BuscaPesquisaDesenvolvimento() throws XPathExpressionException {
		XPathExpression expr = this.xpath.compile("//PESQUISA-E-DESENVOLVIMENTO");
		NodeList listaResultaXpath = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		ArrayList<PesquisaDesenvolvimento> ListaResultadoBusca = new ArrayList<PesquisaDesenvolvimento>();
		for (int i = 0; i < listaResultaXpath.getLength(); i++) {
			Node TipoNode = listaResultaXpath.item(i);
			String anoInicio = TesteNullNo(TipoNode, "ANO-INICIO");
			String mesInicio = TesteNullNo(TipoNode, "MES-INICIO");
			String mesFim = TesteNullNo(TipoNode, "MES-FIM");
			String anoFim = TesteNullNo(TipoNode, "ANO-FIM");
			String flagPeriodo = TesteNullNo(TipoNode, "FLAG-PERIODO");
			String nomeOrgao = TesteNullNo(TipoNode, "NOME-ORGAO");
			String nomeUnidade = TesteNullNo(TipoNode, "NOME-UNIDADE");

			ArrayList<LinhaPesquisa> linhaPesquisa = new ArrayList<LinhaPesquisa>();

			NodeList ListSubItens = TipoNode.getChildNodes();
			for (int j = 0; j < ListSubItens.getLength(); j++) {
				Node subItens = ListSubItens.item(j);
				String tituloLinhaPesquisa = TesteNullNo(subItens, "TITULO-DA-LINHA-DE-PESQUISA");
				String flagLinhaPesquisaAtiva = TesteNullNo(subItens, "FLAG-LINHA-DE-PESQUISA-ATIVA");
				String objetivoLinhaPesquisa = TesteNullNo(subItens, "OBJETIVOS-LINHA-DE-PESQUISA");
				String tituloLinhaPesquisaEN = TesteNullNo(subItens, "TITULO-DA-LINHA-DE-PESQUISA-INGLES");
				String objetivoLinhaPesquisaEN = TesteNullNo(subItens, "OBJETIVOS-LINHA-DE-PESQUISA-INGLES");

				NodeList ListSubItensSub = subItens.getChildNodes();
				PalavraChave palavraChave = null;
				SetorAtividade setorAtividade = null;
				AreaConhecimento areaConhecimento = null;
				for (int k = 0; k < ListSubItensSub.getLength(); k++) {
					Node subItenssub = ListSubItensSub.item(k);
					if (subItenssub.getNodeName().contentEquals("PALAVRAS-CHAVE")) {
						palavraChave = BuscaPalavraChave(subItenssub);
					}
					if (subItenssub.getNodeName().contentEquals("AREAS-DO-CONHECIMENTO")) {
						areaConhecimento = BuscaAreaConhecimento(subItenssub);
					}
					if (subItenssub.getNodeName().contentEquals("SETORES-DE-ATIVIDADE")) {
						setorAtividade = BuscaSetorAtividade(subItenssub);
					}
				}

				LinhaPesquisa linhaPesquisaitem = new LinhaPesquisa(tituloLinhaPesquisa, flagLinhaPesquisaAtiva,
						objetivoLinhaPesquisa, tituloLinhaPesquisaEN, objetivoLinhaPesquisaEN, palavraChave,
						setorAtividade, areaConhecimento);
				linhaPesquisa.add(linhaPesquisaitem);
			}
			PesquisaDesenvolvimento item = new PesquisaDesenvolvimento(mesInicio, anoInicio, mesFim, anoFim,
					flagPeriodo, nomeOrgao, nomeUnidade, linhaPesquisa);
			ListaResultadoBusca.add(item);
		}
		return ListaResultadoBusca;
	}

	public ArrayList<ParticipacaoProjeto> BuscaParticipacaoProjeto() throws XPathExpressionException {
		XPathExpression expr = this.xpath.compile("//PARTICIPACAO-EM-PROJETO");
		NodeList listaResultaXpath = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		ArrayList<ParticipacaoProjeto> ListaResultadoBusca = new ArrayList<ParticipacaoProjeto>();
		for (int i = 0; i < listaResultaXpath.getLength(); i++) {
			Node TipoNode = listaResultaXpath.item(i);
			String anoInicio = TesteNullNo(TipoNode, "ANO-INICIO");
			String mesInicio = TesteNullNo(TipoNode, "MES-INICIO");
			String mesFim = TesteNullNo(TipoNode, "MES-FIM");
			String anoFim = TesteNullNo(TipoNode, "ANO-FIM");
			String flagPeriodo = TesteNullNo(TipoNode, "FLAG-PERIODO");
			String nomeOrgao = TesteNullNo(TipoNode, "NOME-ORGAO");
			String nomeUnidade = TesteNullNo(TipoNode, "NOME-UNIDADE");

			ArrayList<ProjetoPesquisa> projetoPesquisa = new ArrayList<ProjetoPesquisa>();

			NodeList ListSubItens = TipoNode.getChildNodes();
			for (int j = 0; j < ListSubItens.getLength(); j++) {
				Node subItens = ListSubItens.item(j);
				String anoInicio2 = TesteNullNo(subItens, "ANO-INICIO");
				String anoFim2 = TesteNullNo(subItens, "ANO-FIM");
				String situacao = TesteNullNo(subItens, "SITUACAO");
				String nomeProjeto = TesteNullNo(subItens, "NOME-DO-PROJETO");
				String natureza = TesteNullNo(subItens, "NATUREZA");
				String numeroGraducao = TesteNullNo(subItens, "NUMERO-GRADUACAO");
				String numeroMestradoAcademico = TesteNullNo(subItens, "NUMERO-MESTRADO-ACADEMICO");
				String numeroMestradoProf = TesteNullNo(subItens, "NUMERO-MESTRADO-PROF");
				String numeroDoutorado = TesteNullNo(subItens, "NUMERO-DOUTORADO");
				String descricaoProjeto = TesteNullNo(subItens, "DESCRICAO-DO-PROJETO");
				String idProjeto = TesteNullNo(subItens, "IDENTIFICADOR-PROJETO");
				String nomeCoordenador = TesteNullNo(subItens, "NOME-COORDENADOR-CERTIFICACAO");
				String dataCertificacao = TesteNullNo(subItens, "DATA-CERTIFICACAO");
				String numeroTecnicoNivelMedio = TesteNullNo(subItens, "NUMERO_TECNICO_NIVEL_MEDIO");

				NodeList ListSubItensSub = subItens.getChildNodes();
				ArrayList<Orientacoes> orientacoes = new ArrayList<Orientacoes>();
				ArrayList<EquipeProjeto> equipeProjeto = new ArrayList<EquipeProjeto>();
				ArrayList<FinanciadoresProjeto> financiadoresProjeto = new ArrayList<FinanciadoresProjeto>();
				ArrayList<Producoes> producoes = new ArrayList<Producoes>();
				for (int k = 0; k < ListSubItensSub.getLength(); k++) {
					Node subItenssub = ListSubItensSub.item(k);
					if (subItenssub.getNodeName().contentEquals("EQUIPE-DO-PROJETO")) {
						equipeProjeto.add(BuscaEquipeProjeto(subItenssub));
					}
					if (subItenssub.getNodeName().contentEquals("FINANCIADORES-DO-PROJETO")) {
						financiadoresProjeto.add(BuscaFinanciadoresProjeto(subItenssub));
					}
					if (subItenssub.getNodeName().contentEquals("PRODUCOES-CT-DO-PROJETO")) {
						producoes.add(BuscaProducoes(subItenssub));
					}
					if (subItenssub.getNodeName().contentEquals("ORIENTACOES")) {
						orientacoes.add(BuscaOrientacoes(subItenssub));
					}
				}
				ProjetoPesquisa projetoPesquisaitem = new ProjetoPesquisa(anoInicio2, anoFim2, nomeProjeto, situacao,
						natureza, numeroGraducao, numeroMestradoAcademico, numeroMestradoProf, numeroDoutorado,
						descricaoProjeto, idProjeto, nomeCoordenador, dataCertificacao, numeroTecnicoNivelMedio,
						equipeProjeto, financiadoresProjeto, producoes, orientacoes);
				projetoPesquisa.add(projetoPesquisaitem);
			}
			ParticipacaoProjeto item = new ParticipacaoProjeto(mesInicio, anoInicio, mesFim, anoFim, flagPeriodo,
					nomeOrgao, nomeUnidade, projetoPesquisa);
			ListaResultadoBusca.add(item);
		}
		return ListaResultadoBusca;
	}

}
