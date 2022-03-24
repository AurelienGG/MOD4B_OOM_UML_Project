package logic.options;

import logic.runways.RunwayManager;

/**
 * TODO
 */
public class IceStorm extends Option {

    /**
     * TODO
     */
    public IceStorm() {
        super("Ice storm");
    }

    /**
     * TODO
     * @return
     */
    @Override
    public boolean checkRequirement() {
        if(RunwayManager.getInstance().getNbFreeRunway() > 0)
            return true;
        else
            return false;
    }

    /**
     * TODO
     */
    @Override
    public void applyConsequence() {
        RunwayManager.getInstance().removeRunway();
    }
}
