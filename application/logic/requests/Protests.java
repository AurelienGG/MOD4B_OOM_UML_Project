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
        super("Protests", "A group of protestors are blocking the runway claiming that your airplanes are dropping chemtrails which has caused the the following health issues: “makes their toothpaste taste like mint.”");
    }

    /**
     * TODO
     * @return
     */
    protected Option[] generateOptions() {
        return new Option[] {new AllowThemTheSpaceToProtest(), new GetPoliceInvolved(), new LetThePlanesLandAnyways()};
    }
}
