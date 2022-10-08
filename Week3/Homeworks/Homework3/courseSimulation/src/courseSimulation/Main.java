package courseSimulation;

import courseSimulation.business.CourseManager;
import courseSimulation.dataAccess.Hibernate;
import courseSimulation.entities.Course;
import courseSimulation.entities.Instructor;

public class Main {

	public static void main(String[] args) {

		CourseManager courseManager = new CourseManager(new Hibernate());

		Course course1 = new Course();
		course1.setName("Java 2022");
		course1.setPrice(50);
		
		Course course2 = new Course();
		course2.setName("Java 2022");    
		course2.setPrice(50);
		
		Course course3 = new Course();
		course3.setName("C 2008");
		course3.setPrice(50);
		
		Instructor instructor = new Instructor();
		instructor.setName("Engin Demiroğ");
		instructor.createCourse(courseManager,course1);
		instructor.createCourse(courseManager,course2);
		
		instructor.deleteCourse(courseManager, course1);
		instructor.deleteCourse(courseManager, course3);

	}

}
