package com.ibm.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ManageConversionFactorSvcReq {

	private String countryCode;
	private double conversionFactor;
	
	public ManageConversionFactorSvcReq()
	{}
	
	public ManageConversionFactorSvcReq(String countryCode, double conversionFactor) {
		super();
		this.countryCode = countryCode;
		this.conversionFactor = conversionFactor;
	}
	
	
}
