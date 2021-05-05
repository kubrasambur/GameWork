package Concrete;

import Entities.Users;

public class UserCheckManager extends Users{
	public void check(Users user) {
		if(getNationalityId()==user.getNationalityId()) {
			System.out.println("Login Successful");
		}else {
			System.out.println("incorrect login. pls try again.");
		}
	}
}
