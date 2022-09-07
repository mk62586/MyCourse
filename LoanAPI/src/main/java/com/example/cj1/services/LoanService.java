package com.example.cj1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cj1.dto.LoanDTO;
import com.example.cj1.repository.MyRepository;

@Service
public class LoanService {
  @Autowired
	MyRepository repo;

public LoanDTO createLoan(LoanDTO dto) {
	return repo.save(dto);
 }
public LoanDTO getLoanByID(int id) {
	return repo.findById(id).orElse(null);	
   }
}
