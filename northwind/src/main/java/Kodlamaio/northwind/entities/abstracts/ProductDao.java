package Kodlamaio.northwind.entities.abstracts;
import org.springframework.data.jpa.repository.JpaRepository;
import Kodlamaio.northwind.entities.concretes.Product;


public interface ProductDao extends JpaRepository<Product,Integer> {

}
