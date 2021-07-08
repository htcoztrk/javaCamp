package Kodlamaio.northwind.dataaccess.abstracts;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import Kodlamaio.northwind.entities.concretes.Product;


public interface ProductDao extends JpaRepository<Product,Integer> {
   Product getByProductName(String productName);
   Product getByProductNameAndCategory(String productName, int categoryId);
   List<Product> getByProductNameOrCategory(String productName,int categoryId);
   List<Product> getByCategoryIn(List<Integer> categorries);
   List<Product> getByProductNameContains(String productName);
   List<Product> getByProductNameStartsWith(String productName);
   
   @Query("From Product where productName=:productName and category.categoryId=:categoryId")
   List<Product> getByNameAndCategory(String productName,int categoryId);
   
   
   
   
   
}