package com.hibernate.jpa.HIBERNATE_JPA;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movie {
	
	@Id
	private int mId;
	private String mName;
	private int mPrice;
	public int getmId() {
		return mId;
	}
	public void setmId(int mId) {
		this.mId = mId;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public int getmPrice() {
		return mPrice;
	}
	public void setmPrice(int mPrice) {
		this.mPrice = mPrice;
	}
	@Override
	public String toString() {
		return "Movie [mId=" + mId + ", mName=" + mName + ", mPrice=" + mPrice + "]";
	}

}
