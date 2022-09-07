package com.example.cj1.Response;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.cj1.CustomerDTO.CustomerDTO;

import lombok.Data;

@Data
@Component
public class CustomerResponse {
	private int respondCode;
	private boolean error;
	private List<CustomerDTO> dto;
}
