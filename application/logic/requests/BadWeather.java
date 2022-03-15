package logic.requests;

import logic.options.Option;

public class BadWeather extends Request {
    protected BadWeather(double RARITY, String TITLE, String DESCRIPTION, Option[] options) {
        super(RARITY, TITLE, DESCRIPTION, options);
    }
}
