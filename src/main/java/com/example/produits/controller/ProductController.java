package com.example.produits.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.produits.model.Product;
import com.example.produits.services.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@PostMapping("/products")
	public Product saveProduct(@RequestBody Product product) {
		return service.createProduct(product);
	}
	
	@PutMapping("/products/{id}")
	public Product updateProduct(@PathVariable long id, @RequestBody Product product) throws Exception {
		return service.updateProduct(id, product);
	}
	
	@DeleteMapping("/products/{id}")
	public boolean deleteProduct(@PathVariable long id) {
		return service.deleteProductById(id);
	}
	
	@GetMapping("/products/{id}")
	public Product getProductById(@PathVariable long id) throws Exception {
		return service.getProductById(id);
	}
	
	@GetMapping("/products")
	public List<Product> getAllProduct() {
		return service.getAllProduct();
	}
	

	
	
	
	

}
