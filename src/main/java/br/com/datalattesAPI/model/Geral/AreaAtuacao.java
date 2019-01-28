package br.com.datalattesAPI.model.Geral;

import java.util.ArrayList;

/**
* 
*/
public class AreaAtuacao {

	public ArrayList<Area> area;

	public AreaAtuacao(ArrayList<Area> area) {
		super();
		this.area = area;
	}

	public ArrayList<Area> getArea() {
		return this.area;
	}

	public void setArea(ArrayList<Area> area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "AreaAtuacao [" + (this.area != null ? "area=" + this.area : "") + "]";
	}

}