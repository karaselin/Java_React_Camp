import java.rmi.RemoteException;
import java.util.GregorianCalendar;

import abstracts.BaseCustomerManager;
import abstracts.CustomerCheckService;
import abstracts.CustomerService;
import adapters.MernisServiceAdapter;
import concretes.CustomerCheckManager;
import concretes.NeroCustomerManager;
import concretes.StarbucksCustomerManager;
import entities.Customer;

public class Main {

	public static void main(String[] args) throws RemoteException {
		// TODO Auto-generated method stub
		Customer customer1 = new Customer();
		customer1.setId(1);
		customer1.setFirstName("Selin");
		customer1.setLastName("Kara");
		customer1.setDateOfBirth(new GregorianCalendar(1999, 02 , 28).getTime());
		customer1.setNationalityId("1111111111");
		BaseCustomerManager  baseManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		System.out.println("-----------------------------------------------------");
		baseManager.save(customer1);
		System.out.println("-----------------------------------------------------");
		
      
		
		
	}

}
