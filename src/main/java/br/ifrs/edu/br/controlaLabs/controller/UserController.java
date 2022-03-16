package br.ifrs.edu.br.controlaLabs.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import br.ifrs.edu.br.controlaLabs.useful.VerificaIp;

@Controller
public class UserController {

	@GetMapping("/login")
	public String login(HttpServletRequest request) {
		if(new VerificaIp().ipPermitido(request) )
		return "usuario/login";
		else 
			return "usuario/naoPermitido";
	}
	
	public String logout() {
		
		return "usuario/logout";
	}
	
}
