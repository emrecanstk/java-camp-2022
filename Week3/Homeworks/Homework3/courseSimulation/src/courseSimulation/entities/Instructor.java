package courseSimulation.entities;

import courseSimulation.business.CourseManager;
import courseSimulation.dataAccess.Hibernate;

public class Instructor extends User implements ICanProduce {
	private int numberOfCoursesTaught;
	
	
	
	@Override
	public void createCourse(CourseManager courseManager, Course course) {
		
		System.out.print(this.getName()+ " | "+course.getName()+" --> ");
		courseManager.save(course);
		
	}

	public int getNumberOfCoursesTaught() {
		return numberOfCoursesTaught;
	}

}
