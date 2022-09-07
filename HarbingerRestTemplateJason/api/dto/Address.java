package com.harbinger.api.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Address implements Serializable {

	
	

	private long id;
	private long empId;
	private String line1;
	private String line2;
	private String city;
	private String state;
	private String country;
	private int pinCode;
}
