package com.example.produits.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.produits.model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long>{
	
	//requette personnalise
	@Query("select p from Product p")
	public List<Product> findAllProduct();

}
