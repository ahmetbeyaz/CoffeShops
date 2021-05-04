package Entity;

import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapter.MernisServiceAdapter;
import Concrete.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer customer=new Customer();
		customer.setId(1);
		customer.setFirstName("Ahmet");
		customer.setLastName("Beyaz");
		customer.setDateofBirth(LocalDate.of(1999,10,01));
		customer.setNationalityid(35785629498L);
		BaseCustomerManager customerManager=new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(customer);
		
		

	}

}
