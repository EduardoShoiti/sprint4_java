package br.com.fiap.model;

public class LocalProblema {
	
	private String plano;
	private String descida;
	private String subida;
	
	public LocalProblema() {
		super();
	}

	public LocalProblema(String plano, String descida, String subida) {
		super();
		this.plano = plano;
		this.descida = descida;
		this.subida = subida;
	}

	public String getPlano() {
		return plano;
	}

	public void setPlano(String plano) {
		this.plano = plano;
	}

	public String getDescida() {
		return descida;
	}

	public void setDescida(String descida) {
		this.descida = descida;
	}

	public String getSubida() {
		return subida;
	}

	public void setSubida(String subida) {
		this.subida = subida;
	}
	
	
	

}
