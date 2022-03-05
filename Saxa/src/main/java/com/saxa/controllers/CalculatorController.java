package com.saxa.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.saxa.dtos.ResultDTO;

@RestController
public class CalculatorController {

	@PostMapping("/add")
	public ResultDTO add(@RequestBody ResultDTO userData ) {
		Integer result = userData.getNum1() + userData.getNum2();
		userData.setResult(result); 
		return userData; 
	}
	
	@PostMapping("/substract")
	public ResultDTO resta(@RequestBody ResultDTO userData ) {
		Integer result = userData.getNum1() - userData.getNum2();
		userData.setResult(result); 
		return userData; 
	}
	
	@PutMapping("/multiply")
	public ResultDTO multiply(@RequestBody ResultDTO userData ) {
		Integer result = userData.getNum1() * userData.getNum2();
		userData.setResult(result); 
		return userData; 
	} 
	
	@PutMapping("/divide")
	public ResultDTO division(@RequestBody ResultDTO userData ) {
		Integer result = userData.getNum1() / userData.getNum2();
		userData.setResult(result); 
		return userData; 
	}
	
	
}
