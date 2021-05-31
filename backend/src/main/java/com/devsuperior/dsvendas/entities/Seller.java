package com.devsuperior.dsvendas.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Data
@Table(name = "tb_sellers")
public class Seller {

	@Id
	@Column(name = "id_seller")
	private Long id;

	@Column(name = "name")
	private String name;

	@OneToMany(mappedBy = "id_seler")
	private List<Sale> saleList;

}
