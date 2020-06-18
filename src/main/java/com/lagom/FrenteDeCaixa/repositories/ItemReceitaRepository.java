package com.lagom.FrenteDeCaixa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lagom.FrenteDeCaixa.domain.ItemReceita;

@Repository 
public interface ItemReceitaRepository extends JpaRepository<ItemReceita, Integer> {

}