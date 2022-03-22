package logic.options;

import logic.waitingPlanes.WaitingPlanesManager;

/**
 * TODO
 */
public class AirRefueling extends Option {

    private WaitingPlanesManager waitingPlanesManager_instance;

    public AirRefueling() {
        super("Air refueling");
        this.waitingPlanesManager_instance = WaitingPlanesManager.getInstance();
    }

    @Override
    public boolean checkRequirement() {
        if(this.waitingPlanesManager_instance.getNbWaitingPlanes() > 0)
            return true;
        else
            return false;
    }

    @Override
    public void applyConsequence() {
        this.waitingPlanesManager_instance.increaseWaitingPlanesFuel(2);
    }
}
