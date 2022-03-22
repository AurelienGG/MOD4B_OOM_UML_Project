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
        //TODO
        super( "", "");
    }

    /**
     * TODO
     * @return
     */
    protected Option[] generateOptions() {
        return new Option[] {new EmptyRandomRunway(), new RescueTeam(), new AirRefueling()};
    }
}
