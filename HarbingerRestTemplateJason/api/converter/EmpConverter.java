package com.harbinger.api.converter;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.harbinger.api.dto.Employe;
import com.harbinger.api.payload.EmployeePayload;

@Component
public class EmpConverter {

	public Employe conDtoENtity(EmployeePayload employeePayload) {
		ModelMapper model = new ModelMapper(); 
		Employe employee = model.map(employeePayload, Employe.class);
		return employee;
	}
	
	public EmployeePayload con(Employe employee) {
		ModelMapper model = new ModelMapper(); 
		 EmployeePayload employeePayload = model.map(employee, EmployeePayload.class);
		return employeePayload;
	}
}


