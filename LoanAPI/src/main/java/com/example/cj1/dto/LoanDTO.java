package com.example.cj1.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class LoanDTO {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int loanid;
private double loanAmt;
private String loanType;
}
