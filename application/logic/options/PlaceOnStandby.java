package logic.options;

import logic.planes.Plane;
import logic.waitingPlanes.WaitingPlanesManager;

/**
 * TODO
 */
public class PlaceOnStandby extends Option {

    private Plane plane;

    /**
     * TODO
     * @param plane
     */
    public PlaceOnStandby(Plane plane){
        super("Place on standby", "Airplane joins “waiting” planes");
        this.plane = plane;
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
        WaitingPlanesManager.getInstance().addPlaneToWaitingPlanes(this.plane);
    }
}
