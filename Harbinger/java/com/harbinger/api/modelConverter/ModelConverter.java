package com.harbinger.api.modelConverter;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.harbinger.api.dto.EmployeePayload;
import com.harbinger.api.model.Employee;

@Component
public class ModelConverter {

	
	public Employee conDtoENtity(EmployeePayload employeePayload) {
		ModelMapper model = new ModelMapper(); 
		Employee employee = model.map(employeePayload, Employee.class);
		return employee;
	}
	
	public EmployeePayload con(Employee employee) {
		ModelMapper model = new ModelMapper(); 
		 EmployeePayload employeePayload = model.map(employee, EmployeePayload.class);
		return employeePayload;
	}
}
