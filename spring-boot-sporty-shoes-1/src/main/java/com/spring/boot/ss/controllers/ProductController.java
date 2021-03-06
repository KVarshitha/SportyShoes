package com.spring.boot.ss.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.ss.models.Product;
import com.spring.boot.ss.services.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService service;
	
	@GetMapping("/product")
	public List<Product> fetchDepartmentList()
    {
        return service.fetchProductList();
        		}
	
	@PostMapping("/product")
	public Product AddProduct(
			@Validated @RequestBody Product product) {
		return service.saveDepartment(product);
	}
	@PutMapping("/product/{id}")
    public Product
    updateProduct(@RequestBody Product product,
                     @PathVariable("id") Integer productID)
    {
        return service.updateProduct(product, productID);
    }
  
    // Delete operation
    @DeleteMapping("/product/{id}")
    public String deleteProducttById(@PathVariable("id")
                                       Integer productID)
    {
        service.deleteProductById(productID);
        return "Deleted Successfully";
    }
}
