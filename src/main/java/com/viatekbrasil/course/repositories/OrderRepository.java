package com.viatekbrasil.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viatekbrasil.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
