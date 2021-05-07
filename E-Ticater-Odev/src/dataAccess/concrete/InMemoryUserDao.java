package dataAccess.concrete;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class InMemoryUserDao implements UserDao {
    List<User> users=new ArrayList<User>();
	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		users.add(user);
		System.out.println(user.getFirstName()+" added to system.");
	}

	@Override
	public User getByEmail(String email) {
		// TODO Auto-generated method stub
		User user=users.stream().filter(u->u.getEmail()==email)
				.findFirst().orElse(null);
		return user;
	}

	@Override
	public User getById(int id) {
		User user=users.stream().filter(u->u.getId()==id)
				.findFirst().orElse(null);
		return user;
	}

	@Override
	public List<User> getAll() {
		for(User user:users) {
			System.out.println(user.getFirstName());
		}
		System.out.println("-----------");
		return this.users;
	}

	@Override
	public boolean isLogin(String email, String password) {
		// TODO Auto-generated method stub
		User user=users.stream().filter(u->u.getEmail()==email&&u.getPasword()==password)
				.findFirst().orElse(null);
		if(user==null) {
			return false;
		}
		else {
			return true;
		}
	}

}
