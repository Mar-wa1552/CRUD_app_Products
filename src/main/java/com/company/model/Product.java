package com.company.model;

public class Product {

private Long productID;
private String productName;
private String productPrice;
	
	public Product() {
		super();
	}

public Product(Long i, String productName, String price) {
	super();
	this.productID = i;
	this.productName = productName;
	this.productPrice = price;
}
public Long getProductID() {
	return productID;
}
public void setProductID(Long productID) {
	this.productID = productID;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public String getProductPrice() {
	return productPrice;
}
public void setProductPrice(String productPrice) {
	this.productPrice = productPrice;
}



}
