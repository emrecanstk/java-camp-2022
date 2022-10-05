package oopWithNLayaredApp.business;

import oopWithNLayaredApp.dataAccess.JdbcProductDao;
import oopWithNLayaredApp.dataAccess.ProductDao;
import oopWithNLayaredApp.entities.Product;

public class ProductManager {
	private ProductDao productDao;
	
	public ProductManager(ProductDao productDao) {
		this.productDao = productDao;
	}
	
	public void add(Product product) throws Exception {
		// iş kuralları / business rules
		if (product.getUnitPrice() < 10) {
			throw new Exception("Ürün fiyatı 10'dan küçük olamaz");

		}
		productDao.add(product);
		
		// bir katman başka bir katmanın class'ına yalnızca interface'inden erişim kurmalıdır
		// entities hariç..
	}
}
