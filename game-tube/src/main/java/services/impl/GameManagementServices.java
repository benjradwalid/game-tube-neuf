package services.impl;

import javax.ejb.Stateless;

import services.interfaces.GameManagementServicesLocal;
import services.interfaces.GameManagementServicesRemote;

/**
 * Session Bean implementation class GameManagementServices
 */
@Stateless
public class GameManagementServices implements GameManagementServicesRemote,
		GameManagementServicesLocal {

	/**
	 * Default constructor.
	 */
	public GameManagementServices() {
	}

	@Override
	public String sayAhla(String name) {
		return "Good morning: " + name;
	}

}
