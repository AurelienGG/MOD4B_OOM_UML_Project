package logic.options;

import logic.runways.RunwayManager;

/**
 * TODO
 */
public class EmptyRandomRunway extends Option {

    /**
     * TODO
     */
    public EmptyRandomRunway() {
        super("Empty random runway", "Empties a random runway");
    }

    /**
     * TODO
     * @return
     */
    @Override
    public boolean checkRequirement() {
        if(RunwayManager.getInstance().getNbFullRunway() > 0)
            return true;
        else
            return false;
    }

    /**
     * TODO
     */
    @Override
    public void applyConsequence() {
        RunwayManager.getInstance().emptyRandomRunway();
    }
}
