package com.harbinger.api.payload;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class AddressPayload implements Serializable {

	private long id;
	private long empId;
	private String line1;
	private String line2;
	private String city;
	private String state;
	private String country;
	private int pinCode;
	
}
