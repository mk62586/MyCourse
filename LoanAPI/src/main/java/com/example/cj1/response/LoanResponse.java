package com.example.cj1.response;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.cj1.dto.LoanDTO;

import lombok.Data;


@Data
@Component
public class LoanResponse {
	private int respondCode;
	private boolean error;
	private List<LoanDTO> dto;
}
