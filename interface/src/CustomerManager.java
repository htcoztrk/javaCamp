
public class CustomerManager {
	// loosly-tightly coupled
  private Logger[] loggers;
  public CustomerManager(Logger[] loggers) {
	  this.loggers=loggers;
  }
  public void add(Customer customer) {
	  System.out.println("customer added");
	  //logger.log("mesaj");
	 
	 Utils.runLoggers(loggers, customer.getFirstName());
  }
  public void delete(Customer customer) {
	  System.out.println("customer deleted");
  }
}
