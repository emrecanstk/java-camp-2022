package oopWithNLayaredApp;

import oopWithNLayaredApp.business.ProductManager;
import oopWithNLayaredApp.core.logging.DatabaseLogger;
import oopWithNLayaredApp.core.logging.FileLogger;
import oopWithNLayaredApp.core.logging.Logger;
<<<<<<< HEAD
import oopWithNLayaredApp.core.logging.MailLogger;
=======
>>>>>>> 182233748bb5d10b94e811cd26d19914bde9bf46
import oopWithNLayaredApp.dataAccess.JdbcProductDao;
import oopWithNLayaredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		Product product1 = new Product(1,"Poco X3",10000);
		
<<<<<<< HEAD
		Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};
		// herhangi üçünü, ikisini, birini veya hiçbirini
		// merkezi bir noktadan hangileri ile loglama yapabileceğimizi seçebiliyoruz.
		// bağımlılık enjekte etme --> dependency injection
=======
		Logger[] loggers = {new DatabaseLogger(), new FileLogger()};
>>>>>>> 182233748bb5d10b94e811cd26d19914bde9bf46
		
		ProductManager productManager = new ProductManager(new JdbcProductDao(),loggers);
		productManager.add(product1);

	}

}
