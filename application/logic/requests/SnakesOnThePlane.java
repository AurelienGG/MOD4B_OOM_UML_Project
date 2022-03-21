package logic.requests;

import logic.options.Option;

public class SnakesOnThePlane extends Request {

    /**
     *
     * @param RARITY
     * @param TITLE
     * @param DESCRIPTION
     * @param options
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
        return null;
    }
}
