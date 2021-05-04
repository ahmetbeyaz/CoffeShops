package Adapter;

import java.rmi.RemoteException;

import Abstract.ICustomerCheckService;
import Entity.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		KPSPublicSoap soapClient=new KPSPublicSoapProxy();
		boolean result=false;
		
		try {
			result=soapClient.TCKimlikNoDogrula((customer.getNationalityid()),customer.getFirstName().toUpperCase()
					,customer.getLastName().toUpperCase() , customer.getDateofBirth().getYear());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
		
		
	 

}
}
