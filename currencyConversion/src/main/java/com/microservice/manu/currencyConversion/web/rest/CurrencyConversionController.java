/**
 * 
 */
package com.microservice.manu.currencyConversion.web.rest;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.manu.currencyConversion.dto.CurrencyConversionDto;
import com.microservice.manu.currencyConversion.service.CurrencyConversionService;

/**
 * @author manukushavaha
 *
 */
@RestController
public class CurrencyConversionController {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	CurrencyConversionService currencyConversionService;

	@GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionDto convertCurrency(@PathVariable String from, @PathVariable String to,
			@PathVariable Double quantity) {
		
		CurrencyConversionDto conversionDto=new CurrencyConversionDto().setFrom(from).setTo(to).setQuantity(quantity);
		return currencyConversionService.fetchCurrencyMultipleConvert(conversionDto);

	}
	
	
	@GetMapping("/currency-converter-feign/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionDto convertCurrencyFeign(@PathVariable String from, @PathVariable String to,
			@PathVariable Double quantity) {
		
		CurrencyConversionDto conversionDto=new CurrencyConversionDto().setFrom(from).setTo(to).setQuantity(quantity);
		return currencyConversionService.fetchCurrencyMultipleConvertFeign(conversionDto);

	}

	
	
}
