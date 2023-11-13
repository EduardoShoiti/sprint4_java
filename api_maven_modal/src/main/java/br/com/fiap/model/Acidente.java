package br.com.fiap.model;

public class Acidente {

	private String batida;
	private String bateria;
	private String pneus;
	private String mauFuncionamento;
	private String rodaTravada;
	private String pneuCorreia;
	private String combustivelOleo;
	private String sensorFusivel;
	private String radiador;
	private String motorCorreia;
	
	public Acidente() {
		super();
	}

	public Acidente(String batida, String bateria, String pneus, String mauFuncionamento, String rodaTravada,
			String pneuCorreia, String combustivelOleo, String sensorFusivel, String radiador, String motorCorreia) {
		super();
		this.batida = batida;
		this.bateria = bateria;
		this.pneus = pneus;
		this.mauFuncionamento = mauFuncionamento;
		this.rodaTravada = rodaTravada;
		this.pneuCorreia = pneuCorreia;
		this.combustivelOleo = combustivelOleo;
		this.sensorFusivel = sensorFusivel;
		this.radiador = radiador;
		this.motorCorreia = motorCorreia;
	}

	public String getBatida() {
		return batida;
	}

	public void setBatida(String batida) {
		this.batida = batida;
	}

	public String getBateria() {
		return bateria;
	}

	public void setBateria(String bateria) {
		this.bateria = bateria;
	}

	public String getPneus() {
		return pneus;
	}

	public void setPneus(String pneus) {
		this.pneus = pneus;
	}

	public String getMauFuncionamento() {
		return mauFuncionamento;
	}

	public void setMauFuncionamento(String mauFuncionamento) {
		this.mauFuncionamento = mauFuncionamento;
	}

	public String getRodaTravada() {
		return rodaTravada;
	}

	public void setRodaTravada(String rodaTravada) {
		this.rodaTravada = rodaTravada;
	}

	public String getPneuCorreia() {
		return pneuCorreia;
	}

	public void setPneuCorreia(String pneuCorreia) {
		this.pneuCorreia = pneuCorreia;
	}

	public String getCombustivelOleo() {
		return combustivelOleo;
	}

	public void setCombustivelOleo(String combustivelOleo) {
		this.combustivelOleo = combustivelOleo;
	}

	public String getSensorFusivel() {
		return sensorFusivel;
	}

	public void setSensorFusivel(String sensorFusivel) {
		this.sensorFusivel = sensorFusivel;
	}

	public String getRadiador() {
		return radiador;
	}

	public void setRadiador(String radiador) {
		this.radiador = radiador;
	}

	public String getMotorCorreia() {
		return motorCorreia;
	}

	public void setMotorCorreia(String motorCorreia) {
		this.motorCorreia = motorCorreia;
	}
	
	
	
}