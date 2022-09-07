package com.harbinger.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harbinger.api.model.Employee;
import com.harbinger.api.repo.EmployeeRepo;

@Service
public class MyService {

	
	@Autowired
public EmployeeRepo repo;
	
	public Employee saveEmployee(Employee employee){
		return repo.save(employee);
	}
	public Employee fetchbyId(int id) {
		return repo.findById(id).orElse(null);
	}
	public List<Employee> fetchbyIdAll() {
		// TODO Auto-generated method stub
		List<Employee> findAll = repo.findAll();
		return findAll;
	}
}
