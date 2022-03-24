package logic.options;

import logic.planes.Plane;
import logic.runways.RunwayManager;

/**
 * TODO
 */
public class LetThemLand extends Option {

    private Plane plane;

    /**
     * TODO
     * @param plane
     */
    public LetThemLand(Plane plane){
        super("Let them land", "Plane will occupy runway for 7 hours");
        this.plane = plane;
    }

    /**
     * TODO
     * @return
     */
    @Override
    public boolean checkRequirement() {
        if(RunwayManager.getInstance().getNbFreeRunway() > 0)
            return true;
        else
            return false;
    }

    /**
     * TODO
     */
    @Override
    public void applyConsequence() {
        RunwayManager.getInstance().planeLandOnFreeRunway(plane);
        //TODO add snaky plane in planeManager
    }
}
