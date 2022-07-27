package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {

	@RequestMapping("/paymentinfo")
	public String getPayemnt() {
		return "Payment successful";
	}
}
