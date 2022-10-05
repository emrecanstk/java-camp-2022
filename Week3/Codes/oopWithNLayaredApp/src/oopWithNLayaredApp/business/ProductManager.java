package oopWithNLayaredApp.business;

import oopWithNLayaredApp.dataAccess.JdbcProductDao;
import oopWithNLayaredApp.entities.Product;

public class ProductManager {
	public void add(Product product) throws Exception {
		// iş kuralları / business rules
		if (product.getUnitPrice() < 10) {
			throw new Exception("Ürün fiyatı 10'dan küçük olamaz");

		}

		JdbcProductDao productDao = new JdbcProductDao();
		productDao.add(product);
	}
}
