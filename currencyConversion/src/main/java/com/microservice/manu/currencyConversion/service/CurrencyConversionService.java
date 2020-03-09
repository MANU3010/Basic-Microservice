/**
 * 
 */
package com.microservice.manu.currencyConversion.service;

import java.util.Map;

import com.microservice.manu.currencyConversion.dto.CurrencyConversionDto;

/**
 * @author manukushavaha
 *
 */
public interface CurrencyConversionService {
	CurrencyConversionDto fetchCurrencyMultipleConvert(CurrencyConversionDto conversionDto);

	CurrencyConversionDto fetchCurrencyMultipleConvertFeign(CurrencyConversionDto conversionDto);

}
