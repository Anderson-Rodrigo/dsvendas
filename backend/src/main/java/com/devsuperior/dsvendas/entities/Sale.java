package com.devsuperior.dsvendas.entities;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Table(name = "tb_sales")
public class Sale {

	@Id
	@Column(name = "id_seler")
	private Long id;

	@Column(name = "visited")
	private Integer visited;

	@Column(name = "deals")
	private Integer deals;

	@Column(name = "amount")
	private Double amount;

	@Column(name = "date")
	private LocalDate date;

	@ManyToOne
	@JoinColumn(name = "seller_id", columnDefinition = "id_seller")
	private Seller seller;
}
