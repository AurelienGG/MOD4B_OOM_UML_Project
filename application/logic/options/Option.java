package logic.options;

/**
 * Abstract class for options, provide the subclasses template
 *
 * @author Emmie
 * @author Aurélien
 */
public abstract class Option {

    private final String DESCRIPTION;

    /**
     * TODO
     * @param DESCRIPTION
     */
    protected Option(String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }

    /**
     * TODO
     * @return
     */
    public abstract boolean checkRequirement();

    /**
     * TODO
     */
    public abstract void applyConsequence();

    /**
     * TODO
     * @return
     */
    public String displayOption() {
        return this.DESCRIPTION;
    }
}
