package org.prjct.rest.messenger;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.prjct.hibernates.dao.UserDAO;
import org.prjct.hibernates.entity.User;


@Path("/userdetails")
public class UserController {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public User searchUser(@QueryParam("userName") String userName,
								@QueryParam("lastName") String lastName){
		User userObj=new User();
		userObj.setUserName(userName);
		userObj.setLastName(lastName);
		UserDAO userDao=new UserDAO();
		User resultUser=userDao.searchUser(userObj);
		return (resultUser);
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public String addUser( User userDtls){
		UserDAO userDao=new UserDAO();
		userDao.saveOrUpdateUser(userDtls);
		return ("{\"status\":\"Successssss\"}");
	}
}
