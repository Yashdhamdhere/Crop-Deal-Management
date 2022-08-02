package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.FarmerEntity;
import com.example.demo.farmerservice.FarmerService;

@RestController
@RequestMapping("/crops")
public class FarmerController {
	
	@Autowired
	public FarmerService service;
	
	@PostMapping("/addcroptype")
	public FarmerEntity addtypeofCrop(@RequestBody FarmerEntity farmer)
	{
		service.addtypeofCrop(farmer);
		return farmer;
	}
	@DeleteMapping("/remove")
	public String deleteCrop(@PathVariable("id")int cropid) {
		return service.deleteCrop(cropid);
		
	}
	@GetMapping("/get/{id}")	
	public FarmerEntity getCropbyId(@PathVariable("id")int cropid) {
		return service.getCropbyId(cropid);
		
	}
	
	@GetMapping("/listofcrop")
	public List<FarmerEntity> getCropInfo()
	{
		return service.getCropInfo();
	}
	
	@PutMapping("/updatedata/{id}")
	public void updateCropvalues(@PathVariable("id")int cropid,FarmerEntity farmer) {
		service.updateCropvalues(cropid, farmer);
	}
	
}
