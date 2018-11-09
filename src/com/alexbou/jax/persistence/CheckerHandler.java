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
	private int tabulacion = 0;

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if (qName.equals("llistatArbrat")) {
			estructura.add("\tarbre");
			estructura.add("llistatArbrat");
		} else if (qName.equals("arbre")) {
			if (arbol.isLleno())
				arbolesLlenos.add(arbol);
			
			arbol = new Arbol();
		} 
		tabulacion--;
		
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
		}
		tabulacion++;
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
