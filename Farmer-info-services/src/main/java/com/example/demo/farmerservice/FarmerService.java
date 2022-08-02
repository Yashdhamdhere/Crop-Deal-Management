package com.example.demo.farmerservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.FarmerEntity;
import com.example.demo.farmerRepository.FarmerRepo;

@Service
public class FarmerService {

	@Autowired
	public FarmerRepo repo;
	
	//to add crop
	public String addtypeofCrop(FarmerEntity farmer) {
		repo.save(farmer);
		return "Crop added";
	}
	
	//to delete crop
	public String deleteCrop(int cropid) {
		repo.deleteById(cropid);
		return "Crop deleted";
	}
	
	//to get crop by id
	public FarmerEntity getCropbyId(int cropid) {
		return repo.findById(cropid).get();
	
	}
	
	//to get list of crop
	public List<FarmerEntity> getCropInfo(){
		List<FarmerEntity> farmer=new ArrayList<FarmerEntity>();
		repo.findAll().forEach(farmer1 ->farmer.add(farmer1));
		return farmer;
	}
	
	//to update the crop values
	public void updateCropvalues(int cropid,FarmerEntity farmer) {
		repo.save(farmer);
	}
}
