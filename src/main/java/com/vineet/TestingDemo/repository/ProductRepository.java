package com.vineet.TestingDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vineet.TestingDemo.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

    boolean existsByName(String name);
}