package Kodlamaio.northwind.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;

import Kodlamaio.northwind.business.abstracts.UserService;
import Kodlamaio.northwind.core.dataAccess.UserDao;
import Kodlamaio.northwind.core.entities.User;
import Kodlamaio.northwind.core.utilities.results.DataResult;
import Kodlamaio.northwind.core.utilities.results.Result;
import Kodlamaio.northwind.core.utilities.results.SuccessDataResult;
import Kodlamaio.northwind.core.utilities.results.SuccessResult;

public class UserManager implements UserService{

	private UserDao userDao;
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public Result add(User user) {
		// TODO Auto-generated method stub
		this.userDao.save(user);
		return new SuccessResult("kullanıcı eklendi.");
	}

	@Override
	public DataResult<User> fndByEmail(String email) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<User>(this.userDao.findByEmail(email),
				"kullanıcı bulundu.");
	}

}
