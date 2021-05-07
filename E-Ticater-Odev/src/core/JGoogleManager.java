package core;

import JGoogle.SignUpWithGoogleAccount;

public class JGoogleManager implements JGoogleService{

	@Override
	public void login() {
		// TODO Auto-generated method stub
		SignUpWithGoogleAccount g=new SignUpWithGoogleAccount();
		g.register();
		
	}
	
}
