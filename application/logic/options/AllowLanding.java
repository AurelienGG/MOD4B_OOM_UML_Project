package logic.options;

import logic.runways.RunwayManager;

public class AllowLanding extends Option {

    RunwayManager runwayManager;

    public AllowLanding() {
        super("Allow landing");
        runwayManager = RunwayManager.getInstance();
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
        //TODO
    }
}
