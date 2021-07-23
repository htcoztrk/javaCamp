package Kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Kodlamaio.northwind.business.abstracts.ProductService;
import Kodlamaio.northwind.core.utilities.results.DataResult;
import Kodlamaio.northwind.core.utilities.results.Result;
import Kodlamaio.northwind.core.utilities.results.SuccessDataResult;
import Kodlamaio.northwind.core.utilities.results.SuccessResult;
import Kodlamaio.northwind.entities.concretes.Product;
import Kodlamaio.northwind.entities.dtos.ProductWithCategoryDto;

@RestController
@RequestMapping("/api/products")
public class ProductsController {
	
	private ProductService productService;
	
	@Autowired
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}
   @GetMapping("/getall")
   public DataResult<List<Product>> getAll(){
	   return this.productService.getAll();
   }
   @GetMapping("/getproductwithcategorydetails")
   public DataResult<List<ProductWithCategoryDto>> getProductWithCategoryDetails(){
	   return this.productService.getProductWithCategoryDetails();
   }
	@PostMapping("/add")
	public Result add(@RequestBody Product product) {
		return this.productService.add(product);
	}
	@GetMapping("/getByProductName")
	   public DataResult<Product> getByProductName(String productName){
		   return this.productService.getByProductName(productName);
	}
	@GetMapping("/getByProductNameAndCategoryId")
	public DataResult<Product> getByProductNameAndCategoryId
	(@RequestParam("productName") String productName,@RequestParam("categoryId") int categoryId)
	{
		return this.productService.getByProductNameAndCategoryId(productName, categoryId);
		
	}
	
	@GetMapping("/getByProductNameNameContains")
	public DataResult<List<Product>>getByProductNameContains
	(@RequestParam String productName){
		return this.productService.getByProductNameContains(productName);
	}
	@GetMapping("/getAllByPage")
	DataResult<List<Product>>getAll(int pageNo,int pageSize){
		return this.productService.getAll(pageNo, pageSize);
	}
	@GetMapping("/getAllSorted")
	public DataResult<List<Product>> getAllSorted(){
		return this.productService.getAllSorted();
	}
	
	
	
	
	
	
	
	
	
}
