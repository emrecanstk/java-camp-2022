package youtubeEgitim;

public class Main {

	public static void main(String[] args) {
		CreditManager creditManager = new CreditManager();
		creditManager.calculate();
		creditManager.calculate();
		creditManager.save();
		
		Customer customer = new Customer();
		customer.setName("Emre");
		customer.setId(1);
		customer.setNationalIdentity("13424460000");
		customer.setCity("Bursa");
		
		CustomerManager customerManager = new CustomerManager(customer);
		customerManager.save();
		customerManager.delete();
	}

}
