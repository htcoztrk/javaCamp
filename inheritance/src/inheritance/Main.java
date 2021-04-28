package inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        IndividualCustomer c1=new IndividualCustomer();
        c1.firstName="fff";
		Customer[] customers= {c1};
		CustomerManager manager=new CustomerManager();
		manager.addMultiple(customers);
	}

}
