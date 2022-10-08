package interfaces;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
		customerManager.customerDal = new MySqlCustomerDal();
		customerManager.add();

	}

}

// interface'lerin en öne çıkan yanı:
// bir sınıfın birden fazla interface'i implemente edebilmesidir.

// inheritasyon işlemlerinde (kalıtımda) böyle bir durum söz konusu değildir.

// interface'ler de abstractlar gibi new'lenemezler