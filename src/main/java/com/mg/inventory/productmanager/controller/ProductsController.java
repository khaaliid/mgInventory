package com.mg.inventory.productmanager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mg.inventory.productmanager.baos.ProductService;
import com.mg.inventory.productmanager.dtos.Product;

@RestController
public class ProductsController {

	private ProductService productService;
	
	@RequestMapping("/products")
	public List<Product> getAllProducts(){
		
		return productService.getAllPorducts();
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/products")
	public void addProduct(@RequestBody Product newProduct) {
		productService.addNewProduct(newProduct);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/products/{productId}")
	public void deleteProduct(@PathVariable int productId) {
		productService.deleteProduct(productId);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/products/{productId}")
	public void editProduct(@RequestBody Product product,@PathVariable int productId) throws Exception {
		if(productId!=product.getProductId()) {
			Exception ex = new Exception();
			
			throw (ex);
		}else {
			productService.editProduct(product);
		}
	}

	public ProductService getProductService() {
		return productService;
	}

	@Autowired
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
	
	
	
}
