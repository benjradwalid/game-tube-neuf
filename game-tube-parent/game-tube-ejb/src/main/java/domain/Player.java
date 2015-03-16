package domain;

import java.io.Serializable;

import javax.persistence.Entity;

/**
 * Entity implementation class for Entity: Player
 *
 */
@Entity
public class Player extends User implements Serializable {

	private Float balance = 100F;
	private static final long serialVersionUID = 1L;

	public Player() {
		super();
	}

	public Player(String name, String login, String password) {
		this.setName(name);
		this.setLogin(login);
		this.setPassword(password);
	}

	public Float getBalance() {
		return this.balance;
	}

	public void setBalance(Float balance) {
		this.balance = balance;
	}

}
