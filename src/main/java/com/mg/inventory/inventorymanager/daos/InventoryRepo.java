package com.mg.inventory.inventorymanager.daos;

import org.springframework.data.repository.CrudRepository;

import com.mg.inventory.inventorymanager.dtos.Inventory;

public interface InventoryRepo extends CrudRepository<Inventory, Integer> {

}
