package com.hungryfood;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class HungryFoodMvc2Application {

	public static void main(String[] args) {
		SpringApplication.run(HungryFoodMvc2Application.class, args);
	}

}
