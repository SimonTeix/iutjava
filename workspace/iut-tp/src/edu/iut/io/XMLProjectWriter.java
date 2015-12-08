package edu.iut.io;

import java.util.ArrayList;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import edu.iut.app.ExamEvent;

//EX 1 Completer la classe 

public class XMLProjectWriter {
	
	public XMLProjectWriter() {	TransformerFactory transformerFactory=TransformerFactory.newInstance();
	Transformer transformer=transformerFactory.newTransformer();
	DOMSourcesource =new DOMSource(document);
	StreamResultoutput =new StreamResult(new File(System.getProperty("user.home")+"/save.xml"));
	transformer.setOutputProperty(OutputKeys.INDENT,"yes");
	transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount","2");
	transformer.transform(source,output);	
	}
	
	
	
	public void save(ArrayList<ExamEvent> data, java.io.File xmlfile) {
		
	}
}
