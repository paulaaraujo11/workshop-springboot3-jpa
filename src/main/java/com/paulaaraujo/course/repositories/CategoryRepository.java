package com.paulaaraujo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paulaaraujo.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}