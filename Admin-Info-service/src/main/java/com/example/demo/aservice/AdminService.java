package com.example.demo.aservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.aentity.AdminEntity;
import com.example.demo.arepository.AdminRepo;

@Service
public class AdminService {
	
	@Autowired
	public AdminRepo repo;
	
	//get all admin info
	public List<AdminEntity> getAdminInfo()   
	{  
	List<AdminEntity> admin = new ArrayList<AdminEntity>();  
	repo.findAll().forEach(admin1 -> admin.add(admin1));  
	return admin;  
	}
	
	//get admininfo by id
	public AdminEntity getAdminById(int id) {
		return repo.findById(id).get();
	}
	
	//post admin info
	public void addAdminInfo(AdminEntity adminEntity) {  
	repo.save(adminEntity);  
	}  
	
	//deleting admininfo by id
	public void deleteAdminInfo(int id) {
		repo.deleteById(id);
	}
	
	//updating the admininfo
	public void updateAdminInfo(int id,AdminEntity adminEntity) {
		repo.save(adminEntity);
	}
	
}

