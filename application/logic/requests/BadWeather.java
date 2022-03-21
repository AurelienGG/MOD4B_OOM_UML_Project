package logic.requests;

import logic.options.CrossWinds;
import logic.options.IceStorm;
import logic.options.IcyRunWays;
import logic.options.Option;

public class BadWeather extends Request {

    /**
     * TODO
     * @param RARITY
     * @param TITLE
     * @param DESCRIPTION
     */
    protected BadWeather(double RARITY, String TITLE, String DESCRIPTION) {
        super(RARITY, TITLE, DESCRIPTION);
    }

    /**
     * TODO
     * @return
     */
    protected Option[] generateOptions() {
        return new Option[] {new CrossWinds(), new IcyRunWays(), new IceStorm()};
    }


}
