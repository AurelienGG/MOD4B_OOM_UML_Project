package logic.requests;

import logic.options.*;

/**
 * TODO
 */
public class SnakesOnThePlane extends Request {

    /**
     * TODO
     */
    protected SnakesOnThePlane() {
        super("", "");
        // TODO ADD PLANE
    }

    /**
     * TODO
     * @return
     */
    protected Option[] generateOptions() {
        //TODO
        return new Option[] {new LetThemLand(null), new RefuseThem()};
    }
}
