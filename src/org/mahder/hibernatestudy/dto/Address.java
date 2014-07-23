/**
 * 
 */
package org.mahder.hibernatestudy.dto;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;

/**
 * @author alemayehu
 *
 */
@Embeddable
public class Address {
	@Column(name="STREET")
	private String street;
	
	@Column(name="CITY")
	private String city;
	
	@Column(name="ZIP_CODE")
	private int zipCode;
	
	@Column(name="STATE")
	private String state;

	public Address() {
		super();
	}

	public Address(String street, String city, int zipCode, String state) {
		super();
		this.street = street;
		this.city = city;
		this.zipCode = zipCode;
		this.state = state;
	}
	
	

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

}// end class
