/**
 * 
 */
package com.microservice.manu.currencyConversion.dto;

/**
 * @author manukushavaha
 *
 */
public class CurrencyConversionDto {
	private Long id;
	private String from;
	private String to;
	private Double conversionMultiple;
	private Double quantity;
	private Double totalCalculatedAmount;
	private int port;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public CurrencyConversionDto setFrom(String from) {
		this.from = from;
		return this;
	}
	public String getTo() {
		return to;
	}
	public CurrencyConversionDto setTo(String to) {
		this.to = to;
		return this;
	}
	public Double getConversionMultiple() {
		return conversionMultiple;
	}
	public void setConversionMultiple(Double conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}
	public Double getQuantity() {
		return quantity;
	}
	public CurrencyConversionDto setQuantity(Double quantity) {
		this.quantity = quantity;
		return this;
	}
	public Double getTotalCalculatedAmount() {
		if(this .quantity!=null && this.conversionMultiple!=null) {
			totalCalculatedAmount=this.quantity*this.conversionMultiple;
		}
		return totalCalculatedAmount;
	}
	
	public int getPort() {
		return port;
	}
	public CurrencyConversionDto setPort(int port) {
		this.port = port;
		return this;
	}
	

	
}
