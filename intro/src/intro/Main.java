package intro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		String[] krediler= {
				"kredi1",
				"kredi2"
		};
		for(String kredi:krediler) {
			System.out.println(kredi);
		}
		// int,float, double , bool vs bunlar deger tiplerdir. stack de tutulurlar, değer ataması yapılır ama baglantı kalmaz.
		
		int sayi1=10;
		int sayi2=20;
		sayi1=sayi2;
		sayi2=100;
		System.out.println(sayi1);
		
		// arrayler, interfaceler  referans tiplerdir. heap de array tutulur, referans olusturulur.
		int[] sayilar1= {1,2,3,4,5};
		int[] sayilar2= {10,20,30,40,50};
		sayilar1=sayilar2;
		sayilar2[0]=100;
		System.out.println(sayilar1[0]);
	}

}
