package mBeans;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

import services.interfaces.GameManagementServicesLocal;
import domain.Pass;
import domain.Player;

@ManagedBean
@RequestScoped
public class PlayerManagementBean {

	// models
	private Player player = new Player();
	private List<Pass> passes = new ArrayList<>();
	private DataModel<Pass> datamodel = new ListDataModel<>();
	private Pass passSelected;
	// injection of the proxy
	@EJB
	private GameManagementServicesLocal gameManagementServicesLocal;
	@ManagedProperty(value = "#{lb}")
	private LoginBean loginBean;

	public String doAddPlayer() {
		gameManagementServicesLocal.addPlayer(player);
		return "";
	}

	public String doPurchasePass() {
		passSelected=datamodel.getRowData();
		gameManagementServicesLocal.purchasePass(loginBean.getUser().getId(),
				passSelected);
		return "";
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public List<Pass> getPasses() {
		passes = gameManagementServicesLocal.findAllPasses();
		return passes;
	}

	public void setPasses(List<Pass> passes) {
		this.passes = passes;
	}

	public DataModel<Pass> getDatamodel() {
		datamodel.setWrappedData(gameManagementServicesLocal.findAllPasses());
		return datamodel;
	}

	public void setDatamodel(DataModel<Pass> datamodel) {
		this.datamodel = datamodel;
	}

	public Pass getPassSelected() {
		return passSelected;
	}

	public void setPassSelected(Pass passSelected) {
		this.passSelected = passSelected;
	}

	public LoginBean getLoginBean() {
		return loginBean;
	}

	public void setLoginBean(LoginBean loginBean) {
		this.loginBean = loginBean;
	}

}
