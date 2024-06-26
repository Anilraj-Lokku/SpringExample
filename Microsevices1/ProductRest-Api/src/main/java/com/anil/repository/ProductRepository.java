package com.anil.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anil.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>
{

}