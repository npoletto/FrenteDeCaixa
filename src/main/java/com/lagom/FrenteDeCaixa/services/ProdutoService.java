package com.lagom.FrenteDeCaixa.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lagom.FrenteDeCaixa.domain.Produto;
import com.lagom.FrenteDeCaixa.repositories.ProdutoRepository;

@Service
public class ProdutoService {

	 	@Autowired
		private ProdutoRepository repo;
		
		public Produto find(Integer id) {
			Optional<Produto> obj = repo.findById(id);
			return obj.orElse(null);
		}
		
		public List<Produto> findAll() {
			return repo.findAll();
		}
	
}
