package tests;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import services.interfaces.GameManagementServicesRemote;

public class TestSayAhla {

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		GameManagementServicesRemote proxy = (GameManagementServicesRemote) context
				.lookup("/game-tube/GameManagementServices!services.interfaces.GameManagementServicesRemote");

		System.out.println(proxy.sayAhla("samir"));
	}

}
