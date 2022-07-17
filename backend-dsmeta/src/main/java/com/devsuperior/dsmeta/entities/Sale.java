package com.devsuperior.dsmeta.entities;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



import lombok.Getter;
import lombok.Setter;
//Lombok
@Getter
@Setter
//persistence
@Entity
@Table(name="tb_sales")
public class Sale {
	//Identificando ID
	@Id
	//definindo como será esse id(autoincrement)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String sellerName;
	private Integer visited;
	private Integer deals;
	private Double amount;
	private LocalDate date;
	
	public Sale() {
		
	}

}
