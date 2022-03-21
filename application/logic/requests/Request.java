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
     */
    protected Request(double RARITY, String TITLE, String DESCRIPTION) {
        //TODO
        this.RARITY = RARITY;
        this.TITLE = TITLE;
        this.DESCRIPTION = DESCRIPTION;
        this.options = generateOptions();
    }

    protected abstract Option[] generateOptions();
}
