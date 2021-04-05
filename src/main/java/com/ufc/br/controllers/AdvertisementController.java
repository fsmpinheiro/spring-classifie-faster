package com.ufc.br.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.ufc.br.model.Eletrodomesticos;
import com.ufc.br.model.Eletroeletronicos;
import com.ufc.br.model.Empregos;
import com.ufc.br.model.Imoveis;
import com.ufc.br.model.Informatica;
import com.ufc.br.model.Servicos;
import com.ufc.br.model.Veiculos;
import com.ufc.br.service.AdvertisementService;

@Controller
@RequestMapping("/cadastro")
public class AdvertisementController {
	
	@Autowired
	private AdvertisementService advertisementService;

	
			//---Início Cadastro de anúncios da Class01:Eletrodomésticos	
	@RequestMapping("/class01")
	public String formEletrodomesticoAd() {
		return "cadastroClass01";
	}

	@RequestMapping("/submitEletrodomesticoAd")
	public String submitEletrodomesticoAd(Eletrodomesticos anuncio) {

		System.out.println("AdvertisementController output -Anúncio- Id: " + anuncio.getAdNumber() + " _ " + "Categoria: " + anuncio.getAdCategory() + " _ " + "Descrição: " + anuncio.getAdPresentation() + " _ " + "Telefone: " + anuncio.getAdContactPhone() + " _ " + "ReleaseDate: " + anuncio.getAdBirthdate() + " _ " + "Valor: " + anuncio.getAdPrice() + " _ " + "Status: " + anuncio.isAdActiveStatus());

		advertisementService.EletrodomesticoAdSubmit(anuncio);
		return "CadastradoSucesso";

	}
			//---Fim Cadastro de anúncios da Class01:Eletrodomésticos	

			//---Início Cadastro de anúncios da Class02:Eletroeletronicos
	@RequestMapping("/class02")
	public String formEletroeletronicoAd(Eletroeletronicos anuncio) {
		return "cadastroClass02";
	}

	@RequestMapping("/submitEletroeletronicoAd")
	public String submitEletroeletronicoAd(Eletroeletronicos anuncio) {

		System.out.println("AdvertisementController output -Anúncio- Id: " + anuncio.getAdNumber() + " _ " + "Categoria: " + anuncio.getAdCategory() + " _ " + "Descrição: " + anuncio.getAdPresentation() + " _ " + "Telefone: " + anuncio.getAdContactPhone() + " _ " + "ReleaseDate: " + anuncio.getAdBirthdate() + " _ " + "Valor: " + anuncio.getAdPrice() + " _ " + "Status: " + anuncio.isAdActiveStatus());

		advertisementService.EletroeletronicoAdSubmit(anuncio);
		return "CadastradoSucesso";
	}
			//---Fim Cadastro de anúncios da Class02:Eletroeletronicos

			//---Início Cadastro de anúncios da Class03:Empregos	
	@RequestMapping("/class03")
	public String formEmpregoAd( Empregos anuncio ) {
		return "cadastroClass03";
	}
	
	@RequestMapping("/submitEmpregoAd")
	public String submitEmpregoAd( Empregos anuncio ) {
		
		advertisementService.EmpregosAdSubmit(anuncio);
		return "CadastradoSucesso";
	}
			//---Fim Cadastro de anúncios da Class03:Empregos
				
			//---Início Cadastro de anúncios da Class04:Imoveis
	@RequestMapping("/class04")
	public String formImovelAd( Imoveis anuncio ) {
		return "cadastroClass04";
	}
	
	@RequestMapping("/submitImovelAd")
	public String submitImovelAd( Imoveis anuncio ) {
		
		advertisementService.ImoveisAdSubmit( anuncio );
		return "CadastradoSucesso";
	}
			//---Fim Cadastro de anúncios da Class04:Imoveis	
			
			//---Início Cadastro de anúncios da Class05:Informática	
	@RequestMapping("/class05")
	public String formInformaticaAd( Informatica anuncio ) {
		return "cadastroClass05";
	}
	
	@RequestMapping("/submitInformaticaAd")
	public String submitInformaticaAd( Informatica anuncio ) {
		
		advertisementService.InformaticaAdSubmit( anuncio );
		return "CadastradoSucesso";
	}
			//---Fim Cadastro de anúncios da Class05:Informática	
			
			//---Início Cadastro de anúncios da Class06: Servicos
	@RequestMapping("/class06")
	public String formServicoAd( Servicos anuncio ) {
		return "cadastroClass06";
	}
	
	@RequestMapping("/submitServicoAd")
	public String submitServicoAd( Servicos anuncio ) {
		
		advertisementService.ServicosAdSubmit( anuncio );
		return "CadastradoSucesso";
	}
			//---Fim Cadastro de anúncios da Class06: Servicos
				
			//---Início Cadastro de anúncios da Class07: Veiculos
	@RequestMapping("/class07")
	public String formVeiculoAd( Veiculos anuncio ) {
		return "cadastroClass07";
	}
	
	@RequestMapping("/submitVeiculoAd")
	public String submitVeiculoAd( Veiculos anuncio ) {
		
		advertisementService.VeiculosAdSubmit( anuncio );
		return "CadastradoSucesso";
	}
			//---Fim Cadastro de anúncios da Class07: Veiculos
	
	

	
}
