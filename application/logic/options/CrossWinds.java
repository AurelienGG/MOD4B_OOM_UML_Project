package logic.options;

import logic.waitingPlanes.WaitingPlanesManager;

/**
 * TODO
 */
public class CrossWinds extends Option {

    /**
     * TODO
     */
    public CrossWinds() {
        super("Cross winds");
    }

    /**
     * TODO
     * @return
     */
    @Override
    public boolean checkRequirement() {
        return true;
    }

    /**
     * TODO
     */
    @Override
    public void applyConsequence() {
        WaitingPlanesManager.getInstance().decreaseWaitingPlanesFuel();
    }
}
