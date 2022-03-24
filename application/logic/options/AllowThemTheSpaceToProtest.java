package logic.options;

import logic.runways.RunwayManager;

/**
 * TODO
 */
public class AllowThemTheSpaceToProtest extends Option {

    /**
     * TODO
     */
    public AllowThemTheSpaceToProtest() {
        super("Allow them the space to protest", "One runway will be blocked for 10 hours");
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
        RunwayManager.getInstance().blockFreeRunway("PROTEST",10);
    }
}
