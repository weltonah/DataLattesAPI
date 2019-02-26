package br.com.datalattesAPI;

import java.io.File;

import br.com.datalattesAPI.DAO.AtuacaoProfissionalDao;
import br.com.datalattesAPI.DAO.BancaDao;
import br.com.datalattesAPI.DAO.EventoDao;
import br.com.datalattesAPI.DAO.FormacaoDao;
import br.com.datalattesAPI.DAO.GeralDao;
import br.com.datalattesAPI.DAO.OrientacaoDao;
import br.com.datalattesAPI.DAO.ProducaoArtisticaDao;
import br.com.datalattesAPI.DAO.ProducaoBibliograficaDao;
import br.com.datalattesAPI.DAO.ProducaoTecnicaDao;

public class DTapi {
	private AtuacaoProfissionalDao atuacaoProfissionalDao;
	private BancaDao bancaDao;
	private EventoDao eventoDao;
	private FormacaoDao formacaoDao;
	private GeralDao geralDao;
	private OrientacaoDao orientacaoDao;
	private ProducaoArtisticaDao producaoArtisticaDao;
	private ProducaoBibliograficaDao producaoBibliograficaDao;
	private ProducaoTecnicaDao producaoTecnicaDao;

	public DTapi(File file) {
		this.atuacaoProfissionalDao = new AtuacaoProfissionalDao(file);
		this.bancaDao = new BancaDao(file);
		this.eventoDao = new EventoDao(file);
		this.formacaoDao = new FormacaoDao(file);
		this.geralDao = new GeralDao(file);
		this.orientacaoDao = new OrientacaoDao(file);
		this.producaoArtisticaDao = new ProducaoArtisticaDao(file);
		this.producaoBibliograficaDao = new ProducaoBibliograficaDao(file);
		this.producaoTecnicaDao = new ProducaoTecnicaDao(file);
	}

	public AtuacaoProfissionalDao getAtuacaoProfissionalDao() {
		return this.atuacaoProfissionalDao;
	}

	public BancaDao getBancaDao() {
		return this.bancaDao;
	}

	public EventoDao getEventoDao() {
		return this.eventoDao;
	}

	public FormacaoDao getFormacaoDao() {
		return this.formacaoDao;
	}

	public GeralDao getGeralDao() {
		return this.geralDao;
	}

	public OrientacaoDao getOrientacaoDao() {
		return this.orientacaoDao;
	}

	public ProducaoArtisticaDao getProducaoDao() {
		return this.producaoArtisticaDao;
	}

	public ProducaoArtisticaDao getProducaoArtisticaDao() {
		return this.producaoArtisticaDao;
	}

	public ProducaoBibliograficaDao getProducaoBibliograficaDao() {
		return this.producaoBibliograficaDao;
	}

	public ProducaoTecnicaDao getProducaoTecnicaDao() {
		return this.producaoTecnicaDao;
	}

}
