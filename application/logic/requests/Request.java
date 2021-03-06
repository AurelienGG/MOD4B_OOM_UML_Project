package logic.requests;

import logic.options.Option;
import logic.planes.Plane;

/**
 * Class for the request object
 *
 * @author Chloé A
 * @author Aurélien
 */
public abstract class Request {

    private final String TITLE;
    private final String DESCRIPTION;
    protected final Plane plane;
    private Option[] options;

    /**
     *
     * @param TITLE
     * @param DESCRIPTION
     */
    protected Request(String TITLE, String DESCRIPTION, Plane plane) {
        this.TITLE = TITLE;
        this.DESCRIPTION = DESCRIPTION;
        // TODO fix
        // Because generateOptions is called here, we need Plane to be initialise HERE
        // not after super constructor called in child
        // Landing will give a Plane reference where the other request will give null
        this.plane = plane;
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
        StringBuilder stringBuilder = new StringBuilder(TITLE + "\n" + DESCRIPTION + "\n\n");
        char idRequest = 'A';
        for(Option option: options)
            stringBuilder.append("Option " + idRequest++ + ") " + option.displayOption() + "\n");
        return stringBuilder.toString();
    }

    /**
     * TODO
     * @return
     */
    public int getNbOptions() {
        return this.options.length;
    }

    /**
     * TODO
     * @param idOption
     * @return
     */
    public boolean isOptionDoable(int idOption) {
        return this.options[idOption].checkRequirement();
    }

    /**
     * TODO
     * @param idOption
     * @return
     */
    public void doOption(int idOption) {
        if(isOptionDoable(idOption))
            this.options[idOption].applyConsequence();
    }
}
