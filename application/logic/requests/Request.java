package logic.requests;

import logic.options.Option;

public abstract class Request {

    private final double RARITY;
    private final String TITLE;
    private final String DESCRIPTION;
    private Option[] options;

    protected Request(double RARITY, String TITLE, String DESCRIPTION, Option[] options) {
        //TODO
        this.RARITY = RARITY;
        this.TITLE = TITLE;
        this.DESCRIPTION = DESCRIPTION;
        this.options = options;
    }
}
