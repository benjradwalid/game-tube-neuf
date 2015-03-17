package domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Pass
 *
 */
@Entity
public class Pass implements Serializable {

	private Integer id;
	private String type;
	private Float price;
	private static final long serialVersionUID = 1L;

	private List<User> users;

	public Pass() {
		super();
	}

	public Pass(String type, Float price) {
		super();
		this.type = type;
		this.price = price;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	@OneToMany(mappedBy = "pass", fetch = FetchType.EAGER)
	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return "Pass [id=" + id + ", type=" + type + ", price=" + price
				+ ", users=" + users + "]";
	}

}
