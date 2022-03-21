package logic.requests;

import logic.options.Option;

public class FundingEvent extends Request {

    /**
     * TODO
     * @param RARITY
     * @param TITLE
     * @param DESCRIPTION
     */
    protected FundingEvent(double RARITY, String TITLE, String DESCRIPTION) {
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
