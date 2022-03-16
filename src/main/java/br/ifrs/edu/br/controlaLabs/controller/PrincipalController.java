package br.ifrs.edu.br.controlaLabs.controller;


import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.ifrs.edu.br.controlaLabs.dto.AlertDTO;
import br.ifrs.edu.br.controlaLabs.model.UserDetailsImpl;
import br.ifrs.edu.br.controlaLabs.services.GerenciaInternetService;
import br.ifrs.edu.br.controlaLabs.dto.AcaoModeloDTO;

@Controller
@RequestMapping(value ={"/controlaLabs/internet-labs", "/internet-labs"})
public class PrincipalController {

	@GetMapping
	public String home(ModelMap model) {
		model.addAttribute("acao", new AcaoModeloDTO());
		return "home/home.html";
	}

	@PostMapping("/acao")
	public String acao(AcaoModeloDTO acao, RedirectAttributes attrs) {
		 

		GerenciaInternetService gerencia = new GerenciaInternetService();
		UserDetailsImpl user = (UserDetailsImpl) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String labDaOperacao = "";
		if (acao.getLab() == null) {
			labDaOperacao = user.getUsername();
			gerencia.realizaOperacao(acao.getAcao(), labDaOperacao);

		} else {
			labDaOperacao = acao.getLab();
			gerencia.realizaOperacao(acao.getAcao(), labDaOperacao);
		}
		attrs.addFlashAttribute("alert",
				new AlertDTO("Ação executada: " + acao.getAcao() + " no lab: "+labDaOperacao, "alert-success"));
		return "redirect:/internet-labs";

	}

	

}
