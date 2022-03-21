package logic.requests;

import logic.options.*;

public class Protests extends Request {

    /**
     * TODO
     */
    protected Protests() {

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
