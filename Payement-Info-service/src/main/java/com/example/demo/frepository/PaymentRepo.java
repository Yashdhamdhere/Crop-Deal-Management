package com.example.demo.frepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.pentity.PaymentEntity;

public interface PaymentRepo extends MongoRepository<PaymentEntity, Integer>{

}
