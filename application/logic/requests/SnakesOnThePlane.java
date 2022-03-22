package logic.requests;

import logic.options.*;
import logic.planes.Plane;

/**
 * TODO
 */
public class SnakesOnThePlane extends Request {

    private Plane plane;

    /**
     * TODO
     */
    protected SnakesOnThePlane(Plane plane) {
        //TODO
        super("Snakes on the plane", "A pilot is reporting that their plane is being overrun by snakes. They want to land at your airport.");
        this.plane = plane;
    }

    /**
     * TODO
     * @return
     */
    protected Option[] generateOptions() {
        return new Option[] {new LetThemLand(this.plane), new RefuseThem()};
    }
}
