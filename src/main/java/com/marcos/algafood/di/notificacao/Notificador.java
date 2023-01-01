package com.marcos.algafood.di.notificacao;

import com.marcos.algafood.di.modelo.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);

}