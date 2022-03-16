package logic.options;

import logic.planes.Plane;
import logic.runways.RunwayManager;

public class AllowLanding extends Option {

    Plane plane;
    RunwayManager runwayManager;

    public AllowLanding(Plane plane) {
        super("Allow landing");
        runwayManager = RunwayManager.getInstance();
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
    }
}
