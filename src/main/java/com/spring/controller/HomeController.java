package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.data.UserData;
import com.spring.data.UserDataImpl;

@Controller
public class HomeController {

	private UserData userdata = new UserDataImpl();

	private static final String fileName = "test.xml";

	@RequestMapping(value = "/")
	public String getIndex(Model model) {
		model.addAttribute("name", "My namy");
		model.addAttribute("user", userdata.parceUserMainInfo(fileName).get(0));
		model.addAttribute("userChanges", userdata.parceUserMainInfo(fileName));
		return "index";
	}

}