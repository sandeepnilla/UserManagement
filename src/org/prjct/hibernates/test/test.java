package org.prjct.hibernates.test;
 
import javax.ws.rs.core.MediaType;

import org.prjct.hibernates.dao.UserDAO;
import org.prjct.hibernates.entity.User;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
 
public class test{
     
	public static void main(String args[]){
		String name="{\"userName\":\"dsaf\",\"firstName\":\"asdf\"}";
		Client client=Client.create();
		WebResource resource =client.resource("http://localhost:8080/messenger/rest");
		resource=resource.path("/userdetails");
		String res= resource.type(MediaType.APPLICATION_JSON).post(String.class,name);
		System.out.println(res);
	}
	
   /* public static void main(String args[]){
         
        //1.Create the object of the Person class
        Person personObj = new Person();
         
        //2.Set the values which you want to save in the database
        personObj.setFirstName("Rahul");
        personObj.setLastName("Wagh");
         
        //3.Create the object of the DAO class which will insert our person object to TABLE
        PersonDAO personDAOObj = new PersonDAO();
        personDAOObj.saveOrUpdatePerson(personObj);
         
         
    }*/
}