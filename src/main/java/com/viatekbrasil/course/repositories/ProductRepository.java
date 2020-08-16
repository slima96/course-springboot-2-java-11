package com.viatekbrasil.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viatekbrasil.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
