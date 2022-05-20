package com.expressanalytics.data;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Data {
	@Id
	private String code;
	private String codeHRIS;
	private String name;
	private String abbrName;
	private String regNo;
	private String logo;
	private Timestamp activeDate;
	private boolean isActive;
	private Timestamp createdOn;
	private String createdBy;
	private Timestamp lastModifiedOn;
	private String lastModifiedBy;
	private String deactivatedBy;
	private Timestamp deactivatedOn;
	private String reactivatedBy;
	private Timestamp reactivatedOn;
	
	public Data() {
		
	}
	
	public Data(String code, String codeHRIS, String name, String abbrName, String regNo, String logo,
			Timestamp activeDate, boolean isActive, Timestamp createdOn, String createdBy, Timestamp lastModifiedOn,
			String lastModifiedBy, String deactivatedBy, Timestamp deactivatedOn, String reactivatedBy,
			Timestamp reactivatedOn) {
		super();
		this.code = code;
		this.codeHRIS = codeHRIS;
		this.name = name;
		this.abbrName = abbrName;
		this.regNo = regNo;
		this.logo = logo;
		this.activeDate = activeDate;
		this.isActive = isActive;
		this.createdOn = createdOn;
		this.createdBy = createdBy;
		this.lastModifiedOn = lastModifiedOn;
		this.lastModifiedBy = lastModifiedBy;
		this.deactivatedBy = deactivatedBy;
		this.deactivatedOn = deactivatedOn;
		this.reactivatedBy = reactivatedBy;
		this.reactivatedOn = reactivatedOn;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCodeHRIS() {
		return codeHRIS;
	}

	public void setCodeHRIS(String codeHRIS) {
		this.codeHRIS = codeHRIS;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAbbrName() {
		return abbrName;
	}

	public void setAbbrName(String abbrName) {
		this.abbrName = abbrName;
	}

	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public Timestamp getActiveDate() {
		return activeDate;
	}

	public void setActiveDate(Timestamp activeDate) {
		this.activeDate = activeDate;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public Timestamp getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Timestamp getLastModifiedOn() {
		return lastModifiedOn;
	}

	public void setLastModifiedOn(Timestamp lastModifiedOn) {
		this.lastModifiedOn = lastModifiedOn;
	}

	public String getLastModifiedBy() {
		return lastModifiedBy;
	}

	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

	public String getDeactivatedBy() {
		return deactivatedBy;
	}

	public void setDeactivatedBy(String deactivatedBy) {
		this.deactivatedBy = deactivatedBy;
	}

	public Timestamp getDeactivatedOn() {
		return deactivatedOn;
	}

	public void setDeactivatedOn(Timestamp deactivatedOn) {
		this.deactivatedOn = deactivatedOn;
	}

	public String getReactivatedBy() {
		return reactivatedBy;
	}

	public void setReactivatedBy(String reactivatedBy) {
		this.reactivatedBy = reactivatedBy;
	}

	public Timestamp getReactivatedOn() {
		return reactivatedOn;
	}

	public void setReactivatedOn(Timestamp reactivatedOn) {
		this.reactivatedOn = reactivatedOn;
	}
}
