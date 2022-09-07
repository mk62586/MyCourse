package com.example.cj1.response;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.cj1.model.ProductDTO;

import lombok.Data;
 @Data
 @Component
public class ProductResponse {
    private int responseCode;
    private boolean error;
    private List<ProductDTO> dtos;
}
