package br.com.fiap.model;


public class Cliente {

	private String cliente;
	private Veiculo veiculo;
	private String cpf;
	private String dataNascimento;
	private String placa;
	private Double pesoVeiculo;
	private String alturaVeiculo;
	private Historico historico;
	private Avaliacao avaliacao;
	
	//construtor vazio 
	public Cliente() {
		super();
	}
	//construtor cheio 
	public Cliente(String cliente, Veiculo veiculo, String cpf, String dataNascimento, String placa, Double pesoVeiculo,
			String alturaVeiculo, Historico historico, Avaliacao avaliacao) {
		super();
		this.cliente = cliente;
		this.veiculo = veiculo;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.placa = placa;
		this.pesoVeiculo = pesoVeiculo;
		this.alturaVeiculo = alturaVeiculo;
		this.historico = historico;
		this.avaliacao = avaliacao;
	}
	//getters e setters 
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public Veiculo getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public Double getPesoVeiculo() {
		return pesoVeiculo;
	}
	public void setPesoVeiculo(Double pesoVeiculo) {
		this.pesoVeiculo = pesoVeiculo;
	}
	public String getAlturaVeiculo() {
		return alturaVeiculo;
	}
	public void setAlturaVeiculo(String alturaVeiculo) {
		this.alturaVeiculo = alturaVeiculo;
	}
	public Historico getHistorico() {
		return historico;
	}
	public void setHistorico(Historico historico) {
		this.historico = historico;
	}
	public Avaliacao getAvaliacao() {
		return avaliacao;
	}
	public void setAvaliacao(Avaliacao avaliacao) {
		this.avaliacao = avaliacao;
	}
	
	
	
}

