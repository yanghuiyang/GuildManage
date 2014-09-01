package com.groupfive.gm.entities;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="AdvancedPerson")

public class AdvancedPerson {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PersonId")
	private Integer personId;
	
	@Column(name="PersonName")
	private String personName;
	
	@Column(name="PerSex")
	private String perSex;
	
	@Column(name="BirthDay")
	private Date birthDay;
	
	@Column(name="PerGroup")//所属工会
	private String perGroup;
	
	@Column(name="PerEdu")
	private String perEdu;
	
	@Column(name="PerAddress")
	private String perAddress;
	
	@Column(name="PerDepartment")//个人单位
	private String perDepartment;
	
	@Column(name="PerHealth")
	private String perHealth;
	
	@Column(name="PerCity")
	private String perCity;
	
	@Column(name="PerTel")
	private String perTel;
	
	@Column(name="IfPS")//个人申报情况
	private String ifPs;
	
	@Column(name="PerCJ")//个人主要成就
	private String perCj;
	
	@Column(name="PerMT")//个人主要事迹
	private String perMt;
	
	@Column(name="Pertitle")//个人称号
	private String perTitle;
	
	@Column(name="PerJT")//个人评定时间
	private Date perJt;
	
	@Column(name="Pergiven")//给予单位
	private String perGiven;
	
	@Column(name="Nation")
	private String nation;
	
//	@ManyToOne(targetEntity=Society.class)  
//    @JoinColumn(name="societyId") 
//	
	
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}

	public Integer getPersonId() {
		return personId;
	}
	public void setPersonId(Integer personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getPerSex() {
		return perSex;
	}
	public void setPerSex(String perSex) {
		this.perSex = perSex;
	}
	public Date getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}
	public String getPerGroup() {
		return perGroup;
	}
	public void setPerGroup(String perGroup) {
		this.perGroup = perGroup;
	}
	public String getPerEdu() {
		return perEdu;
	}
	public void setPerEdu(String perEdu) {
		this.perEdu = perEdu;
	}
	public String getPerAddress() {
		return perAddress;
	}
	public void setPerAddress(String perAddress) {
		this.perAddress = perAddress;
	}
	public String getPerDepartment() {
		return perDepartment;
	}
	public void setPerDepartment(String perDepartment) {
		this.perDepartment = perDepartment;
	}
	public String getPerHealth() {
		return perHealth;
	}
	public void setPerHealth(String perHealth) {
		this.perHealth = perHealth;
	}
	public String getPerCity() {
		return perCity;
	}
	public void setPerCity(String perCity) {
		this.perCity = perCity;
	}
	public String getPerTel() {
		return perTel;
	}
	public void setPerTel(String perTel) {
		this.perTel = perTel;
	}
	public String getIfPs() {
		return ifPs;
	}
	public void setIfPs(String ifPs) {
		this.ifPs = ifPs;
	}
	public String getPerCj() {
		return perCj;
	}
	public void setPerCj(String perCj) {
		this.perCj = perCj;
	}
	public String getPerMt() {
		return perMt;
	}
	public void setPerMt(String perMt) {
		this.perMt = perMt;
	}
	public String getPerTitle() {
		return perTitle;
	}
	public void setPerTitle(String perTitle) {
		this.perTitle = perTitle;
	}
	public Date getPerJt() {
		return perJt;
	}
	public void setPerJt(Date perJt) {
		this.perJt = perJt;
	}
	public String getPerGiven() {
		return perGiven;
	}
	public void setPerGiven(String perGiven) {
		this.perGiven = perGiven;
	}


}
