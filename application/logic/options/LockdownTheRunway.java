package logic.options;

import logic.runways.RunwayManager;

public class LockdownTheRunway extends Option {

    private final String description = "Lockdown the runway";
    RunwayManager runwayManager;

    public LockdownTheRunway(){
        super("Lockdown the runway");
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

    }

    @Override
    public String displayOption() {
        return description;
    }
}
