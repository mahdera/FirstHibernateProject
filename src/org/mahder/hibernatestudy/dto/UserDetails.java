/**
 * 
 */
package org.mahder.hibernatestudy.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author alemayehu
 *
 */
@Entity
public class UserDetails {
	@Id
	private int userId;
	
	private String userName;

	public UserDetails() {

	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}// end class
