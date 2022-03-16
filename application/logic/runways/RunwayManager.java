package logic.runways;

import logic.planes.Plane;

import java.util.ArrayList;

/**
 * Manage the program runways
 *
 * @author Emmie
 * @author Aurélien
 */
public class RunwayManager {

    private static RunwayManager runwayManager_instance = null;
    private ArrayList<Runway> runways;

    /**
     * TODO
     */
    private RunwayManager() {
        this.runways =  new ArrayList<>(8);
        //TODO
    }

    /**
     * TODO
     * @return
     */
    public static RunwayManager getInstance() {
        if (runwayManager_instance == null)
            runwayManager_instance = new RunwayManager();
        return runwayManager_instance;
    }

    /**
     * TODO
     * @param plane
     */
    public void planeLandOnFreeRunway(Plane plane) {
        //TODO
    }

    /**
     * Hourly checks for runways,
     * Decrease the time refueling,
     * Check if planes can leave
     * Make planes leaves
     */
    public void RunwayAdvanceHour() {
        //TODO
    }

    /**
     * TODO IS IT USEFUL ?
     * Decrease the time refueling for every plane occupying a runway
     */
    private void decreaseWaitingPlanesFuel() {
        //TODO
    }

    /**
     * TODO IS IT USEFUL ?
     * Check the fuel left in every waiting planes in the ArrayList
     * @return an ArrayList of planes out of fuel
     * or null if there is no crash
     */
    private void checkRunwayFuel() {
        //TODO
    }

    /**
     * For all the runways check if they are occupied
     * @return the number of occupied runways
     */
    public int getNbFullRunway() {
        //TODO
        return 0;
    }

    /**
     * Empty 1 random runway
     */
    public void emptyRandomRunway() {
        //TODO
    }

    /**
     * Remove a runway
     */
    public void removeRunway() {
        //TODO
    }

    /**
     * For every plane in a runway add more wait time
     * @param hoursToWait the added time to wait
     */
    public void addWaitTimeAllRunways(int hoursToWait) {
        //TODO
    }

    /**
     * Block a free runway
     * @param occupantName
     * @param hoursBlocked
     */
    public void blockFreeRunway(String occupantName, int hoursBlocked) {
        //TODO
    }
}
