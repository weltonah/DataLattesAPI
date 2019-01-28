package br.com.datalattesAPI.model.Geral;

/**
* 
*/
public class DadosGerais {

	public String nomeCompleto;
	public String nomeCitacaoBibliografica;
	public String nacionalidade;
	public String cpf;
	public String numeroPassaporte;
	public String paisNascimento;
	public String ufNascimento;
	public String cidadeNascimento;
	public String dataNascimento;
	public String sexo;
	public String numeroIdentidade;
	public String orgaoEmissor;
	public String ufOrgaoEmissor;
	public String dataEmissao;
	public String nomePai;
	public String nomeMae;
	public String textoResumo;
	public String paisNacionalidade;
	public String racaCor;

	public DadosGerais(String nomeCompleto, String nomeCitacaoBibliografica, String nacionalidade, String cpf,
			String numeroPassaporte, String paisNascimento, String ufNascimento, String cidadeNascimento,
			String dataNascimento, String sexo, String numeroIdentidade, String orgaoEmissor, String ufOrgaoEmissor,
			String dataEmissao, String nomePai, String nomeMae, String textoResumo, String paisNacionalidade,
			String racaCor) {
		super();
		this.nomeCompleto = nomeCompleto;
		this.nomeCitacaoBibliografica = nomeCitacaoBibliografica;
		this.nacionalidade = nacionalidade;
		this.cpf = cpf;
		this.numeroPassaporte = numeroPassaporte;
		this.paisNascimento = paisNascimento;
		this.ufNascimento = ufNascimento;
		this.cidadeNascimento = cidadeNascimento;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.numeroIdentidade = numeroIdentidade;
		this.orgaoEmissor = orgaoEmissor;
		this.ufOrgaoEmissor = ufOrgaoEmissor;
		this.dataEmissao = dataEmissao;
		this.nomePai = nomePai;
		this.nomeMae = nomeMae;
		this.textoResumo = textoResumo;
		this.paisNacionalidade = paisNacionalidade;
		this.racaCor = racaCor;
	}

	public String getNomeCompleto() {
		return this.nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getNomeCitacaoBibliografica() {
		return this.nomeCitacaoBibliografica;
	}

	public void setNomeCitacaoBibliografica(String nomeCitacaoBibliografica) {
		this.nomeCitacaoBibliografica = nomeCitacaoBibliografica;
	}

	public String getNacionalidade() {
		return this.nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNumeroPassaporte() {
		return this.numeroPassaporte;
	}

	public void setNumeroPassaporte(String numeroPassaporte) {
		this.numeroPassaporte = numeroPassaporte;
	}

	public String getPaisNascimento() {
		return this.paisNascimento;
	}

	public void setPaisNascimento(String paisNascimento) {
		this.paisNascimento = paisNascimento;
	}

	public String getUfNascimento() {
		return this.ufNascimento;
	}

	public void setUfNascimento(String ufNascimento) {
		this.ufNascimento = ufNascimento;
	}

	public String getCidadeNascimento() {
		return this.cidadeNascimento;
	}

	public void setCidadeNascimento(String cidadeNascimento) {
		this.cidadeNascimento = cidadeNascimento;
	}

	public String getDataNascimento() {
		return this.dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getSexo() {
		return this.sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getNumeroIdentidade() {
		return this.numeroIdentidade;
	}

	public void setNumeroIdentidade(String numeroIdentidade) {
		this.numeroIdentidade = numeroIdentidade;
	}

	public String getOrgaoEmissor() {
		return this.orgaoEmissor;
	}

	public void setOrgaoEmissor(String orgaoEmissor) {
		this.orgaoEmissor = orgaoEmissor;
	}

	public String getUfOrgaoEmissor() {
		return this.ufOrgaoEmissor;
	}

	public void setUfOrgaoEmissor(String ufOrgaoEmissor) {
		this.ufOrgaoEmissor = ufOrgaoEmissor;
	}

	public String getDataEmissao() {
		return this.dataEmissao;
	}

	public void setDataEmissao(String dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public String getNomePai() {
		return this.nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getNomeMae() {
		return this.nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getTextoResumo() {
		return this.textoResumo;
	}

	public void setTextoResumo(String textoResumo) {
		this.textoResumo = textoResumo;
	}

	public String getPaisNacionalidade() {
		return this.paisNacionalidade;
	}

	public void setPaisNacionalidade(String paisNacionalidade) {
		this.paisNacionalidade = paisNacionalidade;
	}

	public String getRacaCor() {
		return this.racaCor;
	}

	public void setRacaCor(String racaCor) {
		this.racaCor = racaCor;
	}


	@Override
	public String toString() {
		return "DadosGerais [" + (this.nomeCompleto != null ? "nomeCompleto=" + this.nomeCompleto + ", " : "")
				+ (this.nomeCitacaoBibliografica != null
						? "nomeCitacaoBibliografica=" + this.nomeCitacaoBibliografica + ", "
						: "")
				+ (this.nacionalidade != null ? "nacionalidade=" + this.nacionalidade + ", " : "")
				+ (this.cpf != null ? "cpf=" + this.cpf + ", " : "")
				+ (this.numeroPassaporte != null ? "numeroPassaporte=" + this.numeroPassaporte + ", " : "")
				+ (this.paisNascimento != null ? "paisNascimento=" + this.paisNascimento + ", " : "")
				+ (this.ufNascimento != null ? "ufNascimento=" + this.ufNascimento + ", " : "")
				+ (this.cidadeNascimento != null ? "cidadeNascimento=" + this.cidadeNascimento + ", " : "")
				+ (this.dataNascimento != null ? "dataNascimento=" + this.dataNascimento + ", " : "")
				+ (this.sexo != null ? "sexo=" + this.sexo + ", " : "")
				+ (this.numeroIdentidade != null ? "numeroIdentidade=" + this.numeroIdentidade + ", " : "")
				+ (this.orgaoEmissor != null ? "orgaoEmissor=" + this.orgaoEmissor + ", " : "")
				+ (this.ufOrgaoEmissor != null ? "ufOrgaoEmissor=" + this.ufOrgaoEmissor + ", " : "")
				+ (this.dataEmissao != null ? "dataEmissao=" + this.dataEmissao + ", " : "")
				+ (this.nomePai != null ? "nomePai=" + this.nomePai + ", " : "")
				+ (this.nomeMae != null ? "nomeMae=" + this.nomeMae + ", " : "")
				+ (this.textoResumo != null ? "textoResumo=" + this.textoResumo + ", " : "")
				+ (this.paisNacionalidade != null ? "paisNacionalidade=" + this.paisNacionalidade + ", " : "")
				+ (this.racaCor != null ? "racaCor=" + this.racaCor : "") + "]";
	}

}