package com.alexbou.jax.persistence;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.alexbou.jax.model.Arbol;

public class CheckerHandler extends DefaultHandler {

    private List<String> estructura = new ArrayList<>();
    private Arbol arbol = new Arbol();
    private List<Arbol> arbolesLlenos = new ArrayList<>();
    private int numArbres;
    private int numElem;
    private String actual;
    // private int tabulacion = 0;

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
	if (qName.equals("llistatArbrat")) {
	    estructura.add("\tarbre");
	    estructura.add("llistatArbrat");
	} else if (qName.equals("arbre")) {
	    if (numElem >= 23)
		arbolesLlenos.add(arbol);

	    numElem = 0;
	    arbol = new Arbol();
	}

	// tabulacion--;

    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
	String val = "";
	switch (actual) {
	case "codi":
	    arbol.setCodi(val);
	    numElem++;
	    break;
	case "posicioX_ETRS89":
	    arbol.setPosicioX_ETRS89(val);
	    numElem++;
	    break;
	case "posicioY_ETRS89":
	    arbol.setPosicioY_ETRS89(val);
	    numElem++;
	    break;
	case "latitud_WGS84":
	    arbol.setLatitud_WGS84(val);
	    numElem++;
	    break;
	case "longitud_WGS84":
	    arbol.setLongitud_WGS84(val);
	    numElem++;
	    break;
	case "tipusElement":
	    arbol.setTipusElement(val);
	    numElem++;
	    break;
	case "espaiVerd":
	    arbol.setEspaiVerd(val);
	    numElem++;
	    break;
	case "adreca":
	    arbol.setAdreca(val);
	    numElem++;
	    break;
	case "alcada":
	    arbol.setAlcada(val);
	    numElem++;
	    break;
	case "catEspecieId":
	    arbol.setCatEspecieId(val);
	    numElem++;
	    break;
	case "nomCientific":
	    arbol.setNomCientific(val);
	    numElem++;
	    break;
	case "nomEsp":
	    arbol.setNomEsp(val);
	    numElem++;
	    break;
	case "nomCat":
	    arbol.setNomCat(val);
	    numElem++;
	    break;
	case "categoriaArbrat":
	    arbol.setCategoriaArbrat(val);
	    numElem++;
	    break;
	case "ampladaVorera":
	    arbol.setAmpladaVorera(val);
	    numElem++;
	    break;
	case "plantacioDT":
	    arbol.setPlantacioDT(val);
	    numElem++;
	    break;
	case "tipAigua":
	    arbol.setTipAigua(val);
	    numElem++;
	    break;
	case "tipReg":
	    arbol.setTipReg(val);
	    numElem++;
	    break;
	case "tipSuperf":
	    arbol.setTipSuperf(val);
	    numElem++;
	    break;
	case "tipSuport":
	    arbol.setTipSuport(val);
	    numElem++;
	    break;
	case "cobertaEscocell":
	    arbol.setCobertaEscocell(val);
	    numElem++;
	    break;
	case "midaEscocell":
	    arbol.setMidaEscocell(val);
	    numElem++;
	    break;
	case "voraEscocell":
	    arbol.setVoraEscocell(val);
	    numElem++;
	    break;
	default:
	    // return;
	}

    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
	String toAdd = "";
	if (!qName.equals("llistatArbrat"))
	    toAdd += qName.equals("arbre") ? "\t" : "\t\t";
	toAdd += qName;
	if (!estructura.contains(toAdd))
	    estructura.add(toAdd);
	if (qName.equals("arbre")) {
	    numArbres++;
	    numElem = 0;
	}
	System.out.println(qName);
	actual = qName;
    }

    public List<String> getStructure() {
	return estructura;
    }

    public int getNumArbres() {
	return numArbres;
    }

    public List<Arbol> getArbolesLlenos() {
	return arbolesLlenos;
    }
}
