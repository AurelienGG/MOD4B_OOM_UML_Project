package logic.requests;

import logic.options.*;
import logic.planes.Plane;

/**
 * TODO
 */
public class SnakesOnThePlane extends Request {

    /**
     * TODO
     */
    protected SnakesOnThePlane(Plane plane) {
        //TODO
        super("Snakes on the plane", "A pilot is reporting that their plane is being overrun by snakes. They want to land at your airport.", plane);
    }

    /**
     * TODO
     * @return
     */
    protected Option[] generateOptions() {
        return new Option[] {new LetThemLand(this.plane), new RefuseThem()};
    }
}
