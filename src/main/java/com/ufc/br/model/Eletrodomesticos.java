package com.ufc.br.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue( value = "Eletrodomesticos")
public class Eletrodomesticos extends Advertisement{
	
	public String adPrice;
	public byte[] picture1;
	public byte[] picture2;
	public byte[] picture3;
	public byte[] picture4;
	
	public String getAdPrice() {
		return adPrice;
	}
	public void setAdPrice(String adPrice) {
		this.adPrice = adPrice;
	}
	public byte[] getPicture1() {
		return picture1;
	}
	public void setPicture1(byte[] picture1) {
		this.picture1 = picture1;
	}
	public byte[] getPicture2() {
		return picture2;
	}
	public void setPicture2(byte[] picture2) {
		this.picture2 = picture2;
	}
	public byte[] getPicture3() {
		return picture3;
	}
	public void setPicture3(byte[] picture3) {
		this.picture3 = picture3;
	}
	public byte[] getPicture4() {
		return picture4;
	}
	public void setPicture4(byte[] picture4) {
		this.picture4 = picture4;
	}
	
}
