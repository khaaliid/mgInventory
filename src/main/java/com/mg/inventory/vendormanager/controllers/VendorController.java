package com.mg.inventory.vendormanager.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mg.inventory.vendormanager.baos.VendorService;
import com.mg.inventory.vendormanager.dtos.Vendor;


@RestController
public class VendorController {

	
private VendorService vendorService;
	
	@RequestMapping("/vendors")
	public List<Vendor> getAllVendors(){
		
		return vendorService.getAllVendors();
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/vendors")
	public void addVendor(@RequestBody Vendor newVendor) {
		vendorService.addNewVendor(newVendor);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/vendors/{vendorId}")
	public void deleteVendor(@PathVariable int vendorId) {
		vendorService.deleteVendor(vendorId);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/vendors/{vendorId}")
	public void editVendor(@RequestBody Vendor vendor,@PathVariable int vendorId) throws Exception {
		if(vendorId!=vendor.getVendorId()) {
			Exception ex = new Exception();
			
			throw (ex);
		}else {
			vendorService.editVendor(vendor);
		}
	}

	public VendorService getVendorService() {
		return vendorService;
	}

	@Autowired
	public void setVendorService(VendorService vendorService) {
		this.vendorService = vendorService;
	}

	
	
}
