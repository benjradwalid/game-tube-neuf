package mBeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import domain.User;

@ManagedBean
@SessionScoped
public class LoginBean {
	private User user = new User();

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
