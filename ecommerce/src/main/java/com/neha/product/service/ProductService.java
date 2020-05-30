package com.neha.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.neha.product.dao.ProductDao;
import com.neha.product.entity.ProductEntity;

@Service
public class ProductService {
	
	@Autowired
	ProductDao productDao;
	
	public List<ProductEntity> getallproducts(){
		return productDao.findAll();
	}
	
	public void createproduct(ProductEntity entity) {
		 productDao.save(entity);
	}
	
	public void deleteproduct(Integer pid) {
		productDao.deleteById(pid);
	}
	

}
