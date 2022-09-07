package com.harbinger.api.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.harbinger.api.dto.AddressPayload;

import com.harbinger.api.dto.EmployeePayload;

import com.harbinger.api.model.Employee;
import com.harbinger.api.modelConverter.ModelConverter;
import com.harbinger.api.repo.EmployeeRepo;
import com.harbinger.api.repo.OrderRepo;
import com.harbinger.api.service.MyService;

@RestController
@RequestMapping("/api")
public class Controller {

	@Autowired
	EmployeeRepo repo;
	
	@Autowired
   MyService service;
	
	@Autowired
	ModelConverter modelC;
	


	
	@PostMapping("/save")
	public Employee saveAll(@RequestBody Employee em) {
		
	
		EmployeePayload emp = new EmployeePayload();
		
		//emp.setId(2);
		emp.setEmpCode("12");
		emp.setFName("Rahul");
		emp.setMName("Aman");
		emp.setMName("Sanker");
		emp.setPhoneNo(88999);
		emp.setGender('F');
	   //emp.setDate();
		
		AddressPayload addressPayload = new AddressPayload();
		
	//	addressPayload.setId(101);
		addressPayload.setEmpId(103);
		addressPayload.setLine1("Rajgang");
		addressPayload.setLine2("DhanbAD");
		addressPayload.setState("Jharkhand");
		addressPayload.setCountry("india");
		addressPayload.setPinCode(778985);
		addressPayload.setLine1("Dhanba");
		addressPayload.setCity("Dhanbad");
		
		AddressPayload addressPayload1 = new AddressPayload();
	//	addressPayload1.setId(102);
		addressPayload1.setEmpId(104);
		addressPayload1.setLine1("bokROO");
		addressPayload1.setLine2("dhanbad");
		addressPayload1.setState("cghghbcgcf");
		addressPayload1.setCountry("india");
		addressPayload1.setPinCode(78999);
		addressPayload1.setLine1("srg");
		addressPayload1.setCity("Bokaro");
		
	
		
		List<AddressPayload> adrp = new ArrayList<>();
		
		adrp.add(addressPayload);
		adrp.add(addressPayload1);
		
		emp.setAddressPaylod(adrp);
		
	Employee conDtoENtity = modelC.conDtoENtity(emp);
	return service.saveEmployee(conDtoENtity);
		
	       
		
	}
	@GetMapping("/single")
	public void fetch() {
		
     System.out.println("Hell how arrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr");
	
	}
	@GetMapping("/all")
	public void all() {
		service.fetchbyIdAll();
	}
	@GetMapping("/tot/{id}")
	public Employee all(@PathVariable("id") int id) {
		return service.fetchbyId(id);
	}
}

