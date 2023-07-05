package com.paulaaraujo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paulaaraujo.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
