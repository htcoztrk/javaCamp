package Kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlamaio.northwind.business.abstracts.ProductService;
import Kodlamaio.northwind.core.utilities.results.DataResult;
import Kodlamaio.northwind.core.utilities.results.Result;
import Kodlamaio.northwind.core.utilities.results.SuccessDataResult;
import Kodlamaio.northwind.dataaccess.abstracts.ProductDao;
import Kodlamaio.northwind.entities.concretes.Product;

@Service
public class ProductManager implements ProductService{

	private ProductDao productDao;
	@Autowired
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}
	@Override
	public DataResult<List<Product>> getAll() {
		// TODO Auto-generated method stub	
		return new SuccessDataResult<List<Product>>
		(this.productDao.findAll(),"product listed");	
				
	}
	@Override
	public Result add(Product product) {
		this.productDao.save(product);
		return new SuccessDataResult("product added.");
	}
	@Override
	public DataResult<Product> getByProductName(String productName) {
		
		return new SuccessDataResult<Product>(
				this.productDao.getByProductName(productName),"product name is:");	}
	@Override
	public DataResult<Product> getByProductNameAndCategoryId(String productName, int categoryId) {
		return new SuccessDataResult<Product>(
				this.productDao.getByProductNameAndCategory(productName, categoryId),"mesaj is:");
		
	}
	@Override
	public DataResult<List<Product>> getByProductNameOrCategoryId(String productName, int categoryId) {
		return new SuccessDataResult<List<Product>>(
				this.productDao.getByProductNameOrCategory(productName,categoryId),"product name is:");
	}
	@Override
	public DataResult<List<Product>> getByCategoryIdIn(List<Integer> categorries) {
		return new SuccessDataResult<List<Product>>(
				this.productDao.getByCategoryIn(categorries),"product name is:");
	}
	@Override
	public DataResult<List<Product>> getByProductNameContains(String productName) {
		return new SuccessDataResult<List<Product>>(
				this.productDao.getByProductNameContains(productName),"product name is:");
	}
	@Override
	public DataResult<List<Product>> getByProductNameStartsWith(String productName) {
		return new SuccessDataResult<List<Product>>(
				this.productDao.getByProductNameStartsWith(productName),"product name is:");
	}
	@Override
	public DataResult<List<Product>> getByProductNameAndCategory(String productName, int categoryId) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Product>>(
				this.productDao.getByNameAndCategory(productName, categoryId));
	}
	
	

}
