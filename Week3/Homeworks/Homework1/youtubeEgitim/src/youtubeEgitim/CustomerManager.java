package youtubeEgitim;

public class CustomerManager {
	
	private Customer customer;
	private ICreditManager creditManager;
	
	public CustomerManager(Customer customer,ICreditManager creditManager) {
		this.customer = customer;
		this.creditManager = creditManager;
	}
	
	public void save() {
		System.out.println("Müşteri eklendi: "+customer.getName());
	}
	
	public void delete() {
		System.out.println("Müşteri silindi: "+customer.getName());
	}
	
	public void giveCredit() {
		creditManager.calculate();
		System.out.println("Kredi verildi.");
	}
}
