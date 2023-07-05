package com.paulaaraujo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paulaaraujo.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}