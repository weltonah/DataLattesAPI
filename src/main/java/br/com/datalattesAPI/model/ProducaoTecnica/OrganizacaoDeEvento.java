package br.com.datalattesAPI.model.ProducaoTecnica;

import br.com.datalattesAPI.model.Geral.AreaConhecimento;
import br.com.datalattesAPI.model.Geral.PalavraChave;
import br.com.datalattesAPI.model.Geral.SetorAtividade;
import br.com.datalattesAPI.model.Producao.Autores;
import br.com.datalattesAPI.model.Producao.Auxiliar;

public class OrganizacaoDeEvento extends Auxiliar {
	String tipo;
	String natureza;
	String titulo;
	String ano;
	String pais;
	String idioma;
	String meioDeDivulgacao;
	String homePageDoTrabalho;
	String flagRelevancia;
	String doi;
	String tituloIngles;
	String flagDivulgacaoCientifica;
	String instituicaoPromotora;
	String duracaoEmSemanas;
	String flagEventoItinerante;
	String flagCatalogo;
	String local;
	String cidade;

	public OrganizacaoDeEvento(Autores autores, PalavraChave palavraChave, SetorAtividade setorAtividade,
			AreaConhecimento areaConhecimento, String tipo, String natureza, String titulo, String ano, String pais,
			String idioma, String meioDeDivulgacao, String homePageDoTrabalho, String flagRelevancia, String doi,
			String tituloIngles, String flagDivulgacaoCientifica, String instituicaoPromotora, String duracaoEmSemanas,
			String flagEventoItinerante, String flagCatalogo, String local, String cidade) {
		super(autores, palavraChave, setorAtividade, areaConhecimento);
		this.tipo = tipo;
		this.natureza = natureza;
		this.titulo = titulo;
		this.ano = ano;
		this.pais = pais;
		this.idioma = idioma;
		this.meioDeDivulgacao = meioDeDivulgacao;
		this.homePageDoTrabalho = homePageDoTrabalho;
		this.flagRelevancia = flagRelevancia;
		this.doi = doi;
		this.tituloIngles = tituloIngles;
		this.flagDivulgacaoCientifica = flagDivulgacaoCientifica;
		this.instituicaoPromotora = instituicaoPromotora;
		this.duracaoEmSemanas = duracaoEmSemanas;
		this.flagEventoItinerante = flagEventoItinerante;
		this.flagCatalogo = flagCatalogo;
		this.local = local;
		this.cidade = cidade;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNatureza() {
		return this.natureza;
	}

	public void setNatureza(String natureza) {
		this.natureza = natureza;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAno() {
		return this.ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getPais() {
		return this.pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getIdioma() {
		return this.idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getMeioDeDivulgacao() {
		return this.meioDeDivulgacao;
	}

	public void setMeioDeDivulgacao(String meioDeDivulgacao) {
		this.meioDeDivulgacao = meioDeDivulgacao;
	}

	public String getHomePageDoTrabalho() {
		return this.homePageDoTrabalho;
	}

	public void setHomePageDoTrabalho(String homePageDoTrabalho) {
		this.homePageDoTrabalho = homePageDoTrabalho;
	}

	public String getFlagRelevancia() {
		return this.flagRelevancia;
	}

	public void setFlagRelevancia(String flagRelevancia) {
		this.flagRelevancia = flagRelevancia;
	}

	public String getDoi() {
		return this.doi;
	}

	public void setDoi(String doi) {
		this.doi = doi;
	}

	public String getTituloIngles() {
		return this.tituloIngles;
	}

	public void setTituloIngles(String tituloIngles) {
		this.tituloIngles = tituloIngles;
	}

	public String getFlagDivulgacaoCientifica() {
		return this.flagDivulgacaoCientifica;
	}

	public void setFlagDivulgacaoCientifica(String flagDivulgacaoCientifica) {
		this.flagDivulgacaoCientifica = flagDivulgacaoCientifica;
	}

	public String getInstituicaoPromotora() {
		return this.instituicaoPromotora;
	}

	public void setInstituicaoPromotora(String instituicaoPromotora) {
		this.instituicaoPromotora = instituicaoPromotora;
	}

	public String getDuracaoEmSemanas() {
		return this.duracaoEmSemanas;
	}

	public void setDuracaoEmSemanas(String duracaoEmSemanas) {
		this.duracaoEmSemanas = duracaoEmSemanas;
	}

	public String getFlagEventoItinerante() {
		return this.flagEventoItinerante;
	}

	public void setFlagEventoItinerante(String flagEventoItinerante) {
		this.flagEventoItinerante = flagEventoItinerante;
	}

	public String getFlagCatalogo() {
		return this.flagCatalogo;
	}

	public void setFlagCatalogo(String flagCatalogo) {
		this.flagCatalogo = flagCatalogo;
	}

	public String getLocal() {
		return this.local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getCidade() {
		return this.cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
}
