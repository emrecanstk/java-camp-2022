package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.setName("Laptop");
		product.setId(1);
		product.setDescription("Asus Laptop 8GB RAM");;
		product.setPrice(11000);
		product.setColor("Black");

		ProductManager productManager = new ProductManager();
		
		productManager.Add(product);
		System.out.println(product.getKod());
		

	}

}
