package br.com.datalattesAPI.model.Geral;

import java.util.ArrayList;

/**
 * 
 */
public class CurriculoLattes {

	public ArrayList<Idioma> idioma;
	public ArrayList<Premio> premio;
	public Endereco endereco;
	public ResumoCV resumoCV;
	public DadosGerais dadosGerais;
	public AreaAtuacao areaAtuacao;
	public DadosIdEData dadosIdEData;

	public CurriculoLattes(ArrayList<Idioma> idioma, ArrayList<Premio> premio, Endereco endereco, ResumoCV resumoCV,
			DadosGerais dadosGerais, AreaAtuacao areaAtuacao, DadosIdEData dadosIdEData) {
		super();
		this.idioma = idioma;
		this.premio = premio;
		this.endereco = endereco;
		this.resumoCV = resumoCV;
		this.dadosGerais = dadosGerais;
		this.areaAtuacao = areaAtuacao;
		this.dadosIdEData = dadosIdEData;
	}

	public ArrayList<Idioma> getIdioma() {
		return this.idioma;
	}

	public void setIdioma(ArrayList<Idioma> idioma) {
		this.idioma = idioma;
	}

	public ArrayList<Premio> getPremio() {
		return this.premio;
	}

	public void setPremio(ArrayList<Premio> premio) {
		this.premio = premio;
	}

	public Endereco getEndereco() {
		return this.endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public ResumoCV getResumoCV() {
		return this.resumoCV;
	}

	public void setResumoCV(ResumoCV resumoCV) {
		this.resumoCV = resumoCV;
	}

	public DadosGerais getDadosGerais() {
		return this.dadosGerais;
	}

	public void setDadosGerais(DadosGerais dadosGerais) {
		this.dadosGerais = dadosGerais;
	}

	public AreaAtuacao getAreaAtuacao() {
		return this.areaAtuacao;
	}

	public void setAreaAtuacao(AreaAtuacao areaAtuacao) {
		this.areaAtuacao = areaAtuacao;
	}

	public DadosIdEData getDadosIdEData() {
		return this.dadosIdEData;
	}

	public void setDadosIdEData(DadosIdEData dadosIdEData) {
		this.dadosIdEData = dadosIdEData;
	}

}