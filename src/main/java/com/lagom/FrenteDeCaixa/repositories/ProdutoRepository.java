package com.lagom.FrenteDeCaixa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lagom.FrenteDeCaixa.domain.Produto;

@Repository 
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}