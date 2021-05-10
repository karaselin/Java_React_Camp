package JavaCamp_Hw5.dataAccess.concretes;

import JavaCamp_Hw5.dataAccess.abstracts.UserDao;
import JavaCamp_Hw5.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		System.out.println("Hibernate ile eklendi" + user.getEmail()) ;
	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		System.out.println("Kullanýcý silindi" + user.getEmail());
	}

	@Override
	public void updateUserInfo(User user) {
		// TODO Auto-generated method stub
		System.out.println("Kullanýcý bilgileri güncellendi. ");
	}

}
