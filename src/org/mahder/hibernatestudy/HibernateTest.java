/**
 * 
 */
package org.mahder.hibernatestudy;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.mahder.hibernatestudy.dto.Address;
import org.mahder.hibernatestudy.dto.CellPhone;
import org.mahder.hibernatestudy.dto.UserDetails;
import org.mahder.hibernatestudy.dto.Vehicle;

/**
 * @author alemayehu
 *
 */
public class HibernateTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		UserDetails user = new UserDetails();
		//create address object
		Address address = new Address("7314 Powhatan St", "Lanham", 20708, "MD");
		//now create a Vehicle object here...
		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleName("Toyota DX");
		
		CellPhone cell1 = new CellPhone();
		cell1.setCellPhoneNumber("0936962715");
		CellPhone cell2 = new CellPhone();
		cell2.setCellPhoneNumber("2023743138");
		
		
		user.setUserName("Yefikir");
		user.setAddress(address);
		user.setJoinedDate(new Date());
		user.setDescription("This is the description of the user object");
		user.setVehicle(vehicle);
		user.getCellPhoneCollection().add(cell1);
		user.getCellPhoneCollection().add(cell2);
		cell1.setUserDetail(user);
		cell2.setUserDetail(user);
		
		//I need to save this object to the database...
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.save(vehicle);
		session.save(cell1);
		session.save(cell2);
		session.getTransaction().commit();//ends transaction...
		session.close();//probably should be in a finally close...
		
		//now we need to open a new session and fetch objects read from the database.
		user = null;
		session = sessionFactory.openSession();
		session.beginTransaction();
		user = (UserDetails) session.get(UserDetails.class, 1);
		System.out.println(user.getUserName());
	}

}//end class
