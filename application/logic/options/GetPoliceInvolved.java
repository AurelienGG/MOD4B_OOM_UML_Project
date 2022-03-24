package logic.options;

import logic.runways.RunwayManager;

/**
 * TODO
 */
public class GetPoliceInvolved extends Option {

    /**
     * TODO
     */
    public GetPoliceInvolved() {
        super("Get police involved");
    }

    /**
     * TODO
     * @return
     */
    @Override
    public boolean checkRequirement() {
        if(RunwayManager.getInstance().getNbFreeRunway() >= 2)
            return true;
        else
            return false;
    }

    /**
     * TODO
     */
    @Override
    public void applyConsequence() {
        for(int i = 0; i < 2; i++)
            RunwayManager.getInstance().blockFreeRunway("POLICE",4);
    }
}
