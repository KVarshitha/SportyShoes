package com.spring.boot.ss.services;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.ss.models.Product;
import com.spring.boot.ss.repo.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepository repository;

	@Override
	public Product saveDepartment(Product Product) {
		return	repository.save(Product);
		
	}

	@Override
	public List<Product> fetchProductList() {
		// TODO Auto-generated method stub
		return (List<Product>)repository.findAll();
	}

	@Override
	public Product updateProduct(Product product, Integer ProductId) {
		
		if (Objects.nonNull(product.getProductName())
	            && !"".equals(
	            		product.getProductName())) {
			product.setProductName(product.getProductName());
	        }// TODO Auto-generated method stub
		return repository.save(product);
	}

	@Override
	public void deleteProductById(Integer ProductId) {
		// TODO Auto-generated method stub
		repository.deleteById(ProductId);
	}

}
