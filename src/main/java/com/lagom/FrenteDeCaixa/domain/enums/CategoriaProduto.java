package com.lagom.FrenteDeCaixa.domain.enums;

public enum CategoriaProduto {
	CERVEJA_COPO("Cerveja Copo"), 
	CERVEJA_GARRAFA("Cerveja Garrafa"),
	BEBIDAS_SEM_ALCOOL("Bebidas sem Álcool"),
	PRODUTO_BALCAO("Produto Balcão"),
	PRATO("Prato"),
	SOUVENIR("Souvenir"),
	DRINK ("Drink");
	
	private String descricao;

	CategoriaProduto(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
}
