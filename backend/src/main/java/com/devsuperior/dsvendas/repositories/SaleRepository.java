package com.devsuperior.dsvendas.repositories;

import com.devsuperior.dsvendas.dto.SaleSumDto;
import com.devsuperior.dsvendas.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SaleRepository extends JpaRepository<Sale, Long> {

	@Query("SELECT  ")
	List<SaleSumDto> ammountGroupBySeller();
}
