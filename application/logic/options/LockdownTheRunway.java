package logic.options;

import logic.runways.RunwayManager;

/**
 * TODO
 */
public class LockdownTheRunway extends Option {

    private RunwayManager runwayManager_instance;

    public LockdownTheRunway() {
        super("Lockdown the runway");
        this.runwayManager_instance =RunwayManager.getInstance();
    }

    @Override
    public boolean checkRequirement() {
        if(this.runwayManager_instance.getNbFreeRunway()>0)
            return true;
        else
            return false;
    }

    @Override
    public void applyConsequence() {
        this.runwayManager_instance.blockFreeRunway("LOCKDOWN",8);
    }
}
