
public class CustomerManager implements CustomerService{
    ValidationService validationService;
	public CustomerManager(ValidationService validationService) {
		super();
		this.validationService = validationService;
	}

	@Override
	public void add(Customer customer) {
		// TODO Auto-generated method stub
		if(validationService.isValid(customer)) {
			System.out.println(customer.getFirstName()+" "+customer.getLastName()+"added");

		}
		else {
			System.out.println("customer is not valid ");

		}
	}

	@Override
	public void delete(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println(customer.getFirstName()+" "+customer.getLastName()+"deleted");
	}

	@Override
	public void update(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println(customer.getFirstName()+" "+customer.getLastName()+"updated");
	}

	

}
