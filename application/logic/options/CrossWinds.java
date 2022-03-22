package logic.options;

import logic.waitingPlanes.WaitingPlanesManager;

/**
 * TODO
 */
public class CrossWinds extends Option {

    private WaitingPlanesManager waitingPlanesManager_instance;

    public CrossWinds() {
        super("Cross winds");
        this.waitingPlanesManager_instance = WaitingPlanesManager.getInstance();
    }

    @Override
    public boolean checkRequirement() {
        return true;
    }

    @Override
    public void applyConsequence() {
        this.waitingPlanesManager_instance.decreaseWaitingPlanesFuel();
    }
}
