package com.example.cj1.CustomerDTO;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity

public class CustomerDTO implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int customerId;
	private String customerName;
	private String address;
	private int loanid;
}
