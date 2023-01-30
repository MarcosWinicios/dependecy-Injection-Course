package com.marcos.algafood;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.marcos.algafood.di.modelo.Cliente;
import com.marcos.algafood.di.service.AtivacaoClienteService;

@Controller
public class MeuPrimeiroController {
	
	private AtivacaoClienteService ativacaoClienteService;
	
	public MeuPrimeiroController(AtivacaoClienteService ativadorClienteService ) {
		this.ativacaoClienteService = ativadorClienteService;
		
		System.out.println("Meu Primeiro Controller: " + ativacaoClienteService);
	}
	
	@GetMapping("/hello")
	@ResponseBody
	public String Hello() {
		
		Cliente joao =  new Cliente("João", "joao@xyz.com", "349998888");		
		System.out.println("joao: " + joao);
		ativacaoClienteService.ativar(joao);
		
		return "Hello!";
	}
}
