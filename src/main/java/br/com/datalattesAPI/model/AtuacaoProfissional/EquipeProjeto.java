package br.com.datalattesAPI.model.AtuacaoProfissional;

import java.util.ArrayList;

/**
 * 
 */
public class EquipeProjeto {

	public EquipeProjeto() {
	}

	public EquipeProjeto(ArrayList<IntegranteProjeto> integranteProjeto) {
		super();
		this.integranteProjeto = integranteProjeto;
	}

	public ArrayList<IntegranteProjeto> integranteProjeto;

	public ArrayList<IntegranteProjeto> getIntegranteProjeto() {
		return this.integranteProjeto;
	}

	public void setIntegranteProjeto(ArrayList<IntegranteProjeto> integranteProjeto) {
		this.integranteProjeto = integranteProjeto;
	}

}