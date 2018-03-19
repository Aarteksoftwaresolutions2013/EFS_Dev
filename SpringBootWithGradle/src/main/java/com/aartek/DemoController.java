package com.aartek;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;



@RestController
public class DemoController {
	String data = "tempData";

	@RequestMapping(value = "/getTempData", method = RequestMethod.GET)
	public String getTempData() {
		User user = new User(1, "admin", "gson@gmail.com");
		return new Gson().toJson(user);
	}
}
