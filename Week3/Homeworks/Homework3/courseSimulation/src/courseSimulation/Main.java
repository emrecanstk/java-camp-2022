package courseSimulation;

import courseSimulation.business.CourseManager;
import courseSimulation.dataAccess.Hibernate;
import courseSimulation.entities.Course;

public class Main {
	
	public static void main(String[] args) {
		
		Course course1 = new Course();
		course1.setName("Java 2022");
		course1.setPrice(50);
		
		Course course2 = new Course();
		course2.setName("Java 2022");    
		course2.setPrice(50);
		
		Course course3 = new Course();
		course3.setName("C 2008");
		course3.setPrice(50);
		
		CourseManager courseManager = new CourseManager(new Hibernate());
		courseManager.save(course1);
		courseManager.save(course2);    // başka isimle çakıştığı için eklenemeyecek.
		courseManager.save(course3);
		

	}

}
