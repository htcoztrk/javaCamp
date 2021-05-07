package business.concrete;

import business.abstracts.EmailService;

public class EmailManager implements EmailService{

	@Override
	public void sendLink() {
		// TODO Auto-generated method stub
		System.out.println("Verification link send do email");
	}

	@Override
	public void confirmMembership(String email) {
		// TODO Auto-generated method stub
		System.out.println(email +"  membership confirmed.");
	}

}
