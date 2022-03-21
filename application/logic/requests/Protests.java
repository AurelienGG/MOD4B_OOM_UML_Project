package logic.requests;

import logic.options.*;

public class Protests extends Request {

    /**
     * TODO
     * @param RARITY
     * @param TITLE
     * @param DESCRIPTION
     */
    protected Protests(double RARITY, String TITLE, String DESCRIPTION) {
        super(RARITY, TITLE, DESCRIPTION);
    }

    /**
     * TODO
     * @return
     */
    protected Option[] generateOptions() {
        return new Option[] {new AllowThemTheSpaceToProtest(), new GetPoliceInvolved(), new LetThePlanesLandAnyways()};
    }
}
