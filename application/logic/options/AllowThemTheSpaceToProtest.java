package logic.options;

import logic.runways.RunwayManager;

public class AllowThemTheSpaceToProtest extends Option {
    private final String description ="Allow them the space to protest";
    RunwayManager runwayManager;

    public AllowThemTheSpaceToProtest(){
        super("Allow them the space to protest");
        runwayManager= RunwayManager.getInstance();
    }

    @Override
    public boolean checkRequirement() {
        if(runwayManager.getNbFreeRunway()>0)
            return true;
        else
            return false;
    }

    @Override
    public void applyConsequence() {
        runwayManager.blockFreeRunway("PROTEST",10);
    }

    @Override
    public String displayOption() {
        return description;
    }
}
