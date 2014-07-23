/**
 * 
 */
package org.mahder.hibernatestudy.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author alemayehu
 *
 */
@Entity
@Table(name="CELL_PHONE")
public class CellPhone {
	@Id
	@Column(name="CELLPHONE_ID")
	@GeneratedValue
	private int cellPhoneId;
	
	@Column(name="CELLPHONE_NUMBER")
	private String cellPhoneNumber;
	
	@ManyToOne
	private UserDetails userDetail;

	public CellPhone() {
		
	}

	public int getCellPhoneId() {
		return cellPhoneId;
	}

	public void setCellPhoneId(int cellPhoneId) {
		this.cellPhoneId = cellPhoneId;
	}

	public String getCellPhoneNumber() {
		return cellPhoneNumber;
	}

	public void setCellPhoneNumber(String cellPhoneNumber) {
		this.cellPhoneNumber = cellPhoneNumber;
	}

	public UserDetails getUserDetail() {
		return userDetail;
	}

	public void setUserDetail(UserDetails userDetail) {
		this.userDetail = userDetail;
	}
	
	

}// end class
