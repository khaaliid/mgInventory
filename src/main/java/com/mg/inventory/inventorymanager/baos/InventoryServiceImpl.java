package com.mg.inventory.inventorymanager.baos;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mg.inventory.inventorymanager.daos.InventoryRepo;
import com.mg.inventory.inventorymanager.dtos.Inventory;

@Service
public class InventoryServiceImpl implements InventoryService {
	
	private InventoryRepo inventoryDao;

	public InventoryRepo getInventoryDao() {
		return inventoryDao;
	}

	@Autowired
	public void setInventoryDao(InventoryRepo inventoryDao) {
		this.inventoryDao = inventoryDao;
	}

	@Override
	public List<Inventory> getAllInventories() {
		// TODO Auto-generated method stub
		ArrayList<Inventory> inventories = new ArrayList<Inventory>();
		inventoryDao.findAll().forEach(inventories::add);
		return inventories;
	}

	@Override
	public void addNewinventory(Inventory newinventory) {
		// TODO Auto-generated method stub
		inventoryDao.save(newinventory);
	}

	@Override
	public void deleteInventory(int inventoryId) {
		// TODO Auto-generated method stub
		Inventory inventory = new Inventory(inventoryId);
		inventoryDao.delete(inventory);
	}

	@Override
	public void editInventory(Inventory inventory) {
		// TODO Auto-generated method stub
		inventoryDao.save(inventory);
	}
	
	
	

}
