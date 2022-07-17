package com.devsuperior.dsmeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	public List<Sale> findSales() {
		//Listando todas as entidades no banco
		//por meio do respository é possível executar diversas ações direto no banco.
		return saleRepository.findAll();		
	}

}
