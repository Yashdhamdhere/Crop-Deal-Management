package com.example.demo.farmerRepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.entity.FarmerEntity;

public interface FarmerRepo extends MongoRepository<FarmerEntity, Integer> {

}
