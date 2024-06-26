package com.hungryfood.repository;

import com.hungryfood.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface FoodRepository extends JpaRepository<Food,Long> {
}