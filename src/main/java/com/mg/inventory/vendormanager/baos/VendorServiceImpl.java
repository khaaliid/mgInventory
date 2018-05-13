package com.mg.inventory.vendormanager.baos;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mg.inventory.vendormanager.daos.VendorRepo;
import com.mg.inventory.vendormanager.dtos.Vendor;

@Service
public class VendorServiceImpl implements VendorService {

	private VendorRepo vendorDao;
	
	@Override
	public List<Vendor> getAllVendors() {
		// TODO Auto-generated method stub
		ArrayList<Vendor> vendors = new ArrayList<Vendor>();
		vendorDao.findAll().forEach(vendors::add);
		return vendors;
	}

	@Override
	public void addNewVendor(Vendor newVendor) {
		// TODO Auto-generated method stub
		vendorDao.save(newVendor);
	}

	@Override
	public void deleteVendor(int vendorId) {
		// TODO Auto-generated method stub
		Vendor vendor = new Vendor(vendorId);
		
		vendorDao.delete(vendor);
	}

	@Override
	public void editVendor(Vendor vendor) {
		// TODO Auto-generated method stub
		vendorDao.save(vendor);

	}

	public VendorRepo getVendorDao() {
		return vendorDao;
	}

	@Autowired
	public void setVendorDao(VendorRepo vendorDao) {
		this.vendorDao = vendorDao;
	}

	
}
