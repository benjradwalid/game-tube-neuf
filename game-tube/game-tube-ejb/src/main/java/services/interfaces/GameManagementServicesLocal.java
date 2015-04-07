package services.interfaces;

import java.util.List;

import javax.ejb.Local;

import domain.Pass;
import domain.Player;
import domain.User;

@Local
public interface GameManagementServicesLocal {
	String sayAhla(String name);

	List<Pass> findAllPasses();

	Boolean purchasePass(Integer idUser, Pass pass);

	User findUserById(Integer idUser);

	Boolean addPlayer(Player player);
	
	List<Player> getPlayers();
	
	List<Integer> getThreeCards() ;

}
