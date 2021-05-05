package Concrete;

import Abstract.UserService;
import Entities.Users;

public class UserManager implements UserService{

	@Override
	public void register(Users user) {
		System.out.println( "Logged in : " + user.getFirstName());
		
	}

	@Override
	public void updateData(Users user) {
		System.out.println("Informations updated : " + user.getFirstName());
		
	}

	@Override
	public void deleteAccount(Users user) {
		System.out.println("User deleted : " + user.getFirstName());
		
	}

}
