package br.com.datalattesAPI.model.Geral;

public class DadosIdEData {

	private String dataAtualizacao;
	private String idlattes;
	public DadosIdEData(String dataAtualizacao, String idlattes) {
		super();
		this.dataAtualizacao = dataAtualizacao;
		this.idlattes = idlattes;
	}

	public String getDataAtualizacao() {
		return this.dataAtualizacao;
	}

	public void setDataAtualizacao(String dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}

	public String getIdlattes() {
		return this.idlattes;
	}

	public void setIdlattes(String idlattes) {
		this.idlattes = idlattes;
	}


}
