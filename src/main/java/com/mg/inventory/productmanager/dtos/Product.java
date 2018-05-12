package com.mg.inventory.productmanager.dtos;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name="Products")
public class Product {
	@Id
	private int productId;
	private String productName;
	
	public Product() {
		
	}
	public Product(int productId,String productName) {
		this.productId=productId;
		this.productName=productName;
	}
	public Product(int productId) {
		// TODO Auto-generated constructor stub
		this.productId=productId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	
	

}
