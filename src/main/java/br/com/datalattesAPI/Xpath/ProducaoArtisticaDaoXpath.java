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
import br.com.datalattesAPI.model.ProducaoArtistica.ApresentacaoDeObraArtistica;
import br.com.datalattesAPI.model.ProducaoArtistica.ApresentacaoEmRadioOuTv;
import br.com.datalattesAPI.model.ProducaoArtistica.ArranjoMusical;
import br.com.datalattesAPI.model.ProducaoArtistica.ArtesCenicas;
import br.com.datalattesAPI.model.ProducaoArtistica.ArtesVisuais;
import br.com.datalattesAPI.model.ProducaoArtistica.ComposicaoMusical;
import br.com.datalattesAPI.model.ProducaoArtistica.CursoDeCurtaDuracao;
import br.com.datalattesAPI.model.ProducaoArtistica.Musica;
import br.com.datalattesAPI.model.ProducaoArtistica.ObraDeArtesVisuais;
import br.com.datalattesAPI.model.ProducaoArtistica.OutraProducaoArtisticaCultural;
import br.com.datalattesAPI.model.ProducaoArtistica.PartituraMusical;
import br.com.datalattesAPI.model.ProducaoArtistica.Sonoplastia;

public class ProducaoArtisticaDaoXpath extends AbstractXpath {

	public ProducaoArtisticaDaoXpath(File file) {
		super(file);
	}

	public ArrayList<PartituraMusical> BuscaPartituraMusical() throws XPathExpressionException {
		XPathExpression expr = this.xpath.compile("//PARTITURA-MUSICAL");
		NodeList listaBuscada = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		ArrayList<PartituraMusical> ListaResultadoBusca = new ArrayList<>();
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
			String formacaoInstrumental = TesteFilhoNo(1, TipoNode, "FORMACAO-INSTRUMENTAL");
			String editora = TesteFilhoNo(1, TipoNode, "EDITORA");
			String cidadeDaEditora = TesteFilhoNo(1, TipoNode, "CIDADE-DA-EDITORA");
			String numeroDePaginas = TesteFilhoNo(1, TipoNode, "NUMERO-DE-PAGINAS");
			String numeroDoCatalogo = TesteFilhoNo(1, TipoNode, "NUMERO-DO-CATALOGO");
			NodeList ListSubItens = TipoNode.getChildNodes();
			ArrayList<Autor> autorlista = new ArrayList<>();
			PalavraChave palavraChave = null;
			SetorAtividade setorAtividade = null;
			AreaConhecimento areaConhecimento = null;
			buscarDadosAdicionaisProducaoBibliografica(autorlista, palavraChave, setorAtividade, areaConhecimento,
					ListSubItens);
			Autores autores = new Autores(autorlista);

			PartituraMusical itemResultado = new PartituraMusical(autores, palavraChave, setorAtividade,
					areaConhecimento, natureza, titulo, ano, paisDePublicacao, idioma, meioDeDivulgacao,
					homePageDoTrabalho, flagRelevancia, doi, tituloIngles, formacaoInstrumental, editora,
					cidadeDaEditora, numeroDePaginas, numeroDoCatalogo);
			ListaResultadoBusca.add(itemResultado);
		}
		return ListaResultadoBusca;
	}

	public ArrayList<ApresentacaoDeObraArtistica> BuscaApresentacaoDeObraArtistica() throws XPathExpressionException {
		XPathExpression expr = this.xpath.compile("//APRESENTACAO-DE-OBRA-ARTISTICA");
		NodeList listaBuscada = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		ArrayList<ApresentacaoDeObraArtistica> ListaResultadoBusca = new ArrayList<>();
		for (int i = 0; i < listaBuscada.getLength(); i++) {
			Node TipoNode = listaBuscada.item(i);

			String natureza = TesteFilhoNo(0, TipoNode, "NATUREZA");
			String titulo = TesteFilhoNo(0, TipoNode, "TITULO");
			String ano = TesteFilhoNo(0, TipoNode, "ANO");
			String pais = TesteFilhoNo(0, TipoNode, "PAIS");
			String idioma = TesteFilhoNo(0, TipoNode, "IDIOMA");
			String meioDeDivulgacao = TesteFilhoNo(0, TipoNode, "MEIO-DE-DIVULGACAO");
			String homePage = TesteFilhoNo(0, TipoNode, "HOME-PAGE");
			String flagRelevancia = TesteFilhoNo(0, TipoNode, "FLAG-RELEVANCIA");
			String doi = TesteFilhoNo(0, TipoNode, "DOI");
			String tituloIngles = TesteFilhoNo(0, TipoNode, "TITULO-INGLES");
			String tipoDeEvento = TesteFilhoNo(1, TipoNode, "TIPO-DE-EVENTO");
			String atividadeDosAutores = TesteFilhoNo(1, TipoNode, "ATIVIDADE-DOS-AUTORES");
			String flagIneditismoDaObra = TesteFilhoNo(1, TipoNode, "FLAG-INEDITISMO-DA-OBRA");
			String premiacao = TesteFilhoNo(1, TipoNode, "PREMIACAO");
			String obraDeReferencia = TesteFilhoNo(1, TipoNode, "OBRA-DE-REFERENCIA");
			String autorDaObraDeReferencia = TesteFilhoNo(1, TipoNode, "AUTOR-DA-OBRA-DE-REFERENCIA");
			String anoDaObraDeReferencia = TesteFilhoNo(1, TipoNode, "ANO-DA-OBRA-DE-REFERENCIA");
			String duracaoEmMinutos = TesteFilhoNo(1, TipoNode, "DURACAO-EM-MINUTOS");
			String instituicaoPromotoraDoEvento = TesteFilhoNo(1, TipoNode, "INSTITUICAO-PROMOTORA-DO-EVENTO");
			String localDoEvento = TesteFilhoNo(1, TipoNode, "LOCAL-DO-EVENTO");
			String cidade = TesteFilhoNo(1, TipoNode, "CIDADE");
			NodeList ListSubItens = TipoNode.getChildNodes();
			ArrayList<Autor> autorlista = new ArrayList<>();
			PalavraChave palavraChave = null;
			SetorAtividade setorAtividade = null;
			AreaConhecimento areaConhecimento = null;
			buscarDadosAdicionaisProducaoBibliografica(autorlista, palavraChave, setorAtividade, areaConhecimento,
					ListSubItens);
			Autores autores = new Autores(autorlista);

			ApresentacaoDeObraArtistica itemResultado = new ApresentacaoDeObraArtistica(autores, palavraChave,
					setorAtividade, areaConhecimento, natureza, titulo, ano, pais, idioma, meioDeDivulgacao, homePage,
					flagRelevancia, doi, tituloIngles, tipoDeEvento, atividadeDosAutores, flagIneditismoDaObra,
					premiacao, obraDeReferencia, autorDaObraDeReferencia, anoDaObraDeReferencia, duracaoEmMinutos,
					instituicaoPromotoraDoEvento, localDoEvento, cidade);
			ListaResultadoBusca.add(itemResultado);
		}
		return ListaResultadoBusca;
	}

	public ArrayList<ApresentacaoEmRadioOuTv> BuscaApresentacaoEmRadioOuTv() throws XPathExpressionException {
		XPathExpression expr = this.xpath.compile("//APRESENTACAO-EM-RADIO-OU-TV");
		NodeList listaBuscada = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		ArrayList<ApresentacaoEmRadioOuTv> ListaResultadoBusca = new ArrayList<>();
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
			String emissora = TesteFilhoNo(1, TipoNode, "EMISSORA");
			String formatoDataDeApresentacao = TesteFilhoNo(1, TipoNode, "FORMATO-DATA-DE-APRESENTACAO");
			String dataDeApresentacao = TesteFilhoNo(1, TipoNode, "DATA-DE-APRESENTACAO");
			String duracaoEmMinutos = TesteFilhoNo(1, TipoNode, "DURACAO-EM-MINUTOS");
			String cidade = TesteFilhoNo(1, TipoNode, "CIDADE");
			NodeList ListSubItens = TipoNode.getChildNodes();
			ArrayList<Autor> autorlista = new ArrayList<>();
			PalavraChave palavraChave = null;
			SetorAtividade setorAtividade = null;
			AreaConhecimento areaConhecimento = null;
			buscarDadosAdicionaisProducaoBibliografica(autorlista, palavraChave, setorAtividade, areaConhecimento,
					ListSubItens);
			Autores autores = new Autores(autorlista);

			ApresentacaoEmRadioOuTv itemResultado = new ApresentacaoEmRadioOuTv(autores, palavraChave, setorAtividade,
					areaConhecimento, natureza, titulo, ano, pais, idioma, flagRelevancia, doi, tituloIngles,
					flagDivulgacaoCientifica, emissora, formatoDataDeApresentacao, dataDeApresentacao, duracaoEmMinutos,
					cidade);
			ListaResultadoBusca.add(itemResultado);
		}
		return ListaResultadoBusca;
	}

	public ArrayList<ArranjoMusical> BuscaArranjoMusical() throws XPathExpressionException {
		XPathExpression expr = this.xpath.compile("//ARRANJO-MUSICAL");
		NodeList listaBuscada = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		ArrayList<ArranjoMusical> ListaResultadoBusca = new ArrayList<>();
		for (int i = 0; i < listaBuscada.getLength(); i++) {
			Node TipoNode = listaBuscada.item(i);

			String natureza = TesteFilhoNo(0, TipoNode, "NATUREZA");
			String titulo = TesteFilhoNo(0, TipoNode, "TITULO");
			String ano = TesteFilhoNo(0, TipoNode, "ANO");
			String pais = TesteFilhoNo(0, TipoNode, "PAIS");
			String meioDeDivulgacao = TesteFilhoNo(0, TipoNode, "MEIO-DE-DIVULGACAO");
			String homePage = TesteFilhoNo(0, TipoNode, "HOME-PAGE");
			String flagRelevancia = TesteFilhoNo(0, TipoNode, "FLAG-RELEVANCIA");
			String doi = TesteFilhoNo(0, TipoNode, "DOI");
			String tituloIngles = TesteFilhoNo(0, TipoNode, "TITULO-INGLES");
			String autorDaObraDeReferencia = TesteFilhoNo(1, TipoNode, "AUTOR-DA-OBRA-DE-REFERENCIA");
			String anoDaObraDeReferencia = TesteFilhoNo(1, TipoNode, "ANO-DA-OBRA-DE-REFERENCIA");
			String formacaoInstrumental = TesteFilhoNo(1, TipoNode, "FORMACAO-INSTRUMENTAL");
			String registroDeDireitoAutoral = TesteFilhoNo(1, TipoNode, "REGISTRO-DE-DIREITO-AUTORAL");
			String premiacao = TesteFilhoNo(1, TipoNode, "PREMIACAO");
			NodeList ListSubItens = TipoNode.getChildNodes();
			ArrayList<Autor> autorlista = new ArrayList<>();
			PalavraChave palavraChave = null;
			SetorAtividade setorAtividade = null;
			AreaConhecimento areaConhecimento = null;
			buscarDadosAdicionaisProducaoBibliografica(autorlista, palavraChave, setorAtividade, areaConhecimento,
					ListSubItens);
			Autores autores = new Autores(autorlista);

			ArranjoMusical itemResultado = new ArranjoMusical(autores, palavraChave, setorAtividade, areaConhecimento,
					natureza, titulo, ano, pais, meioDeDivulgacao, homePage, flagRelevancia, doi, tituloIngles,
					autorDaObraDeReferencia, anoDaObraDeReferencia, formacaoInstrumental, registroDeDireitoAutoral,
					premiacao);
			ListaResultadoBusca.add(itemResultado);
		}
		return ListaResultadoBusca;
	}

	public ArrayList<ComposicaoMusical> BuscaComposicaoMusical() throws XPathExpressionException {
		XPathExpression expr = this.xpath.compile("//COMPOSICAO-MUSICAL");
		NodeList listaBuscada = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		ArrayList<ComposicaoMusical> ListaResultadoBusca = new ArrayList<>();
		for (int i = 0; i < listaBuscada.getLength(); i++) {
			Node TipoNode = listaBuscada.item(i);

			String natureza = TesteFilhoNo(0, TipoNode, "NATUREZA");
			String titulo = TesteFilhoNo(0, TipoNode, "TITULO");
			String ano = TesteFilhoNo(0, TipoNode, "ANO");
			String pais = TesteFilhoNo(0, TipoNode, "PAIS");
			String idioma = TesteFilhoNo(0, TipoNode, "IDIOMA");
			String meioDeDivulgacao = TesteFilhoNo(0, TipoNode, "MEIO-DE-DIVULGACAO");
			String homePage = TesteFilhoNo(0, TipoNode, "HOME-PAGE");
			String flagRelevancia = TesteFilhoNo(0, TipoNode, "FLAG-RELEVANCIA");
			String doi = TesteFilhoNo(0, TipoNode, "DOI");
			String tituloIngles = TesteFilhoNo(0, TipoNode, "TITULO-INGLES");
			String formacaoInstrumental = TesteFilhoNo(1, TipoNode, "FORMACAO-INSTRUMENTAL");
			String numeroDePaginas = TesteFilhoNo(1, TipoNode, "NUMERO-DE-PAGINAS");
			String registroDeDireitoAutoral = TesteFilhoNo(1, TipoNode, "REGISTRO-DE-DIREITO-AUTORAL");
			String premiacao = TesteFilhoNo(1, TipoNode, "PREMIACAO");
			NodeList ListSubItens = TipoNode.getChildNodes();
			ArrayList<Autor> autorlista = new ArrayList<>();
			PalavraChave palavraChave = null;
			SetorAtividade setorAtividade = null;
			AreaConhecimento areaConhecimento = null;
			buscarDadosAdicionaisProducaoBibliografica(autorlista, palavraChave, setorAtividade, areaConhecimento,
					ListSubItens);
			Autores autores = new Autores(autorlista);

			ComposicaoMusical itemResultado = new ComposicaoMusical(autores, palavraChave, setorAtividade,
					areaConhecimento, natureza, titulo, ano, pais, idioma, meioDeDivulgacao, homePage, flagRelevancia,
					doi, tituloIngles, formacaoInstrumental, numeroDePaginas, registroDeDireitoAutoral, premiacao);
			ListaResultadoBusca.add(itemResultado);
		}
		return ListaResultadoBusca;
	}

	public ArrayList<CursoDeCurtaDuracao> BuscaCursoDeCurtaDuracao() throws XPathExpressionException {
		XPathExpression expr = this.xpath.compile("//CURSO-DE-CURTA-DURACAO");
		NodeList listaBuscada = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		ArrayList<CursoDeCurtaDuracao> ListaResultadoBusca = new ArrayList<>();
		for (int i = 0; i < listaBuscada.getLength(); i++) {
			Node TipoNode = listaBuscada.item(i);

			String natureza = TesteFilhoNo(0, TipoNode, "NATUREZA");
			String titulo = TesteFilhoNo(0, TipoNode, "TITULO");
			String ano = TesteFilhoNo(0, TipoNode, "ANO");
			String pais = TesteFilhoNo(0, TipoNode, "PAIS");
			String idioma = TesteFilhoNo(0, TipoNode, "IDIOMA");
			String meioDeDivulgacao = TesteFilhoNo(0, TipoNode, "MEIO-DE-DIVULGACAO");
			String homePage = TesteFilhoNo(0, TipoNode, "HOME-PAGE");
			String flagRelevancia = TesteFilhoNo(0, TipoNode, "FLAG-RELEVANCIA");
			String doi = TesteFilhoNo(0, TipoNode, "DOI");
			String tituloIngles = TesteFilhoNo(0, TipoNode, "TITULO-INGLES");
			String duracao = TesteFilhoNo(1, TipoNode, "DURACAO");
			String unidade = TesteFilhoNo(1, TipoNode, "UNIDADE");
			String instituicaoPromotoraDoEvento = TesteFilhoNo(1, TipoNode, "INSTITUICAO-PROMOTORA-DO-EVENTO");
			String localDoEvento = TesteFilhoNo(1, TipoNode, "LOCAL-DO-EVENTO");
			String cidade = TesteFilhoNo(1, TipoNode, "CIDADE");
			NodeList ListSubItens = TipoNode.getChildNodes();
			ArrayList<Autor> autorlista = new ArrayList<>();
			PalavraChave palavraChave = null;
			SetorAtividade setorAtividade = null;
			AreaConhecimento areaConhecimento = null;
			buscarDadosAdicionaisProducaoBibliografica(autorlista, palavraChave, setorAtividade, areaConhecimento,
					ListSubItens);
			Autores autores = new Autores(autorlista);

			CursoDeCurtaDuracao itemResultado = new CursoDeCurtaDuracao(autores, palavraChave, setorAtividade,
					areaConhecimento, natureza, titulo, ano, pais, idioma, meioDeDivulgacao, homePage, flagRelevancia,
					doi, tituloIngles, duracao, unidade, instituicaoPromotoraDoEvento, localDoEvento, cidade);
			ListaResultadoBusca.add(itemResultado);
		}
		return ListaResultadoBusca;
	}

	public ArrayList<ObraDeArtesVisuais> BuscaObraDeArtesVisuais() throws XPathExpressionException {
		XPathExpression expr = this.xpath.compile("//OBRA-DE-ARTES-VISUAIS");
		NodeList listaBuscada = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		ArrayList<ObraDeArtesVisuais> ListaResultadoBusca = new ArrayList<>();
		for (int i = 0; i < listaBuscada.getLength(); i++) {
			Node TipoNode = listaBuscada.item(i);

			String natureza = TesteFilhoNo(0, TipoNode, "NATUREZA");
			String titulo = TesteFilhoNo(0, TipoNode, "TITULO");
			String ano = TesteFilhoNo(0, TipoNode, "ANO");
			String pais = TesteFilhoNo(0, TipoNode, "PAIS");
			String idioma = TesteFilhoNo(0, TipoNode, "IDIOMA");
			String meioDeDivulgacao = TesteFilhoNo(0, TipoNode, "MEIO-DE-DIVULGACAO");
			String homePage = TesteFilhoNo(0, TipoNode, "HOME-PAGE");
			String flagRelevancia = TesteFilhoNo(0, TipoNode, "FLAG-RELEVANCIA");
			String doi = TesteFilhoNo(0, TipoNode, "DOI");
			String tituloIngles = TesteFilhoNo(0, TipoNode, "TITULO-INGLES");
			String materialEmpregado = TesteFilhoNo(1, TipoNode, "MATERIAL-EMPREGADO");
			String tipoDeEvento = TesteFilhoNo(1, TipoNode, "TIPO-DE-EVENTO");
			String evento = TesteFilhoNo(1, TipoNode, "EVENTO");
			String premiacao = TesteFilhoNo(1, TipoNode, "PREMIACAO");
			String acervo = TesteFilhoNo(1, TipoNode, "ACERVO");
			String instituicaoPromotora = TesteFilhoNo(1, TipoNode, "INSTITUICAO-PROMOTORA");
			NodeList ListSubItens = TipoNode.getChildNodes();
			ArrayList<Autor> autorlista = new ArrayList<>();
			PalavraChave palavraChave = null;
			SetorAtividade setorAtividade = null;
			AreaConhecimento areaConhecimento = null;
			buscarDadosAdicionaisProducaoBibliografica(autorlista, palavraChave, setorAtividade, areaConhecimento,
					ListSubItens);
			Autores autores = new Autores(autorlista);

			ObraDeArtesVisuais itemResultado = new ObraDeArtesVisuais(autores, palavraChave, setorAtividade,
					areaConhecimento, natureza, titulo, ano, pais, idioma, meioDeDivulgacao, homePage, flagRelevancia,
					doi, tituloIngles, materialEmpregado, tipoDeEvento, evento, premiacao, acervo,
					instituicaoPromotora);
			ListaResultadoBusca.add(itemResultado);
		}
		return ListaResultadoBusca;
	}

	public ArrayList<OutraProducaoArtisticaCultural> BuscaOutraProducaoArtisticaCultural()
			throws XPathExpressionException {
		XPathExpression expr = this.xpath.compile("//OUTRA-PRODUCAO-ARTISTICA-CULTURAL");
		NodeList listaBuscada = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		ArrayList<OutraProducaoArtisticaCultural> ListaResultadoBusca = new ArrayList<>();
		for (int i = 0; i < listaBuscada.getLength(); i++) {
			Node TipoNode = listaBuscada.item(i);

			String natureza = TesteFilhoNo(0, TipoNode, "NATUREZA");
			String titulo = TesteFilhoNo(0, TipoNode, "TITULO");
			String ano = TesteFilhoNo(0, TipoNode, "ANO");
			String pais = TesteFilhoNo(0, TipoNode, "PAIS");
			String idioma = TesteFilhoNo(0, TipoNode, "IDIOMA");
			String meioDeDivulgacao = TesteFilhoNo(0, TipoNode, "MEIO-DE-DIVULGACAO");
			String homePage = TesteFilhoNo(0, TipoNode, "HOME-PAGE");
			String flagRelevancia = TesteFilhoNo(0, TipoNode, "FLAG-RELEVANCIA");
			String doi = TesteFilhoNo(0, TipoNode, "DOI");
			String tituloIngles = TesteFilhoNo(0, TipoNode, "TITULO-INGLES");
			String naturezaIngles = TesteFilhoNo(0, TipoNode, "NATUREZA-INGLES");
			String flagDivulgacaoCientifica = TesteFilhoNo(0, TipoNode, "FLAG-DIVULGACAO-CIENTIFICA");
			String instituicaoPromotoraDoEvento = TesteFilhoNo(1, TipoNode, "INSTITUICAO-PROMOTORA-DO-EVENTO");
			String localDoEvento = TesteFilhoNo(1, TipoNode, "LOCAL-DO-EVENTO");
			String cidade = TesteFilhoNo(1, TipoNode, "CIDADE");
			String exposicao = TesteFilhoNo(1, TipoNode, "EXPOSICAO");
			String premiacao = TesteFilhoNo(1, TipoNode, "PREMIACAO");
			NodeList ListSubItens = TipoNode.getChildNodes();
			ArrayList<Autor> autorlista = new ArrayList<>();
			PalavraChave palavraChave = null;
			SetorAtividade setorAtividade = null;
			AreaConhecimento areaConhecimento = null;
			buscarDadosAdicionaisProducaoBibliografica(autorlista, palavraChave, setorAtividade, areaConhecimento,
					ListSubItens);
			Autores autores = new Autores(autorlista);

			OutraProducaoArtisticaCultural itemResultado = new OutraProducaoArtisticaCultural(autores, palavraChave,
					setorAtividade, areaConhecimento, natureza, titulo, ano, pais, idioma, meioDeDivulgacao, homePage,
					flagRelevancia, doi, tituloIngles, naturezaIngles, flagDivulgacaoCientifica,
					instituicaoPromotoraDoEvento, localDoEvento, cidade, exposicao, premiacao);
			ListaResultadoBusca.add(itemResultado);
		}
		return ListaResultadoBusca;
	}

	public ArrayList<Sonoplastia> BuscaSonoplastia() throws XPathExpressionException {
		XPathExpression expr = this.xpath.compile("//SONOPLASTIA");
		NodeList listaBuscada = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		ArrayList<Sonoplastia> ListaResultadoBusca = new ArrayList<>();
		for (int i = 0; i < listaBuscada.getLength(); i++) {
			Node TipoNode = listaBuscada.item(i);

			String natureza = TesteFilhoNo(0, TipoNode, "NATUREZA");
			String titulo = TesteFilhoNo(0, TipoNode, "TITULO");
			String ano = TesteFilhoNo(0, TipoNode, "ANO");
			String pais = TesteFilhoNo(0, TipoNode, "PAIS");
			String meioDeDivulgacao = TesteFilhoNo(0, TipoNode, "MEIO-DE-DIVULGACAO");
			String homePage = TesteFilhoNo(0, TipoNode, "HOME-PAGE");
			String flagRelevancia = TesteFilhoNo(0, TipoNode, "FLAG-RELEVANCIA");
			String doi = TesteFilhoNo(0, TipoNode, "DOI");
			String tituloIngles = TesteFilhoNo(0, TipoNode, "TITULO-INGLES");
			String finalidade = TesteFilhoNo(1, TipoNode, "FINALIDADE");
			String premiacao = TesteFilhoNo(1, TipoNode, "PREMIACAO");
			NodeList ListSubItens = TipoNode.getChildNodes();
			ArrayList<Autor> autorlista = new ArrayList<>();
			PalavraChave palavraChave = null;
			SetorAtividade setorAtividade = null;
			AreaConhecimento areaConhecimento = null;
			buscarDadosAdicionaisProducaoBibliografica(autorlista, palavraChave, setorAtividade, areaConhecimento,
					ListSubItens);
			Autores autores = new Autores(autorlista);

			Sonoplastia itemResultado = new Sonoplastia(autores, palavraChave, setorAtividade, areaConhecimento,
					natureza, titulo, ano, pais, meioDeDivulgacao, homePage, flagRelevancia, doi, tituloIngles,
					finalidade, premiacao);
			ListaResultadoBusca.add(itemResultado);
		}
		return ListaResultadoBusca;
	}

	public ArrayList<ArtesCenicas> BuscaArtesCenicas() throws XPathExpressionException {
		XPathExpression expr = this.xpath.compile("//ARTES-CENICAS");
		NodeList listaBuscada = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		ArrayList<ArtesCenicas> ListaResultadoBusca = new ArrayList<>();
		for (int i = 0; i < listaBuscada.getLength(); i++) {
			Node TipoNode = listaBuscada.item(i);

			String natureza = TesteFilhoNo(0, TipoNode, "NATUREZA");
			String titulo = TesteFilhoNo(0, TipoNode, "TITULO");
			String ano = TesteFilhoNo(0, TipoNode, "ANO");
			String pais = TesteFilhoNo(0, TipoNode, "PAIS");
			String idioma = TesteFilhoNo(0, TipoNode, "IDIOMA");
			String flagRelevancia = TesteFilhoNo(0, TipoNode, "FLAG-RELEVANCIA");
			String tituloIngles = TesteFilhoNo(0, TipoNode, "TITULO-INGLES");
			String meioDeDivulgacao = TesteFilhoNo(0, TipoNode, "MEIO-DE-DIVULGACAO");
			String homePage = TesteFilhoNo(0, TipoNode, "HOME-PAGE");
			String flagDivulgacaoCientifica = TesteFilhoNo(0, TipoNode, "FLAG-DIVULGACAO-CIENTIFICA");
			String tipoDeEvento = TesteFilhoNo(1, TipoNode, "TIPO-DE-EVENTO");
			String atividadeDosAutores = TesteFilhoNo(1, TipoNode, "ATIVIDADE-DOS-AUTORES");
			String dataEstreia = TesteFilhoNo(1, TipoNode, "DATA-ESTREIA");
			String dataEncerramento = TesteFilhoNo(1, TipoNode, "DATA-ENCERRAMENTO");
			String localDeEstreia = TesteFilhoNo(1, TipoNode, "LOCAL-DE-ESTREIA");
			String premiacao = TesteFilhoNo(1, TipoNode, "PREMIACAO");
			String instituicaoPromotoraDoPremio = TesteFilhoNo(1, TipoNode, "INSTITUICAO-PROMOTORA-DO-PREMIO");
			String obraDeReferencia = TesteFilhoNo(1, TipoNode, "OBRA-DE-REFERENCIA");
			String autorDaObraDeReferencia = TesteFilhoNo(1, TipoNode, "AUTOR-DA-OBRA-DE-REFERENCIA");
			String anoDaObraDeReferencia = TesteFilhoNo(1, TipoNode, "ANO-DA-OBRA-DE-REFERENCIA");
			String duracao = TesteFilhoNo(1, TipoNode, "DURACAO");
			String temporada = TesteFilhoNo(1, TipoNode, "TEMPORADA");
			String instituicaoPromotoraDoEvento = TesteFilhoNo(1, TipoNode, "INSTITUICAO-PROMOTORA-DO-EVENTO");
			String localDoEvento = TesteFilhoNo(1, TipoNode, "LOCAL-DO-EVENTO");
			String cidadeDoEvento = TesteFilhoNo(1, TipoNode, "CIDADE-DO-EVENTO");
			String flagItinerante = TesteFilhoNo(1, TipoNode, "FLAG-ITINERANTE");
			NodeList ListSubItens = TipoNode.getChildNodes();
			ArrayList<Autor> autorlista = new ArrayList<>();
			PalavraChave palavraChave = null;
			SetorAtividade setorAtividade = null;
			AreaConhecimento areaConhecimento = null;
			buscarDadosAdicionaisProducaoBibliografica(autorlista, palavraChave, setorAtividade, areaConhecimento,
					ListSubItens);
			Autores autores = new Autores(autorlista);

			ArtesCenicas itemResultado = new ArtesCenicas(autores, palavraChave, setorAtividade, areaConhecimento,
					natureza, titulo, ano, pais, idioma, flagRelevancia, tituloIngles, meioDeDivulgacao, homePage,
					flagDivulgacaoCientifica, tipoDeEvento, atividadeDosAutores, dataEstreia, dataEncerramento,
					localDeEstreia, premiacao, instituicaoPromotoraDoPremio, obraDeReferencia, autorDaObraDeReferencia,
					anoDaObraDeReferencia, duracao, temporada, instituicaoPromotoraDoEvento, localDoEvento,
					cidadeDoEvento, flagItinerante);
			ListaResultadoBusca.add(itemResultado);
		}
		return ListaResultadoBusca;
	}

	public ArrayList<ArtesVisuais> BuscaArtesVisuais() throws XPathExpressionException {
		XPathExpression expr = this.xpath.compile("//ARTES-VISUAIS");
		NodeList listaBuscada = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		ArrayList<ArtesVisuais> ListaResultadoBusca = new ArrayList<>();
		for (int i = 0; i < listaBuscada.getLength(); i++) {
			Node TipoNode = listaBuscada.item(i);

			String natureza = TesteFilhoNo(0, TipoNode, "NATUREZA");
			String titulo = TesteFilhoNo(0, TipoNode, "TITULO");
			String ano = TesteFilhoNo(0, TipoNode, "ANO");
			String pais = TesteFilhoNo(0, TipoNode, "PAIS");
			String idioma = TesteFilhoNo(0, TipoNode, "IDIOMA");
			String flagRelevancia = TesteFilhoNo(0, TipoNode, "FLAG-RELEVANCIA");
			String tituloIngles = TesteFilhoNo(0, TipoNode, "TITULO-INGLES");
			String meioDeDivulgacao = TesteFilhoNo(0, TipoNode, "MEIO-DE-DIVULGACAO");
			String homePage = TesteFilhoNo(0, TipoNode, "HOME-PAGE");
			String flagDivulgacaoCientifica = TesteFilhoNo(0, TipoNode, "FLAG-DIVULGACAO-CIENTIFICA");
			String premiacao = TesteFilhoNo(1, TipoNode, "PREMIACAO");
			String atividadeDosAutores = TesteFilhoNo(1, TipoNode, "ATIVIDADE-DOS-AUTORES");
			String instituicaoPromotoraDoEvento = TesteFilhoNo(1, TipoNode, "INSTITUICAO-PROMOTORA-DO-EVENTO");
			String localDoEvento = TesteFilhoNo(1, TipoNode, "LOCAL-DO-EVENTO");
			String cidadeDoEvento = TesteFilhoNo(1, TipoNode, "CIDADE-DO-EVENTO");
			String temporada = TesteFilhoNo(1, TipoNode, "TEMPORADA");
			NodeList ListSubItens = TipoNode.getChildNodes();
			ArrayList<Autor> autorlista = new ArrayList<>();
			PalavraChave palavraChave = null;
			SetorAtividade setorAtividade = null;
			AreaConhecimento areaConhecimento = null;
			buscarDadosAdicionaisProducaoBibliografica(autorlista, palavraChave, setorAtividade, areaConhecimento,
					ListSubItens);
			Autores autores = new Autores(autorlista);

			ArtesVisuais itemResultado = new ArtesVisuais(autores, palavraChave, setorAtividade, areaConhecimento,
					natureza, titulo, ano, pais, idioma, flagRelevancia, tituloIngles, meioDeDivulgacao, homePage,
					flagDivulgacaoCientifica, premiacao, atividadeDosAutores, instituicaoPromotoraDoEvento,
					localDoEvento, cidadeDoEvento, temporada);
			ListaResultadoBusca.add(itemResultado);
		}
		return ListaResultadoBusca;
	}

	public ArrayList<Musica> BuscaMusica() throws XPathExpressionException {
		XPathExpression expr = this.xpath.compile("//MUSICA");
		NodeList listaBuscada = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		ArrayList<Musica> ListaResultadoBusca = new ArrayList<>();
		for (int i = 0; i < listaBuscada.getLength(); i++) {
			Node TipoNode = listaBuscada.item(i);

			String natureza = TesteFilhoNo(0, TipoNode, "NATUREZA");
			String titulo = TesteFilhoNo(0, TipoNode, "TITULO");
			String ano = TesteFilhoNo(0, TipoNode, "ANO");
			String pais = TesteFilhoNo(0, TipoNode, "PAIS");
			String idioma = TesteFilhoNo(0, TipoNode, "IDIOMA");
			String meioDeDivulgacao = TesteFilhoNo(0, TipoNode, "MEIO-DE-DIVULGACAO");
			String homePage = TesteFilhoNo(0, TipoNode, "HOME-PAGE");
			String flagRelevancia = TesteFilhoNo(0, TipoNode, "FLAG-RELEVANCIA");
			String tituloIngles = TesteFilhoNo(0, TipoNode, "TITULO-INGLES");
			String flagDivulgacaoCientifica = TesteFilhoNo(0, TipoNode, "FLAG-DIVULGACAO-CIENTIFICA");
			String tipoDeEvento = TesteFilhoNo(1, TipoNode, "TIPO-DE-EVENTO");
			String atividadeDosAutores = TesteFilhoNo(1, TipoNode, "ATIVIDADE-DOS-AUTORES");
			String formacaoInstrumental = TesteFilhoNo(1, TipoNode, "FORMACAO-INSTRUMENTAL");
			String flagIneditismoDaObra = TesteFilhoNo(1, TipoNode, "FLAG-INEDITISMO-DA-OBRA");
			String dataEstreia = TesteFilhoNo(1, TipoNode, "DATA-ESTREIA");
			String dataEncerramento = TesteFilhoNo(1, TipoNode, "DATA-ENCERRAMENTO");
			String localDeEstreia = TesteFilhoNo(1, TipoNode, "LOCAL-DE-ESTREIA");
			String premiacao = TesteFilhoNo(1, TipoNode, "PREMIACAO");
			String instituicaoPromotoraDoPremio = TesteFilhoNo(1, TipoNode, "INSTITUICAO-PROMOTORA-DO-PREMIO");
			String obraDeReferencia = TesteFilhoNo(1, TipoNode, "OBRA-DE-REFERENCIA");
			String autorDaObraDeReferencia = TesteFilhoNo(1, TipoNode, "AUTOR-DA-OBRA-DE-REFERENCIA");
			String anoDaObraDeReferencia = TesteFilhoNo(1, TipoNode, "ANO-DA-OBRA-DE-REFERENCIA");
			String duracao = TesteFilhoNo(1, TipoNode, "DURACAO");
			String temporada = TesteFilhoNo(1, TipoNode, "TEMPORADA");
			String instituicaoPromotoraDoEvento = TesteFilhoNo(1, TipoNode, "INSTITUICAO-PROMOTORA-DO-EVENTO");
			String localDoEvento = TesteFilhoNo(1, TipoNode, "LOCAL-DO-EVENTO");
			String cidadeDoEvento = TesteFilhoNo(1, TipoNode, "CIDADE-DO-EVENTO");
			NodeList ListSubItens = TipoNode.getChildNodes();
			ArrayList<Autor> autorlista = new ArrayList<>();
			PalavraChave palavraChave = null;
			SetorAtividade setorAtividade = null;
			AreaConhecimento areaConhecimento = null;
			buscarDadosAdicionaisProducaoBibliografica(autorlista, palavraChave, setorAtividade, areaConhecimento,
					ListSubItens);
			Autores autores = new Autores(autorlista);

			Musica itemResultado = new Musica(autores, palavraChave, setorAtividade, areaConhecimento, natureza, titulo,
					ano, pais, idioma, meioDeDivulgacao, homePage, flagRelevancia, tituloIngles,
					flagDivulgacaoCientifica, tipoDeEvento, atividadeDosAutores, formacaoInstrumental,
					flagIneditismoDaObra, dataEstreia, dataEncerramento, localDeEstreia, premiacao,
					instituicaoPromotoraDoPremio, obraDeReferencia, autorDaObraDeReferencia, anoDaObraDeReferencia,
					duracao, temporada, instituicaoPromotoraDoEvento, localDoEvento, cidadeDoEvento);
			ListaResultadoBusca.add(itemResultado);
		}
		return ListaResultadoBusca;
	}
}
