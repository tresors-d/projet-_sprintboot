package com.example.produits.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.produits.model.Product;
import com.example.produits.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	
	public Product createProduct(Product product) {
		return repository.save(product);
	}
	
	public Product updateProduct(long id, Product product) throws Exception {
		Optional<Product> p = repository.findById(id);
		if(p.isPresent() && id == product.getId()) {
			return repository.save(product);
		}
		throw new Exception("Product not found.");
	}
	
	public boolean deleteProductById(long id) {
		repository.deleteById(id);
		return true;
	}
	
	public Product getProductById(long id) throws Exception {
		Optional<Product> p = repository.findById(id);
		if(p.isPresent()) {
			return p.get();
		}
		throw new Exception("Product not found.");
	}
	
	public List<Product> getAllProduct(){
		return repository.findAllProduct();
	}
	

}
