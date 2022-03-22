package logic.options;

import logic.runways.RunwayManager;

/**
 * TODO
 */
public class GetPoliceInvolved extends Option {

    private RunwayManager runwayManager_instance;

    public GetPoliceInvolved() {
        super("Get police involved");
        this.runwayManager_instance = RunwayManager.getInstance();
    }

    @Override
    public boolean checkRequirement() {
        if(this.runwayManager_instance.getNbFreeRunway() >= 2)
            return true;
        else
            return false;
    }

    @Override
    public void applyConsequence() {
        for(int i = 0; i < 2; i++)
            this.runwayManager_instance.blockFreeRunway("POLICE",4);
    }
}
