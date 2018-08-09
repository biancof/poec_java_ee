package com.M2i.web.controller;
import javax.validation.constraints.Pattern;
import org.hibernate.validator.constraints.NotEmpty;
public class CreationForm { 
	@NotEmpty private String libelle; 
	@NotEmpty @Pattern(regexp="\\d*") 
	private String quantite; 
	
	public String getLibelle() { 
		return this.libelle; 
	} 
	public void setLibelle(final String libelle) { 
		this.libelle = libelle; 
	} 
	
	public String getQuantite() { 
		return quantite;
	} 
	
	public void setQuantite(final String quantite) { 
		this.quantite = quantite;
	}
}