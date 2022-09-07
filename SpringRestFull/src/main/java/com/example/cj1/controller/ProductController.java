package com.example.cj1.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cj1.model.ProductDTO;
import com.example.cj1.response.ProductResponse;
import com.example.cj1.service.ProductService;

@RestController
@RequestMapping("api/product")
public class ProductController {

	@Autowired
	private ProductService service;
	
	@Autowired
	private ProductResponse response;
	
	@PostMapping("/saveProduct")
	public ResponseEntity<ProductResponse> saveProduct(@RequestBody ProductDTO dto){
	ProductDTO productdto =service.saveProduct(dto);
	if(productdto!=null) {
		response.setResponseCode(200);
		response.setError(false);
		response.setDtos(Arrays.asList(productdto));
	    return new ResponseEntity<>(response,HttpStatus.OK);
	}else {
		response.setResponseCode(401);
		response.setError(true);
		response.setDtos(null);
		return new ResponseEntity<ProductResponse>(response,HttpStatus.NOT_FOUND);
	}
}
	@GetMapping("/getProductId/{id}")
	public ResponseEntity<ProductResponse> getProductId(@PathVariable("id")int id){
		  ProductDTO getProductByID = service.getProductId(id);
		  if(getProductByID!=null) {
				response.setResponseCode(200);
				response.setError(false);
				response.setDtos(Arrays.asList(getProductByID));
				return new ResponseEntity<>(response,HttpStatus.OK);
	}else {
		response.setResponseCode(400);
		response.setError(true);
		response.setDtos(Arrays.asList(getProductByID));
		return new ResponseEntity<ProductResponse>(response,HttpStatus.NOT_FOUND);
	}
}
 @PutMapping("/updateProduct/{id}")
 public ResponseEntity<ProductResponse> updateProduct(@RequestBody ProductDTO dto){
	 ProductDTO updateProduct = service.updateProduct(dto);
	 if(updateProduct!=null) {
		 response.setResponseCode(200);
		 response.setError(false);
		 response.setDtos(Arrays.asList(updateProduct));
		 return new ResponseEntity<>(response,HttpStatus.OK);
	 }else {
			response.setResponseCode(400);
			response.setError(true);
			response.setDtos(null);
			return new ResponseEntity<ProductResponse>(response,HttpStatus.NOT_FOUND);
	 }
 }
 @DeleteMapping("/deleteProduct/{id}")
 public ResponseEntity<ProductResponse> deleteProduct(@PathVariable("id")int id){
	ProductDTO deleteProduct =  service.deleteProduct(id);
	 if(deleteProduct!=null) {
		 response.setResponseCode(200);
		 response.setError(false);
		 response.setDtos(Arrays.asList(deleteProduct));
		 return new ResponseEntity<>(response,HttpStatus.OK);
	 }else {
			response.setResponseCode(400);
			response.setError(true);
			response.setDtos(null);
			return new ResponseEntity<ProductResponse>(response,HttpStatus.NOT_FOUND);
	   }
     }
  }
 

