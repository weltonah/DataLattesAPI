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
import br.com.datalattesAPI.model.ProducaoBibliografica.ArtigoAceitoParaPublicacao;
import br.com.datalattesAPI.model.ProducaoBibliografica.ArtigoPublicado;
import br.com.datalattesAPI.model.ProducaoBibliografica.CapituloDeLivroPublicado;
import br.com.datalattesAPI.model.ProducaoBibliografica.LivroPublicadoOuOrganizado;
import br.com.datalattesAPI.model.ProducaoBibliografica.PrefacioPosfacio;
import br.com.datalattesAPI.model.ProducaoBibliografica.TextoEmJornalOuRevista;
import br.com.datalattesAPI.model.ProducaoBibliografica.TrabalhoEmEventos;
import br.com.datalattesAPI.model.ProducaoBibliografica.Traducao;

public class ProducaoBibliograficaXpath extends AbstractXpath {

	public ProducaoBibliograficaXpath(File file) {
		super(file);
	}

	public ArrayList<ArtigoPublicado> BuscaArtigoPublicado() throws XPathExpressionException {
		XPathExpression expr = this.xpath.compile("//ARTIGO-PUBLICADO");
		NodeList listaBuscada = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		ArrayList<ArtigoPublicado> ListaResultadoBusca = new ArrayList<>();
		for (int i = 0; i < listaBuscada.getLength(); i++) {
			Node TipoNode = listaBuscada.item(i);

			String natureza = TesteFilhoNo(0, TipoNode, "NATUREZA");
			String tituloDoArtigo = TesteFilhoNo(0, TipoNode, "TITULO-DO-ARTIGO");
			String anoDoArtigo = TesteFilhoNo(0, TipoNode, "ANO-DO-ARTIGO");
			String paisDePublicacao = TesteFilhoNo(0, TipoNode, "PAIS-DE-PUBLICACAO");
			String idioma = TesteFilhoNo(0, TipoNode, "IDIOMA");
			String meioDeDivulgacao = TesteFilhoNo(0, TipoNode, "MEIO-DE-DIVULGACAO");
			String homePageDoTrabalho = TesteFilhoNo(0, TipoNode, "HOME-PAGE-DO-TRABALHO");
			String flagRelevancia = TesteFilhoNo(0, TipoNode, "FLAG-RELEVANCIA");
			String doi = TesteFilhoNo(0, TipoNode, "DOI");
			String tituloDoArtigoIngles = TesteFilhoNo(0, TipoNode, "TITULO-DO-ARTIGO-INGLES");
			String flagDivulgacaoCientifica = TesteFilhoNo(0, TipoNode, "FLAG-DIVULGACAO-CIENTIFICA");
			String tituloDoPeriodicoOuRevista = TesteFilhoNo(1, TipoNode, "TITULO-DO-PERIODICO-OU-REVISTA");
			String issn = TesteFilhoNo(1, TipoNode, "ISSN");
			String volume = TesteFilhoNo(1, TipoNode, "VOLUME");
			String fasciculo = TesteFilhoNo(1, TipoNode, "FASCICULO");
			String serie = TesteFilhoNo(1, TipoNode, "SERIE");
			String paginaInicial = TesteFilhoNo(1, TipoNode, "PAGINA-INICIAL");
			String paginaFinal = TesteFilhoNo(1, TipoNode, "PAGINA-FINAL");
			String localDePublicacao = TesteFilhoNo(1, TipoNode, "LOCAL-DE-PUBLICACAO");

			NodeList ListSubItens = TipoNode.getChildNodes();
			ArrayList<Autor> autorlista = new ArrayList<>();
			PalavraChave palavraChave = null;
			SetorAtividade setorAtividade = null;
			AreaConhecimento areaConhecimento = null;
			buscarDadosAdicionaisProducaoBibliografica(autorlista, palavraChave, setorAtividade, areaConhecimento,
					ListSubItens);
			Autores autores = new Autores(autorlista);
			ArtigoPublicado itemResultado = new ArtigoPublicado(autores, palavraChave, setorAtividade, areaConhecimento,
					natureza, tituloDoArtigo, anoDoArtigo, paisDePublicacao, idioma, meioDeDivulgacao,
					homePageDoTrabalho, flagRelevancia, doi, tituloDoArtigoIngles, flagDivulgacaoCientifica,
					tituloDoPeriodicoOuRevista, issn, volume, fasciculo, serie, paginaInicial, paginaFinal,
					localDePublicacao);
			ListaResultadoBusca.add(itemResultado);
		}
		return ListaResultadoBusca;
	}

	public ArrayList<TrabalhoEmEventos> BuscaTrabalhoEmEventos() throws XPathExpressionException {
		XPathExpression expr = this.xpath.compile("//TRABALHO-EM-EVENTOS");
		NodeList listaBuscada = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		ArrayList<TrabalhoEmEventos> ListaResultadoBusca = new ArrayList<>();
		for (int i = 0; i < listaBuscada.getLength(); i++) {
			Node TipoNode = listaBuscada.item(i);

			String natureza = TesteNullNo(TipoNode, "NATUREZA");
			String tituloDoTrabalho = TesteFilhoNo(0, TipoNode, "TITULO-DO-TRABALHO");
			String anoDoTrabalho = TesteFilhoNo(0, TipoNode, "ANO-DO-TRABALHO");
			String paisDoEvento = TesteFilhoNo(0, TipoNode, "PAIS-DO-EVENTO");
			String idioma = TesteFilhoNo(0, TipoNode, "IDIOMA");
			String meioDeDivulgacao = TesteFilhoNo(0, TipoNode, "MEIO-DE-DIVULGACAO");
			String homePageDoTrabalho = TesteFilhoNo(0, TipoNode, "HOME-PAGE-DO-TRABALHO");
			String flagRelevancia = TesteFilhoNo(0, TipoNode, "FLAG-RELEVANCIA");
			String doi = TesteFilhoNo(0, TipoNode, "DOI");
			String tituloDoTrabalhoIngles = TesteFilhoNo(0, TipoNode, "TITULO-DO-TRABALHO-INGLES");
			String flagDivulgacaoCientifica = TesteFilhoNo(0, TipoNode, "FLAG-DIVULGACAO-CIENTIFICA");
			String classificacaoDoEvento = TesteFilhoNo(1, TipoNode, "CLASSIFICACAO-DO-EVENTO");
			String nomeDoEvento = TesteFilhoNo(1, TipoNode, "NOME-DO-EVENTO");
			String cidadeDoEvento = TesteFilhoNo(1, TipoNode, "CIDADE-DO-EVENTO");
			String anoDeRealizacao = TesteFilhoNo(1, TipoNode, "ANO-DE-REALIZACAO");
			String tituloDosAnaisOuProceedings = TesteFilhoNo(1, TipoNode, "TITULO-DOS-ANAIS-OU-PROCEEDINGS");
			String volume = TesteFilhoNo(1, TipoNode, "VOLUME");
			String fasciculo = TesteFilhoNo(1, TipoNode, "FASCICULO");
			String serie = TesteFilhoNo(1, TipoNode, "SERIE");
			String paginaInicial = TesteFilhoNo(1, TipoNode, "PAGINA-INICIAL");
			String paginaFinal = TesteFilhoNo(1, TipoNode, "PAGINA-FINAL");
			String isbn = TesteFilhoNo(1, TipoNode, "ISBN");
			String nomeDaEditora = TesteFilhoNo(1, TipoNode, "NOME-DA-EDITORA");
			String cidadeDaEditora = TesteFilhoNo(1, TipoNode, "CIDADE-DA-EDITORA");
			String nomeDoEventoIngles = TesteFilhoNo(1, TipoNode, "NOME-DO-EVENTO-INGLES");

			NodeList ListSubItens = TipoNode.getChildNodes();
			ArrayList<Autor> autorlista = new ArrayList<>();
			PalavraChave palavraChave = null;
			SetorAtividade setorAtividade = null;
			AreaConhecimento areaConhecimento = null;
			buscarDadosAdicionaisProducaoBibliografica(autorlista, palavraChave, setorAtividade, areaConhecimento,
					ListSubItens);
			Autores autores = new Autores(autorlista);
			TrabalhoEmEventos itemResultado = new TrabalhoEmEventos(autores, palavraChave, setorAtividade,
					areaConhecimento, natureza, tituloDoTrabalho, anoDoTrabalho, paisDoEvento, idioma, meioDeDivulgacao,
					homePageDoTrabalho, flagRelevancia, doi, tituloDoTrabalhoIngles, flagDivulgacaoCientifica,
					classificacaoDoEvento, nomeDoEvento, cidadeDoEvento, anoDeRealizacao, tituloDosAnaisOuProceedings,
					volume, fasciculo, serie, paginaInicial, paginaFinal, isbn, nomeDaEditora, cidadeDaEditora,
					nomeDoEventoIngles);
			ListaResultadoBusca.add(itemResultado);
		}
		return ListaResultadoBusca;
	}

	public ArrayList<LivroPublicadoOuOrganizado> BuscaLivroPublicaasdasdoOuOrganizado()
			throws XPathExpressionException {
		XPathExpression expr = this.xpath.compile("//LIVRO-PUBLICADO-OU-ORGANIZADO");
		NodeList listaBuscada = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		ArrayList<LivroPublicadoOuOrganizado> ListaResultadoBusca = new ArrayList<>();
		for (int i = 0; i < listaBuscada.getLength(); i++) {
			Node TipoNode = listaBuscada.item(i);

			String tipo = TesteFilhoNo(0, TipoNode, "TIPO");
			String natureza = TesteFilhoNo(0, TipoNode, "NATUREZA");
			String tituloDoLivro = TesteFilhoNo(0, TipoNode, "TITULO-DO-LIVRO");
			String ano = TesteFilhoNo(0, TipoNode, "ANO");
			String paisDePublicacao = TesteFilhoNo(0, TipoNode, "PAIS-DE-PUBLICACAO");
			String idioma = TesteFilhoNo(0, TipoNode, "IDIOMA");
			String meioDeDivulgacao = TesteFilhoNo(0, TipoNode, "MEIO-DE-DIVULGACAO");
			String homePageDoTrabalho = TesteFilhoNo(0, TipoNode, "HOME-PAGE-DO-TRABALHO");
			String flagRelevancia = TesteFilhoNo(0, TipoNode, "FLAG-RELEVANCIA");
			String doi = TesteFilhoNo(0, TipoNode, "DOI");
			String tituloDoLivroIngles = TesteFilhoNo(0, TipoNode, "TITULO-DO-LIVRO-INGLES");
			String flagDivulgacaoCientifica = TesteFilhoNo(0, TipoNode, "FLAG-DIVULGACAO-CIENTIFICA");
			String numeroDeVolumes = TesteFilhoNo(1, TipoNode, "NUMERO-DE-VOLUMES");
			String numeroDePaginas = TesteFilhoNo(1, TipoNode, "NUMERO-DE-PAGINAS");
			String isbn = TesteFilhoNo(1, TipoNode, "ISBN");
			String numeroDaEdicaoRevisao = TesteFilhoNo(1, TipoNode, "NUMERO-DA-EDICAO-REVISAO");
			String numeroDaSerie = TesteFilhoNo(1, TipoNode, "NUMERO-DA-SERIE");
			String cidadeDaEditora = TesteFilhoNo(1, TipoNode, "CIDADE-DA-EDITORA");
			String nomeDaEditora = TesteFilhoNo(1, TipoNode, "NOME-DA-EDITORA");
			NodeList ListSubItens = TipoNode.getChildNodes();
			ArrayList<Autor> autorlista = new ArrayList<>();
			PalavraChave palavraChave = null;
			SetorAtividade setorAtividade = null;
			AreaConhecimento areaConhecimento = null;
			buscarDadosAdicionaisProducaoBibliografica(autorlista, palavraChave, setorAtividade, areaConhecimento,
					ListSubItens);
			Autores autores = new Autores(autorlista);
			LivroPublicadoOuOrganizado itemResultado = new LivroPublicadoOuOrganizado(autores, palavraChave,
					setorAtividade, areaConhecimento, tipo, natureza, tituloDoLivro, ano, paisDePublicacao, idioma,
					meioDeDivulgacao, homePageDoTrabalho, flagRelevancia, doi, tituloDoLivroIngles,
					flagDivulgacaoCientifica, numeroDeVolumes, numeroDePaginas, isbn, numeroDaEdicaoRevisao,
					numeroDaSerie, cidadeDaEditora, nomeDaEditora);
			ListaResultadoBusca.add(itemResultado);
		}
		return ListaResultadoBusca;
	}

	public ArrayList<CapituloDeLivroPublicado> BuscaCapituloDeLivroPublicado() throws XPathExpressionException {
		XPathExpression expr = this.xpath.compile("//CAPITULO-DE-LIVRO-PUBLICADO");
		NodeList listaBuscada = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		ArrayList<CapituloDeLivroPublicado> ListaResultadoBusca = new ArrayList<>();
		for (int i = 0; i < listaBuscada.getLength(); i++) {
			Node TipoNode = listaBuscada.item(i);

			String tipo = TesteFilhoNo(0, TipoNode, "TIPO");
			String tituloDoCapituloDoLivro = TesteFilhoNo(0, TipoNode, "TITULO-DO-CAPITULO-DO-LIVRO");
			String ano = TesteFilhoNo(0, TipoNode, "ANO");
			String paisDePublicacao = TesteFilhoNo(0, TipoNode, "PAIS-DE-PUBLICACAO");
			String idioma = TesteFilhoNo(0, TipoNode, "IDIOMA");
			String meioDeDivulgacao = TesteFilhoNo(0, TipoNode, "MEIO-DE-DIVULGACAO");
			String homePageDoTrabalho = TesteFilhoNo(0, TipoNode, "HOME-PAGE-DO-TRABALHO");
			String flagRelevancia = TesteFilhoNo(0, TipoNode, "FLAG-RELEVANCIA");
			String doi = TesteFilhoNo(0, TipoNode, "DOI");
			String tituloDoCapituloDoLivroIngles = TesteFilhoNo(0, TipoNode, "TITULO-DO-CAPITULO-DO-LIVRO-INGLES");
			String flagDivulgacaoCientifica = TesteFilhoNo(0, TipoNode, "FLAG-DIVULGACAO-CIENTIFICA");
			String tituloDoLivro = TesteFilhoNo(1, TipoNode, "TITULO-DO-LIVRO");
			String numeroDeVolumes = TesteFilhoNo(1, TipoNode, "NUMERO-DE-VOLUMES");
			String paginaInicial = TesteFilhoNo(1, TipoNode, "PAGINA-INICIAL");
			String paginaFinal = TesteFilhoNo(1, TipoNode, "PAGINA-FINAL");
			String isbn = TesteFilhoNo(1, TipoNode, "ISBN");
			String organizadores = TesteFilhoNo(1, TipoNode, "ORGANIZADORES");
			String numeroDaEdicaoRevisao = TesteFilhoNo(1, TipoNode, "NUMERO-DA-EDICAO-REVISAO");
			String numeroDaSerie = TesteFilhoNo(1, TipoNode, "NUMERO-DA-SERIE");
			String cidadeDaEditora = TesteFilhoNo(1, TipoNode, "CIDADE-DA-EDITORA");
			String nomeDaEditora = TesteFilhoNo(1, TipoNode, "NOME-DA-EDITORA");
			NodeList ListSubItens = TipoNode.getChildNodes();
			ArrayList<Autor> autorlista = new ArrayList<>();
			PalavraChave palavraChave = null;
			SetorAtividade setorAtividade = null;
			AreaConhecimento areaConhecimento = null;
			buscarDadosAdicionaisProducaoBibliografica(autorlista, palavraChave, setorAtividade, areaConhecimento,
					ListSubItens);
			Autores autores = new Autores(autorlista);
			CapituloDeLivroPublicado itemResultado = new CapituloDeLivroPublicado(autores, palavraChave, setorAtividade,
					areaConhecimento, tipo, tituloDoCapituloDoLivro, ano, paisDePublicacao, idioma, meioDeDivulgacao,
					homePageDoTrabalho, flagRelevancia, doi, tituloDoCapituloDoLivroIngles, flagDivulgacaoCientifica,
					tituloDoLivro, numeroDeVolumes, paginaInicial, paginaFinal, isbn, organizadores,
					numeroDaEdicaoRevisao, numeroDaSerie, cidadeDaEditora, nomeDaEditora);
			ListaResultadoBusca.add(itemResultado);
		}
		return ListaResultadoBusca;
	}

	public ArrayList<TextoEmJornalOuRevista> BuscaTextoEmJornalOuRevista() throws XPathExpressionException {
		XPathExpression expr = this.xpath.compile("//TEXTO-EM-JORNAL-OU-REVISTA");
		NodeList listaBuscada = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		ArrayList<TextoEmJornalOuRevista> ListaResultadoBusca = new ArrayList<>();
		for (int i = 0; i < listaBuscada.getLength(); i++) {
			Node TipoNode = listaBuscada.item(i);

			String natureza = TesteFilhoNo(0, TipoNode, "NATUREZA");
			String tituloDoTexto = TesteFilhoNo(0, TipoNode, "TITULO-DO-TEXTO");
			String anoDoTexto = TesteFilhoNo(0, TipoNode, "ANO-DO-TEXTO");
			String paisDePublicacao = TesteFilhoNo(0, TipoNode, "PAIS-DE-PUBLICACAO");
			String idioma = TesteFilhoNo(0, TipoNode, "IDIOMA");
			String meioDeDivulgacao = TesteFilhoNo(0, TipoNode, "MEIO-DE-DIVULGACAO");
			String homePageDoTrabalho = TesteFilhoNo(0, TipoNode, "HOME-PAGE-DO-TRABALHO");
			String flagRelevancia = TesteFilhoNo(0, TipoNode, "FLAG-RELEVANCIA");
			String doi = TesteFilhoNo(0, TipoNode, "DOI");
			String tituloDoTextoIngles = TesteFilhoNo(0, TipoNode, "TITULO-DO-TEXTO-INGLES");
			String flagDivulgacaoCientifica = TesteFilhoNo(0, TipoNode, "FLAG-DIVULGACAO-CIENTIFICA");
			String tituloDoJornalOuRevista = TesteFilhoNo(1, TipoNode, "TITULO-DO-JORNAL-OU-REVISTA");
			String issn = TesteFilhoNo(1, TipoNode, "ISSN");
			String formatoDataDePublicacao = TesteFilhoNo(1, TipoNode, "FORMATO-DATA-DE-PUBLICACAO");
			String dataDePublicacao = TesteFilhoNo(1, TipoNode, "DATA-DE-PUBLICACAO");
			String volume = TesteFilhoNo(1, TipoNode, "VOLUME");
			String paginaInicial = TesteFilhoNo(1, TipoNode, "PAGINA-INICIAL");
			String paginaFinal = TesteFilhoNo(1, TipoNode, "PAGINA-FINAL");
			String localDePublicacao = TesteFilhoNo(1, TipoNode, "LOCAL-DE-PUBLICACAO");
			NodeList ListSubItens = TipoNode.getChildNodes();
			ArrayList<Autor> autorlista = new ArrayList<>();
			PalavraChave palavraChave = null;
			SetorAtividade setorAtividade = null;
			AreaConhecimento areaConhecimento = null;
			buscarDadosAdicionaisProducaoBibliografica(autorlista, palavraChave, setorAtividade, areaConhecimento,
					ListSubItens);
			Autores autores = new Autores(autorlista);

			TextoEmJornalOuRevista itemResultado = new TextoEmJornalOuRevista(autores, palavraChave, setorAtividade,
					areaConhecimento, natureza, tituloDoTexto, anoDoTexto, paisDePublicacao, idioma, meioDeDivulgacao,
					homePageDoTrabalho, flagRelevancia, doi, tituloDoTextoIngles, flagDivulgacaoCientifica,
					tituloDoJornalOuRevista, issn, formatoDataDePublicacao, dataDePublicacao, volume, paginaInicial,
					paginaFinal, localDePublicacao);
			ListaResultadoBusca.add(itemResultado);
		}
		return ListaResultadoBusca;
	}

	public ArrayList<ArtigoAceitoParaPublicacao> BuscaArtigoAceitoParaPublicacao() throws XPathExpressionException {
		XPathExpression expr = this.xpath.compile("//ARTIGO-ACEITO-PARA-PUBLICACAO");
		NodeList listaBuscada = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		ArrayList<ArtigoAceitoParaPublicacao> ListaResultadoBusca = new ArrayList<>();
		for (int i = 0; i < listaBuscada.getLength(); i++) {
			Node TipoNode = listaBuscada.item(i);

			String natureza = TesteFilhoNo(0, TipoNode, "NATUREZA");
			String tituloDoArtigo = TesteFilhoNo(0, TipoNode, "TITULO-DO-ARTIGO");
			String anoDoArtigo = TesteFilhoNo(0, TipoNode, "ANO-DO-ARTIGO");
			String paisDePublicacao = TesteFilhoNo(0, TipoNode, "PAIS-DE-PUBLICACAO");
			String idioma = TesteFilhoNo(0, TipoNode, "IDIOMA");
			String meioDeDivulgacao = TesteFilhoNo(0, TipoNode, "MEIO-DE-DIVULGACAO");
			String homePageDoTrabalho = TesteFilhoNo(0, TipoNode, "HOME-PAGE-DO-TRABALHO");
			String flagRelevancia = TesteFilhoNo(0, TipoNode, "FLAG-RELEVANCIA");
			String doi = TesteFilhoNo(0, TipoNode, "DOI");
			String tituloDoArtigoIngles = TesteFilhoNo(0, TipoNode, "TITULO-DO-ARTIGO-INGLES");
			String flagDivulgacaoCientifica = TesteFilhoNo(0, TipoNode, "FLAG-DIVULGACAO-CIENTIFICA");
			String tituloDoPeriodicoOuRevista = TesteFilhoNo(1, TipoNode, "TITULO-DO-PERIODICO-OU-REVISTA");
			String issn = TesteFilhoNo(1, TipoNode, "ISSN");
			String volume = TesteFilhoNo(1, TipoNode, "VOLUME");
			String fasciculo = TesteFilhoNo(1, TipoNode, "FASCICULO");
			String serie = TesteFilhoNo(1, TipoNode, "SERIE");
			String paginaInicial = TesteFilhoNo(1, TipoNode, "PAGINA-INICIAL");
			String paginaFinal = TesteFilhoNo(1, TipoNode, "PAGINA-FINAL");
			String localDePublicacao = TesteFilhoNo(1, TipoNode, "LOCAL-DE-PUBLICACAO");
			NodeList ListSubItens = TipoNode.getChildNodes();
			ArrayList<Autor> autorlista = new ArrayList<>();
			PalavraChave palavraChave = null;
			SetorAtividade setorAtividade = null;
			AreaConhecimento areaConhecimento = null;
			buscarDadosAdicionaisProducaoBibliografica(autorlista, palavraChave, setorAtividade, areaConhecimento,
					ListSubItens);
			Autores autores = new Autores(autorlista);

			ArtigoAceitoParaPublicacao itemResultado = new ArtigoAceitoParaPublicacao(autores, palavraChave,
					setorAtividade, areaConhecimento, natureza, tituloDoArtigo, anoDoArtigo, paisDePublicacao, idioma,
					meioDeDivulgacao, homePageDoTrabalho, flagRelevancia, doi, tituloDoArtigoIngles,
					flagDivulgacaoCientifica, tituloDoPeriodicoOuRevista, issn, volume, fasciculo, serie, paginaInicial,
					paginaFinal, localDePublicacao);
			ListaResultadoBusca.add(itemResultado);
		}
		return ListaResultadoBusca;
	}

	public ArrayList<PrefacioPosfacio> BuscaPrefacioPosfacio() throws XPathExpressionException {
		XPathExpression expr = this.xpath.compile("//PREFACIO-POSFACIO");
		NodeList listaBuscada = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		ArrayList<PrefacioPosfacio> ListaResultadoBusca = new ArrayList<>();
		for (int i = 0; i < listaBuscada.getLength(); i++) {
			Node TipoNode = listaBuscada.item(i);

			String tipo = TesteFilhoNo(0, TipoNode, "TIPO");
			String natureza = TesteFilhoNo(0, TipoNode, "NATUREZA");
			String titulo = TesteFilhoNo(0, TipoNode, "TITULO");
			String ano = TesteFilhoNo(0, TipoNode, "ANO");
			String paisDePublicacao = TesteFilhoNo(0, TipoNode, "PAIS-DE-PUBLICACAO");
			String idioma = TesteFilhoNo(0, TipoNode, "IDIOMA");
			String meioDeDivulgacao = TesteFilhoNo(0, TipoNode, "MEIO-DE-DIVULGACAO");
			String homePageDoTrabalho = TesteFilhoNo(0, TipoNode, "HOME-PAGE-DO-TRABALHO");
			String flagRelevancia = TesteFilhoNo(0, TipoNode, "FLAG-RELEVANCIA");
			String doi = TesteFilhoNo(0, TipoNode, "DOI");
			String tituloIngles = TesteFilhoNo(0, TipoNode, "TITULO-INGLES");
			String nomeDoAutorDaPublicacao = TesteFilhoNo(1, TipoNode, "NOME-DO-AUTOR-DA-PUBLICACAO");
			String tituloDaPublicacao = TesteFilhoNo(1, TipoNode, "TITULO-DA-PUBLICACAO");
			String issnIsbn = TesteFilhoNo(1, TipoNode, "ISSN-ISBN");
			String numeroDaEdicaoRevisao = TesteFilhoNo(1, TipoNode, "NUMERO-DA-EDICAO-REVISAO");
			String volume = TesteFilhoNo(1, TipoNode, "VOLUME");
			String serie = TesteFilhoNo(1, TipoNode, "SERIE");
			String fasciculo = TesteFilhoNo(1, TipoNode, "FASCICULO");
			String editoraDoPrefacioPosfacio = TesteFilhoNo(1, TipoNode, "EDITORA-DO-PREFACIO-POSFACIO");
			String cidadeDaEditora = TesteFilhoNo(1, TipoNode, "CIDADE-DA-EDITORA");
			NodeList ListSubItens = TipoNode.getChildNodes();
			ArrayList<Autor> autorlista = new ArrayList<>();
			PalavraChave palavraChave = null;
			SetorAtividade setorAtividade = null;
			AreaConhecimento areaConhecimento = null;
			buscarDadosAdicionaisProducaoBibliografica(autorlista, palavraChave, setorAtividade, areaConhecimento,
					ListSubItens);
			Autores autores = new Autores(autorlista);

			PrefacioPosfacio itemResultado = new PrefacioPosfacio(autores, palavraChave, setorAtividade,
					areaConhecimento, tipo, natureza, titulo, ano, paisDePublicacao, idioma, meioDeDivulgacao,
					homePageDoTrabalho, flagRelevancia, doi, tituloIngles, nomeDoAutorDaPublicacao, tituloDaPublicacao,
					issnIsbn, numeroDaEdicaoRevisao, volume, serie, fasciculo, editoraDoPrefacioPosfacio,
					cidadeDaEditora);
			ListaResultadoBusca.add(itemResultado);
		}
		return ListaResultadoBusca;
	}

	public ArrayList<Traducao> BuscaTraducao() throws XPathExpressionException {
		XPathExpression expr = this.xpath.compile("//TRADUCAO");
		NodeList listaBuscada = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		ArrayList<Traducao> ListaResultadoBusca = new ArrayList<>();
		for (int i = 0; i < listaBuscada.getLength(); i++) {
			Node TipoNode = listaBuscada.item(i);

			String natureza = TesteFilhoNo(0, TipoNode, "NATUREZA");
			String titulo = TesteFilhoNo(0, TipoNode, "TITULO");
			String ano = TesteFilhoNo(0, TipoNode, "ANO");
			String paisDePublicacao = TesteFilhoNo(0, TipoNode, "PAIS-DE-PUBLICACAO");
			String idioma = TesteFilhoNo(0, TipoNode, "IDIOMA");
			String meioDeDivulgacao = TesteFilhoNo(0, TipoNode, "MEIO-DE-DIVULGACAO");
			String homePageDoTrabalho = TesteFilhoNo(0, TipoNode, "HOME-PAGE-DO-TRABALHO");
			String flagRelevancia = TesteFilhoNo(0, TipoNode, "FLAG-RELEVANCIA");
			String doi = TesteFilhoNo(0, TipoNode, "DOI");
			String tituloIngles = TesteFilhoNo(0, TipoNode, "TITULO-INGLES");
			String nomeDoAutorTraduzido = TesteFilhoNo(1, TipoNode, "NOME-DO-AUTOR-TRADUZIDO");
			String tituloDaObraOriginal = TesteFilhoNo(1, TipoNode, "TITULO-DA-OBRA-ORIGINAL");
			String issnIsbn = TesteFilhoNo(1, TipoNode, "ISSN-ISBN");
			String idiomaDaObraOriginal = TesteFilhoNo(1, TipoNode, "IDIOMA-DA-OBRA-ORIGINAL");
			String editoraDaTraducao = TesteFilhoNo(1, TipoNode, "EDITORA-DA-TRADUCAO");
			String cidadeDaEditora = TesteFilhoNo(1, TipoNode, "CIDADE-DA-EDITORA");
			String numeroDePaginas = TesteFilhoNo(1, TipoNode, "NUMERO-DE-PAGINAS");
			String numeroDaEdicaoRevisao = TesteFilhoNo(1, TipoNode, "NUMERO-DA-EDICAO-REVISAO");
			String volume = TesteFilhoNo(1, TipoNode, "VOLUME");
			String fasciculo = TesteFilhoNo(1, TipoNode, "FASCICULO");
			String serie = TesteFilhoNo(1, TipoNode, "SERIE");
			NodeList ListSubItens = TipoNode.getChildNodes();
			ArrayList<Autor> autorlista = new ArrayList<>();
			PalavraChave palavraChave = null;
			SetorAtividade setorAtividade = null;
			AreaConhecimento areaConhecimento = null;
			buscarDadosAdicionaisProducaoBibliografica(autorlista, palavraChave, setorAtividade, areaConhecimento,
					ListSubItens);
			Autores autores = new Autores(autorlista);

			Traducao itemResultado = new Traducao(autores, palavraChave, setorAtividade, areaConhecimento, natureza,
					titulo, ano, paisDePublicacao, idioma, meioDeDivulgacao, homePageDoTrabalho, flagRelevancia, doi,
					tituloIngles, nomeDoAutorTraduzido, tituloDaObraOriginal, issnIsbn, idiomaDaObraOriginal,
					editoraDaTraducao, cidadeDaEditora, numeroDePaginas, numeroDaEdicaoRevisao, volume, fasciculo,
					serie);
			ListaResultadoBusca.add(itemResultado);
		}
		return ListaResultadoBusca;
	}

}
