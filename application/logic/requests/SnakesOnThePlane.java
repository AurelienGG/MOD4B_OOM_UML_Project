package logic.requests;

import logic.options.*;

public class SnakesOnThePlane extends Request {

    /**
     *
     * @param RARITY
     * @param TITLE
     * @param DESCRIPTION
     */
    protected SnakesOnThePlane(double RARITY, String TITLE, String DESCRIPTION) {
        super(RARITY, TITLE, DESCRIPTION);
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
