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
        for(int i = 0;i<2;i++){
            runwayManager.blockFreeRunway("POLICE",4);
        }
    }

    @Override
    public String displayOption() {
        return description;
    }
}
