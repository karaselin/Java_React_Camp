package JavaCamp_Hw5.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import JavaCamp_Hw5.business.abstracts.UserValidationService;
import JavaCamp_Hw5.dataAccess.abstracts.UserDao;
import JavaCamp_Hw5.entities.concretes.User;

public class UserValidationManager implements UserValidationService{

	String regex ="^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
	Pattern pattern =Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
	
	
			
	private UserDao userDao;
	
	public UserValidationManager(UserDao userDao) {
		super();
		this.userDao = userDao;
		
	}

	@Override
	public boolean isEmailValid(User User) {
		// TODO Auto-generated method stub
		Matcher matcher = pattern.matcher(User.getEmail());
		if(matcher.matches()) {
		System.out.println("Doğru e-mail formatı!");
		
		return true;
		
		}
		else {
			System.out.println("Geçerli bir e-mail adresi giriniz.");
			return false;
		}
	
	}

	
	@Override
	public boolean isPasswordLengthValid(User user) {
		// TODO Auto-generated method stub
		if(user.getPassword().length()>=6) {
			
		System.out.println("Uygun uzunlukta şifre girilmiştir.");
		return true;
		}
		else {
		System.out.println("Şifre en az 6 karakterden oluşmalıdır.");
		return false;	
		}
		
	}

	@Override
	public boolean isFirstandLastNameValid(User user) {
		// TODO Auto-generated method stub
		if(user.getFirstName().length()>=2 && user.getLastName().length()>=2) {
			return true;
		}
		else {
			System.out.println("İsim ve soyisim en az 2 karakterden oluşmalıdır. ");
			return false;	
		}
		
	}
	
}
