package logic.runways;

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
}
