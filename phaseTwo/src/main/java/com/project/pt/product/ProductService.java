package com.project.pt.product;

import java.util.*;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

	@Autowired
	ProductRepository prepo;
	
	public String getProduct(int p_id) {
		try {
			Optional<ProductEntity> prod = prepo.findById(p_id);
			if(prod.isPresent()) {
				return prod.get().toString();
			} else {
				return "Product does not exist.";
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return "Could not find product successfully.";
		}
	}
	
	public List<ProductEntity> getAllProducts() {
		try {
			return prepo.findAll();
		} catch(Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	
	public String createProduct(ProductEntity product) {
		try {
			prepo.save(product);
			System.out.println(product.toString());
			return "Product created successfully!";
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return "Could not create product successfully.";
		}
	}
	
	public String updateProduct(ProductEntity product) {
		try {
			Optional<ProductEntity> prod = prepo.findById(product.getP_id());
			if(!prod.isPresent()) {
				return "Invalid Product ID.";
			}
			prod.get().setCat_id(product.getCat_id());
			prod.get().setCat_name(product.getCat_name());
			prod.get().setP_name(product.getP_name());
			prepo.save(prod.get());
			return "Updated product successfully!";
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return "Could not update product successfully.";
		}
	}
	
	public String deleteProduct(int id) {
		try {
			prepo.deleteById(id);
			return "Deleted product successfully!";
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return "Could not delete successfully.";
		}
	}
}
