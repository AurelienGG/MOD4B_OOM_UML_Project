package logic.options;

import logic.runways.RunwayManager;

public class EmptyRandomRunway extends Option {

    private final String description = "Empty random runway";
    RunwayManager runwayManager;

    public EmptyRandomRunway(){
        super("Empty random runway");
        runwayManager=RunwayManager.getInstance();
    }

    @Override
    public boolean checkRequirement() {
        if(runwayManager.getNbFullRunway()>0)
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
