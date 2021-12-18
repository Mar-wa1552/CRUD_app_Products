package com.company.service;

import java.util.List;

import com.company.model.Product;

public interface ProductService {
	List<Product> getProducts();
    Product getProduct(Long id);
	void createProduct(Long productID,String productName,String price);
	void updateProduct(Product product);
	void deleteProduct(Long id);
}
