package business.concrete;

import java.util.regex.Pattern;

import business.abstracts.EmailService;
import business.abstracts.UserService;
import core.JGoogleService;
import core.Utilities.BusinessRules;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService{
public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
			Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

private UserDao userDao;
private JGoogleService googleService;
private EmailService emailService;

	public UserManager(UserDao userDao, JGoogleService googleService,EmailService emailService) {
	super();
	this.userDao = userDao;
	this.googleService = googleService;
	this.emailService=emailService;
}


	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		boolean result=BusinessRules.Run(checkFirstAndLastName(user),
				checkIfUserEmpty(user),
				checkIfEmailFormatValid( user),
				checkIfEmailUsed( user),
				checkIfPasswordValid( user)
				);
		if(result) {
		  userDao.add(user);
		  System.out.println(user.getFirstName()+" added successfully");
		  googleService.login();
		  emailService.sendLink();
		}
		else {
			System.out.println("Adding operation Failed!!");
		}
	}

	
	private boolean checkFirstAndLastName(User user) {
		if(user.getFirstName().length()<3||user.getLastName().length()<3) {
			System.out.println("ad ve soyad en az iki karakter olmalı");
			return false;
		}
		return true;
	}
	private boolean checkIfUserEmpty(User user) {
		if(user.getEmail()==null||user.getFirstName()==null||
				user.getLastName()==null||user.getPasword()==null) {
			System.out.println("User info can not be ampty");
			return false;
		}
		return true;
	}
	private boolean checkIfEmailFormatValid(User user) {
		if(VALID_EMAIL_ADDRESS_REGEX.matcher(user.getEmail()).find()) {
			
			return true;
		}
		else {
			System.out.println("invalid email");
			return false;
		}
		
		
	}
    private boolean checkIfEmailUsed(User user) {
    	if(userDao.getByEmail(user.getEmail())!=null) {
    		System.out.println("User already exist! Use another email");
    		return false;
    	}
    	return true;
    }
    private boolean checkIfPasswordValid(User user) {
    	if(user.getPasword().length()<6) {
    		System.out.println("pasword can not be less than 6 character");
    		return false;
    	}
    	return true;
    }


	@Override
	public boolean isLogin(String email, String password) {
		// TODO Auto-generated method stub
	     if(userDao.isLogin(email, password)) {
	    	 System.out.println(email+" login successfully");
	    	 return true;
	     }
	     else {
	    	 System.out.println(" email or password is wrong");
	    	 return false;
	     }
	    	 
	    	 
	}


}




