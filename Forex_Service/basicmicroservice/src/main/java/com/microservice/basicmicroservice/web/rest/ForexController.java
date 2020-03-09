/**
 * 
 */
package com.microservice.basicmicroservice.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.basicmicroservice.domain.ExchangeValue;
import com.microservice.basicmicroservice.service.ExchangeValueService;

/**
 * @author manukushavaha
 *
 */
@RestController
public class ForexController {

	@Autowired
	private ExchangeValueService exchangeValueService;

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retriveExchangeValue(@PathVariable String from, @PathVariable String to) {
		return exchangeValueService.fetchExchangeValueByfromAndTo(from, to);

	}

}
