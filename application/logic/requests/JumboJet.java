package logic.requests;

import logic.planes.Plane;

/**
 * TODO
 */
public class JumboJet extends Landing {

    /**
     * TODO
     * @param plane
     */
    protected JumboJet(Plane plane) {
        // Changed the description to show the runway time needed
        super("Jumbo Jet",
                "A large aircraft carrying " + plane.getNbPassengers() + " passengers with " + plane.getHoursFuelLeft() + " hours of fuel wishes to land. It requires " + plane.getHoursRunwayNeeded() + " hours of runway time.",
                plane);
    }
}
