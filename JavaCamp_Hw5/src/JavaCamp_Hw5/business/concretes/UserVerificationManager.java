package JavaCamp_Hw5.business.concretes;

import JavaCamp_Hw5.business.abstracts.UserVerificationService;
import JavaCamp_Hw5.entities.concretes.User;

public class UserVerificationManager implements UserVerificationService {

	@Override
	public void emailVerification(User user) {
		// TODO Auto-generated method stub
		System.out.println("Üyelik baþarýlý,E-mail gönderildi.");
	}

}
