import JavaCamp_Hw5.business.abstracts.UserValidationService;
import JavaCamp_Hw5.business.abstracts.UserVerificationService;
import JavaCamp_Hw5.business.concretes.UserValidationManager;
import JavaCamp_Hw5.business.concretes.UserVerificationManager;
import JavaCamp_Hw5.core.GoogleAuthenticatorService;
import JavaCamp_Hw5.dataAccess.concretes.HibernateUserDao;
import JavaCamp_Hw5.entities.concretes.User;
import adapter.GoogleAuthenticatorManager;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User userSelin = new User("Selin","Kara","selinkara99@hotmail.com","123456");
		UserValidationService uvs = new UserValidationManager(new HibernateUserDao());
		uvs.isEmailValid(userSelin);
		uvs.isFirstandLastNameValid(userSelin);
		uvs.isPasswordLengthValid(userSelin);
		
		
		
		
		
		UserVerificationService uvs1 = new UserVerificationManager();
		uvs1.emailVerification(userSelin);
		
		GoogleAuthenticatorService gas=new GoogleAuthenticatorManager();
		gas.register(userSelin, "selinkara99@hotmail.com");
	}

}
