package logic.requests;

import logic.options.*;
import logic.planes.Plane;

/**
 * TODO
 */
public class PlaneLanding extends Landing {

    //TODO fix
    public PlaneLanding(Plane plane) {
        super("Plane Landing", generateDescription(plane), plane);
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
