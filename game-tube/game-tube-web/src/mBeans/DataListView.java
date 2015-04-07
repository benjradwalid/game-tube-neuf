package mBeans;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import services.interfaces.GameManagementServicesLocal;
import domain.Player;

@ManagedBean
@ViewScoped
public class DataListView implements Serializable {
     
    private List<Player> player;
     
     
    @ManagedProperty("#{playerService}")
    private GameManagementServicesLocal service;
     
    @PostConstruct
    public void init() {
        player = service.getPlayers();
     
    }
 
    public List<Player> getCars1() {
        return player;
    }  
 
    public void setService(GameManagementServicesLocal service) {
        this.service = service;
    }
 /*
    public Car getSelectedCar() {
        return selectedCar;
    }
 
    public void setSelectedCar(Car selectedCar) {
        this.selectedCar = selectedCar;
    }*/
}
