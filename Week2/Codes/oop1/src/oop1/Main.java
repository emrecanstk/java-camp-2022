package oop1;

public class Main {

	public static void main(String[] args) {

		String mesaj = "Vade oranı";

		Product product1 = new Product();
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(4);
		product1.setImageUrl("bilmemne1.jpg");

		Product product2 = new Product();
		product2.setName("Simag Kahve Makinesi");
		product2.setDiscount(10);
		product2.setUnitPrice(9000);
		product2.setUnitsInStock(3);
		product2.setImageUrl("bilmemne2.jpg");

		Product product3 = new Product();
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setDiscount(4);
		product3.setUnitPrice(6700);
		product3.setUnitsInStock(8);
		product3.setImageUrl("bilmemne3.jpg");

		Product[] products = { product1, product2, product3 };
		
		for (Product product : products) {
			System.out.println(product.getName());
		}

	}

}
