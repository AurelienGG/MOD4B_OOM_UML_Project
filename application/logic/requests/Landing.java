package logic.requests;

import logic.options.*;
import logic.planes.Plane;

/**
 *
 */
public abstract class Landing extends Request {

    /**
     *
     * @param plane
     */
    //TODO
    protected Landing(String TITLE, String DESCRIPTION, Plane plane) {
        super(TITLE, DESCRIPTION, plane);
    }

    /**
     * TODO
     * @return
     */
    protected Option[] generateOptions() {
        return new Option[] {new AllowLanding(super.plane), new PlaceOnStandby(super.plane)};
    }
}
