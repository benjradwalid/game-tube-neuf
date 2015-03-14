package services.impl;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import domain.Pass;
import domain.Player;

/**
 * Session Bean implementation class DbCreator
 */
@Singleton
@Startup
public class DbCreator {
	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public DbCreator() {
		// TODO Auto-generated constructor stub
	}

	@PostConstruct
	public void initDb() {
		Player player = new Player("moez", "moez", "moez");
		Player player2 = new Player("bechir", "bechir", "bechir");
		Player player3 = new Player("feten", "feten", "feten");

		Pass pass = new Pass("bronze", 10F);
		Pass pass2 = new Pass("silver", 50F);
		Pass pass3 = new Pass("gold", 200F);

		entityManager.persist(player);
		entityManager.persist(player2);
		entityManager.persist(player3);

		entityManager.persist(pass);
		entityManager.persist(pass2);
		entityManager.persist(pass3);
	}
}
