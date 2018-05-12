package com.mg.inventory.productmanager.daos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mg.inventory.productmanager.dtos.Product;

public interface ProductDao extends CrudRepository<Product, Integer>{

	

}
