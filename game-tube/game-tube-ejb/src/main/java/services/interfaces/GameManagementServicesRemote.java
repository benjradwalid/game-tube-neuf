package services.interfaces;

import java.util.List;

import javax.ejb.Remote;

import domain.Pass;
import domain.User;

@Remote
public interface GameManagementServicesRemote {
	String sayAhla(String name);

	List<Pass> findAllPasses();

	Boolean purchasePass(Integer idUser, Pass pass);

	User findUserById(Integer idUser);
	

}
