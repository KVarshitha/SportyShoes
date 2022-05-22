package com.spring.boot.ss.models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.LazyToOne;
import org.hibernate.annotations.LazyToOneOption;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Orders {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	Integer OrderID;
	String OrderName;
	
	@OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.EAGER )
	@JoinTable(name = "order_product",
	joinColumns = @JoinColumn(name="OrderId"),
	inverseJoinColumns = @JoinColumn(name="ProductID"))
	private List<Product> product;
	
	
	public Integer getOrderID() {
		return OrderID;
	}
	public void setOrderID(Integer orderID) {
		OrderID = orderID;
	}
	public String getOrderName() {
		return OrderName;
	}
	public void setOrderName(String orderName) {
		OrderName = orderName;
	}
	public List<Product> getProduct() {
		return product;
	}
	public void setProduct(List<Product> product) {
		this.product = product;
	}
	public Orders(Integer orderID, String orderName, List<Product> product) {
		super();
		this.OrderID = orderID;
		this.OrderName = orderName;
		this.product = product;
	}
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}