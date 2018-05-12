package com.mg.inventory.productmanager.baos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mg.inventory.productmanager.daos.ProductDao;
import com.mg.inventory.productmanager.dtos.Product;

@Service
public class ProductServiceImpl implements ProductService {

	private ProductDao productDao;
	
	@Override
	public List<Product> getAllPorducts() {
		// TODO Auto-generated method stub
//		Product products[] = {new Product(1,"p1"),
//		new Product(2,"p2"),
//		new Product(3,"p3"),
//		new Product(4,"p4")};
		ArrayList<Product> products = new ArrayList<Product>();
		productDao.findAll().forEach(products::add);
		return products;
	}

	public ProductDao getProductDao() {
		return productDao;
	}

	@Autowired
	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}

	@Override
	public void addNewProduct(Product newProduct) {
		// TODO Auto-generated method stub
		productDao.save(newProduct);
	}

	@Override
	public void deleteProduct(int productId) {
		// TODO Auto-generated method stub
		Product product = new Product(productId);
		
		productDao.delete(product);
		
	}

	@Override
	public void editProduct(Product product) {
		// TODO Auto-generated method stub
		productDao.save(product);
		
	}
	
	
	

}
