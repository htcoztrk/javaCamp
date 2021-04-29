package Business;

import homework.User;
import homework.logger.Logger;

public class UserManager {

	private Logger _logger;

	public UserManager(Logger logger) {
		super();
		this._logger = logger;
	}
	public void add(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+" "+"added");
	    _logger.log();
	}
	public void update(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+" "+"updated");
	    _logger.log();
	}
	public void delete(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+" "+"deleted");
	    _logger.log();
	}
	public void list(User... users) {
		for(User user:users ) {
			System.out.println(user.getFirstName());
		}
	    _logger.log();
	}
	
}
