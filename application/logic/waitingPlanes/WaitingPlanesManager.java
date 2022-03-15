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
        this.waitingPlanes = new ArrayList<>();
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
        this.waitingPlanes.add(plane);
    }

    /**
     * Hourly checks for waiting planes,
     * Decrease the fuel,
     * Check for crash
     * Communicate number of dead passengers from crash
     * @return number of dead passengers or 0
     */
    public int waitingPlanesAdvanceHour() {
        decreaseWaitingPlanesFuel();
        ArrayList<Plane> crashingPlanes = checkWaitingPlanesFuel();

        for (Plane plane: crashingPlanes) {
            crashWaitingPlane(plane);
        }

        int deadPassenger = 0;


        return deadPassenger;
    }

    /**
     * Decrease the fuel left in every waiting planes in the ArrayList
     */
    private void decreaseWaitingPlanesFuel() {
        for (Plane plane: waitingPlanes) {
            plane.decreaseFuelLeft();
        }
    }

    /**
     * Check the fuel left in every waiting planes in the ArrayList
     * @return an ArrayList of planes out of fuel
     * or null if there is no crash
     */
    private ArrayList<Plane> checkWaitingPlanesFuel() {
        ArrayList<Plane> noFuelPlanes = new ArrayList<>();
        for (Plane plane: waitingPlanes) {
            if ( plane.getHoursFuelLeft() <= 0) {
                noFuelPlanes.add(plane);
            }
        }
        if (noFuelPlanes.isEmpty()){
            return null;
        }
        else {
            return noFuelPlanes;
        }

    }

    /**
     * Crash the waiting plane without fuels left
     * @param crashingPlane the plane crashing
     */
    private void crashWaitingPlane(Plane crashingPlane) {
        this.waitingPlanes.remove(crashingPlane);
    }

    /**
     * The number of people dying from the crash
     * @param crashingPlane the plane crashing
     * @return the number of people dying from the crash
     */
    private int numberDeadPassengersFromCrash(Plane crashingPlane) {

        return crashingPlane.getNbPassengers();
    }


}
