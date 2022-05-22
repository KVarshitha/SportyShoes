package com.spring.boot.ss.services;

import java.util.List;


import com.spring.boot.ss.models.Orders;


public interface OrderService  {

	
    
    public Orders addToOrder(Orders order);
	public void deleteorder(int orderId);
	public Orders updateOrder(Orders order);
	public Orders getOrderById(int orderId);
	public List<Orders> getAllorders();
}
