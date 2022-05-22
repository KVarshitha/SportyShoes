package com.spring.boot.ss.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.ss.models.Orders;
import com.spring.boot.ss.services.OrderService;

@RestController
public class OrderController {

	@Autowired
	private OrderService service;
	
	@PostMapping("/orders")
	public Orders addToOrder(@RequestBody Orders order) {
		return service.addToOrder(order);
	}

	@DeleteMapping("/orders/{orderID}")
	public void deleteOrder(@PathVariable int orderID) {
		service.deleteorder(orderID);
	}

	@PutMapping("/orders")
	public Orders updateOrder(@RequestBody Orders order) {
		return service.updateOrder(order);
	}

	@GetMapping("/orders/{orderID}")
	public Orders getOrderById(@PathVariable int orderID) {
		return service.getOrderById(orderID);
	}

	@GetMapping("/getAllorders")
	public List<Orders> getAllOrder() {
		return service.getAllorders();
	}    
}
