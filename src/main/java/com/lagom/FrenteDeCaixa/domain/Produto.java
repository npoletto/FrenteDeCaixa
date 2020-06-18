package com.lagom.FrenteDeCaixa.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.lagom.FrenteDeCaixa.domain.enums.CategoriaProduto;

@Entity
public class Produto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String nome;
	private BigDecimal preco;
	private BigDecimal precoComDesconto;
	private boolean comDesconto;
	private boolean aVenda;
	private CategoriaProduto categoriaProduto;
	private List<ItemReceita> itensReceita; 
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	public BigDecimal getPrecoComDesconto() {
		return precoComDesconto;
	}
	public void setPrecoComDesconto(BigDecimal precoComDesconto) {
		this.precoComDesconto = precoComDesconto;
	}
	public boolean isComDesconto() {
		return comDesconto;
	}
	public void setComDesconto(boolean comDesconto) {
		this.comDesconto = comDesconto;
	}
	public boolean isaVenda() {
		return aVenda;
	}
	public void setaVenda(boolean aVenda) {
		this.aVenda = aVenda;
	}
	public CategoriaProduto getCategoriaProduto() {
		return categoriaProduto;
	}
	public void setCategoriaProduto(CategoriaProduto categoriaProduto) {
		this.categoriaProduto = categoriaProduto;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
	
}
