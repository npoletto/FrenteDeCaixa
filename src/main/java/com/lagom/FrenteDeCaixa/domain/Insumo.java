package com.lagom.FrenteDeCaixa.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.lagom.FrenteDeCaixa.domain.enums.Unidade;

@Entity
public class Insumo implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String nome;
	private Unidade unidade;
	private BigDecimal custo;
	private BigDecimal estoque;
	
}
