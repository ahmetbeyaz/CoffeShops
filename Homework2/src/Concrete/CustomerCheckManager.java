
package Concrete;

import Abstract.ICustomerCheckService;
import Entity.Customer;

public class CustomerCheckManager implements ICustomerCheckService {
	public boolean CheckIfRealPerson(Customer customer) {
		return true;
		
		
		
	}

}
