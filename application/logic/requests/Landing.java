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
     * @param RARITY
     * @param TITLE
     * @param DESCRIPTION
     * @param plane
     */
    //TODO
    protected Landing(double RARITY, String TITLE, String DESCRIPTION, Plane plane) {
        super(RARITY, TITLE, DESCRIPTION);
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
