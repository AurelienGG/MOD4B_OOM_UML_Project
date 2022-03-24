package logic.options;

import logic.runways.RunwayManager;

/**
 * TODO
 */
public class IcyRunWays extends Option {

    /**
     * TODO
     */
    public IcyRunWays() {
        super("Icy run ways");
    }

    /**
     * TODO
     * @return
     */
    @Override
    public boolean checkRequirement() {
        return true;
    }

    /**
     * TODO
     */
    @Override
    public void applyConsequence() {
        RunwayManager.getInstance().addTimeBlockedAllPlanes(2);
    }
}
