package logic.requests;

import logic.options.*;

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
        return new Option[] {new EmptyRandomRunway(), new RescueTeam(), new AirRefueling()};
    }
}
