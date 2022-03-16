package logic.options;

import logic.planes.Plane;
import logic.runways.RunwayManager;

public class LetThemLand extends Option {

    private final String description = "Let them land";
    RunwayManager runwayManager;
    Plane plane;

    public LetThemLand(Plane plane){
        super("Let them land");
        runwayManager=RunwayManager.getInstance();
        this.plane=plane;
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
        runwayManager.planeLandOnFreeRunway(plane);
        //TODO add snaky plane in planeManager
    }

    @Override
    public String displayOption() {
        return description;
    }
}
