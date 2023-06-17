package com.codemash.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codemash.model.Employee;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

	@PostMapping("/save")
	public ResponseEntity<Employee> saveEmployee(@Valid @RequestBody Employee employee) {
	
		
		return new ResponseEntity<Employee>( employee, HttpStatus.CREATED);
		
	}
}
