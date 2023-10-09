package edu.ifam.dra.chatfront.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import edu.ifam.dra.chatfront.service.ContatoFrontService;

@Controller
public class ContatoFrontController {
	
	@Autowired
	ContatoFrontService contatoFrontService;

	@GetMapping("/mostrarContatos")
	public String mostraContatos(Model model) {
		
		model.addAttribute("contatos", contatoFrontService.getContatos());
		return "listaContatos";
		
	}
}
