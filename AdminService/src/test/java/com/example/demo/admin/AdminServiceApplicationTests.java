package com.example.demo.admin;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.admin.farmerentity.FarmerEntity;
import com.example.demo.admin.farmerrepository.FarmerRepos;
import com.example.demo.admin.farmerservice.FarmerService;

@RunWith(SpringRunner.class)
@SpringBootTest
class AdminServiceApplicationTests {

	@Autowired
	FarmerService service;
	
	@MockBean
	FarmerRepos repo;
	
//	@Test
//	public FarmerEntity addFarmerInfo() {
//		FarmerEntity farmer = new FarmerEntity(3,"Ganpat","Lal",23451,"Pune");
//		when(repo.save(farmer)).thenReturn(farmer);
//		assertEquals(farmer, service.addFarmerInfo(farmer));
//		
//	}

	@Test
	public void deleteFarmerInfo(int id) {
		FarmerEntity farmer = new FarmerEntity(3,"Ganpat","Lal",23451,"Pune");
		service.deleteFarmerInfo(id);
		verify(repo,times(id)).deleteById(id);
	}
}
