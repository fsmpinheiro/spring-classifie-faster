package com.ufc.br.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue( value = "Empregos")
public class Empregos extends Advertisement{
	
	public String adPaymant;

	public String getAdPaymant() {
		return adPaymant;
	}

	public void setAdPaymant(String adPaymant) {
		this.adPaymant = adPaymant;
	}

}
