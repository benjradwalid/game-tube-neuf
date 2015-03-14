package domain;

import domain.User;
import java.io.Serializable;
import java.lang.Float;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Player
 *
 */
@Entity

public class Player extends User implements Serializable {

	
	private Float balance;
	private static final long serialVersionUID = 1L;

	public Player() {
		super();
	}   
	public Float getBalance() {
		return this.balance;
	}

	public void setBalance(Float balance) {
		this.balance = balance;
	}
   
}
