package logic.options;

import logic.waitingPlanes.WaitingPlanesManager;

public class AirRefueling extends Option {

    private final String description = "Air refueling";
    WaitingPlanesManager waitingPlanesManager;

    public AirRefueling(){
        super("Air refueling");
        waitingPlanesManager=WaitingPlanesManager.getInstance();
    }

    @Override
    public boolean checkRequirement() {
        if(waitingPlanesManager.getNbWaitingPlanes()>0)
            return true;
        else
            return false;
    }

    @Override
    public void applyConsequence() {
        waitingPlanesManager.increaseWaitingPlanesFuel(2);
    }

    @Override
    public String displayOption() {
        return description;
    }
}
