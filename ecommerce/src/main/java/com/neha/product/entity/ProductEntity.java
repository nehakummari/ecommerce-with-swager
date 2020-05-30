package com.neha.product.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProductEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer productid;
	private String productname;
	private String productavailability;
	private String productcategory;
	private double productprice;
	public Integer getProductid() {
		return productid;
	}
	public void setProductid(Integer productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getProductavailability() {
		return productavailability;
	}
	public void setProductavailability(String productavailability) {
		this.productavailability = productavailability;
	}
	public String getProductcategory() {
		return productcategory;
	}
	public void setProductcategory(String productcategory) {
		this.productcategory = productcategory;
	}
	public double getProductprice() {
		return productprice;
	}
	public void setProductprice(double productprice) {
		this.productprice = productprice;
	}
	@Override
	public String toString() {
		return "ProductEntity [productid=" + productid + ", productname=" + productname + ", productavailability="
				+ productavailability + ", productcategory=" + productcategory + ", productprice=" + productprice + "]";
	}
	
	
	
	
	

}
