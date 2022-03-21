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
    protected Landing(Plane plane) {
        super("", "");
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
