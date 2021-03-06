package com.algaworks;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class TemaBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String temaSelecionado = "bootstrap";
	
	public List<String> getTemasDisponiveis() {
		return Arrays.asList("bootstrap", "afterdark", "aristo"); 
	}

	public String getTemaSelecionado() {
		return temaSelecionado;
	}

	public void setTemaSelecionado(String temaSelecionado) {
		this.temaSelecionado = temaSelecionado;
	}
	
}