package com.devsuperior.dsvendas.dto;

import com.devsuperior.dsvendas.entities.Sale;

import java.io.Serializable;
import java.time.LocalDate;

public class SaleDto implements Serializable {

	private Long id;
	private Integer visited;
	private Integer deals;
	private Double amount;
	private LocalDate date;

	private SellerDto sellerDto;

	public SaleDto(Sale entity){
		id = entity.getId();
		visited = entity.getVisited();
		deals = entity.getDeals();
		amount = entity.getAmount();
		date = entity.getDate();
		sellerDto = new SellerDto(entity.getSeller());
	}

	public Long getId () {
		return id;
	}

	public void setId (Long id) {
		this.id = id;
	}

	public Integer getVisited () {
		return visited;
	}

	public void setVisited (Integer visited) {
		this.visited = visited;
	}

	public Integer getDeals () {
		return deals;
	}

	public void setDeals (Integer deals) {
		this.deals = deals;
	}

	public Double getAmount () {
		return amount;
	}

	public void setAmount (Double amount) {
		this.amount = amount;
	}

	public LocalDate getDate () {
		return date;
	}

	public void setDate (LocalDate date) {
		this.date = date;
	}

	public SellerDto getSellerDto () {
		return sellerDto;
	}

	public void setSellerDto (SellerDto sellerDto) {
		this.sellerDto = sellerDto;
	}
}
