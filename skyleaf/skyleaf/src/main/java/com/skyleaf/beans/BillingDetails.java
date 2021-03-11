package com.skyleaf.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BillingDetails {
	@Id
	private String street;
	private String street2;
	private String city;
	private String country;
	private String zip;
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getStreet2() {
		return street2;
	}
	public void setStreet2(String street2) {
		this.street2 = street2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	@Override
	public String toString() {
		return "BillingDetails [street=" + street + ", street2=" + street2 + ", city=" + city + ", country=" + country
				+ ", zip=" + zip + "]";
	}

	
}
