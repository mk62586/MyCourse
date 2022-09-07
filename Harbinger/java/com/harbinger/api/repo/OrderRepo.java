package com.harbinger.api.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harbinger.api.model.Address;

public interface OrderRepo extends JpaRepository<Address, Integer>{

	
}
