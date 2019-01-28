package br.com.datalattesAPI.model.Geral;

import java.util.ArrayList;

/**
 * 
 */
public class Endereco {

	public ArrayList<EnderecoProfissional> enderecoProfissional;
	public ArrayList<EnderecoResidencial> enderecoResidencial;

	public Endereco(ArrayList<EnderecoProfissional> enderecoProfissional,
			ArrayList<EnderecoResidencial> enderecoResidencial) {
		super();
		this.enderecoProfissional = enderecoProfissional;
		this.enderecoResidencial = enderecoResidencial;
	}

	public ArrayList<EnderecoProfissional> getEnderecoProfissional() {
		return this.enderecoProfissional;
	}

	public void setEnderecoProfissional(ArrayList<EnderecoProfissional> enderecoProfissional) {
		this.enderecoProfissional = enderecoProfissional;
	}

	public ArrayList<EnderecoResidencial> getEnderecoResidencial() {
		return this.enderecoResidencial;
	}

	public void setEnderecoResidencial(ArrayList<EnderecoResidencial> enderecoResidencial) {
		this.enderecoResidencial = enderecoResidencial;
	}

}