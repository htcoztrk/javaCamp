package Business;

import homework.User;
import homework.logger.Logger;

public class StudentManager extends UserManager{

	private Logger _logger;

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		super.add(user);
		System.out.println("student added");
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		super.update(user);
		System.out.println(" student updated");
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		super.delete(user);
		System.out.println("student deleted");
	}

	@Override
	public void list(User... users) {
		// TODO Auto-generated method stub
		super.list(users);
		System.out.println("students listed");
	}

	public StudentManager(Logger _logger) {
		super(_logger);
		this._logger = _logger;
	}
	
}
