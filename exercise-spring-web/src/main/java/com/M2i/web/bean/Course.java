package com.M2i.web.bean;  

import javax.persistence.Column; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.GenerationType; 
import javax.persistence.Id; 
import javax.persistence.Table;

@Entity
@Table(name="LISTECOURSES")

public class Course {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="IDOBJET")
	private Integer id;
	private String libelle;
	private Integer quantite;
	
	public Integer getId() {
		return this.id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getLibelle() {
		return this.libelle;
	}
	
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	public Integer getQuantite() {
		return this.quantite;
	}
	
	public void setQuantite(Integer quantite) {
		this.quantite = quantite;
	}
}
