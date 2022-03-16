package logic.options;

import logic.waitingPlanes.WaitingPlanesManager;

public class CrossWinds extends Option {

    private final String description = "Cross winds";
    WaitingPlanesManager waitingPlanesManager;

    public CrossWinds(){
        super("Cross winds");
        waitingPlanesManager = WaitingPlanesManager.getInstance();
    }

    @Override
    public boolean checkRequirement() {
        return true;
    }

    @Override
    public void applyConsequence() {
        waitingPlanesManager.decreaseWaitingPlanesFuel();
    }

    @Override
    public String displayOption() {
        return description;
    }
}
