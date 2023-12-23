package com.example.produits.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.produits.dto.LoginRequest;
import com.example.produits.model.Role;
import com.example.produits.model.TypeRole;
import com.example.produits.model.User;
import com.example.produits.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository repository;
	
	public User createUser(User user) {
		Role role = new Role();
		role.setLibelle(TypeRole.USER);
		user.setRole(role);
		return repository.save(user);
	}
	
	public User updateUser(long id, User user) throws Exception {
		Optional<User> u = repository.findById(id);
		if(u.isPresent() && id == user.getId()) {
			return repository.save(user);
		}
		throw new Exception("user not found.");
	}

	public boolean login(LoginRequest userLogin) {
		
		User user = repository.findByEmail(userLogin.getEmail());
		if (user!= null && user.getPassword().equals(userLogin.getPassword())) {
			return true;
		}
		return false;
	}

}
