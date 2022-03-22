package logic.options;

import logic.runways.RunwayManager;

/**
 * TODO
 */
public class EmptyRandomRunway extends Option {

    private RunwayManager runwayManager_instance;

    public EmptyRandomRunway() {
        super("Empty random runway");
        this.runwayManager_instance =RunwayManager.getInstance();
    }

    @Override
    public boolean checkRequirement() {
        if(this.runwayManager_instance.getNbFullRunway() > 0)
            return true;
        else
            return false;
    }

    @Override
    public void applyConsequence() {
        this.runwayManager_instance.emptyRandomRunway();
    }
}
