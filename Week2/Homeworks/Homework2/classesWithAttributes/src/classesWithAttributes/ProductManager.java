package classesWithAttributes;

// https://www.youtube.com/playlist?list=PLqG356ExoxZUGwbqoJEKSMnaxVJe4Uvf8
// "JAVA Dersleri"
// Lesson 31 32 33 34

public class ProductManager {

	public void Add(Product product) {
		// JDBC
		System.out.println("Ürün eklendi: " + product.getName());
	}
	
	public void Add2(int id, String name, String description, int stockAmount, double price) {
		
	}

}
