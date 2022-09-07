package com.example.cj1.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cj1.dto.LoanDTO;
import com.example.cj1.response.LoanResponse;
import com.example.cj1.services.LoanService;

@RestController
@RequestMapping("/api/Loan")
public class LoanController {
 
	@Autowired
	LoanService service;
	
	@Autowired
	LoanResponse response;
	
	@PostMapping("/createLoan")
	public ResponseEntity<LoanResponse> createLoanAC(@RequestBody LoanDTO dto){
		LoanDTO createLoan=service.createLoan(dto);
		if(createLoan!=null) {
			response.setRespondCode(200);
			response.setError(false);
			response.setDto(Arrays.asList(createLoan));
			return new ResponseEntity<>(response,HttpStatus.OK);
		}else { 
			response.setRespondCode(400);
			response.setError(true);
			response.setDto(null);
			return new ResponseEntity<>(response,HttpStatus.NOT_FOUND);
		}
	}
/*	@GetMapping("/getLoanById/{id}")
	public ResponseEntity<LoanResponse>getLoanById(@PathVariable("id")int id){
	LoanDTO loanById =service.getLoanByID(id);
	if(loanById!=null) {
		response.setRespondCode(200);
		response.setError(false);
		response.setDto(Arrays.asList(loanById));
		return new ResponseEntity<>(response,HttpStatus.OK);
	}else { 
		response.setRespondCode(401);
		response.setError(true);
		response.setDto(Arrays.asList(loanById));
		return new ResponseEntity<>(response,HttpStatus.NOT_FOUND);
	  }
    }*/
	@GetMapping("/fetchLoanById/{id}")
	public LoanDTO fetchLoanById(@PathVariable("id") int id) {
		return service.getLoanByID(id);
	}

 }
