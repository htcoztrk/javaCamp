package Business;

import homework.User;
import homework.logger.Logger;

public class InstructorManager extends UserManager{

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		super.add(user);
		System.out.println("instructor added");
	}
	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		super.update(user);
		System.out.println("instructor updated");
	}
	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		super.delete(user);
		System.out.println("instructor deleted");
	}
	@Override
	public void list(User... users) {
		// TODO Auto-generated method stub
		super.list(users);
		System.out.println("instructors listed");
	}
	private Logger _logger;
	public InstructorManager(Logger logger) {
		super(logger);
		this._logger=logger;
		// TODO Auto-generated constructor stub
	}
  
}
