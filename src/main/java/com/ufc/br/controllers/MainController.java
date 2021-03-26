package com.ufc.br.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("/olamundo")
	public String olaMundo() {
		return "OlaMundo";
	}
	
	
	@RequestMapping("/")
	public String home1(){
		return "Main";
	}
	
	@RequestMapping("/main")
	public String home2(){
		return "Main";
	}
	
	@RequestMapping("/cadastro")
	public String cadastro() {
		return "Cadastro";
	}
	
}
