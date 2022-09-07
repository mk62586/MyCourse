package com.example.cj1.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cj1.model.ProductDTO;
import com.example.cj1.repository.ProductRepositiory;

@Service
public class ProductService {
     @Autowired
	ProductRepositiory repo;
	public ProductDTO saveProduct(ProductDTO dto) {
		return repo.save(dto);
	}
	public ProductDTO getProductId(int id) {
	return repo.findById(1).orElse(null);	
	}
	public ProductDTO updateProduct(ProductDTO dto) {
		ProductDTO productDTO = repo.findById(1).orElse(null);
		           productDTO.setProductName(dto.getProductName());
		           productDTO.setPrice(dto.getPrice());
		           return repo.save(productDTO);
	}
	public ProductDTO deleteProduct(int id) {
		ProductDTO deleteProduct = repo.findById(id).orElse(null);
         repo.delete(deleteProduct);
		 return deleteProduct;
	}
}
