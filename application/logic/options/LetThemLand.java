package logic.options;

import logic.runways.RunwayManager;

public class LetThemLand extends Option {

    private final String description = "Let them land";
    RunwayManager runwayManager;

    public LetThemLand(){
        super("Let them land");
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
