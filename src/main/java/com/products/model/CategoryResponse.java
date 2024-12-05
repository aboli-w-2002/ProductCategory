package com.products.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class CategoryResponse {
    private Long categoryId;
    private String categoryName;
    private String categoryDescription;

    public CategoryResponse(Long categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        
        
    }
    
    

	public CategoryResponse(Long categoryId, String categoryName, String categoryDescription) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.categoryDescription = categoryDescription;
	}



	public CategoryResponse() {
		super();
		// TODO Auto-generated constructor stub
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

	@Override
	public String toString() {
		return "CategoryResponse [categoryId=" + categoryId + ", categoryName=" + categoryName
				+ ", categoryDescription=" + categoryDescription + "]";
	}
    
	

}

