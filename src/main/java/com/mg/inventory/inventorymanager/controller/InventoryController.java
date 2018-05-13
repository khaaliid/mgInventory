package com.mg.inventory.inventorymanager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mg.inventory.inventorymanager.baos.InventoryService;
import com.mg.inventory.inventorymanager.dtos.Inventory;



@RestController
public class InventoryController {

	private InventoryService inventoryBao; 
	
	@RequestMapping("/inventories")
	public List<Inventory> getAllVendors(){
		
		return inventoryBao.getAllInventories();
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/inventories")
	public void addVendor(@RequestBody Inventory newInventory) {
		inventoryBao.addNewinventory(newInventory);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/inventories/{inventoryId}")
	public void deleteVendor(@PathVariable int inventoryId) {
		inventoryBao.deleteInventory(inventoryId);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/inventories/{inventoryId}")
	public void editVendor(@RequestBody Inventory inventory,@PathVariable int inventoryId) throws Exception {
		if(inventoryId!=inventory.getInventoryId()) {
			Exception ex = new Exception();
			
			throw (ex);
		}else {
			inventoryBao.editInventory(inventory);
		}
	}

	public InventoryService getInventoryBao() {
		return inventoryBao;
	}

	@Autowired
	public void setInventoryBao(InventoryService inventoryBao) {
		this.inventoryBao = inventoryBao;
	}
	
	
	
}
