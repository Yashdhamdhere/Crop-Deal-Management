package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/crop")
public class CropController {

	@RequestMapping("/cropinfo")
	public String getCropDeatils() {
		return "Hi Crop here";
	}
}
