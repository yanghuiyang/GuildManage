package com.groupfive.gm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="AdvancedPersonType")
public class AdvancedPersonType {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="apTypeId")
	private Integer apTypeId;
	
	@Column(name="APname")
	private String apName;
	
	@Column(name="APtreat")
	private String apTreat;

	public Integer getApTypeId() {
		return apTypeId;
	}

	public void setApTypeId(Integer apTypeId) {
		this.apTypeId = apTypeId;
	}

	public String getApName() {
		return apName;
	}

	public void setApName(String apName) {
		this.apName = apName;
	}

	public String getApTreat() {
		return apTreat;
	}

	public void setApTreat(String apTreat) {
		this.apTreat = apTreat;
	}
	
}
