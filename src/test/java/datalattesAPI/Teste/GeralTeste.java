package datalattesAPI.Teste;

import java.io.File;

import javax.xml.xpath.XPathExpressionException;

import org.junit.Test;

import br.com.datalattesAPI.DTapi;
import br.com.datalattesAPI.model.Geral.CurriculoLattes;

public class GeralTeste {

	@Test
	public void CurriculoLattes() throws XPathExpressionException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("static/testFile/" + "Alessandreiacurriculo.xml").getFile());
		DTapi dt = new DTapi(file);
		CurriculoLattes result = dt.getGeralDao().CurriculoLattes();
	}

}
