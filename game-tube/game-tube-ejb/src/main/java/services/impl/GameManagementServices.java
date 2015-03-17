package services.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import services.interfaces.GameManagementServicesLocal;
import services.interfaces.GameManagementServicesRemote;
import domain.Pass;
import domain.Player;
import domain.User;

/**
 * Session Bean implementation class GameManagementServices
 */
@Stateless
public class GameManagementServices implements GameManagementServicesRemote,
		GameManagementServicesLocal {
	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public GameManagementServices() {
	}

	@Override
	public String sayAhla(String name) {
		return "Good morning: " + name;
	}

	@Override
	public List<Pass> findAllPasses() {

		return entityManager.createQuery("select p from Pass p", Pass.class)
				.getResultList();

	}

	@Override
	public Boolean purchasePass(Integer idUser, Pass pass) {
		Boolean b = false;
		try {
			Player playerFounded = (Player) findUserById(idUser);
			if (playerFounded.getBalance() > pass.getPrice()) {
				playerFounded.setPass(pass);
				playerFounded.setBalance(playerFounded.getBalance()
						- pass.getPrice());
				entityManager.merge(playerFounded);
				b = true;
			} else {
				System.out.println("not enough money ...");
			}
		} catch (Exception e) {
			System.out.println("player not founded");
		}
		return b;
	}

	@Override
	public User findUserById(Integer idUser) {

		return entityManager.find(User.class, idUser);
	}

}
