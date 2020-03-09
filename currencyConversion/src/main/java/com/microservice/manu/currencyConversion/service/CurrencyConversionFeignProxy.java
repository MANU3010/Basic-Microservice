/**
 * 
 */
package com.microservice.manu.currencyConversion.service;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.microservice.manu.currencyConversion.dto.CurrencyConversionDto;

/**
 * @author manukushavaha
 *
 */
@FeignClient(name = "forex-service")
@RibbonClient(name="forex-service")
public interface CurrencyConversionFeignProxy {

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyConversionDto retrieveExchangeValue(@PathVariable("from") String from,
			@PathVariable("to") String to);

}
