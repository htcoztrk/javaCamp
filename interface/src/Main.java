
public class Main {

	public static void main(String[] args) {
		
Logger[] loggers= {new SmsLogger(),new FileLogger()};	
  CustomerManager customerManager=new CustomerManager(loggers);
  Customer customer=new Customer(1,"hatice","ozturk");
  customerManager.add(customer);
	}

}
