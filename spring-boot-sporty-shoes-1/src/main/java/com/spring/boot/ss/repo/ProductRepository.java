package com.spring.boot.ss.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.boot.ss.models.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
