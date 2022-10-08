package courseSimulation.entities;

import courseSimulation.business.CourseManager;

public interface ICanProduce {
	void createCourse(CourseManager courseManager, Course course);
}
