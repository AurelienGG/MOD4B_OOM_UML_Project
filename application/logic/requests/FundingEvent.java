package logic.requests;

import logic.options.*;

/**
 * TODO
 */
public class FundingEvent extends Request {

    /**
     * TODO
     */
    protected FundingEvent() {
        super( "Funding Event", "Increase in funding allows for one of the following bonuses");
    }

    /**
     * TODO
     * @return
     */
    protected Option[] generateOptions() {
        return new Option[] {new EmptyRandomRunway(), new RescueTeam(), new AirRefueling()};
    }
}
