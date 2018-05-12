package com.mg.inventory.productmanager.baos;

import java.util.List;

import com.mg.inventory.productmanager.dtos.Product;

public interface ProductService {
	
	public List<Product> getAllPorducts();

	public void addNewProduct(Product newProduct);

	public void deleteProduct(int productId);

	public void editProduct(Product product);

}
