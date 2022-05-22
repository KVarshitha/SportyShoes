package com.spring.boot.ss.services;

import java.util.List;

import com.spring.boot.ss.models.Product;


public interface ProductService {
	
	Product saveDepartment(Product Product);
	  
    // Read operation
    List<Product> fetchProductList();
  
    // Update operation
    Product updateProduct(Product Product,
                                Integer ProductId);
  
    // Delete operation
    void deleteProductById(Integer ProductId);
}
