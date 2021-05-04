package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entity.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private ICustomerCheckService _customercheckservice;
	
	public StarbucksCustomerManager(ICustomerCheckService _customercheckservice) {
		this._customercheckservice = _customercheckservice;
	}

	@Override
	public  void save(Customer customer) {
		// TODO Auto-generated method stub
		
		if(_customercheckservice.CheckIfRealPerson(customer)) {
			super.save(customer);
			
		}else {
			System.out.println("Not a valid person");
		}
		
	}


}
