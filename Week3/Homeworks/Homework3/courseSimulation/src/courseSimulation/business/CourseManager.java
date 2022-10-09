package courseSimulation.business;

import java.util.ArrayList;
import java.util.List;

import courseSimulation.core.logging.ILogger;
import courseSimulation.dataAccess.IDao;
import courseSimulation.entities.Course;

public class CourseManager {

	private IDao dao;

	public CourseManager(IDao dao) {
		this.dao = dao;
	}

	List<Course> courses = new ArrayList<>();

	public void save(Course course, List<Course> haveCourses) {
		boolean isValid = true;

		if (course.getPrice() < 0)
			isValid = false;
		for (Course temp : courses) {
			if (temp.getName().equals(course.getName())) isValid = false;
		}

		if (isValid) {
			dao.saveCourse(course);
			courses.add(course);
			haveCourses.add(course);
		} else {
			System.out.println("Kurs nitelikleri uyumsuz.");
		}
	}

	public void delete(Course course, List<Course> haveCourses) {
		boolean isValid = false;

		for (Course temp : haveCourses) {
			if (temp == course) {
				isValid = true;
				break;
			}
		}

		if (isValid) {
			haveCourses.remove(course);
			courses.remove(course);
			dao.deleteCourse(course);
		} else {
			System.out.println("Eğitimcinin böyle bir kursu bulunamadı.");
		}

	}

	public void log(ILogger[] loggers, Course course) {
		for (ILogger logger : loggers) {
			logger.log(course.getName());
		}
	}
}
