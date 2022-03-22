package logic.requests;

import logic.options.*;

/**
 * TODO
 */
public class Protests extends Request {

    /**
     * TODO
     */
    protected Protests() {
        // TODO
        super("", "");
    }

    /**
     * TODO
     * @return
     */
    protected Option[] generateOptions() {
        return new Option[] {new AllowThemTheSpaceToProtest(), new GetPoliceInvolved(), new LetThePlanesLandAnyways()};
    }
}
