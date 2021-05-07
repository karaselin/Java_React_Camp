package concretes;

import abstracts.BaseCustomerManager;
import abstracts.CustomerCheckService;
import entities.Customer;


public class StarbucksCustomerManager extends BaseCustomerManager {
private CustomerCheckService customerCheckService;

public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
	this.customerCheckService = customerCheckService;
}

@Override
public  void save(Customer customer) {
	// TODO Auto-generated method stub
	//System.out.println("Save to database. " + customer.firstName);
	if(customerCheckService.checkIfRealPerson(customer)== true) {
		super.save(customer);
	}
	
	else {
		System.out.println("Not valid person.");
	}
}


}
