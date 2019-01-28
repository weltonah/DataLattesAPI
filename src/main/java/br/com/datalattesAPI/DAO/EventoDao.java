package br.com.datalattesAPI.DAO;

import java.io.File;
import java.util.ArrayList;
import java.util.stream.Collectors;

import javax.xml.xpath.XPathExpressionException;

import br.com.datalattesAPI.Xpath.EventoXpath;
import br.com.datalattesAPI.model.Evento.AuxiliarEvento;
import br.com.datalattesAPI.model.Evento.EventoCongresso;
import br.com.datalattesAPI.model.Evento.EventoEncontro;
import br.com.datalattesAPI.model.Evento.EventoExposicao;
import br.com.datalattesAPI.model.Evento.EventoFeira;
import br.com.datalattesAPI.model.Evento.EventoOficina;
import br.com.datalattesAPI.model.Evento.EventoOlimpiada;
import br.com.datalattesAPI.model.Evento.EventoSeminario;
import br.com.datalattesAPI.model.Evento.EventoSimposio;

public class EventoDao {
	public EventoXpath eventoXpath;

	public EventoDao(File file) {
		this.eventoXpath = new EventoXpath(file);
	}

	public ArrayList<EventoCongresso> EventoCongresso() throws XPathExpressionException {
		ArrayList<AuxiliarEvento> resposta = this.eventoXpath.BuscaEvento("//PARTICIPACAO-EM-CONGRESSO",
				"EventoCongresso");
		ArrayList<EventoCongresso> result = (ArrayList<EventoCongresso>) resposta.stream().map(u -> (EventoCongresso) u)
				.collect(Collectors.toList());
		return result;
	}

	public ArrayList<EventoFeira> EventoFeira() throws XPathExpressionException {
		ArrayList<AuxiliarEvento> resposta = this.eventoXpath.BuscaEvento("//PARTICIPACAO-EM-FEIRA", "EventoFeira");
		ArrayList<EventoFeira> result = (ArrayList<EventoFeira>) resposta.stream().map(u -> (EventoFeira) u)
				.collect(Collectors.toList());
		return result;
	}

	public ArrayList<EventoSeminario> EventoSeminario() throws XPathExpressionException {
		ArrayList<AuxiliarEvento> resposta = this.eventoXpath.BuscaEvento("//PARTICIPACAO-EM-SEMINARIO",
				"EventoSeminario");
		ArrayList<EventoSeminario> result = (ArrayList<EventoSeminario>) resposta.stream().map(u -> (EventoSeminario) u)
				.collect(Collectors.toList());
		return result;
	}

	public ArrayList<EventoSimposio> EventoSimposio() throws XPathExpressionException {
		ArrayList<AuxiliarEvento> resposta = this.eventoXpath.BuscaEvento("//PARTICIPACAO-EM-SIMPOSIO",
				"EventoSimposio");
		ArrayList<EventoSimposio> result = (ArrayList<EventoSimposio>) resposta.stream().map(u -> (EventoSimposio) u)
				.collect(Collectors.toList());
		return result;
	}

	public ArrayList<EventoOficina> EventoOficina() throws XPathExpressionException {
		ArrayList<AuxiliarEvento> resposta = this.eventoXpath.BuscaEvento("//PARTICIPACAO-EM-OFICINA", "EventoOficina");
		ArrayList<EventoOficina> result = (ArrayList<EventoOficina>) resposta.stream().map(u -> (EventoOficina) u)
				.collect(Collectors.toList());
		return result;
	}

	public ArrayList<EventoEncontro> EventoEncontro() throws XPathExpressionException {
		ArrayList<AuxiliarEvento> resposta = this.eventoXpath.BuscaEvento("//PARTICIPACAO-EM-ENCONTRO",
				"EventoEncontro");
		ArrayList<EventoEncontro> result = (ArrayList<EventoEncontro>) resposta.stream().map(u -> (EventoEncontro) u)
				.collect(Collectors.toList());
		return result;
	}

	public ArrayList<EventoExposicao> EventoExposicao() throws XPathExpressionException {
		ArrayList<AuxiliarEvento> resposta = this.eventoXpath.BuscaEvento("//PARTICIPACAO-EM-EXPOSICAO",
				"EventoExposicao");
		ArrayList<EventoExposicao> result = (ArrayList<EventoExposicao>) resposta.stream().map(u -> (EventoExposicao) u)
				.collect(Collectors.toList());
		return result;
	}

	public ArrayList<EventoOlimpiada> EventoOlimpiada() throws XPathExpressionException {
		ArrayList<AuxiliarEvento> resposta = this.eventoXpath.BuscaEvento("//PARTICIPACAO-EM-OLIMPIADA",
				"EventoOlimpiada");
		ArrayList<EventoOlimpiada> result = (ArrayList<EventoOlimpiada>) resposta.stream().map(u -> (EventoOlimpiada) u)
				.collect(Collectors.toList());
		return result;
	}

}
