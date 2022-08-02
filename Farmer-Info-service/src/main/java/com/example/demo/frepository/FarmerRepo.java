package com.example.demo.frepository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.fentity.Farmer;

public interface FarmerRepo extends MongoRepository<Farmer, Integer>
{

//	public Farmer findById(int farmerid);
//	public List<Farmer> findAllFarmer();
//	public Farmer save(Farmer farmer);

}
