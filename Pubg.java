package com.hibernate.jpa1.HIBERNATE_JPA_1;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pubg {
	
	@Id
	private int pId;
	private String pName;
	private int pTime;
	
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getpTime() {
		return pTime;
	}
	public void setpTime(int pTime) {
		this.pTime = pTime;
	}
	@Override
	public String toString() {
		return "Pubg [pId=" + pId + ", pName=" + pName + ", pTime=" + pTime + "]";
	}
	
	

}
