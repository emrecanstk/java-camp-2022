package courseSimulation.dataAccess;

import courseSimulation.entities.Course;
import courseSimulation.entities.User;

public interface IDao {
	void saveUser(User user);
	void saveCourse(Course course);
	void deleteUser(User user);
	void deleteCourse(Course course);
}
