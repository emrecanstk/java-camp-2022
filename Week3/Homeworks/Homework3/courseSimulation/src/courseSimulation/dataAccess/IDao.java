package courseSimulation.dataAccess;

import courseSimulation.entities.Catagory;
import courseSimulation.entities.Course;
import courseSimulation.entities.User;

public interface IDao {
	void saveUser(User user);
	void saveCourse(Course course);
	void saveCatagory(Catagory catagory);
	void deleteUser(User user);
	void deleteCourse(Course course);
	void deleteCatagory(Catagory catagory);
}
