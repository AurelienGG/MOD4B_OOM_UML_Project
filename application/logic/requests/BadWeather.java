package logic.requests;

import logic.options.CrossWinds;
import logic.options.IceStorm;
import logic.options.IcyRunWays;
import logic.options.Option;

public class BadWeather extends Request {

    /**
     * TODO
     */
    protected BadWeather() {
        super("","");
    }

    /**
     * TODO
     * @return
     */
    protected Option[] generateOptions() {
        return new Option[] {new CrossWinds(), new IcyRunWays(), new IceStorm()};
    }


}
