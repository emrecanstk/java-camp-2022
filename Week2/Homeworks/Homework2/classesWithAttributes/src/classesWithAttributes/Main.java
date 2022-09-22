package classesWithAttributes;

// https://www.youtube.com/playlist?list=PLqG356ExoxZUGwbqoJEKSMnaxVJe4Uvf8
// "JAVA Dersleri"
// Lesson 31 32 33 34

public class Main {

	public static void main(String[] args) {
		Product product = new Product(1,"Laptop","Asus Laptop",3000,2,"Siyah");

		ProductManager productManager = new ProductManager();
		
		productManager.Add(product);
		System.out.println(product.getKod());
		

	}

}
