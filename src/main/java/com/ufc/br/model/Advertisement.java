package com.ufc.br.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance( strategy = InheritanceType.SINGLE_TABLE )
@DiscriminatorColumn (name = "Category", discriminatorType = DiscriminatorType.STRING )
@DiscriminatorValue("Advertisement")
public class Advertisement {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long adNumber;
	private String adName;
	
	@Column(insertable = true , updatable = true)
	private String adCategory;
	private String adPresentation;
	private String adContactPhone;
	private LocalDateTime adBirthdate;
	private boolean adActiveStatus;
	
	
	public Long getAdNumber() {
		return adNumber;
	}
	public void setAdNumber(Long adNumber) {
		this.adNumber = adNumber;
	}
	public String getAdName() {
		return adName;
	}
	public void setAdName(String adName) {
		this.adName = adName;
	}
	public String getAdCategory() {
		return adCategory;
	}
	public void setAdCategory(String adCategory) {
		this.adCategory = adCategory;
	}
	public String getAdPresentation() {
		return adPresentation;
	}
	public void setAdPresentation(String adPresentation) {
		this.adPresentation = adPresentation;
	}
	public String getAdContactPhone() {
		return adContactPhone;
	}
	public void setAdContactPhone(String adContactPhone) {
		this.adContactPhone = adContactPhone;
	}
	public LocalDateTime getAdBirthdate() {
		return adBirthdate;
	}
	public void setAdBirthdate(LocalDateTime adBirthdate) {
		this.adBirthdate = adBirthdate;
	}
	public boolean isAdActiveStatus() {
		return adActiveStatus;
	}
	public void setAdActiveStatus(boolean adActiveStatus) {
		this.adActiveStatus = adActiveStatus;
	}
	
}
