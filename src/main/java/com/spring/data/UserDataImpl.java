package com.spring.data;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.spring.domain.Address;
import com.spring.domain.User;
import com.spring.domain.Work;

public class UserDataImpl implements UserData {

	private final static String NAME = "fname", SURNAME = "lname", MIDDLENAME = "mname", INN = "inn",
			BIRTHDAY = "bdate", GENDER = "csexref", FAMILY_STATUS = "familyref";

	private final static String DATE_OF_CREATION = "dwdt", WHO_GAVE = "dwho", NUMBER = "dnom", SERIA = "dser",
			TYPE = "dtyperef", LANGUAGE_REF = "lngref", DATE_OF_CHANGE = "vdate";

	private final static String FLAT_NUMBER = "adflat", HOME_NUMBER = "adhome", STREET = "adstreet", SITY = "adcity",
			STATE = "adstate", COUNTRY = "adcountry", TYPE_REF = "adtyperef", INDEX = "adindex";

	private final static String WORK = "wname", EGRPOU_OF_WORK = "cdolgn", WORK_SALARY = "wdohod", WORK_PO = "wokpo",
			POSITION_STATUS = "cdolgnref";

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
				user.setLastModified(element.getAttribute(DATE_OF_CHANGE));
				user.setGender(element.getAttribute(GENDER));
				user.setFamilyStatus(element.getAttribute(FAMILY_STATUS));
			}
			users.add(user);
		}
		return users;
	}

	public List<com.spring.domain.Document> parceDocumentUserInfo(String fileName) {
		List<com.spring.domain.Document> documents = new ArrayList<>();
		com.spring.domain.Document document = null;
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
		NodeList nList = doc.getElementsByTagName("doc");
		for (int temp = 0; temp < nList.getLength(); temp++) {
			Node nNode = nList.item(temp);
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) nNode;
				document = new com.spring.domain.Document();
				document.setDateOfChange(element.getAttribute(DATE_OF_CHANGE));
				document.setDateOfCreation(element.getAttribute(DATE_OF_CREATION));
				document.setLanguageRef(element.getAttribute(LANGUAGE_REF));
				document.setNumber(element.getAttribute(NUMBER));
				document.setSeria(element.getAttribute(SERIA));
				document.setType(element.getAttribute(TYPE));
				document.setWhoGave(element.getAttribute(WHO_GAVE));
			}
			documents.add(document);
		}
		return documents;
	}

	public List<Address> parceUserAddressInfo(String fileName) {
		List<Address> addresses = new ArrayList<>();
		Address address = null;
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
		NodeList nList = doc.getElementsByTagName("addr");
		for (int temp = 0; temp < nList.getLength(); temp++) {
			Node nNode = nList.item(temp);
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) nNode;
				address = new Address();
				address.setCity(element.getAttribute(SITY));
				address.setCountry(element.getAttribute(COUNTRY));
				address.setDateOfChange(element.getAttribute(DATE_OF_CHANGE));
				address.setFlatNumber(element.getAttribute(FLAT_NUMBER));
				address.setHomeNumber(element.getAttribute(HOME_NUMBER));
				address.setIndex(element.getAttribute(INDEX));
				address.setLanguageRef(LANGUAGE_REF);
				address.setState(element.getAttribute(STATE));
				address.setStreet(element.getAttribute(STREET));
				address.setTypeRef(element.getAttribute(TYPE_REF));
			}
			addresses.add(address);
		}
		return addresses;
	}

	public List<Work> parceUserWorkInfo(String fileName) {
		List<Work> works = new ArrayList<>();
		Work work = null;
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
		NodeList nList = doc.getElementsByTagName("work");
		for (int temp = 0; temp < nList.getLength(); temp++) {
			Node nNode = nList.item(temp);
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) nNode;
				work = new Work();
				work.setDateOfChange(element.getAttribute(DATE_OF_CHANGE));
				work.setEGRPOUofWork(element.getAttribute(EGRPOU_OF_WORK));
				work.setLanguageRef(element.getAttribute(LANGUAGE_REF));
				work.setPositionStatus(element.getAttribute(POSITION_STATUS));
				work.setWork(element.getAttribute(WORK));
				work.setWorkPo(element.getAttribute(WORK_PO));
				work.setWorkSalary(element.getAttribute(WORK_SALARY));
			}
			works.add(work);
		}
		return works;
	}

}
