package JavaCamp_Hw5.core;

import JavaCamp_Hw5.entities.concretes.User;

public interface GoogleAuthenticatorService {
	boolean register(User user,String email);
	
}
