package com.anil.repository;

import com.anil.model.Food;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepository extends ReactiveCrudRepository<Food, Long> {
}
