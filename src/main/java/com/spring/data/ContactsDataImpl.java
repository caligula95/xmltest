package com.spring.data;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.spring.domain.Contacts;
import com.spring.domain.User;

public class ContactsDataImpl implements ContactsData {

	private static final String TYPE_OF_CONTACT = "ctyperef", CONTACT = "cval", DATE_OF_CONTACT = "vdate", TYPE = "ctype";
	
	public Set<Contacts> parceContactInfo(String fileName) {
		Set<Contacts> contacts = new HashSet<>();
		Contacts contact = null;
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = null;
		try {
			dBuilder = dbFactory.newDocumentBuilder();
		} catch (ParserConfigurationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Document doc = null;
		File file = new File(fileName);
		try {

			doc = dBuilder.parse(file);
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		doc.getDocumentElement().normalize();
		NodeList nList = doc.getElementsByTagName("cont");
		for (int temp = 0; temp < nList.getLength(); temp++) {
			Node nNode = nList.item(temp);
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) nNode;
			contact = new Contacts();
			contact.setContact(element.getAttribute(CONTACT));
			contact.setDateOfContact(element.getAttribute(DATE_OF_CONTACT));
			contact.setTypeOfContact(element.getAttribute(TYPE_OF_CONTACT));
			contact.setType(Integer.parseInt(element.getAttribute(TYPE)));
			}
			contacts.add(contact);
		}
		return contacts;
	}
}
