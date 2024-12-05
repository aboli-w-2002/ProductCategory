package com.products.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



public class ProductDetailsResponse {
    private Long productId;
    private String productName;
    private Double productCost;
    private CategoryResponse category;

    public ProductDetailsResponse(Long productId, String productName, Double productCost, CategoryResponse category) {
        this.productId = productId;
        this.productName = productName;
        this.productCost = productCost;
        this.category = category;
    }

	public ProductDetailsResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Double getProductCost() {
		return productCost;
	}

	public void setProductCost(Double productCost) {
		this.productCost = productCost;
	}

	public CategoryResponse getCategory() {
		return category;
	}

	public void setCategory(CategoryResponse category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "ProductDetailsResponse [productId=" + productId + ", productName=" + productName + ", productCost="
				+ productCost + ", category=" + category + "]";
	}
    
    
}

