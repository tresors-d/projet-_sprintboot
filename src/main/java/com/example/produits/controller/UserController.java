package com.example.produits.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.produits.dto.LoginRequest;
import com.example.produits.model.User;
import com.example.produits.services.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService service;
	
	@PostMapping("/users")
	public User saveUser(@RequestBody User user) {
		return service.createUser(user);
	}
	
	@PutMapping("/users/{id}")
	public User updateUser(@PathVariable long id, @RequestBody User user) throws Exception {
		return service.updateUser(id, user);
	}
	
	@PostMapping("/users/connexion")
	public boolean loginUser( @RequestBody LoginRequest userLogin) throws Exception {
		return service.login(userLogin);
	}

}
//pour enlever les importation unitile dans une classe on utilise ctrl + shift + o