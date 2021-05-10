package adapter;

import JavaCamp_Hw5.core.GoogleAuthenticatorService;
import JavaCamp_Hw5.entities.concretes.User;

public class GoogleAuthenticatorManager implements GoogleAuthenticatorService {

	@Override
	public boolean register(User user,String email) {
		// TODO Auto-generated method stub
		
		if(user.getEmail()==email) {
		System.out.println("Google hesabý ile üyelik oluþturuldu. ");	
		return true;
		}
		else
		{
			System.out.println("Google hesabý ile üyelik baþarýsýz! ");
			return false;
		}
		
		
	}

}
