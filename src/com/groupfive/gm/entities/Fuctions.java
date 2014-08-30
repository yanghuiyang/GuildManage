package com.groupfive.gm.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@SuppressWarnings("serial")
@Entity
@Table(name="sysFunction")
public class Fuctions implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="funId")
	private Integer funId;//功能ID
	
	@Column(name="funName")
	private String funName;//功能名称
	
	@Column(name="funUrl")
	private String funUrl;//功能地址
	
	@Column(name="funPid")
	private Integer funPid;//功能父ID

	public Integer getFunId() {
		return funId;
	}

	public void setFunId(Integer funId) {
		this.funId = funId;
	}

	public String getFunName() {
		return funName;
	}

	public void setFunName(String funName) {
		this.funName = funName;
	}

	public String getFunUrl() {
		return funUrl;
	}

	public void setFunUrl(String funUrl) {
		this.funUrl = funUrl;
	}

	public Integer getFunPid() {
		return funPid;
	}

	public void setFunPid(Integer funPid) {
		this.funPid = funPid;
	}
}
