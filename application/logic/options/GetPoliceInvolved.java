package logic.options;

import logic.runways.RunwayManager;

public class GetPoliceInvolved extends Option {

    private final String description = "Get police involved";
    RunwayManager runwayManager;

    public GetPoliceInvolved(){
        super("Get police involved");
        runwayManager=RunwayManager.getInstance();
    }

    @Override
    public boolean checkRequirement() {
        if(runwayManager.getNbFreeRunway()>=2)
            return true;
        else
            return false;
    }

    @Override
    public void applyConsequence() {

    }

    @Override
    public String displayOption() {
        return description;
    }
}
