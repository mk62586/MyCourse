package com.example.cj1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class ProductDTO {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
     private int id;
     private String productName;
     private double price;
}
