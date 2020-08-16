package com.viatekbrasil.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viatekbrasil.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
