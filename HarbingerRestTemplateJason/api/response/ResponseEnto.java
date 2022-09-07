package com.harbinger.api.response;

import org.springframework.stereotype.Component;

import com.harbinger.api.dto.Employe;
import com.harbinger.api.payload.EmployeePayload;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
public class ResponseEnto {

	private Employe employe;
	private EmployeePayload employeePayload;
}
