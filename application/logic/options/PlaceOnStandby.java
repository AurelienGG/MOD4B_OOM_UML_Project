package logic.options;

import logic.planes.Plane;
import logic.waitingPlanes.WaitingPlanesManager;

/**
 * TODO
 */
public class PlaceOnStandby extends Option {

    private Plane plane;
    private WaitingPlanesManager waitingPlanesManager_instance;

    public PlaceOnStandby(Plane plane){
        super("Place on standby");
        this.plane = plane;
        this.waitingPlanesManager_instance = WaitingPlanesManager.getInstance();
    }

    @Override
    public boolean checkRequirement() {
        return true;
    }

    @Override
    public void applyConsequence() {
        this.waitingPlanesManager_instance.addPlaneToWaitingPlanes(this.plane);
    }
}
