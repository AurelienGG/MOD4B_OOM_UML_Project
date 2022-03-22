package logic.options;

import logic.planes.Plane;
import logic.runways.RunwayManager;

/**
 * TODO
 */
public class LetThemLand extends Option {

    private Plane plane;
    private RunwayManager runwayManager_instance;

    public LetThemLand(Plane plane){
        super("Let them land");
        this.runwayManager_instance =RunwayManager.getInstance();
        this.plane=plane;
    }

    @Override
    public boolean checkRequirement() {
        if(this.runwayManager_instance.getNbFreeRunway() > 0)
            return true;
        else
            return false;
    }

    @Override
    public void applyConsequence() {
        this.runwayManager_instance.planeLandOnFreeRunway(plane);
        //TODO add snaky plane in planeManager
    }
}
