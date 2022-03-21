package logic.requests;

import logic.options.CrossWinds;
import logic.options.IceStorm;
import logic.options.IcyRunWays;
import logic.options.Option;
import logic.planes.Plane;

public class EmergencyLanding extends Landing {

    /**
     * TODO
     * @param RARITY
     * @param TITLE
     * @param DESCRIPTION
     * @param plane
     */
    protected EmergencyLanding(double RARITY, String TITLE, String DESCRIPTION, Plane plane) {
        super(RARITY, TITLE, DESCRIPTION, plane);
    }


}
