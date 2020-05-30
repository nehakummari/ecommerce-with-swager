package com.neha.product.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neha.product.entity.ProductEntity;

public interface ProductDao extends JpaRepository<ProductEntity, Integer> {

}
