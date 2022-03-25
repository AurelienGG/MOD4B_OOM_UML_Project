package logic.options;

import logic.planes.Plane;
import logic.runways.RunwayManager;

/**
 * TODO
 */
public class AllowLanding extends Option {

    private Plane plane;

    /**
     * TODO
     * @param plane
     */
    public AllowLanding(Plane plane) {
        super("Allow landing", "Plane lands and occupies the runway for stated time");
        this.plane = plane;
    }

    /**
     * TODO
     * @return
     */
    @Override
    public boolean checkRequirement() {
        if(RunwayManager.getInstance().getNbFreeRunway()>0)
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
    }
}
