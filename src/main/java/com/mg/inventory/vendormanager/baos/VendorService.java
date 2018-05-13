package com.mg.inventory.vendormanager.baos;

import java.util.List;

import com.mg.inventory.vendormanager.dtos.Vendor;

public interface VendorService {

	List<Vendor> getAllVendors();

	void addNewVendor(Vendor newVendor);

	void deleteVendor(int vendorId);

	void editVendor(Vendor vendor);

}
