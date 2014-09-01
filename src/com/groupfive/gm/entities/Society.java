package com.groupfive.gm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="Society")

public class Society {
	
	public Integer getSocietyId() {
		return societyId;
	}

	public void setSocietyId(Integer societyId) {
		this.societyId = societyId;
	}

	public String getSocietyName() {
		return societyName;
	}

	public void setSocietyName(String societyName) {
		this.societyName = societyName;
	}

	public String getSocieryAddr() {
		return socieryAddr;
	}

	public void setSocieryAddr(String socieryAddr) {
		this.socieryAddr = socieryAddr;
	}

	public String getSocietyCity() {
		return societyCity;
	}

	public void setSocietyCity(String societyCity) {
		this.societyCity = societyCity;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="societyId")
	private Integer societyId;
	
	@Column(name="societyName")
	private String societyName;
	
	@Column(name="societyAddr")
	private String socieryAddr;
	
	@Column(name="societyCity")
	private String societyCity;
	
}
