package com.example.cj1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cj1.dto.LoanDTO;

public interface MyRepository extends JpaRepository<LoanDTO, Integer>{

}
