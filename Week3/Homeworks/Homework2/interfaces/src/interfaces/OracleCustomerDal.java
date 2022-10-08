package interfaces;

public class OracleCustomerDal implements ICustomerDal, IRepository {   // birden fazla interface implemente edilebiliyor.

	@Override
	public void add() {
		System.out.println("Oracle eklendi");
		
	}

}
