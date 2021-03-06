package com.M2i.web.services; 

import java.util.List; 
import com.M2i.web.bean.Course; 

public interface IServiceListeCourses {      
	List<Course> rechercherCourses();
	void creerCourse(final String libelle, final Integer quantite);
	void supprimerCourse(final Integer idCourse);
	void modifierCourse(final List<Course> listeCourses);
} 
