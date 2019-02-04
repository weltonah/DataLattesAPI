package br.com.datalattesAPI.Xpath;

import java.io.File;
import java.util.ArrayList;

import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import br.com.datalattesAPI.model.Geral.AreaConhecimento;
import br.com.datalattesAPI.model.Geral.PalavraChave;
import br.com.datalattesAPI.model.Geral.SetorAtividade;
import br.com.datalattesAPI.model.Producao.Autor;
import br.com.datalattesAPI.model.Producao.Autores;
import br.com.datalattesAPI.model.ProducaoTecnica.ApresentacaoDeTrabalho;
import br.com.datalattesAPI.model.ProducaoTecnica.CartaMapaOuSimilar;
import br.com.datalattesAPI.model.ProducaoTecnica.CultivarProtegida;
import br.com.datalattesAPI.model.ProducaoTecnica.CultivarRegistrada;
import br.com.datalattesAPI.model.ProducaoTecnica.CursoDeCurtaDuracaoMinistrado;
import br.com.datalattesAPI.model.ProducaoTecnica.DesenhoIndustrial;
import br.com.datalattesAPI.model.ProducaoTecnica.DesenvolvimentoDeMaterialDidaticoOuInstrucional;
import br.com.datalattesAPI.model.ProducaoTecnica.Editoracao;
import br.com.datalattesAPI.model.ProducaoTecnica.ManutencaoDeObraArtistica;
import br.com.datalattesAPI.model.ProducaoTecnica.Maquete;
import br.com.datalattesAPI.model.ProducaoTecnica.Marca;
import br.com.datalattesAPI.model.ProducaoTecnica.MidiaSocialWebsiteBlog;
import br.com.datalattesAPI.model.ProducaoTecnica.OrganizacaoDeEvento;
import br.com.datalattesAPI.model.ProducaoTecnica.Patente;
import br.com.datalattesAPI.model.ProducaoTecnica.ProcessosOuTecnicas;
import br.com.datalattesAPI.model.ProducaoTecnica.ProdutoTecnologico;
import br.com.datalattesAPI.model.ProducaoTecnica.ProgramaDeRadioOuTv;
import br.com.datalattesAPI.model.ProducaoTecnica.RelatorioDePesquisa;
import br.com.datalattesAPI.model.ProducaoTecnica.Software;
import br.com.datalattesAPI.model.ProducaoTecnica.TopografiaDeCircuitoIntegrado;
import br.com.datalattesAPI.model.ProducaoTecnica.TrabalhoTecnico;

public class ProducaoTecnicaXpath extends AbstractXpath {

	public ProducaoTecnicaXpath(File file) {
		super(file);
	}

	public ArrayList<CultivarRegistrada> BuscaCultivarRegistrada() throws XPathExpressionException {
		XPathExpression expr = this.xpath.compile("//CULTIVAR-REGISTRADA");
		NodeList listaBuscada = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		ArrayList<CultivarRegistrada> ListaResultadoBusca = new ArrayList<CultivarRegistrada>();
		for (int i = 0; i < listaBuscada.getLength(); i++) {
			Node TipoNode = listaBuscada.item(i);

			String denominacao = TesteFilhoNo(0, TipoNode, "DENOMINACAO");
			String anoSolicitacao = TesteFilhoNo(0, TipoNode, "ANO-SOLICITACAO");
			String pais = TesteFilhoNo(0, TipoNode, "PAIS");
			String flagRelevancia = TesteFilhoNo(0, TipoNode, "FLAG-RELEVANCIA");
			String denominacaoIngles = TesteFilhoNo(0, TipoNode, "DENOMINACAO-INGLES");
			String flagPotencialInovacao = TesteFilhoNo(0, TipoNode, "FLAG-POTENCIAL-INOVACAO");
			String finalidade = TesteFilhoNo(1, TipoNode, "FINALIDADE");
			String instituicaoFinanciadora = TesteFilhoNo(1, TipoNode, "INSTITUICAO-FINANCIADORA");
			String finalidadeIngles = TesteFilhoNo(1, TipoNode, "FINALIDADE-INGLES");
			NodeList ListSubItens = TipoNode.getChildNodes();
			ArrayList<Autor> autorlista = new ArrayList<Autor>();
			PalavraChave palavraChave = null;
			SetorAtividade setorAtividade = null;
			AreaConhecimento areaConhecimento = null;
			buscarDadosAdicionaisProducaoBibliografica(autorlista, palavraChave, setorAtividade, areaConhecimento,
					ListSubItens);
			Autores autores = new Autores(autorlista);

			CultivarRegistrada itemResultado = new CultivarRegistrada(autores, palavraChave, setorAtividade,
					areaConhecimento, denominacao, anoSolicitacao, pais, flagRelevancia, denominacaoIngles,
					flagPotencialInovacao, finalidade, instituicaoFinanciadora, finalidadeIngles);
			ListaResultadoBusca.add(itemResultado);
		}
		return ListaResultadoBusca;
	}

	public ArrayList<Software> BuscaSoftware() throws XPathExpressionException {
		XPathExpression expr = this.xpath.compile("//SOFTWARE");
		NodeList listaBuscada = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		ArrayList<Software> ListaResultadoBusca = new ArrayList<Software>();
		for (int i = 0; i < listaBuscada.getLength(); i++) {
			Node TipoNode = listaBuscada.item(i);

			String natureza = TesteFilhoNo(0, TipoNode, "NATUREZA");
			String tituloDoSoftware = TesteFilhoNo(0, TipoNode, "TITULO-DO-SOFTWARE");
			String ano = TesteFilhoNo(0, TipoNode, "ANO");
			String pais = TesteFilhoNo(0, TipoNode, "PAIS");
			String idioma = TesteFilhoNo(0, TipoNode, "IDIOMA");
			String meioDeDivulgacao = TesteFilhoNo(0, TipoNode, "MEIO-DE-DIVULGACAO");
			String homePageDoTrabalho = TesteFilhoNo(0, TipoNode, "HOME-PAGE-DO-TRABALHO");
			String flagRelevancia = TesteFilhoNo(0, TipoNode, "FLAG-RELEVANCIA");
			String doi = TesteFilhoNo(0, TipoNode, "DOI");
			String tituloDoSoftwareIngles = TesteFilhoNo(0, TipoNode, "TITULO-DO-SOFTWARE-INGLES");
			String flagDivulgacaoCientifica = TesteFilhoNo(0, TipoNode, "FLAG-DIVULGACAO-CIENTIFICA");
			String flagPotencialInovacao = TesteFilhoNo(0, TipoNode, "FLAG-POTENCIAL-INOVACAO");
			String finalidade = TesteFilhoNo(1, TipoNode, "FINALIDADE");
			String plataforma = TesteFilhoNo(1, TipoNode, "PLATAFORMA");
			String ambiente = TesteFilhoNo(1, TipoNode, "AMBIENTE");
			String disponibilidade = TesteFilhoNo(1, TipoNode, "DISPONIBILIDADE");
			String instituicaoFinanciadora = TesteFilhoNo(1, TipoNode, "INSTITUICAO-FINANCIADORA");
			String finalidadeIngles = TesteFilhoNo(1, TipoNode, "FINALIDADE-INGLES");
			NodeList ListSubItens = TipoNode.getChildNodes();
			ArrayList<Autor> autorlista = new ArrayList<Autor>();
			PalavraChave palavraChave = null;
			SetorAtividade setorAtividade = null;
			AreaConhecimento areaConhecimento = null;
			buscarDadosAdicionaisProducaoBibliografica(autorlista, palavraChave, setorAtividade, areaConhecimento,
					ListSubItens);
			Autores autores = new Autores(autorlista);

			Software itemResultado = new Software(autores, palavraChave, setorAtividade, areaConhecimento, natureza,
					tituloDoSoftware, ano, pais, idioma, meioDeDivulgacao, homePageDoTrabalho, flagRelevancia, doi,
					tituloDoSoftwareIngles, flagDivulgacaoCientifica, flagPotencialInovacao, finalidade, plataforma,
					ambiente, disponibilidade, instituicaoFinanciadora, finalidadeIngles);
			ListaResultadoBusca.add(itemResultado);
		}
		return ListaResultadoBusca;
	}

	public ArrayList<Patente> BuscaPatente() throws XPathExpressionException {
		XPathExpression expr = this.xpath.compile("//PATENTE");
		NodeList listaBuscada = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		ArrayList<Patente> ListaResultadoBusca = new ArrayList<Patente>();
		for (int i = 0; i < listaBuscada.getLength(); i++) {
			Node TipoNode = listaBuscada.item(i);

			String titulo = TesteFilhoNo(0, TipoNode, "TITULO");
			String anoDesenvolvimento = TesteFilhoNo(0, TipoNode, "ANO-DESENVOLVIMENTO");
			String pais = TesteFilhoNo(0, TipoNode, "PAIS");
			String homePage = TesteFilhoNo(0, TipoNode, "HOME-PAGE");
			String meioDeDivulgacao = TesteFilhoNo(0, TipoNode, "MEIO-DE-DIVULGACAO");
			String flagRelevancia = TesteFilhoNo(0, TipoNode, "FLAG-RELEVANCIA");
			String tituloIngles = TesteFilhoNo(0, TipoNode, "TITULO-INGLES");
			String flagPotencialInovacao = TesteFilhoNo(0, TipoNode, "FLAG-POTENCIAL-INOVACAO");
			String finalidade = TesteFilhoNo(1, TipoNode, "FINALIDADE");
			String instituicaoFinanciadora = TesteFilhoNo(1, TipoNode, "INSTITUICAO-FINANCIADORA");
			String finalidadeIngles = TesteFilhoNo(1, TipoNode, "FINALIDADE-INGLES");
			String categoria = TesteFilhoNo(1, TipoNode, "CATEGORIA");
			NodeList ListSubItens = TipoNode.getChildNodes();
			ArrayList<Autor> autorlista = new ArrayList<Autor>();
			PalavraChave palavraChave = null;
			SetorAtividade setorAtividade = null;
			AreaConhecimento areaConhecimento = null;
			buscarDadosAdicionaisProducaoBibliografica(autorlista, palavraChave, setorAtividade, areaConhecimento,
					ListSubItens);
			Autores autores = new Autores(autorlista);

			Patente itemResultado = new Patente(autores, palavraChave, setorAtividade, areaConhecimento, titulo,
					anoDesenvolvimento, pais, homePage, meioDeDivulgacao, flagRelevancia, tituloIngles,
					flagPotencialInovacao, finalidade, instituicaoFinanciadora, finalidadeIngles, categoria);
			ListaResultadoBusca.add(itemResultado);
		}
		return ListaResultadoBusca;
	}

	public ArrayList<CultivarProtegida> BuscaCultivarProtegida() throws XPathExpressionException {
		XPathExpression expr = this.xpath.compile("//CULTIVAR-PROTEGIDA");
		NodeList listaBuscada = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		ArrayList<CultivarProtegida> ListaResultadoBusca = new ArrayList<CultivarProtegida>();
		for (int i = 0; i < listaBuscada.getLength(); i++) {
			Node TipoNode = listaBuscada.item(i);

			String denominacao = TesteFilhoNo(0, TipoNode, "DENOMINACAO");
			String anoSolicitacao = TesteFilhoNo(0, TipoNode, "ANO-SOLICITACAO");
			String pais = TesteFilhoNo(0, TipoNode, "PAIS");
			String flagRelevancia = TesteFilhoNo(0, TipoNode, "FLAG-RELEVANCIA");
			String denominacaoIngles = TesteFilhoNo(0, TipoNode, "DENOMINACAO-INGLES");
			String flagPotencialInovacao = TesteFilhoNo(0, TipoNode, "FLAG-POTENCIAL-INOVACAO");
			String finalidade = TesteFilhoNo(1, TipoNode, "FINALIDADE");
			String instituicaoFinanciadora = TesteFilhoNo(1, TipoNode, "INSTITUICAO-FINANCIADORA");
			String finalidadeIngles = TesteFilhoNo(1, TipoNode, "FINALIDADE-INGLES");
			NodeList ListSubItens = TipoNode.getChildNodes();
			ArrayList<Autor> autorlista = new ArrayList<Autor>();
			PalavraChave palavraChave = null;
			SetorAtividade setorAtividade = null;
			AreaConhecimento areaConhecimento = null;
			buscarDadosAdicionaisProducaoBibliografica(autorlista, palavraChave, setorAtividade, areaConhecimento,
					ListSubItens);
			Autores autores = new Autores(autorlista);

			CultivarProtegida itemResultado = new CultivarProtegida(autores, palavraChave, setorAtividade,
					areaConhecimento, denominacao, anoSolicitacao, pais, flagRelevancia, denominacaoIngles,
					flagPotencialInovacao, finalidade, instituicaoFinanciadora, finalidadeIngles);
			ListaResultadoBusca.add(itemResultado);
		}
		return ListaResultadoBusca;
	}

	public ArrayList<DesenhoIndustrial> BuscaDesenhoIndustrial() throws XPathExpressionException {
		XPathExpression expr = this.xpath.compile("//DESENHO-INDUSTRIAL");
		NodeList listaBuscada = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		ArrayList<DesenhoIndustrial> ListaResultadoBusca = new ArrayList<DesenhoIndustrial>();
		for (int i = 0; i < listaBuscada.getLength(); i++) {
			Node TipoNode = listaBuscada.item(i);

			String titulo = TesteFilhoNo(0, TipoNode, "TITULO");
			String anoDesenvolvimento = TesteFilhoNo(0, TipoNode, "ANO-DESENVOLVIMENTO");
			String pais = TesteFilhoNo(0, TipoNode, "PAIS");
			String flagRelevancia = TesteFilhoNo(0, TipoNode, "FLAG-RELEVANCIA");
			String tituloIngles = TesteFilhoNo(0, TipoNode, "TITULO-INGLES");
			String flagPotencialInovacao = TesteFilhoNo(0, TipoNode, "FLAG-POTENCIAL-INOVACAO");
			String finalidade = TesteFilhoNo(1, TipoNode, "FINALIDADE");
			String instituicaoFinanciadora = TesteFilhoNo(1, TipoNode, "INSTITUICAO-FINANCIADORA");
			String finalidadeIngles = TesteFilhoNo(1, TipoNode, "FINALIDADE-INGLES");
			NodeList ListSubItens = TipoNode.getChildNodes();
			ArrayList<Autor> autorlista = new ArrayList<Autor>();
			PalavraChave palavraChave = null;
			SetorAtividade setorAtividade = null;
			AreaConhecimento areaConhecimento = null;
			buscarDadosAdicionaisProducaoBibliografica(autorlista, palavraChave, setorAtividade, areaConhecimento,
					ListSubItens);
			Autores autores = new Autores(autorlista);

			DesenhoIndustrial itemResultado = new DesenhoIndustrial(autores, palavraChave, setorAtividade,
					areaConhecimento, titulo, anoDesenvolvimento, pais, flagRelevancia, tituloIngles,
					flagPotencialInovacao, finalidade, instituicaoFinanciadora, finalidadeIngles);
			ListaResultadoBusca.add(itemResultado);
		}
		return ListaResultadoBusca;
	}

	public ArrayList<Marca> BuscaMarca() throws XPathExpressionException {
		XPathExpression expr = this.xpath.compile("//MARCA");
		NodeList listaBuscada = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		ArrayList<Marca> ListaResultadoBusca = new ArrayList<Marca>();
		for (int i = 0; i < listaBuscada.getLength(); i++) {
			Node TipoNode = listaBuscada.item(i);

			String titulo = TesteFilhoNo(0, TipoNode, "TITULO");
			String anoDesenvolvimento = TesteFilhoNo(0, TipoNode, "ANO-DESENVOLVIMENTO");
			String pais = TesteFilhoNo(0, TipoNode, "PAIS");
			String flagRelevancia = TesteFilhoNo(0, TipoNode, "FLAG-RELEVANCIA");
			String tituloIngles = TesteFilhoNo(0, TipoNode, "TITULO-INGLES");
			String flagPotencialInovacao = TesteFilhoNo(0, TipoNode, "FLAG-POTENCIAL-INOVACAO");
			String finalidade = TesteFilhoNo(1, TipoNode, "FINALIDADE");
			String finalidadeIngles = TesteFilhoNo(1, TipoNode, "FINALIDADE-INGLES");
			String natureza = TesteFilhoNo(1, TipoNode, "NATUREZA");
			NodeList ListSubItens = TipoNode.getChildNodes();
			ArrayList<Autor> autorlista = new ArrayList<Autor>();
			PalavraChave palavraChave = null;
			SetorAtividade setorAtividade = null;
			AreaConhecimento areaConhecimento = null;
			buscarDadosAdicionaisProducaoBibliografica(autorlista, palavraChave, setorAtividade, areaConhecimento,
					ListSubItens);
			Autores autores = new Autores(autorlista);

			Marca itemResultado = new Marca(autores, palavraChave, setorAtividade, areaConhecimento, titulo,
					anoDesenvolvimento, pais, flagRelevancia, tituloIngles, flagPotencialInovacao, finalidade,
					finalidadeIngles, natureza);
			ListaResultadoBusca.add(itemResultado);
		}
		return ListaResultadoBusca;
	}

	public ArrayList<TopografiaDeCircuitoIntegrado> BuscaTopografiaDeCircuitoIntegrado()
			throws XPathExpressionException {
		XPathExpression expr = this.xpath.compile("//TOPOGRAFIA-DE-CIRCUITO-INTEGRADO");
		NodeList listaBuscada = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		ArrayList<TopografiaDeCircuitoIntegrado> ListaResultadoBusca = new ArrayList<TopografiaDeCircuitoIntegrado>();
		for (int i = 0; i < listaBuscada.getLength(); i++) {
			Node TipoNode = listaBuscada.item(i);

			String titulo = TesteFilhoNo(0, TipoNode, "TITULO");
			String anoDesenvolvimento = TesteFilhoNo(0, TipoNode, "ANO-DESENVOLVIMENTO");
			String pais = TesteFilhoNo(0, TipoNode, "PAIS");
			String flagRelevancia = TesteFilhoNo(0, TipoNode, "FLAG-RELEVANCIA");
			String tituloIngles = TesteFilhoNo(0, TipoNode, "TITULO-INGLES");
			String flagPotencialInovacao = TesteFilhoNo(0, TipoNode, "FLAG-POTENCIAL-INOVACAO");
			String finalidade = TesteFilhoNo(1, TipoNode, "FINALIDADE");
			String instituicaoFinanciadora = TesteFilhoNo(1, TipoNode, "INSTITUICAO-FINANCIADORA");
			String finalidadeIngles = TesteFilhoNo(1, TipoNode, "FINALIDADE-INGLES");
			NodeList ListSubItens = TipoNode.getChildNodes();
			ArrayList<Autor> autorlista = new ArrayList<Autor>();
			PalavraChave palavraChave = null;
			SetorAtividade setorAtividade = null;
			AreaConhecimento areaConhecimento = null;
			buscarDadosAdicionaisProducaoBibliografica(autorlista, palavraChave, setorAtividade, areaConhecimento,
					ListSubItens);
			Autores autores = new Autores(autorlista);

			TopografiaDeCircuitoIntegrado itemResultado = new TopografiaDeCircuitoIntegrado(autores, palavraChave,
					setorAtividade, areaConhecimento, titulo, anoDesenvolvimento, pais, flagRelevancia, tituloIngles,
					flagPotencialInovacao, finalidade, instituicaoFinanciadora, finalidadeIngles);
			ListaResultadoBusca.add(itemResultado);
		}
		return ListaResultadoBusca;
	}

	public ArrayList<ProdutoTecnologico> BuscaProdutoTecnologico() throws XPathExpressionException {
		XPathExpression expr = this.xpath.compile("//PRODUTO-TECNOLOGICO");
		NodeList listaBuscada = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		ArrayList<ProdutoTecnologico> ListaResultadoBusca = new ArrayList<ProdutoTecnologico>();
		for (int i = 0; i < listaBuscada.getLength(); i++) {
			Node TipoNode = listaBuscada.item(i);

			String tipoProduto = TesteFilhoNo(0, TipoNode, "TIPO-PRODUTO");
			String natureza = TesteFilhoNo(0, TipoNode, "NATUREZA");
			String tituloDoProduto = TesteFilhoNo(0, TipoNode, "TITULO-DO-PRODUTO");
			String ano = TesteFilhoNo(0, TipoNode, "ANO");
			String pais = TesteFilhoNo(0, TipoNode, "PAIS");
			String idioma = TesteFilhoNo(0, TipoNode, "IDIOMA");
			String meioDeDivulgacao = TesteFilhoNo(0, TipoNode, "MEIO-DE-DIVULGACAO");
			String homePageDoTrabalho = TesteFilhoNo(0, TipoNode, "HOME-PAGE-DO-TRABALHO");
			String flagRelevancia = TesteFilhoNo(0, TipoNode, "FLAG-RELEVANCIA");
			String doi = TesteFilhoNo(0, TipoNode, "DOI");
			String tituloDoProdutoIngles = TesteFilhoNo(0, TipoNode, "TITULO-DO-PRODUTO-INGLES");
			String flagPotencialInovacao = TesteFilhoNo(0, TipoNode, "FLAG-POTENCIAL-INOVACAO");
			String finalidade = TesteFilhoNo(1, TipoNode, "FINALIDADE");
			String disponibilidade = TesteFilhoNo(1, TipoNode, "DISPONIBILIDADE");
			String cidadeDoProduto = TesteFilhoNo(1, TipoNode, "CIDADE-DO-PRODUTO");
			String instituicaoFinanciadora = TesteFilhoNo(1, TipoNode, "INSTITUICAO-FINANCIADORA");
			String finalidadeIngles = TesteFilhoNo(1, TipoNode, "FINALIDADE-INGLES");
			NodeList ListSubItens = TipoNode.getChildNodes();
			ArrayList<Autor> autorlista = new ArrayList<Autor>();
			PalavraChave palavraChave = null;
			SetorAtividade setorAtividade = null;
			AreaConhecimento areaConhecimento = null;
			buscarDadosAdicionaisProducaoBibliografica(autorlista, palavraChave, setorAtividade, areaConhecimento,
					ListSubItens);
			Autores autores = new Autores(autorlista);

			ProdutoTecnologico itemResultado = new ProdutoTecnologico(autores, palavraChave, setorAtividade,
					areaConhecimento, tipoProduto, natureza, tituloDoProduto, ano, pais, idioma, meioDeDivulgacao,
					homePageDoTrabalho, flagRelevancia, doi, tituloDoProdutoIngles, flagPotencialInovacao, finalidade,
					disponibilidade, cidadeDoProduto, instituicaoFinanciadora, finalidadeIngles);
			ListaResultadoBusca.add(itemResultado);
		}
		return ListaResultadoBusca;
	}

	public ArrayList<ProcessosOuTecnicas> BuscaProcessosOuTecnicas() throws XPathExpressionException {
		XPathExpression expr = this.xpath.compile("//PROCESSOS-OU-TECNICAS");
		NodeList listaBuscada = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		ArrayList<ProcessosOuTecnicas> ListaResultadoBusca = new ArrayList<ProcessosOuTecnicas>();
		for (int i = 0; i < listaBuscada.getLength(); i++) {
			Node TipoNode = listaBuscada.item(i);

			String natureza = TesteFilhoNo(0, TipoNode, "NATUREZA");
			String tituloDoProcesso = TesteFilhoNo(0, TipoNode, "TITULO-DO-PROCESSO");
			String ano = TesteFilhoNo(0, TipoNode, "ANO");
			String pais = TesteFilhoNo(0, TipoNode, "PAIS");
			String idioma = TesteFilhoNo(0, TipoNode, "IDIOMA");
			String meioDeDivulgacao = TesteFilhoNo(0, TipoNode, "MEIO-DE-DIVULGACAO");
			String homePageDoTrabalho = TesteFilhoNo(0, TipoNode, "HOME-PAGE-DO-TRABALHO");
			String flagRelevancia = TesteFilhoNo(0, TipoNode, "FLAG-RELEVANCIA");
			String doi = TesteFilhoNo(0, TipoNode, "DOI");
			String tituloDoProcessoIngles = TesteFilhoNo(0, TipoNode, "TITULO-DO-PROCESSO-INGLES");
			String flagPotencialInovacao = TesteFilhoNo(0, TipoNode, "FLAG-POTENCIAL-INOVACAO");
			String finalidade = TesteFilhoNo(1, TipoNode, "FINALIDADE");
			String disponibilidade = TesteFilhoNo(1, TipoNode, "DISPONIBILIDADE");
			String instituicaoFinanciadora = TesteFilhoNo(1, TipoNode, "INSTITUICAO-FINANCIADORA");
			String cidadeDoProcesso = TesteFilhoNo(1, TipoNode, "CIDADE-DO-PROCESSO");
			String finalidadeIngles = TesteFilhoNo(1, TipoNode, "FINALIDADE-INGLES");
			NodeList ListSubItens = TipoNode.getChildNodes();
			ArrayList<Autor> autorlista = new ArrayList<Autor>();
			PalavraChave palavraChave = null;
			SetorAtividade setorAtividade = null;
			AreaConhecimento areaConhecimento = null;
			buscarDadosAdicionaisProducaoBibliografica(autorlista, palavraChave, setorAtividade, areaConhecimento,
					ListSubItens);
			Autores autores = new Autores(autorlista);

			ProcessosOuTecnicas itemResultado = new ProcessosOuTecnicas(autores, palavraChave, setorAtividade,
					areaConhecimento, natureza, tituloDoProcesso, ano, pais, idioma, meioDeDivulgacao,
					homePageDoTrabalho, flagRelevancia, doi, tituloDoProcessoIngles, flagPotencialInovacao, finalidade,
					disponibilidade, instituicaoFinanciadora, cidadeDoProcesso, finalidadeIngles);
			ListaResultadoBusca.add(itemResultado);
		}
		return ListaResultadoBusca;
	}

	public ArrayList<TrabalhoTecnico> BuscaTrabalhoTecnico() throws XPathExpressionException {
		XPathExpression expr = this.xpath.compile("//TRABALHO-TECNICO");
		NodeList listaBuscada = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		ArrayList<TrabalhoTecnico> ListaResultadoBusca = new ArrayList<TrabalhoTecnico>();
		for (int i = 0; i < listaBuscada.getLength(); i++) {
			Node TipoNode = listaBuscada.item(i);

			String natureza = TesteFilhoNo(0, TipoNode, "NATUREZA");
			String tituloDoTrabalhoTecnico = TesteFilhoNo(0, TipoNode, "TITULO-DO-TRABALHO-TECNICO");
			String ano = TesteFilhoNo(0, TipoNode, "ANO");
			String pais = TesteFilhoNo(0, TipoNode, "PAIS");
			String meioDeDivulgacao = TesteFilhoNo(0, TipoNode, "MEIO-DE-DIVULGACAO");
			String homePageDoTrabalho = TesteFilhoNo(0, TipoNode, "HOME-PAGE-DO-TRABALHO");
			String idioma = TesteFilhoNo(0, TipoNode, "IDIOMA");
			String flagRelevancia = TesteFilhoNo(0, TipoNode, "FLAG-RELEVANCIA");
			String doi = TesteFilhoNo(0, TipoNode, "DOI");
			String tituloDoTrabalhoTecnicoIngles = TesteFilhoNo(0, TipoNode, "TITULO-DO-TRABALHO-TECNICO-INGLES");
			String finalidade = TesteFilhoNo(1, TipoNode, "FINALIDADE");
			String duracaoEmMeses = TesteFilhoNo(1, TipoNode, "DURACAO-EM-MESES");
			String numeroDePaginas = TesteFilhoNo(1, TipoNode, "NUMERO-DE-PAGINAS");
			String disponibilidade = TesteFilhoNo(1, TipoNode, "DISPONIBILIDADE");
			String instituicaoFinanciadora = TesteFilhoNo(1, TipoNode, "INSTITUICAO-FINANCIADORA");
			String cidadeDoTrabalho = TesteFilhoNo(1, TipoNode, "CIDADE-DO-TRABALHO");
			String finalidadeIngles = TesteFilhoNo(1, TipoNode, "FINALIDADE-INGLES");
			NodeList ListSubItens = TipoNode.getChildNodes();
			ArrayList<Autor> autorlista = new ArrayList<Autor>();
			PalavraChave palavraChave = null;
			SetorAtividade setorAtividade = null;
			AreaConhecimento areaConhecimento = null;
			buscarDadosAdicionaisProducaoBibliografica(autorlista, palavraChave, setorAtividade, areaConhecimento,
					ListSubItens);
			Autores autores = new Autores(autorlista);

			TrabalhoTecnico itemResultado = new TrabalhoTecnico(autores, palavraChave, setorAtividade, areaConhecimento,
					natureza, tituloDoTrabalhoTecnico, ano, pais, meioDeDivulgacao, homePageDoTrabalho, idioma,
					flagRelevancia, doi, tituloDoTrabalhoTecnicoIngles, finalidade, duracaoEmMeses, numeroDePaginas,
					disponibilidade, instituicaoFinanciadora, cidadeDoTrabalho, finalidadeIngles);
			ListaResultadoBusca.add(itemResultado);
		}
		return ListaResultadoBusca;
	}

	public ArrayList<ApresentacaoDeTrabalho> BuscaApresentacaoDeTrabalho() throws XPathExpressionException {
		XPathExpression expr = this.xpath.compile("//APRESENTACAO-DE-TRABALHO");
		NodeList listaBuscada = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		ArrayList<ApresentacaoDeTrabalho> ListaResultadoBusca = new ArrayList<ApresentacaoDeTrabalho>();
		for (int i = 0; i < listaBuscada.getLength(); i++) {
			Node TipoNode = listaBuscada.item(i);

			String natureza = TesteFilhoNo(0, TipoNode, "NATUREZA");
			String titulo = TesteFilhoNo(0, TipoNode, "TITULO");
			String ano = TesteFilhoNo(0, TipoNode, "ANO");
			String pais = TesteFilhoNo(0, TipoNode, "PAIS");
			String idioma = TesteFilhoNo(0, TipoNode, "IDIOMA");
			String flagRelevancia = TesteFilhoNo(0, TipoNode, "FLAG-RELEVANCIA");
			String doi = TesteFilhoNo(0, TipoNode, "DOI");
			String tituloIngles = TesteFilhoNo(0, TipoNode, "TITULO-INGLES");
			String flagDivulgacaoCientifica = TesteFilhoNo(0, TipoNode, "FLAG-DIVULGACAO-CIENTIFICA");
			String nomeDoEvento = TesteFilhoNo(1, TipoNode, "NOME-DO-EVENTO");
			String instituicaoPromotora = TesteFilhoNo(1, TipoNode, "INSTITUICAO-PROMOTORA");
			String localDaApresentacao = TesteFilhoNo(1, TipoNode, "LOCAL-DA-APRESENTACAO");
			String cidadeDaApresentacao = TesteFilhoNo(1, TipoNode, "CIDADE-DA-APRESENTACAO");
			String nomeDoEventoIngles = TesteFilhoNo(1, TipoNode, "NOME-DO-EVENTO-INGLES");
			NodeList ListSubItens = TipoNode.getChildNodes();
			ArrayList<Autor> autorlista = new ArrayList<Autor>();
			PalavraChave palavraChave = null;
			SetorAtividade setorAtividade = null;
			AreaConhecimento areaConhecimento = null;
			buscarDadosAdicionaisProducaoBibliografica(autorlista, palavraChave, setorAtividade, areaConhecimento,
					ListSubItens);
			Autores autores = new Autores(autorlista);

			ApresentacaoDeTrabalho itemResultado = new ApresentacaoDeTrabalho(autores, palavraChave, setorAtividade,
					areaConhecimento, natureza, titulo, ano, pais, idioma, flagRelevancia, doi, tituloIngles,
					flagDivulgacaoCientifica, nomeDoEvento, instituicaoPromotora, localDaApresentacao,
					cidadeDaApresentacao, nomeDoEventoIngles);
			ListaResultadoBusca.add(itemResultado);
		}
		return ListaResultadoBusca;
	}

	public ArrayList<CartaMapaOuSimilar> BuscaCartaMapaOuSimilar() throws XPathExpressionException {
		XPathExpression expr = this.xpath.compile("//CARTA-MAPA-OU-SIMILAR");
		NodeList listaBuscada = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		ArrayList<CartaMapaOuSimilar> ListaResultadoBusca = new ArrayList<CartaMapaOuSimilar>();
		for (int i = 0; i < listaBuscada.getLength(); i++) {
			Node TipoNode = listaBuscada.item(i);

			String natureza = TesteFilhoNo(0, TipoNode, "NATUREZA");
			String titulo = TesteFilhoNo(0, TipoNode, "TITULO");
			String ano = TesteFilhoNo(0, TipoNode, "ANO");
			String pais = TesteFilhoNo(0, TipoNode, "PAIS");
			String idioma = TesteFilhoNo(0, TipoNode, "IDIOMA");
			String meioDeDivulgacao = TesteFilhoNo(0, TipoNode, "MEIO-DE-DIVULGACAO");
			String homePageDoTrabalho = TesteFilhoNo(0, TipoNode, "HOME-PAGE-DO-TRABALHO");
			String flagRelevancia = TesteFilhoNo(0, TipoNode, "FLAG-RELEVANCIA");
			String doi = TesteFilhoNo(0, TipoNode, "DOI");
			String tituloIngles = TesteFilhoNo(0, TipoNode, "TITULO-INGLES");
			String temaDaCartaMapaOuSimilar = TesteFilhoNo(1, TipoNode, "TEMA-DA-CARTA-MAPA-OU-SIMILAR");
			String tecnicaUtilizada = TesteFilhoNo(1, TipoNode, "TECNICA-UTILIZADA");
			String finalidade = TesteFilhoNo(1, TipoNode, "FINALIDADE");
			String areaRepresentada = TesteFilhoNo(1, TipoNode, "AREA-REPRESENTADA");
			String instituicaoFinanciadora = TesteFilhoNo(1, TipoNode, "INSTITUICAO-FINANCIADORA");
			String finalidadeIngles = TesteFilhoNo(1, TipoNode, "FINALIDADE-INGLES");
			NodeList ListSubItens = TipoNode.getChildNodes();
			ArrayList<Autor> autorlista = new ArrayList<Autor>();
			PalavraChave palavraChave = null;
			SetorAtividade setorAtividade = null;
			AreaConhecimento areaConhecimento = null;
			buscarDadosAdicionaisProducaoBibliografica(autorlista, palavraChave, setorAtividade, areaConhecimento,
					ListSubItens);
			Autores autores = new Autores(autorlista);

			CartaMapaOuSimilar itemResultado = new CartaMapaOuSimilar(autores, palavraChave, setorAtividade,
					areaConhecimento, natureza, titulo, ano, pais, idioma, meioDeDivulgacao, homePageDoTrabalho,
					flagRelevancia, doi, tituloIngles, temaDaCartaMapaOuSimilar, tecnicaUtilizada, finalidade,
					areaRepresentada, instituicaoFinanciadora, finalidadeIngles);
			ListaResultadoBusca.add(itemResultado);
		}
		return ListaResultadoBusca;
	}

	public ArrayList<CursoDeCurtaDuracaoMinistrado> BuscaCursoDeCurtaDuracaoMinistrado()
			throws XPathExpressionException {
		XPathExpression expr = this.xpath.compile("//CURSO-DE-CURTA-DURACAO-MINISTRADO");
		NodeList listaBuscada = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		ArrayList<CursoDeCurtaDuracaoMinistrado> ListaResultadoBusca = new ArrayList<CursoDeCurtaDuracaoMinistrado>();
		for (int i = 0; i < listaBuscada.getLength(); i++) {
			Node TipoNode = listaBuscada.item(i);

			String nivelDoCurso = TesteFilhoNo(0, TipoNode, "NIVEL-DO-CURSO");
			String titulo = TesteFilhoNo(0, TipoNode, "TITULO");
			String ano = TesteFilhoNo(0, TipoNode, "ANO");
			String pais = TesteFilhoNo(0, TipoNode, "PAIS");
			String idioma = TesteFilhoNo(0, TipoNode, "IDIOMA");
			String meioDeDivulgacao = TesteFilhoNo(0, TipoNode, "MEIO-DE-DIVULGACAO");
			String homePageDoTrabalho = TesteFilhoNo(0, TipoNode, "HOME-PAGE-DO-TRABALHO");
			String flagRelevancia = TesteFilhoNo(0, TipoNode, "FLAG-RELEVANCIA");
			String doi = TesteFilhoNo(0, TipoNode, "DOI");
			String tituloIngles = TesteFilhoNo(0, TipoNode, "TITULO-INGLES");
			String flagDivulgacaoCientifica = TesteFilhoNo(0, TipoNode, "FLAG-DIVULGACAO-CIENTIFICA");
			String participacaoDosAutores = TesteFilhoNo(1, TipoNode, "PARTICIPACAO-DOS-AUTORES");
			String instituicaoPromotoraDoCurso = TesteFilhoNo(1, TipoNode, "INSTITUICAO-PROMOTORA-DO-CURSO");
			String localDoCurso = TesteFilhoNo(1, TipoNode, "LOCAL-DO-CURSO");
			String cidade = TesteFilhoNo(1, TipoNode, "CIDADE");
			String duracao = TesteFilhoNo(1, TipoNode, "DURACAO");
			String unidade = TesteFilhoNo(1, TipoNode, "UNIDADE");
			String unidadeIngles = TesteFilhoNo(1, TipoNode, "UNIDADE-INGLES");
			NodeList ListSubItens = TipoNode.getChildNodes();
			ArrayList<Autor> autorlista = new ArrayList<Autor>();
			PalavraChave palavraChave = null;
			SetorAtividade setorAtividade = null;
			AreaConhecimento areaConhecimento = null;
			buscarDadosAdicionaisProducaoBibliografica(autorlista, palavraChave, setorAtividade, areaConhecimento,
					ListSubItens);
			Autores autores = new Autores(autorlista);

			CursoDeCurtaDuracaoMinistrado itemResultado = new CursoDeCurtaDuracaoMinistrado(autores, palavraChave,
					setorAtividade, areaConhecimento, nivelDoCurso, titulo, ano, pais, idioma, meioDeDivulgacao,
					homePageDoTrabalho, flagRelevancia, doi, tituloIngles, flagDivulgacaoCientifica,
					participacaoDosAutores, instituicaoPromotoraDoCurso, localDoCurso, cidade, duracao, unidade,
					unidadeIngles);
			ListaResultadoBusca.add(itemResultado);
		}
		return ListaResultadoBusca;
	}

	public ArrayList<DesenvolvimentoDeMaterialDidaticoOuInstrucional> BuscaDesenvolvimentoDeMaterialDidaticoOuInstrucional()
			throws XPathExpressionException {
		XPathExpression expr = this.xpath.compile("//DESENVOLVIMENTO-DE-MATERIAL-DIDATICO-OU-INSTRUCIONAL");
		NodeList listaBuscada = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		ArrayList<DesenvolvimentoDeMaterialDidaticoOuInstrucional> ListaResultadoBusca = new ArrayList<DesenvolvimentoDeMaterialDidaticoOuInstrucional>();
		for (int i = 0; i < listaBuscada.getLength(); i++) {
			Node TipoNode = listaBuscada.item(i);

			String natureza = TesteFilhoNo(0, TipoNode, "NATUREZA");
			String titulo = TesteFilhoNo(0, TipoNode, "TITULO");
			String ano = TesteFilhoNo(0, TipoNode, "ANO");
			String pais = TesteFilhoNo(0, TipoNode, "PAIS");
			String idioma = TesteFilhoNo(0, TipoNode, "IDIOMA");
			String meioDeDivulgacao = TesteFilhoNo(0, TipoNode, "MEIO-DE-DIVULGACAO");
			String homePageDoTrabalho = TesteFilhoNo(0, TipoNode, "HOME-PAGE-DO-TRABALHO");
			String flagRelevancia = TesteFilhoNo(0, TipoNode, "FLAG-RELEVANCIA");
			String doi = TesteFilhoNo(0, TipoNode, "DOI");
			String tituloIngles = TesteFilhoNo(0, TipoNode, "TITULO-INGLES");
			String naturezaIngles = TesteFilhoNo(0, TipoNode, "NATUREZA-INGLES");
			String flagDivulgacaoCientifica = TesteFilhoNo(0, TipoNode, "FLAG-DIVULGACAO-CIENTIFICA");
			String finalidade = TesteFilhoNo(1, TipoNode, "FINALIDADE");
			String finalidadeIngles = TesteFilhoNo(1, TipoNode, "FINALIDADE-INGLES");
			NodeList ListSubItens = TipoNode.getChildNodes();
			ArrayList<Autor> autorlista = new ArrayList<Autor>();
			PalavraChave palavraChave = null;
			SetorAtividade setorAtividade = null;
			AreaConhecimento areaConhecimento = null;
			buscarDadosAdicionaisProducaoBibliografica(autorlista, palavraChave, setorAtividade, areaConhecimento,
					ListSubItens);
			Autores autores = new Autores(autorlista);

			DesenvolvimentoDeMaterialDidaticoOuInstrucional itemResultado = new DesenvolvimentoDeMaterialDidaticoOuInstrucional(
					autores, palavraChave, setorAtividade, areaConhecimento, natureza, titulo, ano, pais, idioma,
					meioDeDivulgacao, homePageDoTrabalho, flagRelevancia, doi, tituloIngles, naturezaIngles,
					flagDivulgacaoCientifica, finalidade, finalidadeIngles);
			ListaResultadoBusca.add(itemResultado);
		}
		return ListaResultadoBusca;
	}

	public ArrayList<Editoracao> BuscaEditoracao() throws XPathExpressionException {
		XPathExpression expr = this.xpath.compile("//EDITORACAO");
		NodeList listaBuscada = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		ArrayList<Editoracao> ListaResultadoBusca = new ArrayList<Editoracao>();
		for (int i = 0; i < listaBuscada.getLength(); i++) {
			Node TipoNode = listaBuscada.item(i);

			String natureza = TesteFilhoNo(0, TipoNode, "NATUREZA");
			String titulo = TesteFilhoNo(0, TipoNode, "TITULO");
			String ano = TesteFilhoNo(0, TipoNode, "ANO");
			String pais = TesteFilhoNo(0, TipoNode, "PAIS");
			String idioma = TesteFilhoNo(0, TipoNode, "IDIOMA");
			String meioDeDivulgacao = TesteFilhoNo(0, TipoNode, "MEIO-DE-DIVULGACAO");
			String homePageDoTrabalho = TesteFilhoNo(0, TipoNode, "HOME-PAGE-DO-TRABALHO");
			String flagRelevancia = TesteFilhoNo(0, TipoNode, "FLAG-RELEVANCIA");
			String doi = TesteFilhoNo(0, TipoNode, "DOI");
			String tituloIngles = TesteFilhoNo(0, TipoNode, "TITULO-INGLES");
			String numeroDePaginas = TesteFilhoNo(1, TipoNode, "NUMERO-DE-PAGINAS");
			String instituicaoPromotora = TesteFilhoNo(1, TipoNode, "INSTITUICAO-PROMOTORA");
			String editora = TesteFilhoNo(1, TipoNode, "EDITORA");
			String cidade = TesteFilhoNo(1, TipoNode, "CIDADE");
			NodeList ListSubItens = TipoNode.getChildNodes();
			ArrayList<Autor> autorlista = new ArrayList<Autor>();
			PalavraChave palavraChave = null;
			SetorAtividade setorAtividade = null;
			AreaConhecimento areaConhecimento = null;
			buscarDadosAdicionaisProducaoBibliografica(autorlista, palavraChave, setorAtividade, areaConhecimento,
					ListSubItens);
			Autores autores = new Autores(autorlista);

			Editoracao itemResultado = new Editoracao(autores, palavraChave, setorAtividade, areaConhecimento, natureza,
					titulo, ano, pais, idioma, meioDeDivulgacao, homePageDoTrabalho, flagRelevancia, doi, tituloIngles,
					numeroDePaginas, instituicaoPromotora, editora, cidade);
			ListaResultadoBusca.add(itemResultado);
		}
		return ListaResultadoBusca;
	}

	public ArrayList<ManutencaoDeObraArtistica> BuscaManutencaoDeObraArtistica() throws XPathExpressionException {
		XPathExpression expr = this.xpath.compile("//MANUTENCAO-DE-OBRA-ARTISTICA");
		NodeList listaBuscada = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		ArrayList<ManutencaoDeObraArtistica> ListaResultadoBusca = new ArrayList<ManutencaoDeObraArtistica>();
		for (int i = 0; i < listaBuscada.getLength(); i++) {
			Node TipoNode = listaBuscada.item(i);

			String tipo = TesteFilhoNo(0, TipoNode, "TIPO");
			String natureza = TesteFilhoNo(0, TipoNode, "NATUREZA");
			String titulo = TesteFilhoNo(0, TipoNode, "TITULO");
			String ano = TesteFilhoNo(0, TipoNode, "ANO");
			String pais = TesteFilhoNo(0, TipoNode, "PAIS");
			String idioma = TesteFilhoNo(0, TipoNode, "IDIOMA");
			String flagRelevancia = TesteFilhoNo(0, TipoNode, "FLAG-RELEVANCIA");
			String doi = TesteFilhoNo(0, TipoNode, "DOI");
			String tituloIngles = TesteFilhoNo(0, TipoNode, "TITULO-INGLES");
			String nomeDaObra = TesteFilhoNo(1, TipoNode, "NOME-DA-OBRA");
			String autorDaObra = TesteFilhoNo(1, TipoNode, "AUTOR-DA-OBRA");
			String anoDaObra = TesteFilhoNo(1, TipoNode, "ANO-DA-OBRA");
			String acervo = TesteFilhoNo(1, TipoNode, "ACERVO");
			String local = TesteFilhoNo(1, TipoNode, "LOCAL");
			String cidade = TesteFilhoNo(1, TipoNode, "CIDADE");
			NodeList ListSubItens = TipoNode.getChildNodes();
			ArrayList<Autor> autorlista = new ArrayList<Autor>();
			PalavraChave palavraChave = null;
			SetorAtividade setorAtividade = null;
			AreaConhecimento areaConhecimento = null;
			buscarDadosAdicionaisProducaoBibliografica(autorlista, palavraChave, setorAtividade, areaConhecimento,
					ListSubItens);
			Autores autores = new Autores(autorlista);

			ManutencaoDeObraArtistica itemResultado = new ManutencaoDeObraArtistica(autores, palavraChave,
					setorAtividade, areaConhecimento, tipo, natureza, titulo, ano, pais, idioma, flagRelevancia, doi,
					tituloIngles, nomeDaObra, autorDaObra, anoDaObra, acervo, local, cidade);
			ListaResultadoBusca.add(itemResultado);
		}
		return ListaResultadoBusca;
	}

	public ArrayList<Maquete> BuscaMaquete() throws XPathExpressionException {
		XPathExpression expr = this.xpath.compile("//MAQUETE");
		NodeList listaBuscada = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		ArrayList<Maquete> ListaResultadoBusca = new ArrayList<Maquete>();
		for (int i = 0; i < listaBuscada.getLength(); i++) {
			Node TipoNode = listaBuscada.item(i);

			String titulo = TesteFilhoNo(0, TipoNode, "TITULO");
			String ano = TesteFilhoNo(0, TipoNode, "ANO");
			String pais = TesteFilhoNo(0, TipoNode, "PAIS");
			String idioma = TesteFilhoNo(0, TipoNode, "IDIOMA");
			String meioDeDivulgacao = TesteFilhoNo(0, TipoNode, "MEIO-DE-DIVULGACAO");
			String homePageDoTrabalho = TesteFilhoNo(0, TipoNode, "HOME-PAGE-DO-TRABALHO");
			String flagRelevancia = TesteFilhoNo(0, TipoNode, "FLAG-RELEVANCIA");
			String doi = TesteFilhoNo(0, TipoNode, "DOI");
			String tituloIngles = TesteFilhoNo(0, TipoNode, "TITULO-INGLES");
			String finalidade = TesteFilhoNo(1, TipoNode, "FINALIDADE");
			String objetoRepresentado = TesteFilhoNo(1, TipoNode, "OBJETO-REPRESENTADO");
			String materialUtilizado = TesteFilhoNo(1, TipoNode, "MATERIAL-UTILIZADO");
			String instituicaoFinanciadora = TesteFilhoNo(1, TipoNode, "INSTITUICAO-FINANCIADORA");
			String finalidadeIngles = TesteFilhoNo(1, TipoNode, "FINALIDADE-INGLES");
			NodeList ListSubItens = TipoNode.getChildNodes();
			ArrayList<Autor> autorlista = new ArrayList<Autor>();
			PalavraChave palavraChave = null;
			SetorAtividade setorAtividade = null;
			AreaConhecimento areaConhecimento = null;
			buscarDadosAdicionaisProducaoBibliografica(autorlista, palavraChave, setorAtividade, areaConhecimento,
					ListSubItens);
			Autores autores = new Autores(autorlista);

			Maquete itemResultado = new Maquete(autores, palavraChave, setorAtividade, areaConhecimento, titulo, ano,
					pais, idioma, meioDeDivulgacao, homePageDoTrabalho, flagRelevancia, doi, tituloIngles, finalidade,
					objetoRepresentado, materialUtilizado, instituicaoFinanciadora, finalidadeIngles);
			ListaResultadoBusca.add(itemResultado);
		}
		return ListaResultadoBusca;
	}

	public ArrayList<OrganizacaoDeEvento> BuscaOrganizacaoDeEvento() throws XPathExpressionException {
		XPathExpression expr = this.xpath.compile("//ORGANIZACAO-DE-EVENTO");
		NodeList listaBuscada = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		ArrayList<OrganizacaoDeEvento> ListaResultadoBusca = new ArrayList<OrganizacaoDeEvento>();
		for (int i = 0; i < listaBuscada.getLength(); i++) {
			Node TipoNode = listaBuscada.item(i);

			String tipo = TesteFilhoNo(0, TipoNode, "TIPO");
			String natureza = TesteFilhoNo(0, TipoNode, "NATUREZA");
			String titulo = TesteFilhoNo(0, TipoNode, "TITULO");
			String ano = TesteFilhoNo(0, TipoNode, "ANO");
			String pais = TesteFilhoNo(0, TipoNode, "PAIS");
			String idioma = TesteFilhoNo(0, TipoNode, "IDIOMA");
			String meioDeDivulgacao = TesteFilhoNo(0, TipoNode, "MEIO-DE-DIVULGACAO");
			String homePageDoTrabalho = TesteFilhoNo(0, TipoNode, "HOME-PAGE-DO-TRABALHO");
			String flagRelevancia = TesteFilhoNo(0, TipoNode, "FLAG-RELEVANCIA");
			String doi = TesteFilhoNo(0, TipoNode, "DOI");
			String tituloIngles = TesteFilhoNo(0, TipoNode, "TITULO-INGLES");
			String flagDivulgacaoCientifica = TesteFilhoNo(0, TipoNode, "FLAG-DIVULGACAO-CIENTIFICA");
			String instituicaoPromotora = TesteFilhoNo(1, TipoNode, "INSTITUICAO-PROMOTORA");
			String duracaoEmSemanas = TesteFilhoNo(1, TipoNode, "DURACAO-EM-SEMANAS");
			String flagEventoItinerante = TesteFilhoNo(1, TipoNode, "FLAG-EVENTO-ITINERANTE");
			String flagCatalogo = TesteFilhoNo(1, TipoNode, "FLAG-CATALOGO");
			String local = TesteFilhoNo(1, TipoNode, "LOCAL");
			String cidade = TesteFilhoNo(1, TipoNode, "CIDADE");
			NodeList ListSubItens = TipoNode.getChildNodes();
			ArrayList<Autor> autorlista = new ArrayList<Autor>();
			PalavraChave palavraChave = null;
			SetorAtividade setorAtividade = null;
			AreaConhecimento areaConhecimento = null;
			buscarDadosAdicionaisProducaoBibliografica(autorlista, palavraChave, setorAtividade, areaConhecimento,
					ListSubItens);
			Autores autores = new Autores(autorlista);

			OrganizacaoDeEvento itemResultado = new OrganizacaoDeEvento(autores, palavraChave, setorAtividade,
					areaConhecimento, tipo, natureza, titulo, ano, pais, idioma, meioDeDivulgacao, homePageDoTrabalho,
					flagRelevancia, doi, tituloIngles, flagDivulgacaoCientifica, instituicaoPromotora, duracaoEmSemanas,
					flagEventoItinerante, flagCatalogo, local, cidade);
			ListaResultadoBusca.add(itemResultado);
		}
		return ListaResultadoBusca;
	}

	public ArrayList<ProgramaDeRadioOuTv> BuscaProgramaDeRadioOuTv() throws XPathExpressionException {
		XPathExpression expr = this.xpath.compile("//PROGRAMA-DE-RADIO-OU-TV");
		NodeList listaBuscada = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		ArrayList<ProgramaDeRadioOuTv> ListaResultadoBusca = new ArrayList<ProgramaDeRadioOuTv>();
		for (int i = 0; i < listaBuscada.getLength(); i++) {
			Node TipoNode = listaBuscada.item(i);

			String natureza = TesteFilhoNo(0, TipoNode, "NATUREZA");
			String titulo = TesteFilhoNo(0, TipoNode, "TITULO");
			String ano = TesteFilhoNo(0, TipoNode, "ANO");
			String pais = TesteFilhoNo(0, TipoNode, "PAIS");
			String idioma = TesteFilhoNo(0, TipoNode, "IDIOMA");
			String flagRelevancia = TesteFilhoNo(0, TipoNode, "FLAG-RELEVANCIA");
			String doi = TesteFilhoNo(0, TipoNode, "DOI");
			String tituloIngles = TesteFilhoNo(0, TipoNode, "TITULO-INGLES");
			String homePage = TesteFilhoNo(0, TipoNode, "HOME-PAGE");
			String meioDeDivulgacao = TesteFilhoNo(0, TipoNode, "MEIO-DE-DIVULGACAO");
			String flagDivulgacaoCientifica = TesteFilhoNo(0, TipoNode, "FLAG-DIVULGACAO-CIENTIFICA");
			String emissora = TesteFilhoNo(1, TipoNode, "EMISSORA");
			String tema = TesteFilhoNo(1, TipoNode, "TEMA");
			String formatoDataDaApresentacao = TesteFilhoNo(1, TipoNode, "FORMATO-DATA-DA-APRESENTACAO");
			String dataDaApresentacao = TesteFilhoNo(1, TipoNode, "DATA-DA-APRESENTACAO");
			String duracaoEmMinutos = TesteFilhoNo(1, TipoNode, "DURACAO-EM-MINUTOS");
			String cidade = TesteFilhoNo(1, TipoNode, "CIDADE");
			String veiculoDeDivulgacao = TesteFilhoNo(1, TipoNode, "VEICULO-DE-DIVULGACAO");
			NodeList ListSubItens = TipoNode.getChildNodes();
			ArrayList<Autor> autorlista = new ArrayList<Autor>();
			PalavraChave palavraChave = null;
			SetorAtividade setorAtividade = null;
			AreaConhecimento areaConhecimento = null;
			buscarDadosAdicionaisProducaoBibliografica(autorlista, palavraChave, setorAtividade, areaConhecimento,
					ListSubItens);
			Autores autores = new Autores(autorlista);

			ProgramaDeRadioOuTv itemResultado = new ProgramaDeRadioOuTv(autores, palavraChave, setorAtividade,
					areaConhecimento, natureza, titulo, ano, pais, idioma, flagRelevancia, doi, tituloIngles, homePage,
					meioDeDivulgacao, flagDivulgacaoCientifica, emissora, tema, formatoDataDaApresentacao,
					dataDaApresentacao, duracaoEmMinutos, cidade, veiculoDeDivulgacao);
			ListaResultadoBusca.add(itemResultado);
		}
		return ListaResultadoBusca;
	}

	public ArrayList<RelatorioDePesquisa> BuscaRelatorioDePesquisa() throws XPathExpressionException {
		XPathExpression expr = this.xpath.compile("//RELATORIO-DE-PESQUISA");
		NodeList listaBuscada = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		ArrayList<RelatorioDePesquisa> ListaResultadoBusca = new ArrayList<RelatorioDePesquisa>();
		for (int i = 0; i < listaBuscada.getLength(); i++) {
			Node TipoNode = listaBuscada.item(i);

			String titulo = TesteFilhoNo(0, TipoNode, "TITULO");
			String ano = TesteFilhoNo(0, TipoNode, "ANO");
			String pais = TesteFilhoNo(0, TipoNode, "PAIS");
			String idioma = TesteFilhoNo(0, TipoNode, "IDIOMA");
			String meioDeDivulgacao = TesteFilhoNo(0, TipoNode, "MEIO-DE-DIVULGACAO");
			String homePageDoTrabalho = TesteFilhoNo(0, TipoNode, "HOME-PAGE-DO-TRABALHO");
			String flagRelevancia = TesteFilhoNo(0, TipoNode, "FLAG-RELEVANCIA");
			String doi = TesteFilhoNo(0, TipoNode, "DOI");
			String tituloIngles = TesteFilhoNo(0, TipoNode, "TITULO-INGLES");
			String nomeDoProjeto = TesteFilhoNo(1, TipoNode, "NOME-DO-PROJETO");
			String numeroDePaginas = TesteFilhoNo(1, TipoNode, "NUMERO-DE-PAGINAS");
			String disponibilidade = TesteFilhoNo(1, TipoNode, "DISPONIBILIDADE");
			String instituicaoFinanciadora = TesteFilhoNo(1, TipoNode, "INSTITUICAO-FINANCIADORA");
			NodeList ListSubItens = TipoNode.getChildNodes();
			ArrayList<Autor> autorlista = new ArrayList<Autor>();
			PalavraChave palavraChave = null;
			SetorAtividade setorAtividade = null;
			AreaConhecimento areaConhecimento = null;
			buscarDadosAdicionaisProducaoBibliografica(autorlista, palavraChave, setorAtividade, areaConhecimento,
					ListSubItens);
			Autores autores = new Autores(autorlista);

			RelatorioDePesquisa itemResultado = new RelatorioDePesquisa(autores, palavraChave, setorAtividade,
					areaConhecimento, titulo, ano, pais, idioma, meioDeDivulgacao, homePageDoTrabalho, flagRelevancia,
					doi, tituloIngles, nomeDoProjeto, numeroDePaginas, disponibilidade, instituicaoFinanciadora);
			ListaResultadoBusca.add(itemResultado);
		}
		return ListaResultadoBusca;
	}

	public ArrayList<MidiaSocialWebsiteBlog> BuscaMidiaSocialWebsiteBlog() throws XPathExpressionException {
		XPathExpression expr = this.xpath.compile("//MIDIA-SOCIAL-WEBSITE-BLOG");
		NodeList listaBuscada = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		ArrayList<MidiaSocialWebsiteBlog> ListaResultadoBusca = new ArrayList<MidiaSocialWebsiteBlog>();
		for (int i = 0; i < listaBuscada.getLength(); i++) {
			Node TipoNode = listaBuscada.item(i);

			String natureza = TesteFilhoNo(0, TipoNode, "NATUREZA");
			String naturezaIngles = TesteFilhoNo(0, TipoNode, "NATUREZA-INGLES");
			String titulo = TesteFilhoNo(0, TipoNode, "TITULO");
			String tituloIngles = TesteFilhoNo(0, TipoNode, "TITULO-INGLES");
			String ano = TesteFilhoNo(0, TipoNode, "ANO");
			String pais = TesteFilhoNo(0, TipoNode, "PAIS");
			String idioma = TesteFilhoNo(0, TipoNode, "IDIOMA");
			String homePage = TesteFilhoNo(0, TipoNode, "HOME-PAGE");
			String flagRelevancia = TesteFilhoNo(0, TipoNode, "FLAG-RELEVANCIA");
			String flagDivulgacaoCientifica = TesteFilhoNo(0, TipoNode, "FLAG-DIVULGACAO-CIENTIFICA");
			String tema = TesteFilhoNo(1, TipoNode, "TEMA");
			NodeList ListSubItens = TipoNode.getChildNodes();
			ArrayList<Autor> autorlista = new ArrayList<Autor>();
			PalavraChave palavraChave = null;
			SetorAtividade setorAtividade = null;
			AreaConhecimento areaConhecimento = null;
			buscarDadosAdicionaisProducaoBibliografica(autorlista, palavraChave, setorAtividade, areaConhecimento,
					ListSubItens);
			Autores autores = new Autores(autorlista);

			MidiaSocialWebsiteBlog itemResultado = new MidiaSocialWebsiteBlog(autores, palavraChave, setorAtividade,
					areaConhecimento, natureza, naturezaIngles, titulo, tituloIngles, ano, pais, idioma, homePage,
					flagRelevancia, flagDivulgacaoCientifica, tema);
			ListaResultadoBusca.add(itemResultado);
		}
		return ListaResultadoBusca;
	}
}
