package br.com.fiap.model;

public class TipoGuincho {

	private String PesadonPadrao;
	private String PesadoplatHidraulica;
	private String platHidraulicaMunck;
	private String platHidraulicaBand;
	private String quintaRodaBandeja;
	private String torreLanca;
	private String plataformaHidraulica;
	private String hidraulicaLanca;
	private String quintaRodalanca;
	private String tecPesado;
	
	//construtor vazio
	public TipoGuincho() {
		super();
	}
	
	//construtor cheio 
	public TipoGuincho(String pesadonPadrao, String pesadoplatHidraulica, String platHidraulicaMunck,
			String platHidraulicaBand, String quintaRodaBandeja, String torreLanca, String plataformaHidraulica,
			String hidraulicaLanca, String quintaRodalanca, String tecPesado) {
		super();
		PesadonPadrao = pesadonPadrao;
		PesadoplatHidraulica = pesadoplatHidraulica;
		this.platHidraulicaMunck = platHidraulicaMunck;
		this.platHidraulicaBand = platHidraulicaBand;
		this.quintaRodaBandeja = quintaRodaBandeja;
		this.torreLanca = torreLanca;
		this.plataformaHidraulica = plataformaHidraulica;
		this.hidraulicaLanca = hidraulicaLanca;
		this.quintaRodalanca = quintaRodalanca;
		this.tecPesado = tecPesado;
	}
	
	//getters setters 

	public String getPesadonPadrao() {
		return PesadonPadrao;
	}

	public void setPesadonPadrao(String pesadonPadrao) {
		PesadonPadrao = pesadonPadrao;
	}

	public String getPesadoplatHidraulica() {
		return PesadoplatHidraulica;
	}

	public void setPesadoplatHidraulica(String pesadoplatHidraulica) {
		PesadoplatHidraulica = pesadoplatHidraulica;
	}

	public String getPlatHidraulicaMunck() {
		return platHidraulicaMunck;
	}

	public void setPlatHidraulicaMunck(String platHidraulicaMunck) {
		this.platHidraulicaMunck = platHidraulicaMunck;
	}

	public String getPlatHidraulicaBand() {
		return platHidraulicaBand;
	}

	public void setPlatHidraulicaBand(String platHidraulicaBand) {
		this.platHidraulicaBand = platHidraulicaBand;
	}

	public String getQuintaRodaBandeja() {
		return quintaRodaBandeja;
	}

	public void setQuintaRodaBandeja(String quintaRodaBandeja) {
		this.quintaRodaBandeja = quintaRodaBandeja;
	}

	public String getTorreLanca() {
		return torreLanca;
	}

	public void setTorreLanca(String torreLanca) {
		this.torreLanca = torreLanca;
	}

	public String getPlataformaHidraulica() {
		return plataformaHidraulica;
	}

	public void setPlataformaHidraulica(String plataformaHidraulica) {
		this.plataformaHidraulica = plataformaHidraulica;
	}

	public String getHidraulicaLanca() {
		return hidraulicaLanca;
	}

	public void setHidraulicaLanca(String hidraulicaLanca) {
		this.hidraulicaLanca = hidraulicaLanca;
	}

	public String getQuintaRodalanca() {
		return quintaRodalanca;
	}

	public void setQuintaRodalanca(String quintaRodalanca) {
		this.quintaRodalanca = quintaRodalanca;
	}

	public String getTecPesado() {
		return tecPesado;
	}

	public void setTecPesado(String tecPesado) {
		this.tecPesado = tecPesado;
	}
	
	
	
	
}
