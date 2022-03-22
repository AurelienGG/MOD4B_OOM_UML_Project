package logic.options;

import logic.runways.RunwayManager;

/**
 * TODO
 */
public class IcyRunWays extends Option {

    private RunwayManager runwayManager_instance;

    public IcyRunWays() {
        super("Icy run ways");
        this.runwayManager_instance = RunwayManager.getInstance();
    }

    @Override
    public boolean checkRequirement() {
        return true;
    }

    @Override
    public void applyConsequence() {
        this.runwayManager_instance.addTimeBlockedAllPlanes(2);
    }
}
