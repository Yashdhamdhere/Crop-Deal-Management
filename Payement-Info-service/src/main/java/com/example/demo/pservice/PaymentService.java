package com.example.demo.pservice;

import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.frepository.PaymentRepo;
import com.example.demo.pentity.PaymentEntity;

@Service
public class PaymentService {

	@Autowired
	public PaymentRepo repo;
	
	public PaymentEntity doPay(PaymentEntity payment) {
		payment.setPaymnetStatus(paymentStatus());
		payment.setTxId(UUID.randomUUID().toString());
		return repo.save(payment);
	}
	
	public String paymentStatus() {
		return new Random().nextBoolean()?"success":"failuer";
	}
}
