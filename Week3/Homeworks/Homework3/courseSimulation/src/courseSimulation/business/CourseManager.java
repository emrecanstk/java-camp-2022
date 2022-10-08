package courseSimulation.business;

import java.util.ArrayList;
import java.util.List;

import courseSimulation.dataAccess.IDao;
import courseSimulation.entities.Course;

public class CourseManager {
	List<Course> courses = new ArrayList<>();
	private IDao dao;

	public CourseManager(IDao dao) {
		this.dao = dao;
	}

	public void save(Course course) {
		boolean isValid = true;
		
		if (course.getPrice() < 0) isValid = false;
		for (Course temp : courses) {
				if (temp.getName().equals(course.getName())) {
					isValid = false;
					
				}
		}

		if (isValid) {
			dao.saveCourse(course);
			courses.add(course);
		} else {
			System.out.println("Kurs nitelikleri uyumsuz.");
		}
	}
}
