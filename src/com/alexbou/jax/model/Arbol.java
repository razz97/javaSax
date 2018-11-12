package com.alexbou.jax.model;

public class Arbol {

    private String codi;
    private String posicioX_ETRS89;
    private String posicioY_ETRS89;
    private String latitud_WGS84;
    private String longitud_WGS84;
    private String tipusElement;
    private String espaiVerd;
    private String adreca;
    private String alcada;
    private String catEspecieId;
    private String nomCientific;
    private String nomEsp;
    private String nomCat;
    private String categoriaArbrat;
    private String ampladaVorera;
    private String plantacioDT;
    private String tipAigua;
    private String tipReg;
    private String tipSuperf;
    private String tipSuport;
    private String cobertaEscocell;
    private String midaEscocell;
    private String voraEscocell;

    public String getCodi() {
	return codi;
    }

    public void setCodi(String codi) {
	this.codi = codi;
    }

    public String getPosicioX_ETRS89() {
	return posicioX_ETRS89;
    }

    public void setPosicioX_ETRS89(String posicioX) {
	this.posicioX_ETRS89 = posicioX;
    }

    public String getPosicioY_ETRS89() {
	return posicioY_ETRS89;
    }

    public void setPosicioY_ETRS89(String posicioY) {
	this.posicioY_ETRS89 = posicioY;
    }

    public String getLatitud_WGS84() {
	return latitud_WGS84;
    }

    public void setLatitud_WGS84(String latitud_WGS84) {
	this.latitud_WGS84 = latitud_WGS84;
    }

    public String getLongitud_WGS84() {
	return longitud_WGS84;
    }

    public void setLongitud_WGS84(String longitud_WGS84) {
	this.longitud_WGS84 = longitud_WGS84;
    }

    public String getTipusElement() {
	return tipusElement;
    }

    public void setTipusElement(String tipusElement) {
	this.tipusElement = tipusElement;
    }

    public String getEspaiVerd() {
	return espaiVerd;
    }

    public void setEspaiVerd(String espaiVerd) {
	this.espaiVerd = espaiVerd;
    }

    public String getAdreca() {
	return adreca;
    }

    public void setAdreca(String adreca) {
	this.adreca = adreca;
    }

    public String getAlcada() {
	return alcada;
    }

    public void setAlcada(String alcada) {
	this.alcada = alcada;
    }

    public String getCatEspecieId() {
	return catEspecieId;
    }

    public void setCatEspecieId(String catEspecieId) {
	this.catEspecieId = catEspecieId;
    }

    public String getNomCientific() {
	return nomCientific;
    }

    public void setNomCientific(String nomCientific) {
	this.nomCientific = nomCientific;
    }

    public String getNomEsp() {
	return nomEsp;
    }

    public void setNomEsp(String nomEsp) {
	this.nomEsp = nomEsp;
    }

    public String getNomCat() {
	return nomCat;
    }

    public void setNomCat(String nomCat) {
	this.nomCat = nomCat;
    }

    public String getCategoriaArbrat() {
	return categoriaArbrat;
    }

    public void setCategoriaArbrat(String categoriaArbrat) {
	this.categoriaArbrat = categoriaArbrat;
    }

    public String getAmpladaVorera() {
	return ampladaVorera;
    }

    public void setAmpladaVorera(String ampladaVorera) {
	this.ampladaVorera = ampladaVorera;
    }

    public String getPlantacioDT() {
	return plantacioDT;
    }

    public void setPlantacioDT(String plantacioDT) {
	this.plantacioDT = plantacioDT;
    }

    public String getTipAigua() {
	return tipAigua;
    }

    public void setTipAigua(String tipAigua) {
	this.tipAigua = tipAigua;
    }

    public String getTipReg() {
	return tipReg;
    }

    public void setTipReg(String tipReg) {
	this.tipReg = tipReg;
    }

    public String getTipSuperf() {
	return tipSuperf;
    }

    public void setTipSuperf(String tipSuperf) {
	this.tipSuperf = tipSuperf;
    }

    public String getTipSuport() {
	return tipSuport;
    }

    public void setTipSuport(String tipSuport) {
	this.tipSuport = tipSuport;
    }

    public String getCobertaEscocell() {
	return cobertaEscocell;
    }

    public void setCobertaEscocell(String cobEscocell) {
	this.cobertaEscocell = cobEscocell;
    }

    public String getVoraEscocell() {
	return voraEscocell;
    }

    public void setVoraEscocell(String voraEscocell) {
	this.voraEscocell = voraEscocell;
    }

    public String getMidaEscocell() {
	return midaEscocell;
    }

    public void setMidaEscocell(String midaEscocell) {
	this.midaEscocell = midaEscocell;
    }

    @Override
    public String toString() {
	return "Arbre " + this.codi;
    }

}
