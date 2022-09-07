package com.harbinger.api.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Employe implements Serializable {

	  
		private int id;
		private String empCode;
		@JsonProperty("fName")
		private String fName;
		@JsonProperty("mName")
		private String mName;
		@JsonProperty("gender")
		private char gender;
		private int phoneNo;
		@OneToMany(targetEntity = Address.class,cascade = CascadeType.ALL)
		@JoinColumn(name="fk",referencedColumnName = "id")
		@JsonProperty("address")
		private List<Address> address;
}
