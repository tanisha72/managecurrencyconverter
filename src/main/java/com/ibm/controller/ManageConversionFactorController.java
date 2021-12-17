package com.ibm.controller;

import javax.websocket.server.PathParam;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.model.ManageConversionFactorSvcReq;

@RequestMapping("/conversionFactor")
@RestController
public class ManageConversionFactorController {

	
	@PostMapping
	public ResponseEntity<?> addConversionFactor(@RequestBody ManageConversionFactorSvcReq req)
	{
		
		return ResponseEntity.status(HttpStatus.CREATED).body("Created");
		}
	
	@GetMapping("/{countryCode}")
	public ResponseEntity<?> getConversionFactor(@RequestParam String countryCode)
	{
		
		return ResponseEntity.status(HttpStatus.CREATED).body("Created");
	}
	
	@PutMapping()
	public ResponseEntity<?> updateConversionFactor(@RequestBody ManageConversionFactorSvcReq req)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body("Created");	
	}
}
