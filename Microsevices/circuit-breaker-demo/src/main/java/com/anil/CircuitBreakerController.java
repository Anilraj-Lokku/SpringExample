package com.anil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CircuitBreakerController {

    private final CircuitBreakerService circuitBreakerService;

    @Autowired
    public CircuitBreakerController(CircuitBreakerService circuitBreakerService) {
        this.circuitBreakerService = circuitBreakerService;
    }

    @GetMapping("/test")
    public String testCircuitBreaker() {
        return circuitBreakerService.callExternalService();
    }
}
