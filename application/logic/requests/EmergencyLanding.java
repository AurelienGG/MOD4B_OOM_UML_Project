package logic.requests;

import logic.options.CrossWinds;
import logic.options.IceStorm;
import logic.options.IcyRunWays;
import logic.options.Option;
import logic.planes.Plane;

/**
 * TODO
 */
public class EmergencyLanding extends Landing {

    /**
     * TODO
     * @param plane
     */
    protected EmergencyLanding(Plane plane) {
        super("Emergency Landing",
                "Plane requests to land. It has " + plane.getHoursFuelLeft() + " hours of fuel left to wait. It needs " + plane.getHoursRunwayNeeded() + " hours of runway time. It has " + plane.getNbPassengers() + " passengers",
                plane);
    }
}
