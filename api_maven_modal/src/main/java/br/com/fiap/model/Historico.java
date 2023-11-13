package br.com.fiap.model;

public class Historico {
	
	
	private String chamadosAntigos;
	private String frequenciaChamado;
	private int numeroDeAntigosProblemas;
	
	//construtor vazio
	public Historico() {
		super();
	}
	//construtor cheio
	public Historico(String chamadosAntigos, String frequenciaChamado, int numeroDeAntigosProblemas) {
		super();
		this.chamadosAntigos = chamadosAntigos;
		this.frequenciaChamado = frequenciaChamado;
		this.numeroDeAntigosProblemas = numeroDeAntigosProblemas;
	}
	
	//getters e setters 
	public String getChamadosAntigos() {
		return chamadosAntigos;
	}
	public void setChamadosAntigos(String chamadosAntigos) {
		this.chamadosAntigos = chamadosAntigos;
	}
	public String getFrequenciaChamado() {
		return frequenciaChamado;
	}
	public void setFrequenciaChamado(String frequenciaChamado) {
		this.frequenciaChamado = frequenciaChamado;
	}
	public int getNumeroDeAntigosProblemas() {
		return numeroDeAntigosProblemas;
	}
	public void setNumeroDeAntigosProblemas(int numeroDeAntigosProblemas) {
		this.numeroDeAntigosProblemas = numeroDeAntigosProblemas;
	}
	

}

