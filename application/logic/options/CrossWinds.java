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
        super("Cross winds", "Remove 1 hour of fuel from all waiting planes in air");
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
