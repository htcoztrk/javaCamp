package Kodlamaio.northwind.business.abstracts;

import java.util.List;

import Kodlamaio.northwind.core.utilities.results.DataResult;
import Kodlamaio.northwind.core.utilities.results.Result;
import Kodlamaio.northwind.entities.concretes.Product;

public interface ProductService {
  DataResult<List<Product>>getAll();
  Result add(Product product);
}
