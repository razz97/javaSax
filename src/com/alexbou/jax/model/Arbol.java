package com.alexbou.jax.model;

public class Arbol {

	boolean lleno = false;
	private String codi;
	private String posX;
	private String posY;
	private String latitude;
	private String longitude;
	private String tipus;
	private String espaiVerd;
	private String adreca;
	private String alcada;
	private String catEspecie;
	private String nomCientific;
	private String nomEsp;
	private String nomCat;
	private String catArbrat;
	private String amplBorera;
	private String plantDT;
	private String tipAigua;
	private String tipSuperf;
	private String tipSuport;
	private String cobEscocell;
	private String voraEscocell;
	
	public boolean isLleno() {
		return lleno;
	}
	
	public void setLleno(boolean lleno) {
		this.lleno = lleno;
	}
	
	public String getCodi() {
		return codi;
	}

	public String getPosX() {
		return posX;
	}

	public String getPosY() {
		return posY;
	}

	public String getLatitude() {
		return latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public String getTipus() {
		return tipus;
	}

	public String getEspaiVerd() {
		return espaiVerd;
	}

	public String getAdreca() {
		return adreca;
	}

	public String getAlcada() {
		return alcada;
	}

	public String getCatEspecie() {
		return catEspecie;
	}

	public String getNomCientific() {
		return nomCientific;
	}

	public String getNomEsp() {
		return nomEsp;
	}

	public String getNomCat() {
		return nomCat;
	}

	public String getCatArbrat() {
		return catArbrat;
	}

	public String getAmplBorera() {
		return amplBorera;
	}

	public String getPlantDT() {
		return plantDT;
	}

	public String getTipAigua() {
		return tipAigua;
	}

	public String getTipSuperf() {
		return tipSuperf;
	}

	public String getTipSuport() {
		return tipSuport;
	}

	public String getCobEscocell() {
		return cobEscocell;
	}

	public String getVoraEscocell() {
		return voraEscocell;
	}

	public void setCodi(String codi) {
		this.codi = codi;
	}

	public void setPosX(String posX) {
		this.posX = posX;
	}

	public void setPosY(String posY) {
		this.posY = posY;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public void setTipus(String tipus) {
		this.tipus = tipus;
	}

	public void setEspaiVerd(String espaiVerd) {
		this.espaiVerd = espaiVerd;
	}

	public void setAdreca(String adreca) {
		this.adreca = adreca;
	}

	public void setAlcada(String alcada) {
		this.alcada = alcada;
	}

	public void setCatEspecie(String catEspecie) {
		this.catEspecie = catEspecie;
	}

	public void setNomCientific(String nomCientific) {
		this.nomCientific = nomCientific;
	}

	public void setNomEsp(String nomEsp) {
		this.nomEsp = nomEsp;
	}

	public void setNomCat(String nomCat) {
		this.nomCat = nomCat;
	}

	public void setCatArbrat(String catArbrat) {
		this.catArbrat = catArbrat;
	}

	public void setAmplBorera(String amplBorera) {
		this.amplBorera = amplBorera;
	}

	public void setPlantDT(String plantDT) {
		this.plantDT = plantDT;
	}

	public void setTipAigua(String tipAigua) {
		this.tipAigua = tipAigua;
	}

	public void setTipSuperf(String tipSuperf) {
		this.tipSuperf = tipSuperf;
	}

	public void setTipSuport(String tipSuport) {
		this.tipSuport = tipSuport;
	}

	public void setCobEscocell(String cobEscocell) {
		this.cobEscocell = cobEscocell;
	}

	public void setVoraEscocell(String voraEscocell) {
		this.voraEscocell = voraEscocell;
	}
	
	@Override
	public String toString() {
		return "Arbre " + this.codi;
	}

}
