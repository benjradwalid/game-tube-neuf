package mBeans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import services.interfaces.GameManagementServicesLocal;

@ManagedBean
@RequestScoped
public class GameManagementBean {
	
	@EJB
	private GameManagementServicesLocal gameManagementServicesLocal;
	@ManagedProperty(value = "#{lb}")
	private LoginBean loginBean;
	
	public LoginBean getLoginBean() {
		return loginBean;
	}

	public void setLoginBean(LoginBean loginBean) {
		this.loginBean = loginBean;
	}

}
