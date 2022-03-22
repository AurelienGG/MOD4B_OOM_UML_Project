package logic.requests;

import logic.options.*;
import logic.planes.Plane;

/**
 *
 */
public abstract class Landing extends Request {

    private Plane plane;

    /**
     *
     * @param plane
     */
    //TODO
    protected Landing(String TITLE, String DESCRIPTION, Plane plane) {
        super(TITLE, DESCRIPTION);
        this.plane = plane;
    }

    /**
     * TODO
     * @return
     */
    protected Option[] generateOptions() {
        //TODO
        return new Option[] {new AllowLanding(null), new PlaceOnStandby(null)};
    }
}
