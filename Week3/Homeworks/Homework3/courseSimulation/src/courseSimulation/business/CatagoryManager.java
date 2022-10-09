package courseSimulation.business;

import java.util.ArrayList;
import java.util.List;

import courseSimulation.core.logging.ILogger;
import courseSimulation.dataAccess.IDao;
import courseSimulation.entities.Catagory;

public class CatagoryManager {
	private IDao dao;

	List<Catagory> catagories = new ArrayList<>();

	public CatagoryManager(IDao dao) {
		this.dao = dao;
	}

	public void save(Catagory catagory) {
		boolean isValid = true;

		for (Catagory temp : catagories) {
			if (temp.getName().equals(catagory.getName()))
				isValid = false;
		}

		if (isValid) {
			System.out.println(catagory.getName() + " eklendi.");
			dao.saveCatagory(catagory);
			catagories.add(catagory);
		} else {
			System.out.println("Katagori nitelikleri uyumsuz.");
		}

	}

	public void delete(Catagory catagory) {

		boolean isValid = false;

		for (Catagory temp : catagories) {
			if (temp == catagory) {
				isValid = true;
				break;
			}
		}
		
		if(isValid) {
			System.out.println(catagory.getName() + " silindi.");
			dao.deleteCatagory(catagory);
			catagories.remove(catagory);
		} else {
			System.out.println("Böyle bir katagori bulunamadı.");
		}
		
	}

	public void log(ILogger[] loggers, Catagory catagory) {
		for (ILogger logger : loggers) {
			logger.log(catagory.getName());
		}
	}
}
