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

    /**
     * TODO
     * @return
     */
    public String displayRequest() {
        StringBuilder stringBuilder = new StringBuilder(TITLE + "\n" + DESCRIPTION + "\n");

        char idRequest = 'A';
        for(Option option: options)
            stringBuilder.append("Option " + idRequest++ + ") " + option.getDESCRIPTION() + "\n");

        return stringBuilder.toString();
    }

    /**
     * TODO
     * @return
     */
    public int getNbOptions() {
        return this.options.length;
    }
}
