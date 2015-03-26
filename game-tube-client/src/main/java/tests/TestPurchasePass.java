package tests;

import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import services.interfaces.GameManagementServicesRemote;
import domain.Pass;

public class TestPurchasePass {

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		GameManagementServicesRemote proxy = (GameManagementServicesRemote) context
				.lookup("/game-tube/GameManagementServices!services.interfaces.GameManagementServicesRemote");

		List<Pass> passes = proxy.findAllPasses();
		for (Pass p : passes) {
			System.out.println(p);
		}

		System.out.println(proxy.purchasePass(1, passes.get(0)));
		System.out.println(proxy.purchasePass(2, passes.get(1)));
		System.out.println(proxy.purchasePass(3, passes.get(2)));

	}

}
