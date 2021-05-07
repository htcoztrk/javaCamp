package business.concrete;

import business.abstracts.AuthService;
import business.abstracts.UserService;
import entities.concretes.User;

public class AuthManager implements AuthService {
private UserService userService;

	public AuthManager(UserService userService) {
	super();
	this.userService = userService;
}

	@Override
	public void login(String email,String password) {
		// TODO Auto-generated method stub
		userService.isLogin(email, password);
	}

	@Override
	public void register(User user) {
		// TODO Auto-generated method stub
		userService.add(user);
	}

}
