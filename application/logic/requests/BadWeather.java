package logic.requests;

import logic.options.CrossWinds;
import logic.options.IceStorm;
import logic.options.IcyRunWays;
import logic.options.Option;

/**
 * TODO
 */
public class BadWeather extends Request {

    /**
     * TODO
     */
    protected BadWeather() {
        super("Bad Weather","Select a bad weather event", null);
    }

    /**
     * TODO
     * @return
     */
    protected Option[] generateOptions() {
        return new Option[] {new CrossWinds(), new IcyRunWays(), new IceStorm()};
    }


}
