package com.mg.inventory.inventorymanager.baos;

import java.util.List;

import com.mg.inventory.inventorymanager.dtos.Inventory;

public interface InventoryService {

	List<Inventory> getAllInventories();

	void addNewinventory(Inventory newinventory);

	void deleteInventory(int inventoryId);

	void editInventory(Inventory inventory);

}
