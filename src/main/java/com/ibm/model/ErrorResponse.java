package com.ibm.model;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorResponse {

	
	private String code;
	private String description;
	private Date timestamp;
	
	private ErrorResponse()
	{
		
	}

	public ErrorResponse(String code, String description, Date timestamp) {
		super();
		this.code = code;
		this.description = description;
		this.timestamp = timestamp;
	}
	
		
}
