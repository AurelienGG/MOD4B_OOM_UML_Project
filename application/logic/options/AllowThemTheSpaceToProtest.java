package logic.options;

import logic.runways.RunwayManager;

/**
 * TODO
 */
public class AllowThemTheSpaceToProtest extends Option {

    private RunwayManager runwayManager_instance;

    public AllowThemTheSpaceToProtest() {
        super("Allow them the space to protest");
        this.runwayManager_instance = RunwayManager.getInstance();
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
        this.runwayManager_instance.blockFreeRunway("PROTEST",10);
    }
}
