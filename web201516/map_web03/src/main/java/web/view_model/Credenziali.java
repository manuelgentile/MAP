package web.view_model;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@RequestScoped
@Named("credenziali")
public class Credenziali {
	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Credenziali [username=" + username + ", password=" + password + "]";
	}

}
