package JavaCamp_Hw5.business.abstracts;

import JavaCamp_Hw5.entities.concretes.User;

public interface UserValidationService {
	boolean isEmailValid(User User);
	boolean isPasswordLengthValid(User user);
	boolean isFirstandLastNameValid(User user);
	
}
