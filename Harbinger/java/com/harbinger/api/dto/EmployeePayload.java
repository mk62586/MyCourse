package com.harbinger.api.dto;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.harbinger.api.model.Address;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Data
@Getter
@Setter
public class EmployeePayload {

	private int id;
	private String empCode;
	private String fName;
	private String mName;
	private Date date;
	private char gender;
	private int phoneNo;
	private List<AddressPayload> addressPaylod;

	
}
