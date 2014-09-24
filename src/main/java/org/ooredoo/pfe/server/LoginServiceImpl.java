package org.ooredoo.pfe.server;



import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.ooredoo.pfe.client.services.LoginService;
import org.ooredoo.pfe.server.persistence.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gwt.user.client.rpc.RemoteService;

//@Service("loginService")
public class LoginServiceImpl implements LoginService{

//	@Autowired
//    private UserDao dao;
    @PostConstruct
    public void init() throws Exception { 
    	
    }
	@PreDestroy
    public void destroy() { 
		
	}
	public String authenticateUser(String login, String password)
			throws IllegalArgumentException {
		String chaine;
//		try {
//			chaine = dao.findById(login).getPassword();
//		} catch (Exception e) {
//			// TODO: handle exception
//			return e.toString();
//		}
		
		//return "Hello from server " + login + " " + password;
		return password;
	}

}
