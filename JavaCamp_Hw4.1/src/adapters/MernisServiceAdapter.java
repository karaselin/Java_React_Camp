package adapters;


import java.rmi.RemoteException;
import java.time.ZoneId;

import abstracts.CustomerCheckService;
import entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

    @Override
    public boolean checkIfRealPerson(Customer customer) {

        boolean result=true;

        KPSPublicSoapProxy client = new KPSPublicSoapProxy();


                    try {
                        result= client.TCKimlikNoDogrula(
                        Long.parseLong(customer.getNationalityId()),
                        customer.getFirstName().toUpperCase(), 
                        customer.getLastName().toUpperCase(),
                        customer.getDateOfBirth().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getYear());
                        
                    } 
                    catch (RemoteException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    return result;


    }

	
	

}
