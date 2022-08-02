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

import com.example.demo.aentity.AdminEntity;
import com.example.demo.aservice.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@RequestMapping("/admininfo")
	public String getAdminDeatils() {
		return "Hi Admin here";
	}
	@Autowired
	public AdminService adminService;
	
	@GetMapping("admin-info")
	public List<AdminEntity> getAdminInfoService(){
		return adminService.getAdminInfo();
	}
	
	@GetMapping("/admin-info/{id}")  
	public AdminEntity getAdminInfoById(@PathVariable("id") int id)   
	{  
	return adminService.getAdminById(id);
	} 
	
	@PostMapping("/admin-save")  
	public AdminEntity addAdminInfo(@RequestBody AdminEntity adminEntity)   
	{  
	adminService.addAdminInfo(adminEntity); 
	return adminEntity;  
	}
	
	@PutMapping("/admin-info/{id}")  
	public AdminEntity updateAdminInfo(@PathVariable("id") int id,@RequestBody AdminEntity adminEntity)   
	{  
	adminService.updateAdminInfo(id,adminEntity);
	return adminEntity;  
	}  
	
	@DeleteMapping("/admin-info/{id}")  
	private void deleteAdminInfo(@PathVariable("id") int id)   
	{  
	adminService.deleteAdminInfo(id);  
	}  
	
}
