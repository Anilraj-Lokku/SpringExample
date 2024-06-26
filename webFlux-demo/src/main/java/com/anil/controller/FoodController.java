package com.anil.controller;

import com.anil.model.Food;
import com.anil.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
public class FoodController {

    @Autowired
    private FoodService foodService;

    @GetMapping("/string")
    public Mono<String> getString() {
        return foodService.getString();
    }

    @GetMapping("/strings")
    public Flux<String> getStrings() {
        return foodService.getStrings();
    }

    @GetMapping("/food/{id}")
    public Mono<Food> getFood(@PathVariable Long id) {
        return foodService.getFood(id);
    }

    @GetMapping("/foods")
    public Flux<Food> getAllFoods() {
        return foodService.getAllFoods();
    }
}
