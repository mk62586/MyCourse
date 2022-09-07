package com.harbinger.api.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.harbinger.api.dto.Employe;
import com.harbinger.api.payload.EmployeePayload;
import com.harbinger.api.service.JasonService;

@RestController
@RequestMapping("/api")
public class Controller {

	@Autowired
	public JasonService services;
	
	/*@PostMapping("/bhejo")
	public EmployeePayload em(@RequestBody Employe emp) throws IOException, IOException {
		return services.saveData(emp);
	}*/
//	@RequestMapping("/api/")
	@GetMapping("/fetch/")
	public Employe getAll( Employe employed) throws IOException {
		Employe ep =services.saveData(employed);
		
		System.out.println(ep.getFName()+" jjjjjjjjjjjjjjjjjjjjjjjjjjj");
		return ep;
		
	}
	
}
