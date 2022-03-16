package logic.options;

import logic.planes.Plane;
import logic.waitingPlanes.WaitingPlanesManager;

public class PlaceOnStandby extends Option {

    private final String description = "Place on standby";
    Plane plane;
    WaitingPlanesManager waitingPlanesManager;

    public PlaceOnStandby(Plane plane){
        super("Place on standby");
        this.plane=plane;
        waitingPlanesManager=WaitingPlanesManager.getInstance();
    }

    @Override
    public boolean checkRequirement() {
        return true;
    }

    @Override
    public void applyConsequence() {
        waitingPlanesManager.addPlaneToWaitingPlanes(plane);
    }

    @Override
    public String displayOption() {
        return description;
    }
}
