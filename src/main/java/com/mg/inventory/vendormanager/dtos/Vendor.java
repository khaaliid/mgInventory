package com.mg.inventory.vendormanager.dtos;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vendor {
	@Id
	private int vendorId;
	private String vendorName;
	
	public Vendor() {
		// TODO Auto-generated constructor stub
		
	}
	
	public Vendor(int vendorId) {
		// TODO Auto-generated constructor stub
		this.vendorId=vendorId;
	}
	
	public int getVendorId() {
		return vendorId;
	}

	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}

	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	
	
	
	

}
