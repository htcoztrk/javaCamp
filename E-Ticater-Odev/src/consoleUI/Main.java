package consoleUI;
import business.concrete.AuthManager;
import business.concrete.EmailManager;
import business.concrete.UserManager;
import core.JGoogleManager;
import dataAccess.concrete.InMemoryUserDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User user1=new User(1,"hatice","ozturk","hatice@gmail.com","123456",true);
		User user2=new User(2,"mmm","ozz","m@gmail.com","123456",true);
		User user3=new User(2,"mmm","ozz","m@gmail.com","123456",true);
		User user4=new User(2,"abc","abc","abcgmailcom","123456",true);
		
		EmailManager emailManager=new EmailManager();
		UserManager userManager=new UserManager(new InMemoryUserDao(),new JGoogleManager(),emailManager);
		AuthManager authManager=new AuthManager(userManager);
		
		
		authManager.register(user1);
		System.out.println("****************************");
		emailManager.confirmMembership(user1.getEmail());
		System.out.println("****************************");
		authManager.register(user2);
		System.out.println("****************************");
		authManager.register(user3); //user already exist hatası verecek
		System.out.println("****************************");
		authManager.login(user1.getEmail(), user1.getPasword());
		System.out.println("****************************");
		authManager.login("dfjsdnks", "sdfks");//email ve password hatası verecek.
		System.out.println("****************************");
		authManager.register(user4);//email hatalı oldugu için invalid hatası verecek işlem başarısız
	}

}
