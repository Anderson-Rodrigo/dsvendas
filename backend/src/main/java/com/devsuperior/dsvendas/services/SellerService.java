package com.devsuperior.dsvendas.services;

import com.devsuperior.dsvendas.dto.SellerDto;
import com.devsuperior.dsvendas.entities.Seller;
import com.devsuperior.dsvendas.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SellerService implements Serializable {

	@Autowired
	private SellerRepository sellerRepository;

	public List<SellerDto> findAll(){
		List<Seller> result = sellerRepository.findAll();
		return result.stream().map(SellerDto::new).collect(Collectors.toList());
	}
}
