package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.data.ContactsData;
import com.spring.data.ContactsDataImpl;
import com.spring.data.UserData;
import com.spring.data.UserDataImpl;

@Controller
public class HomeController {

	private UserData userdata = new UserDataImpl();
	private ContactsData contactsData = new ContactsDataImpl();

	private static final String fileName = "test.xml";

	@RequestMapping(value = "/")
	public String getIndex(Model model) {
		model.addAttribute("name", "My namy");
		model.addAttribute("user", userdata.parceUserMainInfo(fileName).get(0));
		model.addAttribute("userChanges", userdata.parceUserMainInfo(fileName));
		model.addAttribute("document", userdata.parceDocumentUserInfo(fileName).get(0));
		model.addAttribute("documents", userdata.parceDocumentUserInfo(fileName));
		model.addAttribute("address", userdata.parceUserAddressInfo(fileName).get(0));
		model.addAttribute("addresses", userdata.parceUserAddressInfo(fileName));
		model.addAttribute("work", userdata.parceUserWorkInfo(fileName).get(0));
		model.addAttribute("phoneContact", contactsData.parceContactInfo(fileName));
		return "index";
	}

}