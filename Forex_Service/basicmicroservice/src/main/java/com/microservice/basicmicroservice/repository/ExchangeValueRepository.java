/**
 * 
 */
package com.microservice.basicmicroservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.basicmicroservice.domain.ExchangeValue;

/**
 * @author manukushavaha
 *
 */
public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {
	ExchangeValue findByFromAndTo(String from, String to);

}
