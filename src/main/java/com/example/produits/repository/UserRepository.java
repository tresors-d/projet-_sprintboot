package com.example.produits.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.produits.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>  {

	@Query("select u from User u where u.email like %:email%")
	public User findByEmail(@Param("email") String email);
}
