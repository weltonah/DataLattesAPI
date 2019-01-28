package br.com.datalattesAPI.Xpath;

import java.io.File;
import java.util.ArrayList;

import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import br.com.datalattesAPI.model.Geral.Area;
import br.com.datalattesAPI.model.Geral.AreaAtuacao;
import br.com.datalattesAPI.model.Geral.CurriculoLattes;
import br.com.datalattesAPI.model.Geral.DadosGerais;
import br.com.datalattesAPI.model.Geral.DadosIdEData;
import br.com.datalattesAPI.model.Geral.Endereco;
import br.com.datalattesAPI.model.Geral.EnderecoProfissional;
import br.com.datalattesAPI.model.Geral.EnderecoResidencial;
import br.com.datalattesAPI.model.Geral.Idioma;
import br.com.datalattesAPI.model.Geral.Premio;
import br.com.datalattesAPI.model.Geral.ResumoCV;

public class GeralXpath extends AbstractXpath {

	public GeralXpath(File file) {
		super(file);
	}

	public CurriculoLattes BuscaCurriculoLattes() throws XPathExpressionException {
		ArrayList<Idioma> idioma = BuscaIdioma();
		ArrayList<Premio> premio = BuscaPremio();
		ArrayList<EnderecoResidencial> enderecoResidencial = BuscaEnderecoResidencial();
		ArrayList<EnderecoProfissional> enderecoProfissional = BuscaEnderecoProfissional();
		Endereco endereco = new Endereco(enderecoProfissional, enderecoResidencial);
		ResumoCV resumoCV = BuscaResumoCV();
		DadosGerais dadosGerais = BuscaDadosGerais();
		AreaAtuacao areaAtuacao = BuscaAreaAtuacao();
		DadosIdEData dadosIdEData = BuscaDadosIdEData();
		return new CurriculoLattes(idioma, premio, endereco, resumoCV, dadosGerais, areaAtuacao, dadosIdEData);
	}

	private DadosIdEData BuscaDadosIdEData() throws XPathExpressionException {
		XPathExpression expr = this.xpath.compile("string(/CURRICULO-VITAE[1]/@DATA-ATUALIZACAO)");
		StringBuilder sb = new StringBuilder(expr.evaluate(this.xmlfile));
		sb.insert(8, " ");
		sb.insert(4, "/");
		sb.insert(2, "/");
		String dataAtualizacao = sb.toString();

		expr = this.xpath.compile("string(/CURRICULO-VITAE[1]/@NUMERO-IDENTIFICADOR)");
		String idlattes = expr.evaluate(this.xmlfile);

		DadosIdEData dadosIdEData = new DadosIdEData(dataAtualizacao, idlattes);
		return dadosIdEData;
	}

	private DadosGerais BuscaDadosGerais() throws XPathExpressionException {
		XPathExpression expr = this.xpath.compile("//DADOS-GERAIS");
		NodeList listaIdiomaBusca = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		DadosGerais dadosGerais = null;
		Node TipoNode = listaIdiomaBusca.item(0);
		String nomeCompleto = TesteNullNo(TipoNode, "NOME-COMPLETO");

		String nomeCitacaoBibliografica = TesteNullNo(TipoNode, "NOME-EM-CITACOES-BIBLIOGRAFICAS");
		String nacionalidade = TesteNullNo(TipoNode, "NACIONALIDADE");
		String cpf = TesteNullNo(TipoNode, "CPF");
		String numeroPassaporte = TesteNullNo(TipoNode, "NUMERO-DO-PASSAPORTE");
		String paisNascimento = TesteNullNo(TipoNode, "PAIS-DE-NASCIMENTO");
		String ufNascimento = TesteNullNo(TipoNode, "UF-NASCIMENTO");
		String cidadeNascimento = TesteNullNo(TipoNode, "CIDADE-NASCIMENTO");
		String dataNascimento = TesteNullNo(TipoNode, "DATA-NASCIMENTO");
		String sexo = TesteNullNo(TipoNode, "SEXO");
		String numeroIdentidade = TesteNullNo(TipoNode, "NUMERO-IDENTIDADE");
		String orgaoEmissor = TesteNullNo(TipoNode, "ORGAO-EMISSOR");
		String ufOrgaoEmissor = TesteNullNo(TipoNode, "UF-ORGAO-EMISSOR");
		String dataEmissao = TesteNullNo(TipoNode, "DATA-DE-EMISSAO");
		String nomePai = TesteNullNo(TipoNode, "NOME-DO-PAI");
		String nomeMae = TesteNullNo(TipoNode, "NOME-DA-MAE");
		String textoResumo = TesteNullNo(TipoNode, "TEXTO-RESUMO-CV-RH");
		String paisNacionalidade = TesteNullNo(TipoNode, "PAIS-DE-NACIONALIDADE");
		String racaCor = TesteNullNo(TipoNode, "RACA-OU-COR");

		dadosGerais = new DadosGerais(nomeCompleto, nomeCitacaoBibliografica, nacionalidade, cpf, numeroPassaporte,
				paisNascimento, ufNascimento, cidadeNascimento, dataNascimento, sexo, numeroIdentidade, orgaoEmissor,
				ufOrgaoEmissor, dataEmissao, nomePai, nomeMae, textoResumo, paisNacionalidade, racaCor);
		return dadosGerais;
	}

	private ResumoCV BuscaResumoCV() throws XPathExpressionException {
		XPathExpression expr = this.xpath.compile("string(/*/DADOS-GERAIS/RESUMO-CV[1]/@TEXTO-RESUMO-CV-RH)");
		String resumo = expr.evaluate(this.xmlfile);
		expr = this.xpath.compile("string(/*/DADOS-GERAIS/RESUMO-CV[1]/@TEXTO-RESUMO-CV-RH-EN)");
		String resumoEN = expr.evaluate(this.xmlfile);
		ResumoCV resumoCV = new ResumoCV(resumo, resumoEN);
		return resumoCV;
	}

	private AreaAtuacao BuscaAreaAtuacao() throws XPathExpressionException {
		XPathExpression expr = this.xpath.compile("//AREA-DE-ATUACAO");
		NodeList listaIdiomaBusca = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		ArrayList<Area> ListArea = new ArrayList<>();
		AreaAtuacao areaAtuacao = null;
		for (int i = 0; i < listaIdiomaBusca.getLength(); i++) {
			Node TipoNode = listaIdiomaBusca.item(i);
			String nomeGrandeArea = TesteNullNo(TipoNode, "NOME-GRANDE-AREA-DO-CONHECIMENTO");
			String nomeArea = TesteNullNo(TipoNode, "NOME-DA-AREA-DO-CONHECIMENTO");
			String nomeSubArea = TesteNullNo(TipoNode, "NOME-DA-SUB-AREA-DO-CONHECIMENTO");
			String nomeEspecialidade = TesteNullNo(TipoNode, "NOME-DA-ESPECIALIDADE");
			Area area = new Area(nomeGrandeArea, nomeArea, nomeSubArea, nomeEspecialidade);
			ListArea.add(area);
		}
		areaAtuacao = new AreaAtuacao(ListArea);
		return areaAtuacao;
	}

	private ArrayList<EnderecoProfissional> BuscaEnderecoProfissional() throws XPathExpressionException {
		XPathExpression expr = this.xpath.compile("//ENDERECO-PROFISSIONAL");
		NodeList listaIdiomaBusca = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		ArrayList<EnderecoProfissional> ListEndereco = new ArrayList<>();
		for (int i = 0; i < listaIdiomaBusca.getLength(); i++) {
			Node TipoNode = listaIdiomaBusca.item(i);
			String pais = TesteNullNo(TipoNode, "PAIS");
			String uf = TesteNullNo(TipoNode, "UF");
			String cep = TesteNullNo(TipoNode, "CEP");
			String bairro = TesteNullNo(TipoNode, "BAIRRO");
			String cidade = TesteNullNo(TipoNode, "CIDADE");
			String ddd = TesteNullNo(TipoNode, "DDD");
			String telefone = TesteNullNo(TipoNode, "TELEFONE");
			String ramal = TesteNullNo(TipoNode, "RAMAL");
			String nomeInstituicaoEmpresa = TesteNullNo(TipoNode, "NOME-INSTITUICAO-EMPRESA");
			String nomeOrgao = TesteNullNo(TipoNode, "NOME-ORGAO");
			String nomeUnidade = TesteNullNo(TipoNode, "NOME-UNIDADE");
			EnderecoProfissional enderecoProfissional = new EnderecoProfissional(pais, uf, cep, bairro, cidade, ddd,
					telefone, ramal, nomeInstituicaoEmpresa, nomeOrgao, nomeUnidade);
			ListEndereco.add(enderecoProfissional);
		}
		return ListEndereco;
	}

	private ArrayList<EnderecoResidencial> BuscaEnderecoResidencial() throws XPathExpressionException {
		XPathExpression expr = this.xpath.compile("//ENDERECO-RESIDENCIAL");
		NodeList listaIdiomaBusca = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		ArrayList<EnderecoResidencial> ListEndereco = new ArrayList<>();
		for (int i = 0; i < listaIdiomaBusca.getLength(); i++) {
			Node TipoNode = listaIdiomaBusca.item(i);
			String pais = TesteNullNo(TipoNode, "PAIS");
			String uf = TesteNullNo(TipoNode, "UF");
			String cep = TesteNullNo(TipoNode, "CEP");
			String bairro = TesteNullNo(TipoNode, "BAIRRO");
			String cidade = TesteNullNo(TipoNode, "CIDADE");
			String ddd = TesteNullNo(TipoNode, "DDD");
			String telefone = TesteNullNo(TipoNode, "TELEFONE");
			String ramal = TesteNullNo(TipoNode, "RAMAL");

			EnderecoResidencial enderecoResidencial = new EnderecoResidencial(pais, uf, cep, bairro, cidade, ddd,
					telefone, ramal);
			ListEndereco.add(enderecoResidencial);
		}
		return ListEndereco;
	}

	private ArrayList<Premio> BuscaPremio() throws XPathExpressionException {
		XPathExpression expr = this.xpath.compile("//PREMIO-TITULO");
		NodeList listaIdiomaBusca = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		ArrayList<Premio> ListPremio = new ArrayList<>();
		for (int i = 0; i < listaIdiomaBusca.getLength(); i++) {
			Node TipoNode = listaIdiomaBusca.item(i);
			String nomePremioTitulo = TesteNullNo(TipoNode, "NOME-DO-PREMIO-OU-TITULO");
			String nomeEntidade = TesteNullNo(TipoNode, "NOME-DA-ENTIDADE-PROMOTORA");
			String anoPremiacao = TesteNullNo(TipoNode, "ANO-DA-PREMIACAO");
			String nomePremioTituloEN = TesteNullNo(TipoNode, "NOME-DO-PREMIO-OU-TITULO-INGLES");
			Premio premio = new Premio(nomePremioTitulo, nomeEntidade, anoPremiacao, nomePremioTituloEN);
			ListPremio.add(premio);
		}
		return ListPremio;
	}

	private ArrayList<Idioma> BuscaIdioma() throws XPathExpressionException {
		XPathExpression expr = this.xpath.compile("//IDIOMA");
		NodeList listaIdiomaBusca = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		ArrayList<Idioma> Listidioma = new ArrayList<>();
		for (int i = 0; i < listaIdiomaBusca.getLength(); i++) {
			Node TipoNode = listaIdiomaBusca.item(i);
			String nomeIdioma = TesteNullNo(TipoNode, "IDIOMA");
			String descricaoIdioma = TesteNullNo(TipoNode, "DESCRICAO-DO-IDIOMA");
			String proficienciaLeitura = TesteNullNo(TipoNode, "PROFICIENCIA-DE-LEITURA");
			String proficienciaFala = TesteNullNo(TipoNode, "PROFICIENCIA-DE-FALA");
			String proficienciaEscrita = TesteNullNo(TipoNode, "PROFICIENCIA-DE-ESCRITA");
			String proficienciaCompreensao = TesteNullNo(TipoNode, "PROFICIENCIA-DE-COMPREENSAO");
			Idioma idioma = new Idioma(nomeIdioma, descricaoIdioma, proficienciaLeitura, proficienciaFala,
					proficienciaEscrita, proficienciaCompreensao);
			Listidioma.add(idioma);
		}
		return Listidioma;
	}

}
