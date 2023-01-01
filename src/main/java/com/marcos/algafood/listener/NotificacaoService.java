package com.marcos.algafood.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.marcos.algafood.di.notificacao.NivelUrgencia;
import com.marcos.algafood.di.notificacao.Notificador;
import com.marcos.algafood.di.notificacao.TipoDoNotificador;
import com.marcos.algafood.di.service.ClienteAtivadoEvent;

@Component
public class NotificacaoService {
	
	@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
	@Autowired
	private Notificador notificador;
	
	@EventListener
	public void clienteAtivadoListener(ClienteAtivadoEvent event) {
		notificador.notificar(event.getCliente(), "Seu cadastro no Sistema está ativo!");
	}
}
