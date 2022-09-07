package com.harbinger.api.model;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {
	
    @Id
    @GenericGenerator(name="mk",strategy ="increment")
    @GeneratedValue(generator = "mk")
	private int id;
	private String empCode;
	private String fName;
	private String mName;
//	private Date date;
	private char gender;
	private int phoneNo;
	
	@OneToMany(targetEntity =Address.class, cascade =  CascadeType.ALL)
	@JoinColumn(name="ep_fk", referencedColumnName = "id")
	private List<Address> address;
	
}
