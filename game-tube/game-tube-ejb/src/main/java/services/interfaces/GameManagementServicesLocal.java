package services.interfaces;

import javax.ejb.Local;

import domain.Player;

@Local
public interface GameManagementServicesLocal {
	String sayAhla(String name);

	Boolean addPlayer(Player player);

}
