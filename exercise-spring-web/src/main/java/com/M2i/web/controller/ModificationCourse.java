package com.M2i.web.controller; 

import javax.validation.constraints.Pattern; 
import org.hibernate.validator.constraints.NotEmpty; 

public class ModificationCourse { 
	private Integer id; 
	private String libelle; 
	@NotEmpty(message="{modification.course.quantite.notempty}") 
	@Pattern(regexp="\\d*", message="{modification.course.quantite.numerique}") 
	private String quantite; public Integer getId() { 
		return id; 
	} 
	public void setId(final Integer id) { 
		this.id = id; 
	} 
	public String getLibelle() { 
		return this.libelle; 
	} 
	public void setLibelle(final String libelle) { 
		this.libelle = libelle; 
	} 
	public String getQuantite() { 
		return this.quantite;
	} 
	public void setQuantite(final String quantite) { 
		this.quantite = quantite; 
	}
}
