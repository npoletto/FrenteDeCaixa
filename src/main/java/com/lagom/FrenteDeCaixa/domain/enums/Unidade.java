package com.lagom.FrenteDeCaixa.domain.enums;

public enum Unidade {
	KILOGRAMA("Kg"), 
	LITRO("L"),
	UNIDADE("UN");
	
	private String descricao;

	Unidade(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
	
	
}