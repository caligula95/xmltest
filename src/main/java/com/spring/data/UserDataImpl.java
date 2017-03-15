package com.spring.data;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import com.spring.domain.User;
/*String countr = element.getElementsByTagName("country").item(0).getTextContent();
String nearestArea = element.getElementsByTagName("areaName").item(0).getTextContent();*/
public class UserDataImpl implements UserData {

	private final static String NAME = "fname", SURNAME = "lname", MIDDLENAME = "mname",
			INN = "inn", BIRTHDAY = "bdate", LASTMODIFIED = "vdate"; 
	
	public List<User> parceUserMainInfo(String fileName) {
		List<User> users = new ArrayList<User>();
		User user = null;
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
		NodeList nList = doc.getElementsByTagName("ident");
		for (int temp = 0; temp < nList.getLength(); temp++) {
			Node nNode = nList.item(temp);
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) nNode;
				user = new User();
				user.setMiddleName(element.getAttribute(MIDDLENAME));
				user.setBirthday(element.getAttribute(BIRTHDAY));
				user.setSurname(element.getAttribute(SURNAME));
				user.setName(element.getAttribute(NAME));
				user.setInn(element.getAttribute(INN));
				user.setLastModified(element.getAttribute(LASTMODIFIED));
			}
			users.add(user);
		}
		return users;
	}
	
}
