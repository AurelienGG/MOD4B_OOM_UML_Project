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
        int deadPassenger = 0;
        for(Plane plane: crashingPlanes) {
            deadPassenger += plane.getNbPassengers();
            crashWaitingPlane(plane);
        }
        return deadPassenger;
    }

    /**
     * Decrease the fuel left in every waiting planes in the ArrayList
     */
    public void decreaseWaitingPlanesFuel() {
        for (Plane plane: this.waitingPlanes) {
            plane.decreaseFuelLeft();
        }
    }

    /**
     * Check the fuel left in every waiting planes in the ArrayList
     * @return an ArrayList of planes out of fuel
     * or null if there is no crash
     */
    private ArrayList<Plane> checkWaitingPlanesFuel()
    {
        ArrayList<Plane> noFuelPlanes = new ArrayList<>();

        for(Plane plane: this.waitingPlanes)
            if(plane.getHoursFuelLeft() <= 0)
                noFuelPlanes.add(plane);

        if(noFuelPlanes.isEmpty())
            return null;
        else
            return noFuelPlanes;
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

    /**
     * Getter for the number of waiting airplanes in air
     * @return the size of the waitingPlanes ArrayList
     */
    public int getNbWaitingPlanes() {
        //TODO
        return 0;
    }

    /**
     * Refuel all waiting airplanes in air
     */
    public void airRefueling() {
        //TODO
    }

}
