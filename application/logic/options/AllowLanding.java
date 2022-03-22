package logic.options;

import logic.planes.Plane;
import logic.runways.RunwayManager;

/**
 * TODO
 */
public class AllowLanding extends Option {

    private Plane plane;
    private RunwayManager runwayManager_instance;

    /**
     * TODO
     * @param plane
     */
    public AllowLanding(Plane plane) {
        super("Allow landing");
        this.runwayManager_instance = RunwayManager.getInstance();
        this.plane = plane;
    }

    /**
     * TODO
     * @return
     */
    @Override
    public boolean checkRequirement() {
        if(this.runwayManager_instance.getNbFreeRunway()>0)
            return true;
        else
            return false;
    }

    /**
     * TODO
     */
    @Override
    public void applyConsequence() {
        this.runwayManager_instance.planeLandOnFreeRunway(plane);
    }
}
