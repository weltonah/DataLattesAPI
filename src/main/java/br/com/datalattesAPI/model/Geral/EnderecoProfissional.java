package br.com.datalattesAPI.model.Geral;

/**
* 
*/
public class EnderecoProfissional extends EnderecoResidencial {

	public String nomeInstituicaoEmpresa;
	public String nomeOrgao;
	public String nomeUnidade;

	public EnderecoProfissional(String pais, String uf, String cep, String bairro, String cidade, String ddd,
			String telefone, String ramal, String nomeInstituicaoEmpresa, String nomeOrgao, String nomeUnidade) {
		super(pais, uf, cep, bairro, cidade, ddd, telefone, ramal);
		this.nomeInstituicaoEmpresa = nomeInstituicaoEmpresa;
		this.nomeOrgao = nomeOrgao;
		this.nomeUnidade = nomeUnidade;
	}

	public String getNomeInstituicaoEmpresa() {
		return this.nomeInstituicaoEmpresa;
	}

	public void setNomeInstituicaoEmpresa(String nomeInstituicaoEmpresa) {
		this.nomeInstituicaoEmpresa = nomeInstituicaoEmpresa;
	}

	public String getNomeOrgao() {
		return this.nomeOrgao;
	}

	public void setNomeOrgao(String nomeOrgao) {
		this.nomeOrgao = nomeOrgao;
	}

	public String getNomeUnidade() {
		return this.nomeUnidade;
	}

	public void setNomeUnidade(String nomeUnidade) {
		this.nomeUnidade = nomeUnidade;
	}

	@Override
	public String toString() {
		return "EnderecoProfissional ["
				+ (this.nomeInstituicaoEmpresa != null ? "nomeInstituicaoEmpresa=" + this.nomeInstituicaoEmpresa + ", "
						: "")
				+ (this.nomeOrgao != null ? "nomeOrgao=" + this.nomeOrgao + ", " : "")
				+ (this.nomeUnidade != null ? "nomeUnidade=" + this.nomeUnidade : "") + "]";
	}

}