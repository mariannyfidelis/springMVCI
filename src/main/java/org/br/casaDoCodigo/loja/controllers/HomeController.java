package org.br.casaDoCodigo.loja.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public void index() {
	
		System.out.println("Controller recebendo requisições ....");
		
	}
}
