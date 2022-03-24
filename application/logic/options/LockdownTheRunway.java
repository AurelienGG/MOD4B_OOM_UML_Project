package logic.options;

import logic.runways.RunwayManager;

/**
 * TODO
 */
public class LockdownTheRunway extends Option {

    /**
     * TODO
     */
    public LockdownTheRunway() {
        super("Lockdown the runway");
    }

    /**
     * TODO
     * @return
     */
    @Override
    public boolean checkRequirement() {
        if(RunwayManager.getInstance().getNbFreeRunway()>0)
            return true;
        else
            return false;
    }

    /**
     * TODO
     */
    @Override
    public void applyConsequence() {
        RunwayManager.getInstance().blockFreeRunway("LOCKDOWN",8);
    }
}
