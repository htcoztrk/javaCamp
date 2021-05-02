
public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		// TODO Auto-generated method stub
		System.out.println(game.getName()+" added successfully");
	}

	@Override
	public void delete(Game game) {
		// TODO Auto-generated method stub
		System.out.println(game.getName()+" deleted sucessfully");
	}

	@Override
	public void update(Game game) {
		// TODO Auto-generated method stub
		System.out.println(game.getName()+" updated successfully");
	}

	@Override
	public void gameSale(Game game, Customer customer) {
		// TODO Auto-generated method stub
		System.out.println(game.getName()+" saled to "+customer.getFirstName());
	}

	@Override
	public void discount(Game game, Campaign campaign) {
		// TODO Auto-generated method stub
		double discount=game.getPrice()-(game.getPrice()*campaign.getDiscountRate())/100;
		System.out.println("Discounted price: "+discount);
	}

}
