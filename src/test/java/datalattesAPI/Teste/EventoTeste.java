package datalattesAPI.Teste;

import java.io.File;
import java.util.ArrayList;

import javax.xml.xpath.XPathExpressionException;

import org.junit.Test;

import br.com.datalattesAPI.DTapi;
import br.com.datalattesAPI.model.Evento.EventoCongresso;
import br.com.datalattesAPI.model.Evento.EventoEncontro;
import br.com.datalattesAPI.model.Evento.EventoExposicao;
import br.com.datalattesAPI.model.Evento.EventoFeira;
import br.com.datalattesAPI.model.Evento.EventoOficina;
import br.com.datalattesAPI.model.Evento.EventoOlimpiada;
import br.com.datalattesAPI.model.Evento.EventoSeminario;
import br.com.datalattesAPI.model.Evento.EventoSimposio;

public class EventoTeste {

	@Test
	public void EventoCongresso() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<EventoCongresso> result = dt.getEventoDao().EventoCongresso();
	}

	@Test
	public void EventoFeira() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<EventoFeira> result = dt.getEventoDao().EventoFeira();
	}

	@Test
	public void EventoSeminario() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<EventoSeminario> result = dt.getEventoDao().EventoSeminario();
	}

	@Test
	public void EventoSimposio() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<EventoSimposio> result = dt.getEventoDao().EventoSimposio();
	}

	@Test
	public void EventoOficina() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<EventoOficina> result = dt.getEventoDao().EventoOficina();
	}

	@Test
	public void EventoEncontro() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<EventoEncontro> result = dt.getEventoDao().EventoEncontro();
	}

	@Test
	public void EventoExposicao() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<EventoExposicao> result = dt.getEventoDao().EventoExposicao();
	}

	@Test
	public void EventoOlimpiada() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		ArrayList<EventoOlimpiada> result = dt.getEventoDao().EventoOlimpiada();
	}

}
