package br.com.datalattesAPI.Xpath;

import java.io.File;
import java.util.ArrayList;

import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import br.com.datalattesAPI.model.Evento.AuxiliarEvento;
import br.com.datalattesAPI.model.Evento.EventoCongresso;
import br.com.datalattesAPI.model.Evento.EventoEncontro;
import br.com.datalattesAPI.model.Evento.EventoExposicao;
import br.com.datalattesAPI.model.Evento.EventoFeira;
import br.com.datalattesAPI.model.Evento.EventoOficina;
import br.com.datalattesAPI.model.Evento.EventoOlimpiada;
import br.com.datalattesAPI.model.Evento.EventoSeminario;
import br.com.datalattesAPI.model.Evento.EventoSimposio;
import br.com.datalattesAPI.model.Geral.AreaConhecimento;
import br.com.datalattesAPI.model.Geral.PalavraChave;
import br.com.datalattesAPI.model.Geral.SetorAtividade;
import br.com.datalattesAPI.model.Producao.Autor;
import br.com.datalattesAPI.model.Producao.Autores;

public class EventoXpath extends AbstractXpath {

	public EventoXpath(File file) {
		super(file);
	}

	public ArrayList<AuxiliarEvento> BuscaEvento(String raiz, String nomeObjeto) throws XPathExpressionException {
		XPathExpression expr = this.xpath.compile(raiz);
		NodeList listaBancaBuscada = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		ArrayList<AuxiliarEvento> ListaResultadoBusca = new ArrayList<>();
		for (int i = 0; i < listaBancaBuscada.getLength(); i++) {
			Node TipoNode = listaBancaBuscada.item(i);
			String natureza = TipoNode.getChildNodes().item(0).getAttributes().getNamedItem("NATUREZA")
					.getTextContent();
			String titulo = TipoNode.getChildNodes().item(0).getAttributes().getNamedItem("TITULO").getTextContent();
			String ano = TipoNode.getChildNodes().item(0).getAttributes().getNamedItem("ANO").getTextContent();
			String pais = TipoNode.getChildNodes().item(0).getAttributes().getNamedItem("PAIS").getTextContent();
			String idioma = TipoNode.getChildNodes().item(0).getAttributes().getNamedItem("IDIOMA").getTextContent();
			String tipoParticipacao = TipoNode.getChildNodes().item(0).getAttributes().getNamedItem("TIPO-PARTICIPACAO")
					.getTextContent();
			String formaParticipacao = TipoNode.getChildNodes().item(0).getAttributes()
					.getNamedItem("FORMA-PARTICIPACAO").getTextContent();
			String nomeEvento = TipoNode.getChildNodes().item(1).getAttributes().getNamedItem("NOME-DO-EVENTO")
					.getTextContent();
			String nomeInstituicao = TipoNode.getChildNodes().item(1).getAttributes().getNamedItem("NOME-INSTITUICAO")
					.getTextContent();
			String localEvento = TipoNode.getChildNodes().item(1).getAttributes().getNamedItem("LOCAL-DO-EVENTO")
					.getTextContent();
			String cidadeEvento = TipoNode.getChildNodes().item(1).getAttributes().getNamedItem("CIDADE-DO-EVENTO")
					.getTextContent();
			NodeList ListSubItens = TipoNode.getChildNodes();

			ArrayList<Autor> autorlista = new ArrayList<>();
			PalavraChave palavraChave = null;
			SetorAtividade setorAtividade = null;
			AreaConhecimento areaConhecimento = null;
			for (int j = 0; j < ListSubItens.getLength(); j++) {
				Node subItens = ListSubItens.item(j);
				if (subItens.getNodeName().contentEquals("PARTICIPANTE-DE-EVENTOS-CONGRESSOS")) {
					String nomeCompleto = TesteNullNo(subItens, "NOME-COMPLETO-DO-PARTICIPANTE-DE-EVENTOS-CONGRESSOS");
					String nomeCitacao = TesteNullNo(subItens,
							"NOME-PARA-CITACAO-DO-PARTICIPANTE-DE-EVENTOS-CONGRESSOS");
					String idCnpq = TesteNullNo(subItens, "NRO-ID-CNPQ");
					Autor autor = new Autor(nomeCompleto, nomeCitacao, idCnpq);
					autorlista.add(autor);
				}
				if (subItens.getNodeName().contentEquals("PALAVRAS-CHAVE")) {
					palavraChave = BuscaPalavraChave(subItens);
				}
				if (subItens.getNodeName().contentEquals("AREAS-DO-CONHECIMENTO")) {
					areaConhecimento = BuscaAreaConhecimento(subItens);
				}
				if (subItens.getNodeName().contentEquals("SETORES-DE-ATIVIDADE")) {
					setorAtividade = BuscaSetorAtividade(subItens);
				}
			}

			Autores autores = new Autores(autorlista);
			AuxiliarEvento itemResultado = null;
			switch (nomeObjeto) {
			case "EventoCongresso":
				itemResultado = new EventoCongresso(natureza, titulo, ano, pais, idioma, tipoParticipacao, autores,
						palavraChave, setorAtividade, areaConhecimento, formaParticipacao, nomeEvento, nomeInstituicao,
						localEvento, cidadeEvento);
				break;
			case "EventoFeira":
				itemResultado = new EventoFeira(natureza, titulo, ano, pais, idioma, tipoParticipacao, autores,
						palavraChave, setorAtividade, areaConhecimento, formaParticipacao, nomeEvento, nomeInstituicao,
						localEvento, cidadeEvento);
				break;
			case "EventoExposicao":
				itemResultado = new EventoExposicao(natureza, titulo, ano, pais, idioma, tipoParticipacao, autores,
						palavraChave, setorAtividade, areaConhecimento, formaParticipacao, nomeEvento, nomeInstituicao,
						localEvento, cidadeEvento);
				break;
			case "EventoOlimpiada":
				itemResultado = new EventoOlimpiada(natureza, titulo, ano, pais, idioma, tipoParticipacao, autores,
						palavraChave, setorAtividade, areaConhecimento, formaParticipacao, nomeEvento, nomeInstituicao,
						localEvento, cidadeEvento);
				break;
			case "EventoSeminario":
				itemResultado = new EventoSeminario(natureza, titulo, ano, pais, idioma, tipoParticipacao, autores,
						palavraChave, setorAtividade, areaConhecimento, formaParticipacao, nomeEvento, nomeInstituicao,
						localEvento, cidadeEvento);
				break;
			case "EventoEncontro":
				itemResultado = new EventoEncontro(natureza, titulo, ano, pais, idioma, tipoParticipacao, autores,
						palavraChave, setorAtividade, areaConhecimento, formaParticipacao, nomeEvento, nomeInstituicao,
						localEvento, cidadeEvento);
				break;
			case "EventoSimposio":
				itemResultado = new EventoSimposio(natureza, titulo, ano, pais, idioma, tipoParticipacao, autores,
						palavraChave, setorAtividade, areaConhecimento, formaParticipacao, nomeEvento, nomeInstituicao,
						localEvento, cidadeEvento);
				break;
			case "EventoOficina":
				itemResultado = new EventoOficina(natureza, titulo, ano, pais, idioma, tipoParticipacao, autores,
						palavraChave, setorAtividade, areaConhecimento, formaParticipacao, nomeEvento, nomeInstituicao,
						localEvento, cidadeEvento);
				break;
			}
			if (itemResultado != null)
				ListaResultadoBusca.add(itemResultado);
		}
		return ListaResultadoBusca;
	}
}
