package com.anil;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class CircuitBreakerService {
 private final RestTemplate restTemplate;
 
 public CircuitBreakerService(RestTemplate restTemplate) {
	 this.restTemplate=restTemplate;
 }
 
 @CircuitBreaker(name="myCircuitBreaker", fallbackMethod ="fallbackMethod")
 public String callExternalService() {
 return restTemplate.getForObject("hhttp://localhost:8080/sales", String.class);
}

public String fallbackMethod(Exception ex) {
    return "Fallback response due to: " + ex.getMessage();
}
 
}
