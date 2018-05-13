package com.mg.inventory.vendormanager.daos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mg.inventory.vendormanager.dtos.Vendor;

@Repository
public interface VendorRepo extends CrudRepository<Vendor,Integer> {

	
	
}
