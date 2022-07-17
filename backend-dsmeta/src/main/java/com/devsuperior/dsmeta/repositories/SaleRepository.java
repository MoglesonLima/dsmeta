package com.devsuperior.dsmeta.repositories;

import java.time.LocalDate;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.dsmeta.entities.Sale;

//JpaRepository<Sale, Long> identificando a entidade bem como seu ID(Tipo de ID)
//Necessário para interagir com o banco, por isso é necessário indicar a entidade!
public interface SaleRepository extends JpaRepository<Sale, Long>{
	
	//metodo para buscar com base na data(QUERY) -- JPQL
	@Query("SELECT obj FROM Sale obj WHERE obj.date BETWEEN :min AND :max ORDER BY obj.amount DESC")
	Page<Sale> findSales(LocalDate min, LocalDate max, Pageable pageable);
	
	
}
 