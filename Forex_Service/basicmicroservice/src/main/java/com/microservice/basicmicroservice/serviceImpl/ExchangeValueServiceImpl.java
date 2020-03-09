/**
 * 
 */
package com.microservice.basicmicroservice.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.microservice.basicmicroservice.domain.ExchangeValue;
import com.microservice.basicmicroservice.repository.ExchangeValueRepository;
import com.microservice.basicmicroservice.service.ExchangeValueService;

/**
 * @author manukushavaha
 *
 */
@Service
public class ExchangeValueServiceImpl  implements ExchangeValueService{

	@Autowired 
	ExchangeValueRepository exchangeValueRepository;
	@Autowired
	private Environment environment;
	@Override
	public ExchangeValue fetchExchangeValueByfromAndTo(String from ,String to) {
		return	exchangeValueRepository.findByFromAndTo(from, to).setPort(Integer.parseInt(environment.getProperty("server.port")));
		 
	}

}
