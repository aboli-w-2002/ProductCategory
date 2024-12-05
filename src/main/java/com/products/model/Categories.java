package com.products.model;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

import org.springframework.stereotype.Service;


@Entity

@Table(name = "categories")

public class Categories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long categoryId;
    

    @Column(name = "name")
    private String categoryName;

    @Column(name = "decription")
    private String categoryDescription;

    @OneToMany(mappedBy = "category")
    private List<Product> products;

	public Categories() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Categories(Long categoryId, String categoryName, String categoryDescription, List<Product> products) {
		
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.categoryDescription = categoryDescription;
		this.products = products;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryDescription() {
		return categoryDescription;
	}

	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Categories [categoryId=" + categoryId + ", categoryName=" + categoryName + ", categoryDescription="
				+ categoryDescription + ", products=" + products + "]";
	}
    
    
    
    

}
