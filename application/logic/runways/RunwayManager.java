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
    private Runway[] runways;

    private RunwayManager() {
        this.runways =  new Runway[8];
    }

    public static RunwayManager getInstance() {
        if (runwayManager_instance == null)
            runwayManager_instance = new RunwayManager();
        return runwayManager_instance;
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
     * Decrease the time refueling for every plane in a runway
     */
    private void decreaseWaitingPlanesFuel() {
        //TODO
    }

    /**
     * Check the fuel left in every waiting planes in the ArrayList
     * @return an ArrayList of planes out of fuel
     * or null if there is no crash
     */
    private void checkRunwayFuel() {
        //TODO
    }
}
