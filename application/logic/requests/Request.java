package logic.requests;

import logic.options.Option;

/**
 * Class for the request object
 *
 * @author Chloé A
 * @author Aurélien
 */
public abstract class Request {

    private final double RARITY;
    private final String TITLE;
    private final String DESCRIPTION;
    private Option[] options;

    /**
     *
     * @param RARITY
     * @param TITLE
     * @param DESCRIPTION
     * @param options
     */
    protected Request(double RARITY, String TITLE, String DESCRIPTION, Option[] options) {
        //TODO
        this.RARITY = RARITY;
        this.TITLE = TITLE;
        this.DESCRIPTION = DESCRIPTION;
        this.options = options;
    }
}
