package com.harbinger.api.payload;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class EmployeePayload {

	private int id;
	private String empCode;
	@JsonProperty("fName")
	private String fName;
	@JsonProperty("mName")
	private String mName;
	@JsonProperty("gender")
	private char gender;
	private int phoneNo;
	@JsonProperty("addressPayload")
	private List<AddressPayload> addressPaylod;
}
