package com.Demo.DemoMapping.EntityLayer;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long productId;
	@NotNull(message="product name should not be null")
	private String productname;
	private String  description;
	@Positive(message="price should not be negative")
	private Double price;
	public Product(Long productId,  String productname,
			String description,Double price) {
		super();
		this.productId = productId;
		this.productname = productname;
		this.description = description;
		this.price = price;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	

}
