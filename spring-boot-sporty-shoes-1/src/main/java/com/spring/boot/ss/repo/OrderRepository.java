package com.spring.boot.ss.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.boot.ss.models.Orders;

public interface OrderRepository extends JpaRepository<Orders,Integer>{

}
