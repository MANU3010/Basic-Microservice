/**
 * 
 */
package com.microservice.basicmicroservice.service;

import com.microservice.basicmicroservice.domain.ExchangeValue;

/**
 * @author manukushavaha
 *
 */
public interface ExchangeValueService {
	public ExchangeValue fetchExchangeValueByfromAndTo(String from,String to);

}
