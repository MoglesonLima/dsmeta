package com.devsuperior.dsmeta.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsmeta.entities.Sale;
import com.devsuperior.dsmeta.services.SaleService;
import com.devsuperior.dsmeta.services.SmsService;

//Idicando que aqui temos o controller
@RestController
//mapeamento rest(indicando rota)
@RequestMapping(value = "/sales")
public class SaleController {
	
	@Autowired
	private SaleService saleService;
	
	@Autowired
	private SmsService smsService;
	
	//return all
	@GetMapping
	public Page<Sale> finSales(
			//indicando paramentros(request)
			@RequestParam(value = "minDate", defaultValue = "") String minDate, 
			@RequestParam(value = "maxDate", defaultValue = "") String maxDate, 
			Pageable pageable) {
		//chamada do metodo implementado(date min/max)
		return saleService.findSales(minDate, maxDate, pageable);
	}
	
	//params entre {}
	@GetMapping("/{id}/notification")
	public void smsNotify(@PathVariable Long id) {
		smsService.sendSms(id);
	}
	

	
	
}
