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
		customer.setCity("Bursa");
		
		CustomerManager customerManager = new CustomerManager(new Company(),new MilitaryCreditManager());
		customerManager.save();
		customerManager.delete();
		
		Company company = new Company();
		company.setTaxNumber("12545121");
		company.setName("THY");
		company.setId(100);
		
		// IoC Container   (araştırılacak)
		CustomerManager customerManager2 = new CustomerManager(new Person(),new TeacherCreditManager());
		
		Person person = new Person();
		person.setName("Ömer");
		person.setId(5);
		person.setCity("Mustafakemalpaşa");
		
		
	}

}
