
public class ValidationManager implements ValidationService
{

	@Override
	public boolean isValid(Customer customer) {
		// TODO Auto-generated method stub
		if(customer.getNationalityId()!=null) {
			return true;
		}
		else {
			return false;

		}
		
	}

}
