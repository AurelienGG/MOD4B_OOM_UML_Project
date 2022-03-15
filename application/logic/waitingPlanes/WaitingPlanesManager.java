package logic.waitingPlanes;

import logic.planes.Plane;
import java.util.ArrayList;

public class WaitingPlanesManager {

    private static WaitingPlanesManager waitingPlanesManager_instance = null;
    private ArrayList<Plane> waitingPlanes;

    private WaitingPlanesManager() {
        //TODO
    }

    public static WaitingPlanesManager getInstance() {
        if (waitingPlanesManager_instance == null)
            waitingPlanesManager_instance = new WaitingPlanesManager();
        return waitingPlanesManager_instance;
    }

    public void addPlaneToWaitingPlanes(Plane plane) {
        //TODO
    }
}
