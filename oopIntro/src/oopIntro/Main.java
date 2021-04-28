package oopIntro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		//örnek olusturma, referance olusturma, instance olusturma
		Product pro1= new Product();
	    pro1.setId(1);
	    pro1.setName("lenova");
	    pro1.setDetail("16 gb ram");
	    pro1.setUnitPrice(1000);
	    pro1.setDiscount(15);
		System.out.println(pro1.getUnitPriceAfterDiscount());
		
		Category category1=new Category();
		category1.setId(1);
		category1.setName("deneme");
		System.out.println(category1.getName());
		
	}

}
