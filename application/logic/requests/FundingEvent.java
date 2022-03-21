package logic.requests;

import logic.options.*;

public class FundingEvent extends Request {

    /**
     * TODO
     */
    protected FundingEvent() {

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
