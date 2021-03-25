package com.ufc.br.controllers;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ufc.br.model.Eletrodomesticos;
import com.ufc.br.model.Eletroeletronicos;
import com.ufc.br.model.Empregos;
import com.ufc.br.model.Imoveis;
import com.ufc.br.model.Informatica;
import com.ufc.br.model.Servicos;
import com.ufc.br.model.Veiculos;

@Controller
public class AdvertisementController {

	@RequestMapping("/cadastro")
	public String cadastro() {
		return "Cadastro";
	}

//	@RequestMapping("/sucesso")
//	public String sucesso() {
//		return "CadastradoSucesso";
//	}

//---Início Cadastro de anúncios da Class01:Eletrodomésticos	
	@RequestMapping("/cadastro/class01")
	public String formEletrodomesticoAd() {
		return "cadastroClass01";
	}

	@RequestMapping("/cadastro/submitEletrodomesticoAd")
	public String submitEletrodomesticoAd(Eletrodomesticos anuncio) {
		anuncio.setAdBirthdate(java.time.LocalDateTime.now());
		anuncio.setAdActiveStatus(true);

		System.out.println("AdvertisementController output -Anúncio- Id: " + anuncio.getAdNumber() + " _ " + "Categoria: " + anuncio.getAdCategory() + " _ "
				+ "Descrição: " + anuncio.getAdPresentation() + " _ " + "Telefone: " + anuncio.getAdContactPhone()
				+ " _ " + "ReleaseDate: " + anuncio.getAdBirthdate() + " _ " + "Valor: " + anuncio.getAdPrice() + " _ "
				+ "Status: " + anuncio.isAdActiveStatus());

		return "CadastradoSucesso";

	}
//---Fim Cadastro de anúncios da Class01:Eletrodomésticos	

//---Início Cadastro de anúncios da Class02:Eletroeletronicos
	@RequestMapping("/cadastro/class02")
	public String formEletroeletronicoAd(Eletroeletronicos anuncio) {
		return "cadastroClass02";
	}

	@RequestMapping("/cadastro/submitEletroeletronicoAd")
	public String submitEletroeletronicoAd(Eletroeletronicos anuncio) {
		anuncio.setAdBirthdate(java.time.LocalDateTime.now());
		anuncio.setAdActiveStatus(true);

		System.out.println("AdvertisementController output -Anúncio- Id: " + anuncio.getAdNumber() + " _ " + "Categoria: " + anuncio.getAdCategory() + " _ "
				+ "Descrição: " + anuncio.getAdPresentation() + " _ " + "Telefone: " + anuncio.getAdContactPhone()
				+ " _ " + "ReleaseDate: " + anuncio.getAdBirthdate() + " _ " + "Valor: " + anuncio.getAdPrice() + " _ "
				+ "Status: " + anuncio.isAdActiveStatus());

		return "CadastradoSucesso";
	}
//---Fim Cadastro de anúncios da Class02:Eletroeletronicos

//	@RequestMapping("/cadastro/submitEmpregoAd")
//	public String submitEmpregoAd( Empregos anuncio ) {
//		return "Main";
//	}
//	@RequestMapping("/cadastro/submitImovelAd")
//	public String submitImovelAd( Imoveis anuncio ) {
//		return "Main";
//	}
//	@RequestMapping("/cadastro/submitInformaticaAd")
//	public String submitInformaticaAd( Informatica anuncio ) {
//		return "Main";
//	}
//	@RequestMapping("/cadastro/submitServicoAd")
//	public String submitServicoAd( Servicos anuncio ) {
//		return "Main";
//	}
//	@RequestMapping("/cadastro/submitVeiculoAd")
//	public String submitVeiculoAd( Veiculos anuncio ) {
//		return "Main";
//	}

}
