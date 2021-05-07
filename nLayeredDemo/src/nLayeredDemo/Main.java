package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;
import nLayeredDemo.jLogger.JLoggerManager;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //SOLID in O harfi der ki:yeni bir ozellik eklediginde mevcut hiç bir kodu degistiremezsin!
		//not: bir projede entitiyler haric bir sey new lenıyorsa ilerde anla kı problem yasayacaksın
		//ToDo: Spring IoC ile çözülecek
		ProductService productService=new ProductManager(new AbcProductDao(),new JLoggerManagerAdapter());
		
		Product product=new Product(2,1,"Elma",12,50);
	    productService.add(product);
	    
	    
	}

}
