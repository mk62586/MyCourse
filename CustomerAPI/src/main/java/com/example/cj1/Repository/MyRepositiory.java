package com.example.cj1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cj1.CustomerDTO.CustomerDTO;

public interface MyRepositiory extends JpaRepository<CustomerDTO,Integer> {

}
