package com.viatekbrasil.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viatekbrasil.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
