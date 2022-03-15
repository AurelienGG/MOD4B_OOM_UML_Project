package logic.requests;

import logic.options.Option;

public class SnakesOnThePlane extends Request {
    protected SnakesOnThePlane(double RARITY, String TITLE, String DESCRIPTION, Option[] options) {
        super(RARITY, TITLE, DESCRIPTION, options);
    }
}
