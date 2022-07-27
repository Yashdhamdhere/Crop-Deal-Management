package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dealer")
public class DealerController {

	@RequestMapping("/info")
	public String getDealerDeatils() {
		return "Hi Dealer here";
	}
}
