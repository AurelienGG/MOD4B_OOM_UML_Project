package logic.requests;

import logic.options.*;
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
        super("",generateDescription(plane), plane);
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
