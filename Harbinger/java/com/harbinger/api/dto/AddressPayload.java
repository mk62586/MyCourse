package com.harbinger.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter

public class AddressPayload {
	
	private long id;
	private long empId;
	private String line1;
	private String line2;
	private String city;
	private String state;
	private String country;
	private int pinCode;
}
