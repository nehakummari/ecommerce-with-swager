package com.neha.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.neha.product.entity.ProductEntity;
import com.neha.product.service.ProductService;

@RestController

public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@GetMapping(value = "/products")
	public List<ProductEntity> getallproducts(){
		return productService.getallproducts();
	}
	
	@PostMapping(value="/products")
	public void createproduct(@RequestBody ProductEntity entity) {
		 productService.createproduct(entity);
	}
	
	@DeleteMapping(value="/products/{pid}")
	public void deleteproduct(@PathVariable Integer pid) {
		productService.deleteproduct(pid);
	}
	
	@GetMapping(value = "/temp")
	public String test() {
		return "welcome user";
	}
	
}

