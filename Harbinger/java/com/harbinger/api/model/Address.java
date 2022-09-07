package com.harbinger.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Address {
@Id
@Column(name="ADDRESSID")
@GenericGenerator(name="ak",strategy = "increment")
@GeneratedValue(generator = "ak")
private long id;
private long empId;
private String line1;
private String line2;
private String city;
private String state;
private String country;
private int pinCode;

}
