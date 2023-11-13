package br.com.fiap.model;

public class UtilizaveisProjeto {

	private String cep;
	private double pesoTonelada;
	private double alturaMetros;
	private double comprimentoMetros;
    private double larguraMetros;
    private int qtdCargaExtra; 
    private String categoriaTarifaria;
    private String tipoProblema;
    private String localProblema;
	
    public UtilizaveisProjeto() {
		super();
	}

	public UtilizaveisProjeto(String cep, double pesoTonelada, double alturaMetros, double comprimentoMetros,
			double larguraMetros, int qtdCargaExtra, String categoriaTarifaria, String tipoProblema,
			String localProblema) {
		super();
		this.cep = cep;
		this.pesoTonelada = pesoTonelada;
		this.alturaMetros = alturaMetros;
		this.comprimentoMetros = comprimentoMetros;
		this.larguraMetros = larguraMetros;
		this.qtdCargaExtra = qtdCargaExtra;
		this.categoriaTarifaria = categoriaTarifaria;
		this.tipoProblema = tipoProblema;
		this.localProblema = localProblema;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public double getPesoTonelada() {
		return pesoTonelada;
	}

	public void setPesoTonelada(double pesoTonelada) {
		this.pesoTonelada = pesoTonelada;
	}

	public double getAlturaMetros() {
		return alturaMetros;
	}

	public void setAlturaMetros(double alturaMetros) {
		this.alturaMetros = alturaMetros;
	}

	public double getComprimentoMetros() {
		return comprimentoMetros;
	}

	public void setComprimentoMetros(double comprimentoMetros) {
		this.comprimentoMetros = comprimentoMetros;
	}

	public double getLarguraMetros() {
		return larguraMetros;
	}

	public void setLarguraMetros(double larguraMetros) {
		this.larguraMetros = larguraMetros;
	}

	public int getQtdCargaExtra() {
		return qtdCargaExtra;
	}

	public void setQtdCargaExtra(int qtdCargaExtra) {
		this.qtdCargaExtra = qtdCargaExtra;
	}

	public String getCategoriaTarifaria() {
		return categoriaTarifaria;
	}

	public void setCategoriaTarifaria(String categoriaTarifaria) {
		this.categoriaTarifaria = categoriaTarifaria;
	}

	public String getTipoProblema() {
		return tipoProblema;
	}

	public void setTipoProblema(String tipoProblema) {
		this.tipoProblema = tipoProblema;
	}

	public String getLocalProblema() {
		return localProblema;
	}

	public void setLocalProblema(String localProblema) {
		this.localProblema = localProblema;
	}
    
    
	
}
