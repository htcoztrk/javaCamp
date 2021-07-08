package Kodlamaio.northwind.business.abstracts;

import java.util.List;
import Kodlamaio.northwind.core.utilities.results.DataResult;
import Kodlamaio.northwind.core.utilities.results.Result;
import Kodlamaio.northwind.entities.concretes.Product;

public interface ProductService {
  DataResult<List<Product>>getAll();
  Result add(Product product);
  
  
  DataResult<Product>getByProductName(String productName);
  DataResult<Product> getByProductNameAndCategoryId(String productName, int categoryId);
  DataResult<List<Product>> getByProductNameOrCategoryId(String productName,int categoryId);
  DataResult<List<Product>> getByCategoryIdIn(List<Integer> categorries);
  DataResult<List<Product>> getByProductNameContains(String productName);
  DataResult<List<Product>> getByProductNameStartsWith(String productName);
  DataResult<List<Product>> getByProductNameAndCategory(String productName,int categoryId);
  
}
