package com.harbinger.api.repo;

import org.springframework.data.jpa.repository.JpaRepository;


import com.harbinger.api.model.Employee;


public interface EmployeeRepo extends JpaRepository<Employee,Integer>{


}
