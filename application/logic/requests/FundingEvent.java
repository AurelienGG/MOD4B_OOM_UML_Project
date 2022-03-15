package logic.requests;

import logic.options.Option;

public class FundingEvent extends Request {
    protected FundingEvent(double RARITY, String TITLE, String DESCRIPTION, Option[] options) {
        super(RARITY, TITLE, DESCRIPTION, options);
    }
}
