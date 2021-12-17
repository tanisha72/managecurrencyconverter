package com.ibm.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.ibm.entity.Currency;
import com.ibm.model.ManageConversionFactorSvcReq;
import com.ibm.repository.CurrencyRepository;

public class ManageConversionFactorSvc {

	@Autowired
	CurrencyRepository currencyRepo;
	
	public int addConversionFactor(Currency currency)
	{
		Currency newCurrency = currencyRepo.save(currency);
		return newCurrency.getId();
	}
	
	public double getConversionFactor(String countryCode)
	{
		
			double factor = currencyRepo.findConversionFactorByCountryCode(countryCode);
	
		
		return factor;
	}
	
	
}
