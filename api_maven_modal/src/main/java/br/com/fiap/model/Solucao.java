package br.com.fiap.model;

public class Solucao {

	private String guinchos;
	private String motos;
	
	//construtor vazio
	public Solucao() {
		super();
	}
	//construtor cheio
	public Solucao(String guinchos, String motos) {
		super();
		this.guinchos = guinchos;
		this.motos = motos;
	}
	
	//getters e settters 
	public String getGuinchos() {
		return guinchos;
	}
	public void setGuinchos(String guinchos) {
		this.guinchos = guinchos;
	}
	public String getMotos() {
		return motos;
	}
	public void setMotos(String motos) {
		this.motos = motos;
	}
	
}
