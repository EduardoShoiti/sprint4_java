package br.com.fiap.model;

public class Veiculo {

	private String modelo;
	private int ano;
	private String marca;
	private String personalizacao;
	private String placa;
	private double altura;
	private double largura;
	private double comprimento;
	private double peso;
	private double cargaExtra;
	
	public Veiculo() {
		super();
	}

	public Veiculo(String modelo, int ano, String marca, String personalizacao, String placa, double altura,
			double largura, double comprimento, double peso, double cargaExtra) {
		super();
		this.modelo = modelo;
		this.ano = ano;
		this.marca = marca;
		this.personalizacao = personalizacao;
		this.placa = placa;
		this.altura = altura;
		this.largura = largura;
		this.comprimento = comprimento;
		this.peso = peso;
		this.cargaExtra = cargaExtra;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPersonalizacao() {
		return personalizacao;
	}

	public void setPersonalizacao(String personalizacao) {
		this.personalizacao = personalizacao;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getCargaExtra() {
		return cargaExtra;
	}

	public void setCargaExtra(double cargaExtra) {
		this.cargaExtra = cargaExtra;
	}
	
	
	
	
	
}