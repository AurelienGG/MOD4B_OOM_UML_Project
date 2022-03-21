package logic.requests;

import logic.options.CrossWinds;
import logic.options.IceStorm;
import logic.options.IcyRunWays;
import logic.options.Option;
import logic.planes.Plane;

public class EmergencyLanding extends Landing {

    /**
     * TODO
     * @param plane
     */
    protected EmergencyLanding(Plane plane) {
        super("", "", plane);
    }


}
