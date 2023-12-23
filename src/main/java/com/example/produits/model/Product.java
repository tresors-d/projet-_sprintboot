package com.example.produits.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "sb_product")
public class Product {

	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private long id;
	 private String nom;
	 private String description;
	 private String prix;
	 private double quantite;
	 
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPrix() {
		return prix;
	}
	public void setPrix(String prix) {
		this.prix = prix;
	}
	public double getQuantite() {
		return quantite;
	}
	public void setQuantite(double quantite) {
		this.quantite = quantite;
	}
	public Product(long id, String nom, String description, String prix, double quantite) {
		super();
		this.id = id;
		this.nom = nom;
		this.description = description;
		this.prix = prix;
		this.quantite = quantite;
	}
	public Product() {
		super();
	}
	@Override
	public String toString() {
		return "Product [nom=" + nom + ", description=" + description + ", prix=" + prix + ", quantite=" + quantite
				+ "]";
	}
}
