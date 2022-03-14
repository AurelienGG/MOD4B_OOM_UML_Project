package logic.runways;

public class RunwayManager {
    private static RunwayManager runwayManager_instance = null;
    private Runway[] runwayDictionary;
    private RunwayManager(){
        Runway[] runwayDictionary =  new Runway[8];
    }

    public RunwayManager getInstance() {
        if (runwayManager_instance == null)
            runwayManager_instance = new RunwayManager();
        return runwayManager_instance;
    }
}
