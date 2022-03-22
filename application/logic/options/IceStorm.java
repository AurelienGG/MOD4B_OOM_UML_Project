package logic.options;

import logic.runways.RunwayManager;

/**
 * TODO
 */
public class IceStorm extends Option {

    private RunwayManager runwayManager_instance;

    public IceStorm() {
        super("Ice storm");
        this.runwayManager_instance = RunwayManager.getInstance();
    }

    @Override
    public boolean checkRequirement() {
        if(this.runwayManager_instance.getNbFreeRunway() > 0)
            return true;
        else
            return false;
    }

    @Override
    public void applyConsequence() {
        this.runwayManager_instance.removeRunway();
    }
}
