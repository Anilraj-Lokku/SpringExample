package com.anil;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class WebClientDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebClientDemoApplication.class, args);
		String url =  "http://localhost:5000/food/1552";
		WebClient.Builder builder = WebClient.builder();
		String response =  builder.build().get().uri(url)
				.retrieve().bodyToMono(String.class).block();
		System.out.println(response);
	}

}
