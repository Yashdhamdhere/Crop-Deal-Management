package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/farmer")
public class Controller {

	@RequestMapping("/farmerdetails")
	public String addFarmerDetails() {
		return "farmer added";
	}
}
