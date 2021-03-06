package com.spring.boot.ss.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.spring.boot.ss.models.Orders;
import com.spring.boot.ss.repo.OrderRepository;


@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	private OrderRepository dao;
	
	@Override
	public Orders addToOrder(Orders order) {
		// TODO Auto-generated method stub
		return dao.save(order);
	}

	@Override
	public void deleteorder(int orderId) {
		// TODO Auto-generated method stub
		dao.deleteById(orderId);
	}

	@Override
	public Orders updateOrder(Orders order) {
		// TODO Auto-generated method stub
		return dao.save(order);
	}

	@Override
	public Orders getOrderById(int orderId) {
		// TODO Auto-generated method stub
		return dao.findById(orderId).get();
	}

	@Override
	public List<Orders> getAllorders() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	}
