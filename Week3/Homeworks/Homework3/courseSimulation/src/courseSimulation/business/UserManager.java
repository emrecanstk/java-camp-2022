package courseSimulation.business;

import courseSimulation.entities.User;

public class UserManager {
	
	public void save(User user) {
		System.out.println(user.getPosition()+" "+user.getName()+" eklendi.");
	}

	public void delete(User user) {

	}
	
	public void log(User user) {

	}

}
