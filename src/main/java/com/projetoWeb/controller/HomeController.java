package com.projetoWeb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	/**
	 * @RequestMapping tem a função de definir que aquele 
	 * metodo atende a um determinado path ou endereço
	 */
	@RequestMapping("/")
    public String index(){
        System.out.println("Entrando na home do projeto");
        return "home";
    }

}
