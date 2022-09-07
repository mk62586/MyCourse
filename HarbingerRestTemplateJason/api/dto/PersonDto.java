package com.harbinger.api.dto;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonDto {

	private String firstName;
	private String secondName;
	@JsonFormat(pattern = "dd/MM/yyy")
	@DateTimeFormat(pattern ="dd/MM/yyyy")
	private Date dateBirth;
	private String profession;
	private BigDecimal salary;
	
}
