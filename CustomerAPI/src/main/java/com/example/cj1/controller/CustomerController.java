package com.example.cj1.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cj1.CustomerDTO.CustomerDTO;
import com.example.cj1.Response.CustomerResponse;
import com.example.cj1.Response.ReponseValueObject;
import com.example.cj1.Service.CustomerService;


@RestController
@RequestMapping("api/customer")
public class CustomerController {

	@Autowired
	CustomerService service;
	
	@Autowired
	CustomerResponse response;
	
	@PostMapping("/saveCustomer")
	public ResponseEntity<CustomerResponse>saveCustomer(@RequestBody CustomerDTO dto){
		CustomerDTO saveCustomer = service.saveCustomer(dto);
		if(saveCustomer!=null) {
			response.setRespondCode(200);
			response.setError(false);
			response.setDto(Arrays.asList(saveCustomer));
			return new ResponseEntity<>(response,HttpStatus.OK);
		}else { 
			response.setRespondCode(400);
			response.setError(true);
			response.setDto(null);
			return new ResponseEntity<>(response,HttpStatus.NOT_FOUND);
		}
	}
	@GetMapping("/getCustomerByID/{id}")
	public ResponseEntity<CustomerResponse>getCustomerById(@PathVariable("id") int id){
	CustomerDTO customerById=service.getCustomerById(id);
	if(customerById!=null) {
		response.setRespondCode(200);
		response.setError(false);
		response.setDto(Arrays.asList(customerById));
		return new ResponseEntity<>(response,HttpStatus.OK);
	}else { 
		response.setRespondCode(401);
		response.setError(true);
		response.setDto(Arrays.asList(customerById));
		return new ResponseEntity<>(response,HttpStatus.NOT_FOUND);
	  }
	}
	@DeleteMapping("/deleteProduct/{id}")
	public ResponseEntity<CustomerResponse>deleteCustomer(@PathVariable("id") int id){ 
		 CustomerDTO deleteCustomer = service.deleteCustomer(id);
		 if(deleteCustomer!=null) {
			 response.setRespondCode(200);
			 response.setError(false);
			 response.setDto(Arrays.asList(deleteCustomer));
			 return new ResponseEntity<>(response,HttpStatus.OK);
		 }else {
				response.setRespondCode(400);
				response.setError(true);
				response.setDto(null);
				return new ResponseEntity<CustomerResponse>(response,HttpStatus.NOT_FOUND);
		 }
	}	
	@GetMapping("/fetchUserLoanById/{id}")
	public ReponseValueObject fetchUserLoanById(@PathVariable("id") int id) {
		return service.fetchUserLoanById(id);
	}
}

