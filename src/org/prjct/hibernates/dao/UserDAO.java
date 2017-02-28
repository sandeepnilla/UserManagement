package org.prjct.hibernates.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.prjct.hibernates.entity.User;
import org.prjct.hibernates.utility.HibernateUtil;
 
 /*
  * This file is for performing the required transactions on the database 
  * */
public class UserDAO {
     
    public String saveOrUpdateUser(User userObj){
    	Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		 
		//begin the transaction
		Transaction trans=session.beginTransaction();
		
    	try {
			 
			//Save the person in database
			session.persist(userObj);
			 
			//Commit the transaction ok
			trans.commit();
			session.close();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			trans.rollback();;
			e.printStackTrace();
			return "Unable to process Transaction";
		}
        return "User created Successfully";
    }
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public User searchUser(User userObj){
    	  Session session = HibernateUtil.getSessionFactory().getCurrentSession();
    	  session.beginTransaction();
          Criteria cr = session.createCriteria(User.class);
          User userDtls = null;
    	try{
    	  cr.add(Restrictions.eq("lastName", userObj.getLastName()));
          List users = cr.list();
          for (Iterator iterator = 
        		  users.iterator(); iterator.hasNext();){
			   userDtls = (User) iterator.next(); 
          }
          session.getTransaction().commit();
          session.close();
          
    	}
    	 catch (Exception e) {
    		  session.getTransaction().rollback();
    		 session.close();
    	        e.printStackTrace();
    	    }
    	return userDtls;
    }
    
    public void deleteUser(User userObj){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
         
        //begin the transaction
        Transaction trans=session.beginTransaction();
         
        //Save the person in database
        session.delete(userObj);
         
        //Commit the transaction
        trans.commit();
        session.close();
    }
 
}