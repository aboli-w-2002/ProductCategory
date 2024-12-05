package com.products.model;

import jakarta.persistence.*;
import lombok.*;


@Entity

@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "cost", columnDefinition = "DOUBLE DEFAULT 0.0")
    private Double cost;

    @ManyToOne
//    @JsonIgnore
    private Categories category;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(Long id, String name, Double cost, Categories category) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.category = category;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public Categories getCategory() {
		return category;
	}

	public void setCategory(Categories category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", cost=" + cost + ", category=" + category + "]";
	}
    
    
}
