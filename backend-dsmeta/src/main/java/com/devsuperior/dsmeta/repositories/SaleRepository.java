package com.devsuperior.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmeta.entities.Sale;

//JpaRepository<Sale, Long> identificando a entidade bem como seu ID(Tipo de ID)
//Necessário para interagir com o banco, por isso é necessário indicar a entidade!
public interface SaleRepository extends JpaRepository<Sale, Long>{
	
}
 