package br.com.datalattesAPI.DAO;

import java.io.File;

import javax.xml.xpath.XPathExpressionException;

import br.com.datalattesAPI.Xpath.GeralXpath;
import br.com.datalattesAPI.model.Geral.CurriculoLattes;

public class GeralDao {
	public GeralXpath geralXpath;

	public GeralDao(File file) {
		this.geralXpath = new GeralXpath(file);
	}

	public CurriculoLattes CurriculoLattes() throws XPathExpressionException {
		return this.geralXpath.BuscaCurriculoLattes();
	}

}
