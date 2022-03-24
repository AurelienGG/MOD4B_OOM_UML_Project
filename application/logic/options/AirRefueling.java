package logic.options;

import logic.waitingPlanes.WaitingPlanesManager;

/**
 * TODO
 */
public class AirRefueling extends Option {

    /**
     * TODO
     */
    public AirRefueling() {
        super("Air refueling", "All waiting airplanes get 2 more hours of fuel");
    }

    /**
     * TODO
     * @return
     */
    @Override
    public boolean checkRequirement() {
        if(WaitingPlanesManager.getInstance().getNbWaitingPlanes() > 0)
            return true;
        else
            return false;
    }

    /**
     * TODO
     */
    @Override
    public void applyConsequence() {
        WaitingPlanesManager.getInstance().increaseWaitingPlanesFuel(2);
    }
}
