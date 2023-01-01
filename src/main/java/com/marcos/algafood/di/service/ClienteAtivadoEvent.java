package com.marcos.algafood.di.service;

import com.marcos.algafood.di.modelo.Cliente;

public class ClienteAtivadoEvent {
	private Cliente cliente;

	public ClienteAtivadoEvent(Cliente cliente) {
		super();
		this.cliente = cliente;
	}

	public Cliente getCliente() {
		return cliente;
	}
}
