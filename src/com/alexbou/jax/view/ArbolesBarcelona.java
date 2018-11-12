package com.alexbou.jax.view;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

import com.alexbou.jax.persistence.CheckerHandler;

public class ArbolesBarcelona {

    public static void main(String[] args) {
	SAXParser parser;
	CheckerHandler handler = null;
	try {
	    handler = new CheckerHandler();
	    parser = SAXParserFactory.newInstance().newSAXParser();
	    parser.parse(new File("datos.xml"), handler);
	} catch (ParserConfigurationException | SAXException | IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}

	// 1
	handler.getStructure().forEach(System.out::println);
	// 2
	System.out.println("Numero de arboles: " + handler.getNumArbres());
	// 3
	System.out.println("num arboles llenos: " + handler.getArbolesLlenos().size());
//	handler.getArbolesLlenos().forEach(System.out::println);

    }
}
