package com.ufc.br.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ufc.br.model.Advertisement;
import com.ufc.br.service.AdvertisementService;

@Controller
public class MainController {
	
	@Autowired
	private AdvertisementService advertisementService;
	
	@RequestMapping("/olamundo")
	public String olaMundo() {
		return "OlaMundo";
	}
	
	
	@RequestMapping("/")
	public String home1(){
		return "Main";
	}
	
	@RequestMapping("/cadastro")
	public String cadastro() {
		return "Cadastro";
	}
	
	@RequestMapping("/main")
	public ModelAndView feedhome(){
		List<Advertisement> anuncios = advertisementService.listAllAds();
			ModelAndView modelv = new ModelAndView( "Main" );
			modelv.addObject("listOfAds", anuncios);
		return modelv;
	}
	
	@RequestMapping("/eletrodomesticos")
	public ModelAndView feedClass01(){
		List<Advertisement> anuncios = advertisementService.listAllEletrodomesticos();
			ModelAndView modelv = new ModelAndView( "eletrodomesticos" ); 
			modelv.addObject("listOfClass01Ads", anuncios);
		return modelv;
	}
	
	@RequestMapping("/eletroeletronicos")
	public ModelAndView feedClass02(){
		List<Advertisement> anuncios = advertisementService.listAllEletroeletronicos();
			ModelAndView modelv = new ModelAndView( "eletroeletronicos" ); 
			modelv.addObject("listOfClass02Ads", anuncios);
		return modelv;
	}
	
	@RequestMapping("/empregos")
	public ModelAndView feedClass03(){
		List<Advertisement> anuncios = advertisementService.listAllEmpregos();
			ModelAndView modelv = new ModelAndView( "empregos" ); 
			modelv.addObject("listOfClass03Ads", anuncios);
		return modelv;
	}
	
	@RequestMapping("/imoveis")
	public ModelAndView feedClass04(){
		List<Advertisement> anuncios = advertisementService.listAllImoveis();
			ModelAndView modelv = new ModelAndView( "imoveis" ); 
			modelv.addObject("listOfClass04Ads", anuncios);
		return modelv;
	}
	
	@RequestMapping("/informatica")
	public ModelAndView feedClass05(){
		List<Advertisement> anuncios = advertisementService.listAllInformatica();
			ModelAndView modelv = new ModelAndView( "informatica" ); 
			modelv.addObject("listOfClass05Ads", anuncios);
		return modelv;
	}
	
	@RequestMapping("/servicos")
	public ModelAndView feedClass06(){
		List<Advertisement> anuncios = advertisementService.listAllServicos();
			ModelAndView modelv = new ModelAndView( "servicos" ); 
			modelv.addObject("listOfClass06Ads", anuncios);
		return modelv;
	}
	
	@RequestMapping("/veiculos")
	public ModelAndView feedClass07(){
		List<Advertisement> anuncios = advertisementService.listAllVeiculos();
			ModelAndView modelv = new ModelAndView( "veiculos" ); 
			modelv.addObject("listOfClass07Ads", anuncios);
		return modelv;
	}
	
	
}
