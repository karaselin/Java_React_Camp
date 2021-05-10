package JavaCamp_Hw5.dataAccess.abstracts;

import JavaCamp_Hw5.entities.concretes.User;

public interface UserDao {
	void addUser(User user);
	void deleteUser(User user);
	void updateUserInfo(User user);
	//veritaban�nda yap�labilecek i�lemler olmal�
}
