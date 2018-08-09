package com.M2i.web.services; 

import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service; 
import org.springframework.transaction.annotation.Transactional; 
import com.M2i.web.bean.Course; 
import com.M2i.web.dao.IListeCoursesDAO; 

@Service 
public class ServiceListeCourses implements IServiceListeCourses { 
	@Autowired private IListeCoursesDAO dao; 
	@Transactional(readOnly=true) public List<Course> rechercherCourses() { 
		return dao.rechercherCourses();
	}
	@Transactional public void creerCourse(final String pLibelle, final Integer pQuantite) { 
		final Course lCourse = new Course(); 
		lCourse.setLibelle(pLibelle); 
		lCourse.setQuantite(pQuantite); 
		dao.creerCourse(lCourse); 
	}
	@Transactional public void supprimerCourse(final Integer idCourse) {
		final Course lCourse = new Course(); 
		lCourse.setId(idCourse); 
		dao.supprimerCourse(lCourse); 
	}
	@Transactional
	public void modifierCourse(final List<Course> pListeCourses) {
		for (final Course lCourse : pListeCourses) { 
			dao.modifierCourse(lCourse);
		} 
	} 
} 
