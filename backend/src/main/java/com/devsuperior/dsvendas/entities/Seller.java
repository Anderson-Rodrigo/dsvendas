package com.devsuperior.dsvendas.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Table(name = "tb_sellers")
@Entity
public class Seller {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	@OneToMany(mappedBy = "seller")
	private List<Sale> sales = new ArrayList<>();

	public Seller(){}

	public Seller (Long id, String name, List<Sale> sales) {
		this.id = id;
		this.name = name;
		this.sales = sales;
	}

	public Long getId () {
		return id;
	}

	public void setId (Long id) {
		this.id = id;
	}

	public String getName () {
		return name;
	}

	public void setName (String name) {
		this.name = name;
	}

	public List<Sale> sales () {
		return sales;
	}

	public void setSales (List<Sale> sales) {
		this.sales = sales;
	}
}
