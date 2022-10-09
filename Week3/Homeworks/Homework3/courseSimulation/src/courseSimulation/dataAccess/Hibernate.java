package courseSimulation.dataAccess;

import courseSimulation.entities.Catagory;
import courseSimulation.entities.Course;
import courseSimulation.entities.User;

public class Hibernate implements IDao {

	@Override
	public void saveUser(User user) {
		System.out.println(user.getName()+" kullanıcısı Hibernate ile eklendi.");
		
	}

	@Override
	public void saveCourse(Course course) {
		System.out.println(course.getName()+" kursu Hibernate ile eklendi.");
		
	}

	@Override
	public void deleteUser(User user) {
		System.out.println(user.getName()+" kullanıcısı Hibernate ile silindi.");
		
	}

	@Override
	public void deleteCourse(Course course) {
		System.out.println(course.getName()+" kursu Hibernate ile silindi.");
		
	}

	@Override
	public void saveCatagory(Catagory catagory) {
		System.out.println(catagory.getName()+" katagorisi Hibernate ile eklendi.");
		
	}

	@Override
	public void deleteCatagory(Catagory catagory) {
		System.out.println(catagory.getName()+" katagorisi Hibernate ile silindi.");
		
	}

}
