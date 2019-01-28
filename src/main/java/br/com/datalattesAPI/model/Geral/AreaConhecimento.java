package br.com.datalattesAPI.model.Geral;

/**
* 
*/
public class AreaConhecimento {

	public Area area1;
	public Area area2;
	public Area area3;

	public AreaConhecimento(Area area1, Area area2, Area area3) {
		super();
		this.area1 = area1;
		this.area2 = area2;
		this.area3 = area3;
	}

	public Area getArea1() {
		return this.area1;
	}

	public void setArea1(Area area1) {
		this.area1 = area1;
	}

	public Area getArea2() {
		return this.area2;
	}

	public void setArea2(Area area2) {
		this.area2 = area2;
	}

	public Area getArea3() {
		return this.area3;
	}

	public void setArea3(Area area3) {
		this.area3 = area3;
	}

}