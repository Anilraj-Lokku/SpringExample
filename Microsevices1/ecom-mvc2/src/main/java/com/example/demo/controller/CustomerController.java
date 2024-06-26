package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.CircuitBreaker;
import org.springframework.cloud.client.circuitbreaker.CircuitBreakerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Customer;

@Controller
@RequestMapping("customer")
public class CustomerController {

    @Autowired
    private CircuitBreakerFactory cbf;

    @GetMapping
    public ModelAndView home() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("customer"); // Assuming "customer.jsp" or "customer.html" as your view name

        RestTemplate rt = new RestTemplate();
        CircuitBreaker circuitBreaker = cbf.create("circuitbreaker");

        // Example URL for customer API, adjust as per your actual API endpoint
        String customerApiUrl = "http://localhost:7000/customer";

        // Using Circuit Breaker pattern to call the API
        Customer[] customers = circuitBreaker.run(
            () -> rt.getForEntity(customerApiUrl, Customer[].class).getBody(),
            throwable -> errorMethod()
        );

        mv.addObject("customers", customers);
        return mv;
    }

    public Customer[] errorMethod() {
        Customer[] temp = new Customer[1];
        temp[0] = new Customer(0, "Not available", "N/A");
        return temp;
    }
}
