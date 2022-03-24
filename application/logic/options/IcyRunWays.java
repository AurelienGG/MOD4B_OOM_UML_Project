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
        super("Icy run ways", "Add 2 hours wait time to all planes waiting in runway");
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
