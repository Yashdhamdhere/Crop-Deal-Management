package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pentity.PaymentEntity;
import com.example.demo.pservice.PaymentService;

@RestController
@RequestMapping("/payment")
public class PaymentController {
	
	@Autowired
	public PaymentService service;


	@PostMapping("/pay")
	public PaymentEntity doPayment(@RequestBody PaymentEntity paymnet) {
		return service.doPay(paymnet);
	}

}
