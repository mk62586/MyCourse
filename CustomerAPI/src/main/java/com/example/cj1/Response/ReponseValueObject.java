package com.example.cj1.Response;

import org.springframework.stereotype.Component;

import com.example.cj1.CustomerDTO.CustomerDTO;
import com.example.cj1.CustomerDTO.LoanDTO;

import lombok.Data;

@Data
@Component
public class ReponseValueObject {
	private CustomerDTO user;
	private LoanDTO loan;
}
