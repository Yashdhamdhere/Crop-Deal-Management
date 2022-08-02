package com.example.demo.fservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.fentity.Farmer;
import com.example.demo.frepository.FarmerRepo;

@Service
public class FarmerService {

	@Autowired 
	private FarmerRepo repo;
	
	public Farmer add(Farmer farmer) {
		return repo.save(farmer);
	}
	
	
	public List<Farmer> getAll(){
		List<Farmer> farmer =new ArrayList<Farmer>();
		repo.findAll().forEach(farmer1 ->farmer.add(farmer1));
		return farmer;
		}
	
	public Optional<Farmer> getFarmerbyId(int farmerid) {
		return repo.findById(farmerid);
		
	}
	
	public void updateDetails(int farmerid, Farmer farmer) {
		 repo.save(farmer);
	}
	public void delete(int farmerid) {
		repo.deleteById(farmerid);
	}
}
