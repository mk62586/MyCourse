package com.example.cj1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cj1.model.ProductDTO;

public interface ProductRepositiory extends JpaRepository<ProductDTO, Integer>{

}
