package br.com.fiap.model;

public class Avaliacao {

	private String feedback;
	private String comentarios;
	
	//construtor vazio 
	public Avaliacao() {
		super();
	}
	//construtor cheio 
	public Avaliacao(String feedback, String comentarios) {
		super();
		this.feedback = feedback;
		this.comentarios = comentarios;
	}
	
	//getters e setters 
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	public String getComentarios() {
		return comentarios;
	}
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}
}