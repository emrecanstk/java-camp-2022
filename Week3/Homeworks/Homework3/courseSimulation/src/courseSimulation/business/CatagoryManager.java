package courseSimulation.business;

import courseSimulation.core.logging.ILogger;
import courseSimulation.dataAccess.IDao;
import courseSimulation.entities.Catagory;

public class CatagoryManager {
	private IDao dao;

	public CatagoryManager(IDao dao) {
		this.dao = dao;
	}
	
	public void save(Catagory catagory) {
		System.out.println(catagory.getName()+" eklendi.");
		dao.saveCatagory(catagory);
	}

	public void delete(Catagory catagory) {
		System.out.println(catagory.getName()+" silindi.");
		dao.deleteCatagory(catagory);
	}
	
	public void log(ILogger[] loggers, Catagory catagory) {
		for (ILogger logger : loggers) {
			logger.log(catagory.getName());
		}
	}
}
