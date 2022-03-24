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
        super("Allow landing");
        if(plane == null)
            System.err.println("NO PLANE AllowLanding constructor");
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
        if(plane == null)
            System.err.println("NO PLANE AllowLanding applyConsequence");
        RunwayManager.getInstance().planeLandOnFreeRunway(plane);
    }
}
