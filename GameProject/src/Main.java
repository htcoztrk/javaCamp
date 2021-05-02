import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Campaign campaign=new Campaign(1,"Black Friday",15);
       
       Customer customer1=new Customer(1,"Hatice","Oz",new Date(1996,02,07),"1234");
       Customer customer2=new Customer(2,"M","O",new Date(1996,25,06),"123");
       Customer customer3=new Customer();
       
       Game game1=new Game(1,"PUBG",25);
       Game game2=new Game(2,"Brawl Stars",35);
	   
       CampaignManager campaignManager=new CampaignManager();
       CustomerManager customerManager=new CustomerManager(new ValidationManager());
       GameManager gameManager=new GameManager();      
	 
       System.out.println("********Customer*******");
       customerManager.add(customer1);
       customerManager.add(customer3);//customer is not valid hatası verilecek;
       customerManager.update(customer2);
       customerManager.delete(customer2);
       
       System.out.println("********Campaign*******");
       campaignManager.add(campaign);
       campaignManager.delete(campaign);
       campaignManager.update(campaign);
       
       System.out.println("********Game*******");
       gameManager.add(game1);
       gameManager.delete(game2);
       gameManager.update(game2);
       gameManager.gameSale(game1, customer1);
       gameManager.gameSale(game2, customer2);
	   gameManager.discount(game1, campaign);
	   
       
       
	}

}
