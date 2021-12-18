package com.company.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.springframework.stereotype.Service;
import com.company.model.Product;

@Service
public class ProductServiceImpl implements ProductService {
	List<Product>  products=new ArrayList<Product>();
	public ProductServiceImpl() {

		products.add(new Product((long) 1,"iphone7","900dt"));
		products.add(new Product( (long)2,"camera","300dt"));
		products.add(new Product((long)3,"Earphone","40dt"));
		products.add(new Product((long)4,"Headphones","85dt"));
		products.add(new Product((long) 5,"iphone11","3500dt"));
		products.add(new Product((long)6,"Microphone","130dt"));
		products.add(new Product((long)7,"PC dell","2100dt"));
		products.add(new Product((long)8,"Tablet","658dt"));
	}

	
	public List<Product> getProducts() {

		return products;
	}

	




	public Product getProduct(Long id) {
		
			Iterator<Product> iterator=products.iterator();
			while(iterator.hasNext()) {
				Product product=iterator.next();
				if(product.getProductID().equals(id)) {
					return product;
				}
			}
			return null;
		

	}
	public void createProduct(Long productID,String productName,String price) {
		products.add(new Product(productID,productName,price));
	}
	public void updateProduct(Product product) {
		getProduct(product.getProductID()).setProductPrice(product.getProductPrice());
		getProduct(product.getProductID()).setProductName(product.getProductName());
	}
	public void deleteProduct(Long id) {
		System.out.println("Status.."+products.remove(getProduct(id)));
	}
	}


	


		
	
	 


