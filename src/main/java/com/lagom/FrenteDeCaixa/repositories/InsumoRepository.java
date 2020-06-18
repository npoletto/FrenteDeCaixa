package com.lagom.FrenteDeCaixa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lagom.FrenteDeCaixa.domain.Insumo;

@Repository 
public interface InsumoRepository extends JpaRepository<Insumo, Integer> {

}