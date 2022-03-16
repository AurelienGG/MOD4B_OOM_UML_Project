package logic.options;

import logic.runways.Runway;
import logic.runways.RunwayManager;

public class IcyRunWays extends Option {

    private final String description = "Icy run ways";
    RunwayManager runwayManager;

    public IcyRunWays(){
        super("Icy run ways");
        runwayManager=RunwayManager.getInstance();
    }

    @Override
    public boolean checkRequirement() {
        return true;
    }

    @Override
    public void applyConsequence() {
        runwayManager.addTimeBlockedAllPlanes(2);
    }

    @Override
    public String displayOption() {
        return description;
    }
}
