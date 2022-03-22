package logic.requests;

import logic.options.Option;

/**
 * Class for the request object
 *
 * @author Chloé A
 * @author Aurélien
 */
public abstract class Request {

    private final String TITLE;
    private final String DESCRIPTION;
    private Option[] options;

    /**
     *
     * @param TITLE
     * @param DESCRIPTION
     */
    protected Request(String TITLE, String DESCRIPTION) {
        //TODO
        this.TITLE = TITLE;
        this.DESCRIPTION = DESCRIPTION;
        this.options = generateOptions();
    }

    /**
     * TODO
     * @return
     */
    public String getTITLE() {
        return TITLE;
    }

    /**
     * TODO
     * @return
     */
    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    /**
     * TODO
     * @return
     */
    protected abstract Option[] generateOptions();
}
