package com.mg.inventory.inventorymanager.dtos;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Inventory {

	@Id
	private int inventoryId;
	private String inventoryName;
	
	
	public Inventory() {
		// TODO Auto-generated constructor stub
	}
	
	public Inventory(int inventoryId) {
		// TODO Auto-generated constructor stub
		this.inventoryId=inventoryId;
	}
	public int getInventoryId() {
		return inventoryId;
	}
	public void setInventoryId(int inventoryId) {
		this.inventoryId = inventoryId;
	}
	public String getInventoryName() {
		return inventoryName;
	}
	public void setInventoryName(String inventoryName) {
		this.inventoryName = inventoryName;
	}
	
	
}
