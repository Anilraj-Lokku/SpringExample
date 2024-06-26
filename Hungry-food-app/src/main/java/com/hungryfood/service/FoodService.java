package com.hungryfood.service;

import com.hungryfood.entity.Food;
import com.hungryfood.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FoodService {

    @Autowired
    private FoodRepository foodRepository;

    public Food addFood(Food food) {
        return foodRepository.save(food);
    }

    public Food updateFood(Long id, Food foodDetails) {
        Food food = foodRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Food not found"));
        food.setName(foodDetails.getName());
        food.setCategory(foodDetails.getCategory());
        food.setPrice(foodDetails.getPrice());
        return foodRepository.save(food);
    }

    public void deleteFood(Long id) {
        foodRepository.deleteById(id);
    }

    public List<Food> getAllFoods() {
        return foodRepository.findAll();
    }

    public Optional<Food> getFoodById(Long id) {
        return foodRepository.findById(id);
    }
}
