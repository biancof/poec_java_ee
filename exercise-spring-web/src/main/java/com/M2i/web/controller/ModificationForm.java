package com.M2i.web.controller; 

import java.util.List; 
import javax.validation.Valid;

public class ModificationForm { 
	
	@Valid 
	private List<ModificationCourse> listeCourses; 

	public void setListeCourses(final List<ModificationCourse> listeCourses) { 
		this.listeCourses = listeCourses; 
	}
	
	public List<ModificationCourse> getListeCourses() { 
		return this.listeCourses;
		} 
} 