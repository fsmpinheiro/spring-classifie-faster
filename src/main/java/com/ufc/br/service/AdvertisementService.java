package com.ufc.br.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ufc.br.model.Advertisement;
import com.ufc.br.model.Eletrodomesticos;
import com.ufc.br.model.Eletroeletronicos;
import com.ufc.br.model.Empregos;
import com.ufc.br.model.Imoveis;
import com.ufc.br.model.Informatica;
import com.ufc.br.model.Servicos;
import com.ufc.br.model.Veiculos;
import com.ufc.br.repository.AdvertisementRepository;

@Service
public class AdvertisementService {
	
	@Autowired
	private AdvertisementRepository advertisementRepository;

	public void cadastrar (Advertisement anuncio){
		
		advertisementRepository.save(anuncio);
	}
	
	public void EletrodomesticoAdSubmit (Eletrodomesticos anuncio) {
		anuncio.setAdCategory( "Eletrodomésticos" );
		anuncio.setAdBirthdate(java.time.LocalDateTime.now());
		anuncio.setAdActiveStatus(true);
		
		System.out.println("AdvertisementService output -Anúncio- Id: " + anuncio.getAdNumber() + " _ " + "Categoria: " + anuncio.getAdCategory() + " _ " + "Descrição: " + anuncio.getAdPresentation() + " _ " + "Telefone: " + anuncio.getAdContactPhone() + " _ " + "ReleaseDate: " + anuncio.getAdBirthdate() + " _ " + "Valor: " + anuncio.getAdPrice() + " _ " + "Status: " + anuncio.isAdActiveStatus());
		advertisementRepository.save(anuncio);
	}
	
	public void EletroeletronicoAdSubmit (Eletroeletronicos anuncio) {
		anuncio.setAdCategory( "Eletroeletrônicos" );
		anuncio.setAdBirthdate(java.time.LocalDateTime.now());
		anuncio.setAdActiveStatus(true);
		
		System.out.println("AdvertisementService output -Anúncio- Id: " + anuncio.getAdNumber() + " _ " + "Categoria: " + anuncio.getAdCategory() + " _ " + "Descrição: " + anuncio.getAdPresentation() + " _ " + "Telefone: " + anuncio.getAdContactPhone() + " _ " + "ReleaseDate: " + anuncio.getAdBirthdate() + " _ " + "Valor: " + anuncio.getAdPrice() + " _ " + "Status: " + anuncio.isAdActiveStatus());
		advertisementRepository.save(anuncio);
	}
	
	public void EmpregosAdSubmit (Empregos anuncio) {
		anuncio.setAdCategory( "Empregos" );
		anuncio.setAdBirthdate(java.time.LocalDateTime.now());
		anuncio.setAdActiveStatus(true);
		
		System.out.println("AdvertisementService output -Anúncio- Id: " + anuncio.getAdNumber() + " _ " + "Categoria: " + anuncio.getAdCategory() + " _ " + "Descrição: " + anuncio.getAdPresentation() + " _ " + "Telefone: " + anuncio.getAdContactPhone() + " _ " + "ReleaseDate: " + anuncio.getAdBirthdate() + " _ " + "Salário: " + anuncio.getAdPaymant() + " _ " + "Status: " + anuncio.isAdActiveStatus());
		advertisementRepository.save(anuncio);
	}
	
	public void ImoveisAdSubmit ( Imoveis anuncio ) {
		anuncio.setAdCategory( "Imóveis" );
		anuncio.setAdBirthdate(java.time.LocalDateTime.now());
		anuncio.setAdActiveStatus(true);
		
		System.out.println("AdvertisementService output -Anúncio- Id: " + anuncio.getAdNumber() + " _ " + "Categoria: " + anuncio.getAdCategory() + " _ " + "Descrição: " + anuncio.getAdPresentation() + " _ " + "Bairro: " + anuncio.getAdDistrict( ) + " _ " + "Telefone: " + anuncio.getAdContactPhone() + " _ " + "ReleaseDate: " + anuncio.getAdBirthdate() + " _ " + "Salário: " + anuncio.getAdPrice() + " _ " + "Status: " + anuncio.isAdActiveStatus());
		advertisementRepository.save(anuncio);
	}
	
	public void InformaticaAdSubmit ( Informatica anuncio ) {
		anuncio.setAdCategory( "Informática" );
		anuncio.setAdBirthdate(java.time.LocalDateTime.now());
		anuncio.setAdActiveStatus(true);
		
		System.out.println("AdvertisementService output -Anúncio- Id: " + anuncio.getAdNumber() + " _ " + "Categoria: " + anuncio.getAdCategory() + " _ " + "Descrição: " + anuncio.getAdPresentation() + " _ " + "Telefone: " + anuncio.getAdContactPhone() + " _ " + "ReleaseDate: " + anuncio.getAdBirthdate() + " _ " + "Salário: " + anuncio.getAdPrice() + " _ " + "Status: " + anuncio.isAdActiveStatus());
		advertisementRepository.save(anuncio);
	}
	
	public void ServicosAdSubmit (Servicos anuncio ) {
		anuncio.setAdCategory( "Serviços" );
		anuncio.setAdBirthdate(java.time.LocalDateTime.now());
		anuncio.setAdActiveStatus(true);
		
		System.out.println("AdvertisementService output -Anúncio- Id: " + anuncio.getAdNumber() + " _ " + "Categoria: " + anuncio.getAdCategory() + " _ " + "Descrição: " + anuncio.getAdPresentation() + " _ " + "Telefone: " + anuncio.getAdContactPhone() + " _ " + "ReleaseDate: " + anuncio.getAdBirthdate() + " _ " + "Salário: " + anuncio.getAdPrice() + " _ " + "Status: " + anuncio.isAdActiveStatus());
		advertisementRepository.save(anuncio);
	}
	
	public void VeiculosAdSubmit ( Veiculos anuncio ) {
		anuncio.setAdCategory( "Serviços" );
		anuncio.setAdBirthdate(java.time.LocalDateTime.now());
		anuncio.setAdActiveStatus(true);
		
		System.out.println("AdvertisementService output -Anúncio- Id: " + anuncio.getAdNumber() + " _ " + "Categoria: " + anuncio.getAdCategory() + " _ " + "Descrição: " + anuncio.getAdPresentation() + " _ " + "Montadora: " + anuncio.getAdBrand() + " _ "+ "Telefone: " + anuncio.getAdContactPhone() + " _ " + "ReleaseDate: " + anuncio.getAdBirthdate() + " _ " + "Salário: " + anuncio.getAdPrice() + " _ " + "Status: " + anuncio.isAdActiveStatus());
		advertisementRepository.save(anuncio);
	}

	public List<Advertisement> listAllAds() {
		return advertisementRepository.findAll();
	}

//	public List<Advertisement> listOfMostRecents() {
//		
//		
//		
//		return advertisementRepository.;
//	}
	
	
	
}
