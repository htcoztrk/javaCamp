package Kodlamaio.northwind.business.abstracts;

import java.util.List;

import Kodlamaio.northwind.entities.concretes.Product;

public interface ProductService {
  List<Product> getAll();
  
}
