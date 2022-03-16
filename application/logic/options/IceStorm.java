package logic.options;

import logic.runways.RunwayManager;

public class IceStorm extends Option {

    private final String description = "Ice storm";
    RunwayManager runwayManager;

    public IceStorm(){
        super("Ice storm");
        runwayManager=RunwayManager.getInstance();
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
        runwayManager.removeRunway();
    }

    @Override
    public String displayOption() {
        return description;
    }
}
