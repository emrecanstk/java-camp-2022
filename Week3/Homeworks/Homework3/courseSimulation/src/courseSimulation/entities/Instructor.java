package courseSimulation.entities;

import java.util.ArrayList;
import java.util.List;

import courseSimulation.business.CourseManager;

public class Instructor extends User implements ICanProduce {
	private String website;
	private List<Course> haveCourses = new ArrayList<>();

	@Override
	public void createCourse(CourseManager courseManager, Course course) {

		System.out.print("Kurs oluşturma isteği --> " + this.getName() + " | " + course.getName() + " --> ");
		courseManager.save(course, haveCourses);

	}

	@Override
	public void deleteCourse(CourseManager courseManager, Course course) {

		System.out.print("Kurs silme isteği --> " + this.getName() + " | " + course.getName() + " --> ");
		courseManager.delete(course, haveCourses);

	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

}
