package oopWithNLayaredApp.business;
import oopWithNLayaredApp.core.logging.Logger;
import oopWithNLayaredApp.dataAccess.ProductDao;
import oopWithNLayaredApp.entities.Product;

public class ProductManager {
	private ProductDao productDao;
	private Logger[] loggers;      // List<Logger> loggers;
	
	public ProductManager(ProductDao productDao, Logger[] loggers) {
		this.productDao = productDao;
		this.loggers = loggers;
	}
	
	public void add(Product product) throws Exception {
		// iş kuralları / business rules
		if (product.getUnitPrice() < 10) {
			throw new Exception("Ürün fiyatı 10'dan küçük olamaz");

		}
		productDao.add(product);
		
		for(Logger logger: loggers) {
			logger.log(product.getName());
		}
		
		// bir katman başka bir katmanın class'ına yalnızca interface'inden erişim kurmalıdır
		// entities hariç..
	}
}
