package com.anil.service;

import com.anil.model.Food;
import com.anil.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class FoodService {
    @Autowired
    private FoodRepository foodRepository;

    public Mono<String> getString() {
        return Mono.just("Hello, WebFlux!");
    }

    public Flux<String> getStrings() {
        return Flux.just("Hello", "WebFlux", "World");
    }

    public Mono<Food> getFood(Long id) {
        return foodRepository.findById(id);
    }

    public Flux<Food> getAllFoods() {
        return foodRepository.findAll();
    }
}
