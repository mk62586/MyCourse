package com.harbinger.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.harbinger.api.dto.PersonDto;

@RestController
@RequestMapping("/api")
public class PersonController {

	@PostMapping("/ge")
	public PersonDto getPersonDto(@RequestBody PersonDto dto) {
		System.out.println("hello world jjjjjjjjjjjjjjjjjjjjjjjj"+ dto);
		
		return dto;
	}
}
