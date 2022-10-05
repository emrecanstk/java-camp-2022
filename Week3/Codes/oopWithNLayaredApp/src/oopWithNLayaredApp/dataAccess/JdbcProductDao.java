package oopWithNLayaredApp.dataAccess;

import oopWithNLayaredApp.entities.Product;

public class JdbcProductDao {
	public void add(Product product) {
		// sadece ve sadece db erişim kodları buraya yazılır.
		System.out.println("JDBC ile veritabanına eklendi.");
	}
}
