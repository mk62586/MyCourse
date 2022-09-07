package com.harbinger.api.service;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.harbinger.api.converter.EmpConverter;
import com.harbinger.api.dto.Employe;
import com.harbinger.api.payload.EmployeePayload;

@Service
public class JasonService {

	@Autowired
	EmpConverter cover;
	
	public Employe saveData(Employe emp) throws IOException, IOException, IOException  {
	
	//	EmployeePayload employeePayload = new EmployeePayload();
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		File file = new File("C:\\Users\\mk625\\Documents\\workspace-spring-tool-suite-4-4.14.0.RELEASE\\HarbingerRestTemplateJason\\src\\main\\resources\\employee.json");
		
		EmployeePayload emplayePayload = objectMapper.readValue(file,EmployeePayload.class);
		
	       Employe empPayload =	cover.conDtoENtity(emplayePayload);
		       return empPayload;
		//return empPayload;
	}
}
