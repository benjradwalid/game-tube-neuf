package services.interfaces;

import javax.ejb.Remote;

@Remote
public interface GameManagementServicesRemote {
	String sayAhla(String name);

}
