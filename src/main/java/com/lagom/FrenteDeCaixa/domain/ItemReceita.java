package com.lagom.FrenteDeCaixa.domain;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.lagom.FrenteDeCaixa.domain.enums.Unidade;

public class ItemReceita {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private List<Insumo> insumos;
	private Unidade unidade;
	private BigDecimal quantidade;
	
	
	
}
