/**
 * 
 */
package org.mahder.hibernatestudy;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.mahder.hibernatestudy.dto.UserDetails;

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
		user.setUserId(1);
		user.setUserName("Yefikir");
		user.setAddress("7314 Powhatan st");
		user.setJoinedDate(new Date());
		user.setDescription("This is the description of the user object");
		
		//I need to save this object to the database...
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();//ends transaction...
	}

}//end class
