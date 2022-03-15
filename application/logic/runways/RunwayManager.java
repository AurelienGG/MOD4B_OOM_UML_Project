package logic.runways;

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
}
