package com.devsuperior.dsmeta.services;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.devsuperior.dsmeta.entities.Sale;
import com.devsuperior.dsmeta.repositories.SaleRepository;

//Indicando que aqui temos um serviço/component @Service
@Service
public class SaleService {
	
	//insntanciando repository sale
	@Autowired 
	private SaleRepository saleRepository; 		//mesmo que dar um new, criando o objeto
												//instanciando o mesmo!!!
	
//	public List<Sale> findSales() {
//		//Listando todas as entidades no banco
//		//por meio do respository é possível executar diversas ações direto no banco.
//		return saleRepository.findAll();		
//	}
	
	public Page<Sale> findSales(String minDate, String maxDate, Pageable pageable) {
		//verificando se um dos campos for vazios
		LocalDate today  = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());
		
		//Verificando se foi passado parametros(se não mostra um ano atrás)
		LocalDate min = minDate.equals("") ? today.minusDays(365) : LocalDate.parse(minDate);
		LocalDate max = maxDate.equals("") ? today : LocalDate.parse(maxDate);
						
		
//		//casting local date
//		LocalDate min = LocalDate.parse(minDate);
//		LocalDate max = LocalDate.parse(maxDate);
//				
		
		//Listando todas as entidades no banco
		//por meio do respository é possível executar diversas ações direto no banco.
		return saleRepository.findSales(min, max, pageable);		
	}


}
