package br.com.fiap.model;

public class Chamado {

	private String data;
	private String hora;
	private int idChamado;
	
	//construtor vazio 
	public Chamado() {
		super();
	}
	//construtor cheio
	public Chamado(String data, String hora, int idChamado) {
		super();
		this.data = data;
		this.hora = hora;
		this.idChamado = idChamado;
	}
	
	//getters e setters 
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public int getIdChamado() {
		return idChamado;
	}
	public void setIdChamado(int idChamado) {
		this.idChamado = idChamado;
	}
	
}