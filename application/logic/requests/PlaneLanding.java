package logic.requests;

import logic.options.*;
import logic.planes.Plane;

/**
 * TODO
 */
public class PlaneLanding extends Landing {

    /**
     * TODO
     * @param plane
     */
    public PlaneLanding(Plane plane) {
        super("Plane Landing",
                "Plane requests to land. It has " + plane.getHoursFuelLeft() + " hours of fuel left to wait. It needs " + plane.getHoursRunwayNeeded() + " hours of runway time. It has " + plane.getNbPassengers() + " passengers",
                plane);
    }
}
