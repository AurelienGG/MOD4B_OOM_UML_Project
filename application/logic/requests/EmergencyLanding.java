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
        super("", generateDescription(plane), plane);
    }

    /**
     * TODO
     * @param plane
     * @return
     */
    private static String generateDescription(Plane plane) {
        // TODO
        return "";
    }
}
