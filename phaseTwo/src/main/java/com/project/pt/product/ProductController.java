package com.project.pt.product;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	ProductService ps;
	
	@GetMapping("/get/{id}")
	public String getProduct(@PathVariable int id) {
		return ps.getProduct(id);
	}
	
	@GetMapping("/get/all")
	public List<ProductEntity> getAllProducts(){
		return ps.getAllProducts();
	}
	
	@PostMapping("/create")
	public String createProduct(@RequestBody ProductEntity product) {
		return ps.createProduct(product);
	}
	
	@DeleteMapping("/delete")
	public String deleteProduct(@RequestBody int id) {
		return ps.deleteProduct(id);
	}
	
	@PostMapping("/update")
	public String updateProduct(@RequestBody ProductEntity product) {
		return ps.updateProduct(product);
	}

}
