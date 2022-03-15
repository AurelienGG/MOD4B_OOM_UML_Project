package logic.waitingPlanes;

import logic.planes.Plane;
import java.util.ArrayList;

/**
 * Manage program's waiting planes
 *
 * @author Chloé T
 * @author Aurélien
 */
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

    /**
     * Add a plane to the waitingPlanes ArrayList
     * @param plane the plane to add
     */
    public void addPlaneToWaitingPlanes(Plane plane) {
        //TODO
    }

    /**
     * Hourly checks for waiting planes,
     * Decrease the fuel,
     * Check for crash
     * Communicate number of dead passengers from crash
     */
    public void waitingPlanesAdvanceHour() {
        //TODO
    }

    /**
     * Decrease the fuel left in every waiting planes in the ArrayList
     */
    private void decreaseWaitingPlanesFuel() {
        //TODO
    }

    /**
     * Check the fuel left in every waiting planes in the ArrayList
     * @return an ArrayList of planes out of fuel
     * or null if there is no crash
     */
    private ArrayList<Plane> checkWaitingPlanesFuel() {
        //TODO
        return null;
    }

    /**
     * Crash the waiting plane without fuels left
     * @param crashingPlane the plane crashing
     */
    private void crashWaitingPlane(Plane crashingPlane) {
        //TODO
    }

    /**
     * The number of people dying from the crash
     * @param crashingPlane the plane crashing
     * @return the number of people dying from the crash
     */
    private int numberDeadPassengersFromCrash(Plane crashingPlane) {
        //TODO
        return 0;
    }


}
