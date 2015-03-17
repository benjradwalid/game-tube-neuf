package mBeans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

import services.interfaces.GameManagementServicesLocal;
import domain.Player;

@ManagedBean
@RequestScoped
public class PlayerManagementBean {

	// models
	private Player player = new Player();
	// injection of the proxy
	@EJB
	private GameManagementServicesLocal gameManagementServicesLocal;

	public String doAddPlayer() {
		gameManagementServicesLocal.addPlayer(player);
		return "";
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

}
