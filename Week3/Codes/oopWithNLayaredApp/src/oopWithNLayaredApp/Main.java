package oopWithNLayaredApp;

import oopWithNLayaredApp.business.ProductManager;
import oopWithNLayaredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		Product product1 = new Product(1,"Poco X3",10000);
		
		ProductManager productManager = new ProductManager();
		productManager.add(product1);

	}

}
