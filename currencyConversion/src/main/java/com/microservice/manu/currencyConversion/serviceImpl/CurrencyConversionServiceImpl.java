/**
 * 
 */
package com.microservice.manu.currencyConversion.serviceImpl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.microservice.manu.currencyConversion.dto.CurrencyConversionDto;
import com.microservice.manu.currencyConversion.service.CurrencyConversionFeignProxy;
import com.microservice.manu.currencyConversion.service.CurrencyConversionService;

/**
 * @author manukushavaha
 *
 */
@Service
public class CurrencyConversionServiceImpl implements CurrencyConversionService {
	@Autowired
	Environment env;
	@Autowired
	CurrencyConversionFeignProxy currencyConversionFeignProxy;

	@Override
	public CurrencyConversionDto fetchCurrencyMultipleConvert(CurrencyConversionDto conversionDto) {

		Map<String, String> map = convertToMap(conversionDto);
		// TODO Auto-generated method stub
		ResponseEntity<CurrencyConversionDto> responseEntity = new RestTemplate()
				.getForEntity(env.getProperty("frox.service.url"), CurrencyConversionDto.class, map);

		CurrencyConversionDto response = responseEntity.getBody().setQuantity(conversionDto.getQuantity());

		return response;
	}

	@Override
	public CurrencyConversionDto fetchCurrencyMultipleConvertFeign(CurrencyConversionDto conversionDto) {
		// TODO Auto-generated method stub
		return currencyConversionFeignProxy.retrieveExchangeValue(conversionDto.getFrom(), conversionDto.getTo())
				.setQuantity(conversionDto.getQuantity());

	}

	public Map<String, String> convertToMap(CurrencyConversionDto conversionDto) {
		Map<String, String> uriVariables = new HashMap<String, String>();
		uriVariables.put("from", conversionDto.getFrom());
		uriVariables.put("to", conversionDto.getTo());
		return uriVariables;
	}

}
