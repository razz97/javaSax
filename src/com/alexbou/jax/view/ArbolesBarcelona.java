package com.alexbou.jax.view;

import java.io.File;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import com.alexbou.jax.persistence.CheckerHandler;

public class ArbolesBarcelona {

	public static void main(String[] args) throws Exception{
	
		SAXParser parser = SAXParserFactory.newInstance().newSAXParser();
		CheckerHandler handler = new CheckerHandler();
		parser.parse(new File("datos.xml"), handler);
		//1
		handler.getStructure().forEach(System.out::println);
		//2
		System.out.println("Numero de arboles: " + handler.getNumArbres());
		//3
		handler.getArbolesLlenos().forEach(System.out::println);
	}
}
