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

import com.example.demo.fentity.Farmer;
import com.example.demo.frepository.FarmerRepo;
import com.example.demo.fservice.FarmerService;
import com.netflix.discovery.converters.Auto;


@RestController
@RequestMapping("/farmers")
public class Controller {
	
	@Autowired
	private FarmerService service;
	
	@PostMapping("/add")
	public Farmer add(@RequestBody Farmer farmer) {
		service.add(farmer);
		return farmer;
		
	}
	
	@GetMapping("/list")
	public List<Farmer> getAll(){
		return service.getAll();
		
	}
	
	@GetMapping("/{id}")
	public Farmer getFarmerbyId(int farmerid) {
		return service.getFarmerbyId(farmerid);
	}
	
	@PutMapping("/update")
	public Farmer update(@PathVariable("farmerid")int farmerid,@RequestBody Farmer farmer)
	{
		service.updateDetails(farmerid, farmer);
		return farmer;
	}
	
	@DeleteMapping("/delete")
	public String delete(@PathVariable int farmerid) {
		service.delete(farmerid);
		return "DELETED";
	}
}
