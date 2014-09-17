package org.ooredoo.pfe.server.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.ooredoo.pfe.client.AdminUser;

@Entity
@Table(name = "user")
public class UserEntity {

	@Id
	@Column(name="login")
	private String login;
	
	@Column(name="password")
	private String password;
	
	public UserEntity() {
		// TODO Auto-generated constructor stub
	}

	public UserEntity(AdminUser e) {
		// TODO Auto-generated constructor stub
		
		this.login = e.getLogin();
		this.password = e.getPassword();
	}
	
	public AdminUser toGwtObject(){
		AdminUser e = new AdminUser();
		
		e.setLogin(login);
		e.setPassword(password);
		
		return e;
	}
	
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
}
