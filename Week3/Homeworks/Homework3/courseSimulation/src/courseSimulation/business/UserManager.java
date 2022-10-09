package courseSimulation.business;

import courseSimulation.dataAccess.IDao;
import courseSimulation.entities.User;

public class UserManager {
	
	private IDao dao;

	public UserManager(IDao dao) {
		this.dao = dao;
	}
	
	public void save(User user) {
		System.out.println(user.getPosition()+" "+user.getName()+" eklendi.");
		dao.saveUser(user);
	}

	public void delete(User user) {

	}
	
	public void log(User user) {

	}

}
