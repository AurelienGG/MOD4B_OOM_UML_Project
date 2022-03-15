package logic.requests;

import logic.options.Option;

public class Protests extends Request {
    protected Protests(double RARITY, String TITLE, String DESCRIPTION, Option[] options) {
        super(RARITY, TITLE, DESCRIPTION, options);
    }
}
