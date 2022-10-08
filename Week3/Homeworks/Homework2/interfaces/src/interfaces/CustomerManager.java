package interfaces;

public class CustomerManager {
	
	ICustomerDal customerDal;
	
	public void add() {
		customerDal.add();
	}
}
