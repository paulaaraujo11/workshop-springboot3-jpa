package com.paulaaraujo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paulaaraujo.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}